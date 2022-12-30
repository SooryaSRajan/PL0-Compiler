// Generated from java-escape by ANTLR 4.11.1
 package PL0Modules; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PL0Parser}.
 */
public interface PL0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PL0Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PL0Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PL0Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PL0Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PL0Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(PL0Parser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(PL0Parser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#globalDeclList}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDeclList(PL0Parser.GlobalDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#globalDeclList}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDeclList(PL0Parser.GlobalDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDecl(PL0Parser.GlobalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDecl(PL0Parser.GlobalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(PL0Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(PL0Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void enterDataTypes(PL0Parser.DataTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void exitDataTypes(PL0Parser.DataTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#dataTypesTerminals}.
	 * @param ctx the parse tree
	 */
	void enterDataTypesTerminals(PL0Parser.DataTypesTerminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#dataTypesTerminals}.
	 * @param ctx the parse tree
	 */
	void exitDataTypesTerminals(PL0Parser.DataTypesTerminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(PL0Parser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(PL0Parser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#constDeclItemInner}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclItemInner(PL0Parser.ConstDeclItemInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#constDeclItemInner}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclItemInner(PL0Parser.ConstDeclItemInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(PL0Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(PL0Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#varDeclItemInner}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclItemInner(PL0Parser.VarDeclItemInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#varDeclItemInner}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclItemInner(PL0Parser.VarDeclItemInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#constVariableDeclDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstVariableDeclDefinition(PL0Parser.ConstVariableDeclDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#constVariableDeclDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstVariableDeclDefinition(PL0Parser.ConstVariableDeclDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#variableVariableDeclDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableVariableDeclDefinition(PL0Parser.VariableVariableDeclDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#variableVariableDeclDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableVariableDeclDefinition(PL0Parser.VariableVariableDeclDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#assignedVariableDeclDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssignedVariableDeclDefinition(PL0Parser.AssignedVariableDeclDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#assignedVariableDeclDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssignedVariableDeclDefinition(PL0Parser.AssignedVariableDeclDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#variableDeclDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclDefinition(PL0Parser.VariableDeclDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#variableDeclDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclDefinition(PL0Parser.VariableDeclDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#assignedVariableTerminal}.
	 * @param ctx the parse tree
	 */
	void enterAssignedVariableTerminal(PL0Parser.AssignedVariableTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#assignedVariableTerminal}.
	 * @param ctx the parse tree
	 */
	void exitAssignedVariableTerminal(PL0Parser.AssignedVariableTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#procDecl}.
	 * @param ctx the parse tree
	 */
	void enterProcDecl(PL0Parser.ProcDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#procDecl}.
	 * @param ctx the parse tree
	 */
	void exitProcDecl(PL0Parser.ProcDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(PL0Parser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(PL0Parser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#procFormalCallChoice}.
	 * @param ctx the parse tree
	 */
	void enterProcFormalCallChoice(PL0Parser.ProcFormalCallChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#procFormalCallChoice}.
	 * @param ctx the parse tree
	 */
	void exitProcFormalCallChoice(PL0Parser.ProcFormalCallChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#formalDeclInnerRepeat}.
	 * @param ctx the parse tree
	 */
	void enterFormalDeclInnerRepeat(PL0Parser.FormalDeclInnerRepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#formalDeclInnerRepeat}.
	 * @param ctx the parse tree
	 */
	void exitFormalDeclInnerRepeat(PL0Parser.FormalDeclInnerRepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#formalDecl}.
	 * @param ctx the parse tree
	 */
	void enterFormalDecl(PL0Parser.FormalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#formalDecl}.
	 * @param ctx the parse tree
	 */
	void exitFormalDecl(PL0Parser.FormalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PL0Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PL0Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#arrType}.
	 * @param ctx the parse tree
	 */
	void enterArrType(PL0Parser.ArrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#arrType}.
	 * @param ctx the parse tree
	 */
	void exitArrType(PL0Parser.ArrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#mainStmtList}.
	 * @param ctx the parse tree
	 */
	void enterMainStmtList(PL0Parser.MainStmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#mainStmtList}.
	 * @param ctx the parse tree
	 */
	void exitMainStmtList(PL0Parser.MainStmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#stmtListStmtInner}.
	 * @param ctx the parse tree
	 */
	void enterStmtListStmtInner(PL0Parser.StmtListStmtInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#stmtListStmtInner}.
	 * @param ctx the parse tree
	 */
	void exitStmtListStmtInner(PL0Parser.StmtListStmtInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#blockStmtList}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmtList(PL0Parser.BlockStmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#blockStmtList}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmtList(PL0Parser.BlockStmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#blockStmtListInner}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmtListInner(PL0Parser.BlockStmtListInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#blockStmtListInner}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmtListInner(PL0Parser.BlockStmtListInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PL0Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PL0Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#callStmt}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(PL0Parser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#callStmt}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(PL0Parser.CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PL0Parser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PL0Parser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#parametersInnerRepeat}.
	 * @param ctx the parse tree
	 */
	void enterParametersInnerRepeat(PL0Parser.ParametersInnerRepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#parametersInnerRepeat}.
	 * @param ctx the parse tree
	 */
	void exitParametersInnerRepeat(PL0Parser.ParametersInnerRepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(PL0Parser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(PL0Parser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(PL0Parser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(PL0Parser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#assignmentTerminal}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentTerminal(PL0Parser.AssignmentTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#assignmentTerminal}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentTerminal(PL0Parser.AssignmentTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PL0Parser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PL0Parser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#returnStatementChoice}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementChoice(PL0Parser.ReturnStatementChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#returnStatementChoice}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementChoice(PL0Parser.ReturnStatementChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#outStmt}.
	 * @param ctx the parse tree
	 */
	void enterOutStmt(PL0Parser.OutStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#outStmt}.
	 * @param ctx the parse tree
	 */
	void exitOutStmt(PL0Parser.OutStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#outStmtInner}.
	 * @param ctx the parse tree
	 */
	void enterOutStmtInner(PL0Parser.OutStmtInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#outStmtInner}.
	 * @param ctx the parse tree
	 */
	void exitOutStmtInner(PL0Parser.OutStmtInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PL0Parser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PL0Parser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#ifStmtInner}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtInner(PL0Parser.IfStmtInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#ifStmtInner}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtInner(PL0Parser.IfStmtInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(PL0Parser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(PL0Parser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PL0Parser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PL0Parser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PL0Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PL0Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#conditionBooleans}.
	 * @param ctx the parse tree
	 */
	void enterConditionBooleans(PL0Parser.ConditionBooleansContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#conditionBooleans}.
	 * @param ctx the parse tree
	 */
	void exitConditionBooleans(PL0Parser.ConditionBooleansContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatement(PL0Parser.ConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatement(PL0Parser.ConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#conditionalOperations}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperations(PL0Parser.ConditionalOperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#conditionalOperations}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperations(PL0Parser.ConditionalOperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PL0Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PL0Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#expressionInner}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInner(PL0Parser.ExpressionInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#expressionInner}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInner(PL0Parser.ExpressionInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PL0Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PL0Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#termMultDivFactor}.
	 * @param ctx the parse tree
	 */
	void enterTermMultDivFactor(PL0Parser.TermMultDivFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#termMultDivFactor}.
	 * @param ctx the parse tree
	 */
	void exitTermMultDivFactor(PL0Parser.TermMultDivFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PL0Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PL0Parser.FactorContext ctx);
}