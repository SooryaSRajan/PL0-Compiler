// Generated from java-escape by ANTLR 4.11.1
 package PL0Modules; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PL0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PL0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PL0Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PL0Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PL0Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(PL0Parser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#globalDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDeclList(PL0Parser.GlobalDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#globalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDecl(PL0Parser.GlobalDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(PL0Parser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#dataTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypes(PL0Parser.DataTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#dataTypesTerminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypesTerminals(PL0Parser.DataTypesTerminalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(PL0Parser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#constDeclItemInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclItemInner(PL0Parser.ConstDeclItemInnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(PL0Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#varDeclItemInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclItemInner(PL0Parser.VarDeclItemInnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#constVariableDeclDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstVariableDeclDefinition(PL0Parser.ConstVariableDeclDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#variableVariableDeclDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableVariableDeclDefinition(PL0Parser.VariableVariableDeclDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#variableDeclDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclDefinition(PL0Parser.VariableDeclDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#constExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(PL0Parser.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#procDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDecl(PL0Parser.ProcDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(PL0Parser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#procFormalCallChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcFormalCallChoice(PL0Parser.ProcFormalCallChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#formalDeclInnerRepeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalDeclInnerRepeat(PL0Parser.FormalDeclInnerRepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#formalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalDecl(PL0Parser.FormalDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PL0Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#arrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrType(PL0Parser.ArrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#mainStmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStmtList(PL0Parser.MainStmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#stmtListStmtInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtListStmtInner(PL0Parser.StmtListStmtInnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#blockStmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmtList(PL0Parser.BlockStmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#blockStmtListInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmtListInner(PL0Parser.BlockStmtListInnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PL0Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#callStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(PL0Parser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PL0Parser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#parametersInnerRepeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersInnerRepeat(PL0Parser.ParametersInnerRepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(PL0Parser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(PL0Parser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#arrayIntSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIntSelection(PL0Parser.ArrayIntSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(PL0Parser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#returnStatementChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementChoice(PL0Parser.ReturnStatementChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#outStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutStmt(PL0Parser.OutStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#outStmtInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutStmtInner(PL0Parser.OutStmtInnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(PL0Parser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#ifStmtInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtInner(PL0Parser.IfStmtInnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(PL0Parser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(PL0Parser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PL0Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#conditionBooleans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBooleans(PL0Parser.ConditionBooleansContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#conditionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionStatement(PL0Parser.ConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#conditionalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOperations(PL0Parser.ConditionalOperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PL0Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#expressionInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInner(PL0Parser.ExpressionInnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PL0Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#termMultDivFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMultDivFactor(PL0Parser.TermMultDivFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PL0Parser.FactorContext ctx);
}