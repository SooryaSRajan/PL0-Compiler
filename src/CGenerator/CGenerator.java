package CGenerator;

import PL0Modules.PL0BaseListener;
import PL0Modules.PL0Parser;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class CGenerator extends PL0BaseListener {

    String mainDeclaration = "";

    //dataType variableName[] template string
    String arrayDeclaration = "%s %s[%d];\n";

    //int declaration
    String intDeclaration = "int %s;\n";

    //double declaration
    String doubleDeclaration = "double %s;\n";

    //const int declaration
    String constIntDeclaration = "const int %s = %d;\n";

    //const double declaration
    String constDoubleDeclaration = "const double %s = %f;\n";

    //variable assignment
    String assignment = "%s = %s;\n";

    //variable declaration with assignment
    String declarationWithAssignment = "%s %s = %s;\n";

    //function header
    String functionHeader = "%s %s(%s) {\n";

    //function return
    String functionReturn = "return %s;\n";

    //close
    String bracketClose = "}\n";

    //function call without return
    String functionCallNoReturn = "%s(%s);";

    //if condition
    String ifCondition = "if(%s) {\n";

    //else condition
    String elseCondition = "} else {\n";

    //while condition
    String whileCondition = "while(%s) {\n";

    //for condition
    String forCondition = "for(%s; %s; %s) {\n";

    String mainStart = "int main() {\n";
    String mainEnd = "return 0;\n}\n";

    HashMap<String, Value> globalVariables = new HashMap<>();
    HashMap<String, Value> localVariables = new HashMap<>();
    HashMap<String, Value> functions = new HashMap<>();

    boolean isGlobal = false;

    @Override
    public void enterGlobalDeclList(PL0Parser.GlobalDeclListContext ctx) {
        super.enterGlobalDeclList(ctx);
        isGlobal = true;
    }

    @Override
    public void exitGlobalDeclList(PL0Parser.GlobalDeclListContext ctx) {
        super.exitGlobalDeclList(ctx);
        isGlobal = false;
    }

    @Override
    public void enterProcDecl(PL0Parser.ProcDeclContext ctx) {
        super.enterProcDecl(ctx);
        isGlobal = false;
        String function = ctx.ID().get(0).getText();

        String returnType = "void";

        if (ctx.returnType().dataTypes() != null) {
            returnType = ctx.returnType().dataTypes().getText();
            if (returnType.equals("int")) {
                returnType = "int";
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

            String parameters = "";
            for (Value value : paramTypeList) {
                if (value.type == Value.VarType.ARRAY) {
                    parameters += value.typeOfArray.toString().toLowerCase() + " " + value.content + "[]";
                } else {
                    parameters += value.type.toString().toLowerCase() + " " + value.content;
                }
                parameters += ", ";
            }

            //remove last comma using regex
            parameters = parameters.replaceAll(", $", "");


            mainDeclaration += String.format(functionHeader, returnType, function, parameters);

            functions.put(function, new Value(function, Value.VarType.valueOf(returnType.toUpperCase()), false));

        } else {
            mainDeclaration += String.format(functionHeader, returnType, function, "");
            functions.put(function, new Value(function, Value.VarType.valueOf(returnType.toUpperCase()), false));

        }

        System.out.println(functions);

    }

    @Override
    public void exitProcDecl(PL0Parser.ProcDeclContext ctx) {
        super.exitProcDecl(ctx);
        isGlobal = true;
        mainDeclaration += bracketClose;
        System.out.println("Local variables: " + localVariables);
        System.out.println("Local variables: " + globalVariables);
        localVariables.clear();
    }

    public void declareVariable(String variableName, String type, boolean isArray) {

        if (isGlobal) {
            if (globalVariables.containsKey(variableName)) {
                System.out.println("Variable " + variableName + " already declared");
                System.exit(0);
            }
            globalVariables.put(variableName, new Value(variableName, Value.VarType.valueOf(type.toUpperCase()), isArray));
        } else {
            if (localVariables.containsKey(variableName)) {
                System.out.println("Variable " + variableName + " already declared");
                System.exit(0);
            } else if (globalVariables.containsKey(variableName)) {
                System.out.println("Variable " + variableName + " already declared");
                System.exit(0);
            }
            localVariables.put(variableName, new Value(variableName, Value.VarType.valueOf(type.toUpperCase()), isArray));
        }
    }

    public String getVariableType(String variableName) {
        if (localVariables.containsKey(variableName)) {
            return localVariables.get(variableName).type.toString().toLowerCase();
        } else if (globalVariables.containsKey(variableName)) {
            return globalVariables.get(variableName).type.toString().toLowerCase();
        } else {
            System.out.println("Variable " + variableName + " not declared");
            //check function
            System.out.println(functions + " is checked ");
            if (functions.containsKey(variableName)) {

                String type = functions.get(variableName).type.toString().toLowerCase();
                if (type.equals("void")) {
                    System.out.println("Function " + variableName + " does not return a value");
                    System.exit(0);
                }
                return type;
            }
        }
        return null;
    }

    @Override
    public void exitConstVariableDeclDefinition(PL0Parser.ConstVariableDeclDefinitionContext ctx) {
        super.exitConstVariableDeclDefinition(ctx);

        String ID = ctx.ID().getText();
        String dataType = ctx.dataTypes().getText();
        String value = ctx.dataTypesTerminals().getText();

        System.out.println("const variable " + ID + " " + dataType + " " + value);

        if (dataType.equals("int")) {
            mainDeclaration += String.format(constIntDeclaration, ID, Integer.parseInt(value));
            declareVariable(ID, dataType, false);
        } else if (dataType.equals("float")) {
            mainDeclaration += String.format(constDoubleDeclaration, ID, Double.parseDouble(value));
            declareVariable(ID, dataType, false);
        } else {
            System.out.println("Unknown data type: " + dataType);
        }

    }


    //no assignment
    @Override
    public void exitVariableVariableDeclDefinition(PL0Parser.VariableVariableDeclDefinitionContext ctx) {
        super.exitVariableVariableDeclDefinition(ctx);

        String ID = ctx.ID().getText();

        System.out.println("variable " + ID + " datatype" + ctx.type().getText());

        if (ctx.type().dataTypes() != null) {
            String dataType = ctx.type().dataTypes().getText();
            if (dataType.equals("int")) {

                mainDeclaration += String.format(intDeclaration, ID);
                declareVariable(ID, dataType, false);

            } else if (dataType.equals("float")) {
                mainDeclaration += String.format(doubleDeclaration, ID);
                declareVariable(ID, dataType, false);

            } else {
                System.out.println("Unknown data type: " + dataType);
            }
        } else if (ctx.type().arrType() != null) {
            int arraySize = Integer.parseInt(ctx.type().arrType().INTEGER().getText());
            String dataType = ctx.type().arrType().dataTypes().getText();
            if (dataType.equals("int")) {
                mainDeclaration += String.format(arrayDeclaration, "int", ID, arraySize);
                declareVariable(ID, dataType, true);
            } else if (dataType.equals("float")) {
                mainDeclaration += String.format(arrayDeclaration, "double", ID, arraySize);
                declareVariable(ID, dataType, true);
            } else {
                System.out.println("Unknown data type: " + dataType);
            }
        }
    }

    @Override
    public void exitAssignedVariableDeclDefinition(PL0Parser.AssignedVariableDeclDefinitionContext ctx) {
        super.exitAssignedVariableDeclDefinition(ctx);

        String ID = ctx.ID().getText();
        String dataType = ctx.dataTypes().getText();
        String assignedID = "";

        boolean isVariable = false;

        System.out.println("assigned variable " + ID + " " + dataType + " " + ctx.dataTypes().getText());

        if (ctx.assignedVariableTerminal().ID() != null) {
            assignedID = ctx.assignedVariableTerminal().ID().getText();
            isVariable = true;
        } else {
            if (ctx.assignedVariableTerminal().dataTypesTerminals() != null) {
                assignedID = ctx.assignedVariableTerminal().dataTypesTerminals().getText();
            }
        }

        if (dataType.equals("int")) {
            if (isVariable) {
                mainDeclaration += String.format(declarationWithAssignment, "int", ID, assignedID);
                declareVariable(ID, dataType, false);
            } else {
                mainDeclaration += String.format(declarationWithAssignment, "int", ID, Integer.parseInt(assignedID));
                declareVariable(ID, dataType, false);
            }
        } else if (dataType.equals("float")) {
            if (isVariable) {
                mainDeclaration += String.format(declarationWithAssignment, "double", ID, assignedID);
                declareVariable(ID, dataType, false);
            } else {
                mainDeclaration += String.format(declarationWithAssignment, "double", ID, Double.parseDouble(assignedID));
                declareVariable(ID, dataType, false);
            }
        } else {
            System.out.println("Unknown data type: " + dataType);
            System.exit(0);
        }

    }

    @Override
    public void enterMain(PL0Parser.MainContext ctx) {
        super.enterMain(ctx);
        mainDeclaration += mainStart;
        isGlobal = false;

    }

    @Override
    public void exitMain(PL0Parser.MainContext ctx) {
        super.exitMain(ctx);
        mainDeclaration += mainEnd;
        System.out.println(mainDeclaration);

        //if scanf or printf is used, include stdio.h
        if (mainDeclaration.contains("scanf") || mainDeclaration.contains("printf")) {
            mainDeclaration = "#include <stdio.h>\n" + mainDeclaration;
        }

        //write to file
        try {
            FileWriter fileWriter = new FileWriter("output.c");
            fileWriter.write(mainDeclaration);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void enterCallWithoutAssignment(PL0Parser.CallWithoutAssignmentContext ctx) {
        super.enterCallWithoutAssignment(ctx);
        String ID = ctx.callStmt().ID().getText();
        mainDeclaration += String.format(functionCallNoReturn, ID, ctx.callStmt().parameters().getText());

    }

    @Override
    public void enterAssignStmt(PL0Parser.AssignStmtContext ctx) {
        super.enterAssignStmt(ctx);
        String leftSide = ctx.assignL().getText();
        mainDeclaration += leftSide;
    }

    @Override
    public void enterAssignmentSymbol(PL0Parser.AssignmentSymbolContext ctx) {
        super.enterAssignmentSymbol(ctx);
        mainDeclaration += " = ";
    }

    @Override
    public void exitAssignStmt(PL0Parser.AssignStmtContext ctx) {
        super.exitAssignStmt(ctx);
        mainDeclaration += ctx.assignmentTerminal().getText() + ";\n";
    }

    @Override
    public void enterInputStmt(PL0Parser.InputStmtContext ctx) {
        super.enterInputStmt(ctx);

        String input = ctx.assignL().getText();
        System.out.println(input);

        if (getVariableType(input).equals("int")) {
            mainDeclaration += "scanf(\"%d\", &" + input + ");\n";
        } else {
            mainDeclaration += "scanf(\"%f\", &" + input + ");\n";
        }
    }

    @Override
    public void enterReturnStmt(PL0Parser.ReturnStmtContext ctx) {
        super.enterReturnStmt(ctx);

        mainDeclaration += String.format(functionReturn, ctx.returnStatementChoice().getText());
    }

    @Override
    public void enterOutStmt(PL0Parser.OutStmtContext ctx) {
        super.enterOutStmt(ctx);

        //string or datatype
        PL0Parser.OutStmtInnerContext outStmtInnerContext = ctx.outStmtInner();
        if (outStmtInnerContext.STRING() != null) {
            String string = outStmtInnerContext.STRING().getText();
            mainDeclaration += "\nprintf(" + string + ");\n";
        } else {
            String expression = outStmtInnerContext.getText();

            String variableName = "";

            if (outStmtInnerContext.assignmentTerminal().callStmt() != null) {
                variableName = outStmtInnerContext.assignmentTerminal().callStmt().ID().getText();
            } else if (outStmtInnerContext.assignmentTerminal().ID() != null) {
                variableName = outStmtInnerContext.assignmentTerminal().ID().getText();
            } else if (outStmtInnerContext.assignmentTerminal().expr() != null) {
                mainDeclaration += "\nprintf(\"%f\", " + outStmtInnerContext.assignmentTerminal().expr().getText() + ");\n";
                return;
            }

            //check type from hashmap
            if (getVariableType(variableName).equals("int")) {
                mainDeclaration += "\nprintf(\"%d\", " + expression + ");\n";
            } else if (getVariableType(variableName).equals("float")) {
                mainDeclaration += "\nprintf(\"%f\", " + expression + ");\n";
            }
        }

    }

    @Override
    public void enterForStmt(PL0Parser.ForStmtContext ctx) {
        super.enterForStmt(ctx);

        String startExpr = ctx.expr(0).getText();
        String endExpr = ctx.expr(1).getText();

        mainDeclaration += String.format(forCondition, "int i = " + startExpr, "i < " + endExpr, "i++");

    }

    @Override
    public void exitForStmt(PL0Parser.ForStmtContext ctx) {
        super.exitForStmt(ctx);
        mainDeclaration += "\n}\n";
    }

    @Override
    public void enterWhileStmt(PL0Parser.WhileStmtContext ctx) {
        super.enterWhileStmt(ctx);
        String condition = parseCondition(ctx.condition());
        mainDeclaration += String.format(whileCondition, condition);
    }

    @Override
    public void exitWhileStmt(PL0Parser.WhileStmtContext ctx) {
        super.enterWhileStmt(ctx);
        mainDeclaration += bracketClose;
    }

    @Override
    public void enterIfStmt(PL0Parser.IfStmtContext ctx) {
        super.enterIfStmt(ctx);
        String condition = parseCondition(ctx.condition());
        mainDeclaration += String.format(ifCondition, condition);
    }

    @Override
    public void exitIfStmt(PL0Parser.IfStmtContext ctx) {
        super.enterIfStmt(ctx);
        mainDeclaration += bracketClose;
    }

    @Override
    public void enterIfStmtInner(PL0Parser.IfStmtInnerContext ctx) {
        super.enterIfStmtInner(ctx);

        if (ctx.ELSE() != null) {
            mainDeclaration += elseCondition;
        }
    }

    @Override
    public void exitIfStmtInner(PL0Parser.IfStmtInnerContext ctx) {
        super.enterIfStmtInner(ctx);

        if (ctx.ELSE() != null) {
//            mainDeclaration += bracketClose;
        }
    }

    private String parseCondition(PL0Parser.ConditionContext ctx) {

        String stmt = "";
        while (ctx != null) {
            PL0Parser.ConditionStatementContext conditionStatement = ctx.conditionStatement();
            if (conditionStatement != null) {

                if (conditionStatement.ODD() != null) {
                    stmt += "(" + conditionStatement.expr(0).getText() + ") % 2 != 0";
                } else {
                    if (conditionStatement.conditionalOperations().EQUAL() != null) {
                        stmt += "(" + conditionStatement.expr(0).getText() + ") == (" + conditionStatement.expr(1).getText() + ")";
                    } else if (conditionStatement.conditionalOperations().NOTEQUAL() != null) {
                        stmt += "(" + conditionStatement.expr(0).getText() + ") != (" + conditionStatement.expr(1).getText() + ")";
                    } else if (conditionStatement.conditionalOperations().LT() != null) {
                        stmt += "(" + conditionStatement.expr(0).getText() + ") < (" + conditionStatement.expr(1).getText() + ")";
                    } else if (conditionStatement.conditionalOperations().LTE() != null) {
                        stmt += "(" + conditionStatement.expr(0).getText() + ") <= (" + conditionStatement.expr(1).getText() + ")";
                    } else if (conditionStatement.conditionalOperations().GT() != null) {
                        stmt += "(" + conditionStatement.expr(0).getText() + ") > (" + conditionStatement.expr(1).getText() + ")";
                    } else if (conditionStatement.conditionalOperations().GTE() != null) {
                        stmt += "(" + conditionStatement.expr(0).getText() + ") >= (" + conditionStatement.expr(1).getText() + ")";
                    }
                }

                if (ctx.conditionBooleans().AND() != null) {
                    stmt += " && ";
                } else if (ctx.conditionBooleans().OR() != null) {
                    stmt += " || ";
                }

                ctx = ctx.conditionBooleans().condition();

            } else {
                //not statement
                stmt += "!";
                ctx = ctx.condition();

            }

        }
        System.out.println(stmt + " condition");
        return stmt;
    }


}
