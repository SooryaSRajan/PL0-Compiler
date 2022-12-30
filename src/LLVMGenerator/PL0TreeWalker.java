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

    private HashMap<String, Value> variables = new HashMap<>();
    private HashSet<String> globalNames = new HashSet<>();
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
//        PL0Parser.ProcFormalCallChoiceContext formalChoice = ctx.procFormalCallChoice();

        LinkedList<String> paramIDList = new LinkedList<>();
        LinkedList<Value.VarType> paramTypeList = new LinkedList<>();

//        if (formalChoice != null) {
//            PL0Parser.FormalDeclContext formalDeclContext = formalChoice.formalDecl();
//
//            paramIDList.add(formalDeclContext.ID().getText());
//            paramTypeList.add(formalDeclContext.type().getText().equals("integer") ? Value.VarType.INT : Value.VarType.FLOAT);
//
//
//            PL0Parser.FormalDeclInnerRepeatContext innerDeclRepeatContext = formalChoice.formalDeclInnerRepeat();
//            while (innerDeclRepeatContext != null && innerDeclRepeatContext.formalDecl() != null) {
//                paramIDList.add(innerDeclRepeatContext.formalDecl().ID().getText());
//                paramTypeList.add(innerDeclRepeatContext.formalDecl().type().getText().equals("integer") ? Value.VarType.INT : Value.VarType.FLOAT);
//                innerDeclRepeatContext = innerDeclRepeatContext.formalDeclInnerRepeat();
//            }
//
//            LLVMGenerator.function_start(function, paramIDList.toArray(String[]::new), paramTypeList.toArray(String[]::new));

//        }
//        else{
            LLVMGenerator.function_start(function);
//        }

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

        if (!variables.containsKey(ID)) {

            if (isInGlobalScope) {
                globalNames.add(ID);
            } else if (!globalNames.contains(ID)) {
                localNames.add(ID);
            }

            if (dataType.equals("int")) {
                variables.put(ID, new Value(ID, Value.VarType.INT, false));
                LLVMGenerator.declare_i32_constant(ID, Integer.parseInt(value), isInGlobalScope);
            } else if (dataType.equals("float")) {
                variables.put(ID, new Value(ID, Value.VarType.FLOAT, false));
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
                    variables.put(ID, new Value(ID, Value.VarType.INT, false));

                } else if (dataType.equals("float")) {
                    LLVMGenerator.declare_double(ID, isInGlobalScope);
                    variables.put(ID, new Value(ID, Value.VarType.FLOAT, false));
                } else {
                    System.out.println("Unknown data type: " + dataType);
                }
            } else if (ctx.type().arrType() != null) {
                int arraySize = Integer.parseInt(ctx.type().arrType().INTEGER().getText());
                String dataType = ctx.type().arrType().dataTypes().getText();
                if (dataType.equals("int")) {
                    variables.put(ID, new Value(ID, Value.VarType.INT, true));
                } else if (dataType.equals("float")) {
                    variables.put(ID, new Value(ID, Value.VarType.FLOAT, true));
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

        if (!variables.containsKey(ID)) {
            if (isInGlobalScope) {
                globalNames.add(ID);
            } else if (!globalNames.contains(ID)) {
                localNames.add(ID);
            }

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
}


