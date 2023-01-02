package LLVMGenerator;

import PL0Modules.PL0BaseListener;
import PL0Modules.PL0Parser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class PL0TreeWalker extends PL0BaseListener {

    boolean isInGlobalScope = false;
    boolean isConstVariable = false;

    private final HashMap<String, Value> variables = new HashMap<>();
    private final HashSet<String> globalNames = new HashSet<>();
    private HashSet<String> localNames = new HashSet<>();
    private Queue<String> infixExpr = new LinkedList<>();
    private String function = "";


    @Override
    public void enterGlobalDeclList(PL0Parser.GlobalDeclListContext ctx) {
        super.enterGlobalDeclList(ctx);
        isInGlobalScope = true;
    }

    @Override
    public void exitGlobalDeclList(PL0Parser.GlobalDeclListContext ctx) {
        super.exitGlobalDeclList(ctx);
        isInGlobalScope = false;
    }

    @Override
    public void exitProgram(PL0Parser.ProgramContext ctx) {
        super.exitProgram(ctx);
        System.out.println(LLVMGenerator.generate());
    }

    //to observe if the variable is const or not
    @Override
    public void enterConstDecl(PL0Parser.ConstDeclContext ctx) {
        super.enterConstDecl(ctx);
        isConstVariable = true;
    }

    @Override
    public void exitConstDecl(PL0Parser.ConstDeclContext ctx) {
        super.exitConstDecl(ctx);
        isConstVariable = false;
    }

    @Override
    public void enterConstDeclItemInner(PL0Parser.ConstDeclItemInnerContext ctx) {
        super.enterConstDeclItemInner(ctx);
        isConstVariable = true;
    }

    @Override
    public void exitConstDeclItemInner(PL0Parser.ConstDeclItemInnerContext ctx) {
        super.exitConstDeclItemInner(ctx);
        isConstVariable = false;
    }

    //functions

    @Override
    public void enterProcDecl(PL0Parser.ProcDeclContext ctx) {
        super.enterProcDecl(ctx);
        isInGlobalScope = false;
        function = ctx.ID().get(0).getText();

        String returnType = "void";

        if (ctx.returnType().dataTypes() != null) {
            returnType = ctx.returnType().dataTypes().getText();
            if (returnType.equals("int")) {
                returnType = "i32";
            } else if (returnType.equals("float")) {
                returnType = "double";
            }
        }
        PL0Parser.ProcFormalCallChoiceContext formalChoice = ctx.procFormalCallChoice();


        LinkedList<Value> paramTypeList = new LinkedList<>();

        if (formalChoice != null && formalChoice.formalDecl() != null) {
            PL0Parser.FormalDeclContext formalDeclContext = formalChoice.formalDecl();

            String varName = formalDeclContext.ID().getText();
            boolean isArray = formalDeclContext.type().arrType() != null;
            if (isArray) {
                paramTypeList.add(new Value(varName, Value.VarType.valueOf(formalDeclContext.type().arrType().dataTypes().getText()), true));
            } else {
                paramTypeList.add(new Value(varName, Value.VarType.valueOf(formalDeclContext.type().getText().toUpperCase()), false));
            }

            PL0Parser.FormalDeclInnerRepeatContext innerDeclRepeatContext = formalChoice.formalDeclInnerRepeat();
            while (innerDeclRepeatContext != null && innerDeclRepeatContext.formalDecl() != null) {
                PL0Parser.FormalDeclContext declContext = innerDeclRepeatContext.formalDecl();
                varName = declContext.ID().getText();
                isArray = declContext.type().arrType() != null;
                if (isArray) {
                    paramTypeList.add(new Value(varName, Value.VarType.valueOf(declContext.type().arrType().dataTypes().getText().toUpperCase()), true));
                } else {
                    paramTypeList.add(new Value(varName, Value.VarType.valueOf(declContext.type().getText().toUpperCase()), false));
                }
                innerDeclRepeatContext = innerDeclRepeatContext.formalDeclInnerRepeat();
            }

            for (Value value : paramTypeList) {
                localNames.add(value.content);
                putVariable(value.content, value);
            }

            LLVMGenerator.function_start(function, paramTypeList.toArray(new Value[0]), returnType);

        } else {
            LLVMGenerator.function_start(function, returnType);
        }

    }

    @Override
    public void exitProcDecl(PL0Parser.ProcDeclContext ctx) {
        super.exitProcDecl(ctx);
        LLVMGenerator.function_end();
        isInGlobalScope = true;
        removeLocalVariables();
        localNames = new HashSet<>();
    }

    //assignment
    @Override
    public void exitConstVariableDeclDefinition(PL0Parser.ConstVariableDeclDefinitionContext ctx) {
        super.exitConstVariableDeclDefinition(ctx);

        String ID = ctx.ID().getText();
        String dataType = ctx.dataTypes().getText();
        String value = ctx.dataTypesTerminals().getText();

        System.out.println("const variable " + ID + " " + dataType + " " + value);

        if (!variables.containsKey(ID)) {

            if (isInGlobalScope) {
                globalNames.add(ID);
            } else if (!globalNames.contains(ID)) {
                localNames.add(ID);
            }

            if (dataType.equals("int")) {
                putVariable(ID, new Value(ID, Value.VarType.INT, false));
                LLVMGenerator.declare_i32_constant(ID, Integer.parseInt(value), isInGlobalScope);
            } else if (dataType.equals("float")) {
                putVariable(ID, new Value(ID, Value.VarType.FLOAT, false));
                LLVMGenerator.declare_double_constant(ID, Double.parseDouble(value), isInGlobalScope);
            } else {
                System.out.println("Unknown data type: " + dataType);
            }

        } else {
            System.out.println("Variable " + ID + " already declared");
        }

    }

    //no assignment
    @Override
    public void exitVariableVariableDeclDefinition(PL0Parser.VariableVariableDeclDefinitionContext ctx) {
        super.exitVariableVariableDeclDefinition(ctx);

        String ID = ctx.ID().getText();

        System.out.println("variable " + ID + " datatype" + ctx.type().getText());

        if (!variables.containsKey(ID)) {
            if (isInGlobalScope) {
                globalNames.add(ID);
            } else if (!globalNames.contains(ID)) {
                localNames.add(ID);
            }
            if (ctx.type().dataTypes() != null) {
                String dataType = ctx.type().dataTypes().getText();
                if (dataType.equals("int")) {
                    LLVMGenerator.declare_i32(ID, isInGlobalScope);
                    putVariable(ID, new Value(ID, Value.VarType.INT, false));

                } else if (dataType.equals("float")) {
                    LLVMGenerator.declare_double(ID, isInGlobalScope);
                    putVariable(ID, new Value(ID, Value.VarType.FLOAT, false));
                } else {
                    System.out.println("Unknown data type: " + dataType);
                }
            } else if (ctx.type().arrType() != null) {
                int arraySize = Integer.parseInt(ctx.type().arrType().INTEGER().getText());
                String dataType = ctx.type().arrType().dataTypes().getText();
                if (dataType.equals("int")) {
                    putVariable(ID, new Value(ID, Value.VarType.INT, true));
                } else if (dataType.equals("float")) {
                    putVariable(ID, new Value(ID, Value.VarType.FLOAT, true));
                } else {
                    System.out.println("Unknown data type: " + dataType);
                }
                LLVMGenerator.declare_array(ID, arraySize, isInGlobalScope);
            }
        }
    }

    @Override
    public void exitAssignedVariableDeclDefinition(PL0Parser.AssignedVariableDeclDefinitionContext ctx) {
        super.exitAssignedVariableDeclDefinition(ctx);

        String ID = ctx.ID().getText();
        String dataType = ctx.dataTypes().getText();
        Value value = null;

        System.out.println("assigned variable " + ID + " " + dataType + " " + ctx.dataTypes().getText());

        if (!variables.containsKey(ID)) {

            String assignedID = "";

            if (ctx.assignedVariableTerminal().ID() != null) {
                assignedID = ctx.assignedVariableTerminal().ID().getText();
            } else {
                if (ctx.assignedVariableTerminal().dataTypesTerminals() != null) {
                    assignedID = ctx.assignedVariableTerminal().dataTypesTerminals().getText();
                }
            }

            if (dataType.equals("int")) {
                LLVMGenerator.declare_i32(ID, isInGlobalScope);
                value = new Value(assignedID, Value.VarType.INT, false);
            } else if (dataType.equals("float")) {
                LLVMGenerator.declare_double(ID, isInGlobalScope);
                value = new Value(assignedID, Value.VarType.FLOAT, false);
            } else {
                System.out.println("Unknown data type: " + dataType);
            }

            assignVariable(ID, value);

        } else {
            System.out.println("Variable " + ID + " already declared");
        }

    }

    private void assignVariable(String ID, Value value) {
        if (isInGlobalScope) {
            globalNames.add(ID);
        } else if (!globalNames.contains(ID)) {
            localNames.add(ID);
        }

        putVariable(ID, value);

        if (value.type == Value.VarType.INT) {
            LLVMGenerator.assign_i32(ID, getValue(value), globalNames);
        } else if (value.type == Value.VarType.FLOAT) {
            LLVMGenerator.assign_double(ID, getValue(value), globalNames);
        } else {
            System.out.println("Unknown data type: " + value.type);
        }
    }

    private String getValue(Value value) {
        if (value.type == Value.VarType.FLOAT) {
            LLVMGenerator.load_double(value.content, globalNames);
        } else {
            LLVMGenerator.load_i32(value.content, globalNames);
        }
        return "%" + (LLVMGenerator.reg - 1);
    }

    private void removeLocalVariables() {
        for (String id : localNames) {
            variables.remove(id);
        }
    }

    @Override
    public void exitExpr(PL0Parser.ExprContext ctx) {
        super.enterExpr(ctx);
        if (!infixExpr.isEmpty()) {

            if (infixExpr.size() > 1) {
                Value value = MathUtils.eval(infixExpr, globalNames, variables);
                System.out.println(infixExpr + " " + ctx.start.getLine() + " " + value.content);
                infixExpr = new LinkedList<>();
            } else {
                System.out.println(infixExpr + " " + ctx.start.getLine() + " only one variable");
                //Load the variable for usage and use in expressions later
            }

        }

    }

    @Override
    public void enterLp(PL0Parser.LpContext ctx) {
        super.enterLp(ctx);
        infixExpr.add(ctx.getText());
    }

    @Override
    public void enterRp(PL0Parser.RpContext ctx) {
        super.enterRp(ctx);
        infixExpr.add(ctx.getText());
    }

    @Override
    public void enterAdd(PL0Parser.AddContext ctx) {
        super.enterAdd(ctx);
        infixExpr.add(ctx.getText());
    }

    @Override
    public void enterSub(PL0Parser.SubContext ctx) {
        super.enterSub(ctx);
        infixExpr.add(ctx.getText());
    }

    @Override
    public void enterMul(PL0Parser.MulContext ctx) {
        super.enterMul(ctx);
        infixExpr.add(ctx.getText());
    }

    @Override
    public void enterDiv(PL0Parser.DivContext ctx) {
        super.enterDiv(ctx);
        infixExpr.add(ctx.getText());
    }

    @Override
    public void enterFactor(PL0Parser.FactorContext ctx) {
        super.enterFactor(ctx);
        if (ctx.ID() != null) {
            String ID = ctx.ID().getText();
            if (variables.containsKey(ID)) {
                infixExpr.add(ID);
            } else {
                System.out.println("Variable " + ID + " not declared");
                System.out.println(variables.toString() + " " + ctx.start.getLine());
            }
        } else if (ctx.dataTypesTerminals() != null) {
            infixExpr.add(ctx.dataTypesTerminals().getText());
        } else {
            System.out.println(ctx.getText());
        }
    }

    public void putVariable(String ID, Value value) {
        if (variables.containsKey(ID)) {
            System.out.println("Variable " + ID + " already declared");
            System.exit(1);
        } else {
            variables.put(ID, value);
        }
    }

//    @Override
//    public void exitAssignStmt(PL0Parser.AssignStmtContext ctx) {
//        super.exitAssignStmt(ctx);
//        System.out.println("exit assign " + ctx.arrayIndex().getText());
//        System.out.println(ctx.assignmentTerminal().INPUT());
//        String ID = ctx.ID().getText();
//        System.out.println("assigning " + ID);
//        if (ctx.assignmentTerminal().INPUT() != null) {
//            Value value = variables.get(ID);
//            System.out.println(value + " value " + ID);
//            if (value != null) {
//                if (value.type == Value.VarType.INT) {
//                    LLVMGenerator.scanf_i32(ID, globalNames);
//                } else if (value.type == Value.VarType.FLOAT) {
//                    LLVMGenerator.scanf_double(ID, globalNames);
//                }
//            }
//        }
//    }
}


