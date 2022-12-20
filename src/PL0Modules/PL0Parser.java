// Generated from java-escape by ANTLR 4.11.1
 package PL0Modules; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PL0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, MODULE=2, PROCEDURE=3, MAIN=4, BEGIN=5, END=6, CONST=7, VAR=8, INT=9, 
		FLOAT=10, IF=11, THEN=12, ELSE=13, INPUT=14, OUTPUT=15, ODD=16, RETURN=17, 
		OR=18, AND=19, NOT=20, WHILE=21, DO=22, FOR=23, TO=24, ARRAY=25, OF=26, 
		ID=27, INTEGER=28, DECIMAL=29, PLUS=30, MINUS=31, MULTIPLICATION=32, DIVISION=33, 
		ASSIGNMENT=34, EQUAL=35, NOTEQUAL=36, GT=37, LT=38, GTE=39, LTE=40, SEMICOLON=41, 
		COLON=42, DOT=43, COMMA=44, BRACKET_OPEN=45, BRACKET_CLOSE=46, SQ_OPEN=47, 
		SQ_CLOSE=48, COMMENT=49, COMMENT_MULTILINE=50, STRING=51;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statementBlock = 2, RULE_globalDeclList = 3, 
		RULE_globalDecl = 4, RULE_decl = 5, RULE_dataTypes = 6, RULE_dataTypesTerminals = 7, 
		RULE_constDecl = 8, RULE_constDeclItemInner = 9, RULE_varDecl = 10, RULE_varDeclItemInner = 11, 
		RULE_constVariableDeclDefinition = 12, RULE_variableDeclDefinition = 13, 
		RULE_constExpr = 14, RULE_procDecl = 15, RULE_returnType = 16, RULE_procFormalCallChoice = 17, 
		RULE_formalDeclInnerRepeat = 18, RULE_formalDecl = 19, RULE_type = 20, 
		RULE_arrType = 21, RULE_mainStmtList = 22, RULE_stmtListStmtInner = 23, 
		RULE_blockStmtList = 24, RULE_blockStmtListInner = 25, RULE_stmt = 26, 
		RULE_callStmt = 27, RULE_parameters = 28, RULE_parametersInnerRepeat = 29, 
		RULE_assignStmt = 30, RULE_lvalue = 31, RULE_arrayIntSelection = 32, RULE_returnStmt = 33, 
		RULE_returnStatementChoice = 34, RULE_outStmt = 35, RULE_outStmtInner = 36, 
		RULE_ifStmt = 37, RULE_ifStmtInner = 38, RULE_whileStmt = 39, RULE_forStmt = 40, 
		RULE_condition = 41, RULE_conditionBooleans = 42, RULE_conditionStatement = 43, 
		RULE_conditionalOperations = 44, RULE_expr = 45, RULE_expressionInner = 46, 
		RULE_term = 47, RULE_termMultDivFactor = 48, RULE_factor = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statementBlock", "globalDeclList", "globalDecl", 
			"decl", "dataTypes", "dataTypesTerminals", "constDecl", "constDeclItemInner", 
			"varDecl", "varDeclItemInner", "constVariableDeclDefinition", "variableDeclDefinition", 
			"constExpr", "procDecl", "returnType", "procFormalCallChoice", "formalDeclInnerRepeat", 
			"formalDecl", "type", "arrType", "mainStmtList", "stmtListStmtInner", 
			"blockStmtList", "blockStmtListInner", "stmt", "callStmt", "parameters", 
			"parametersInnerRepeat", "assignStmt", "lvalue", "arrayIntSelection", 
			"returnStmt", "returnStatementChoice", "outStmt", "outStmtInner", "ifStmt", 
			"ifStmtInner", "whileStmt", "forStmt", "condition", "conditionBooleans", 
			"conditionStatement", "conditionalOperations", "expr", "expressionInner", 
			"term", "termMultDivFactor", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'module'", "'procedure'", "'main'", "'begin'", "'end'", 
			"'const'", "'var'", "'int'", "'float'", "'if'", "'then'", "'else'", "'input'", 
			"'output'", "'odd'", "'return'", "'or'", "'and'", "'not'", "'while'", 
			"'do'", "'for'", "'to'", "'array'", "'of'", null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "':='", "'='", "'<>'", "'>'", "'<'", "'>='", "'<='", 
			"';'", "':'", "'.'", "','", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "MODULE", "PROCEDURE", "MAIN", "BEGIN", "END", "CONST", "VAR", 
			"INT", "FLOAT", "IF", "THEN", "ELSE", "INPUT", "OUTPUT", "ODD", "RETURN", 
			"OR", "AND", "NOT", "WHILE", "DO", "FOR", "TO", "ARRAY", "OF", "ID", 
			"INTEGER", "DECIMAL", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", 
			"ASSIGNMENT", "EQUAL", "NOTEQUAL", "GT", "LT", "GTE", "LTE", "SEMICOLON", 
			"COLON", "DOT", "COMMA", "BRACKET_OPEN", "BRACKET_CLOSE", "SQ_OPEN", 
			"SQ_CLOSE", "COMMENT", "COMMENT_MULTILINE", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PL0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(PL0Parser.MODULE, 0); }
		public List<TerminalNode> MAIN() { return getTokens(PL0Parser.MAIN); }
		public TerminalNode MAIN(int i) {
			return getToken(PL0Parser.MAIN, i);
		}
		public TerminalNode SEMICOLON() { return getToken(PL0Parser.SEMICOLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PL0Parser.DOT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(MODULE);
			setState(101);
			match(MAIN);
			setState(102);
			match(SEMICOLON);
			setState(103);
			block();
			setState(104);
			match(MAIN);
			setState(105);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public GlobalDeclListContext globalDeclList() {
			return getRuleContext(GlobalDeclListContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			globalDeclList();
			setState(108);
			statementBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PL0Parser.BEGIN, 0); }
		public MainStmtListContext mainStmtList() {
			return getRuleContext(MainStmtListContext.class,0);
		}
		public TerminalNode END() { return getToken(PL0Parser.END, 0); }
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(BEGIN);
			setState(111);
			mainStmtList();
			setState(112);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalDeclListContext extends ParserRuleContext {
		public GlobalDeclContext globalDecl() {
			return getRuleContext(GlobalDeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PL0Parser.SEMICOLON, 0); }
		public GlobalDeclListContext globalDeclList() {
			return getRuleContext(GlobalDeclListContext.class,0);
		}
		public GlobalDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterGlobalDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitGlobalDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitGlobalDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclListContext globalDeclList() throws RecognitionException {
		GlobalDeclListContext _localctx = new GlobalDeclListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalDeclList);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
			case CONST:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				globalDecl();
				setState(115);
				match(SEMICOLON);
				setState(116);
				globalDeclList();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalDeclContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ProcDeclContext procDecl() {
			return getRuleContext(ProcDeclContext.class,0);
		}
		public GlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterGlobalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitGlobalDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitGlobalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclContext globalDecl() throws RecognitionException {
		GlobalDeclContext _localctx = new GlobalDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_globalDecl);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				decl();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				procDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decl);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				constDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PL0Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PL0Parser.FLOAT, 0); }
		public DataTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterDataTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitDataTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitDataTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypesContext dataTypes() throws RecognitionException {
		DataTypesContext _localctx = new DataTypesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypesTerminalsContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(PL0Parser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(PL0Parser.DECIMAL, 0); }
		public DataTypesTerminalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypesTerminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterDataTypesTerminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitDataTypesTerminals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitDataTypesTerminals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypesTerminalsContext dataTypesTerminals() throws RecognitionException {
		DataTypesTerminalsContext _localctx = new DataTypesTerminalsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataTypesTerminals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PL0Parser.CONST, 0); }
		public ConstVariableDeclDefinitionContext constVariableDeclDefinition() {
			return getRuleContext(ConstVariableDeclDefinitionContext.class,0);
		}
		public ConstDeclItemInnerContext constDeclItemInner() {
			return getRuleContext(ConstDeclItemInnerContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(CONST);
			setState(134);
			constVariableDeclDefinition();
			setState(135);
			constDeclItemInner();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclItemInnerContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(PL0Parser.COMMA, 0); }
		public ConstVariableDeclDefinitionContext constVariableDeclDefinition() {
			return getRuleContext(ConstVariableDeclDefinitionContext.class,0);
		}
		public ConstDeclItemInnerContext constDeclItemInner() {
			return getRuleContext(ConstDeclItemInnerContext.class,0);
		}
		public ConstDeclItemInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclItemInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterConstDeclItemInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitConstDeclItemInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitConstDeclItemInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclItemInnerContext constDeclItemInner() throws RecognitionException {
		ConstDeclItemInnerContext _localctx = new ConstDeclItemInnerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constDeclItemInner);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(COMMA);
				setState(138);
				constVariableDeclDefinition();
				setState(139);
				constDeclItemInner();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PL0Parser.VAR, 0); }
		public VariableDeclDefinitionContext variableDeclDefinition() {
			return getRuleContext(VariableDeclDefinitionContext.class,0);
		}
		public VarDeclItemInnerContext varDeclItemInner() {
			return getRuleContext(VarDeclItemInnerContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(VAR);
			setState(145);
			variableDeclDefinition();
			setState(146);
			varDeclItemInner();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclItemInnerContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(PL0Parser.COMMA, 0); }
		public VariableDeclDefinitionContext variableDeclDefinition() {
			return getRuleContext(VariableDeclDefinitionContext.class,0);
		}
		public VarDeclItemInnerContext varDeclItemInner() {
			return getRuleContext(VarDeclItemInnerContext.class,0);
		}
		public VarDeclItemInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclItemInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterVarDeclItemInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitVarDeclItemInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitVarDeclItemInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclItemInnerContext varDeclItemInner() throws RecognitionException {
		VarDeclItemInnerContext _localctx = new VarDeclItemInnerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDeclItemInner);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(COMMA);
				setState(149);
				variableDeclDefinition();
				setState(150);
				varDeclItemInner();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstVariableDeclDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PL0Parser.ID, 0); }
		public TerminalNode COLON() { return getToken(PL0Parser.COLON, 0); }
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PL0Parser.ASSIGNMENT, 0); }
		public ConstExprContext constExpr() {
			return getRuleContext(ConstExprContext.class,0);
		}
		public ConstVariableDeclDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constVariableDeclDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterConstVariableDeclDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitConstVariableDeclDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitConstVariableDeclDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstVariableDeclDefinitionContext constVariableDeclDefinition() throws RecognitionException {
		ConstVariableDeclDefinitionContext _localctx = new ConstVariableDeclDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constVariableDeclDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(COLON);
			setState(157);
			dataTypes();
			setState(158);
			match(ASSIGNMENT);
			setState(159);
			constExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclDefinitionContext extends ParserRuleContext {
		public ConstVariableDeclDefinitionContext constVariableDeclDefinition() {
			return getRuleContext(ConstVariableDeclDefinitionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PL0Parser.ID, 0); }
		public TerminalNode COLON() { return getToken(PL0Parser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterVariableDeclDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitVariableDeclDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitVariableDeclDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclDefinitionContext variableDeclDefinition() throws RecognitionException {
		VariableDeclDefinitionContext _localctx = new VariableDeclDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclDefinition);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				constVariableDeclDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(ID);
				setState(163);
				match(COLON);
				setState(164);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PL0Parser.ID, 0); }
		public DataTypesTerminalsContext dataTypesTerminals() {
			return getRuleContext(DataTypesTerminalsContext.class,0);
		}
		public ConstExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExprContext constExpr() throws RecognitionException {
		ConstExprContext _localctx = new ConstExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constExpr);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(ID);
				}
				break;
			case INTEGER:
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				dataTypesTerminals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcDeclContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(PL0Parser.PROCEDURE, 0); }
		public List<TerminalNode> ID() { return getTokens(PL0Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PL0Parser.ID, i);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(PL0Parser.BRACKET_OPEN, 0); }
		public ProcFormalCallChoiceContext procFormalCallChoice() {
			return getRuleContext(ProcFormalCallChoiceContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(PL0Parser.BRACKET_CLOSE, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PL0Parser.SEMICOLON, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ProcDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterProcDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitProcDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitProcDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcDeclContext procDecl() throws RecognitionException {
		ProcDeclContext _localctx = new ProcDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_procDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(PROCEDURE);
			setState(172);
			match(ID);
			setState(173);
			match(BRACKET_OPEN);
			setState(174);
			procFormalCallChoice();
			setState(175);
			match(BRACKET_CLOSE);
			setState(176);
			returnType();
			setState(177);
			match(SEMICOLON);
			setState(178);
			statementBlock();
			setState(179);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PL0Parser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnType);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(COLON);
				setState(182);
				type();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcFormalCallChoiceContext extends ParserRuleContext {
		public FormalDeclContext formalDecl() {
			return getRuleContext(FormalDeclContext.class,0);
		}
		public FormalDeclInnerRepeatContext formalDeclInnerRepeat() {
			return getRuleContext(FormalDeclInnerRepeatContext.class,0);
		}
		public ProcFormalCallChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procFormalCallChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterProcFormalCallChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitProcFormalCallChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitProcFormalCallChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcFormalCallChoiceContext procFormalCallChoice() throws RecognitionException {
		ProcFormalCallChoiceContext _localctx = new ProcFormalCallChoiceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_procFormalCallChoice);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				formalDecl();
				setState(187);
				formalDeclInnerRepeat();
				}
				break;
			case BRACKET_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalDeclInnerRepeatContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(PL0Parser.COMMA, 0); }
		public FormalDeclContext formalDecl() {
			return getRuleContext(FormalDeclContext.class,0);
		}
		public FormalDeclInnerRepeatContext formalDeclInnerRepeat() {
			return getRuleContext(FormalDeclInnerRepeatContext.class,0);
		}
		public FormalDeclInnerRepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalDeclInnerRepeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterFormalDeclInnerRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitFormalDeclInnerRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitFormalDeclInnerRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalDeclInnerRepeatContext formalDeclInnerRepeat() throws RecognitionException {
		FormalDeclInnerRepeatContext _localctx = new FormalDeclInnerRepeatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formalDeclInnerRepeat);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(COMMA);
				setState(193);
				formalDecl();
				setState(194);
				formalDeclInnerRepeat();
				}
				break;
			case BRACKET_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PL0Parser.ID, 0); }
		public TerminalNode COLON() { return getToken(PL0Parser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterFormalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitFormalDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitFormalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalDeclContext formalDecl() throws RecognitionException {
		FormalDeclContext _localctx = new FormalDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formalDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
			setState(200);
			match(COLON);
			setState(201);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public ArrTypeContext arrType() {
			return getRuleContext(ArrTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				dataTypes();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				arrType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PL0Parser.ARRAY, 0); }
		public TerminalNode SQ_OPEN() { return getToken(PL0Parser.SQ_OPEN, 0); }
		public TerminalNode INTEGER() { return getToken(PL0Parser.INTEGER, 0); }
		public TerminalNode SQ_CLOSE() { return getToken(PL0Parser.SQ_CLOSE, 0); }
		public TerminalNode OF() { return getToken(PL0Parser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterArrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitArrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitArrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrTypeContext arrType() throws RecognitionException {
		ArrTypeContext _localctx = new ArrTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(ARRAY);
			setState(208);
			match(SQ_OPEN);
			setState(209);
			match(INTEGER);
			setState(210);
			match(SQ_CLOSE);
			setState(211);
			match(OF);
			setState(212);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainStmtListContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PL0Parser.SEMICOLON, 0); }
		public StmtListStmtInnerContext stmtListStmtInner() {
			return getRuleContext(StmtListStmtInnerContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public MainStmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterMainStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitMainStmtList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitMainStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStmtListContext mainStmtList() throws RecognitionException {
		MainStmtListContext _localctx = new MainStmtListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mainStmtList);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				decl();
				setState(215);
				match(SEMICOLON);
				setState(216);
				stmtListStmtInner();
				}
				break;
			case IF:
			case OUTPUT:
			case RETURN:
			case WHILE:
			case FOR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				stmt();
				setState(219);
				match(SEMICOLON);
				setState(220);
				stmtListStmtInner();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtListStmtInnerContext extends ParserRuleContext {
		public MainStmtListContext mainStmtList() {
			return getRuleContext(MainStmtListContext.class,0);
		}
		public StmtListStmtInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtListStmtInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterStmtListStmtInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitStmtListStmtInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitStmtListStmtInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListStmtInnerContext stmtListStmtInner() throws RecognitionException {
		StmtListStmtInnerContext _localctx = new StmtListStmtInnerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stmtListStmtInner);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				mainStmtList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtListContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PL0Parser.SEMICOLON, 0); }
		public BlockStmtListInnerContext blockStmtListInner() {
			return getRuleContext(BlockStmtListInnerContext.class,0);
		}
		public BlockStmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterBlockStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitBlockStmtList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitBlockStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtListContext blockStmtList() throws RecognitionException {
		BlockStmtListContext _localctx = new BlockStmtListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_blockStmtList);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case OUTPUT:
			case RETURN:
			case WHILE:
			case FOR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				stmt();
				setState(230);
				match(SEMICOLON);
				setState(231);
				blockStmtListInner();
				}
				break;
			case END:
			case SQ_OPEN:
			case SQ_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtListInnerContext extends ParserRuleContext {
		public BlockStmtListContext blockStmtList() {
			return getRuleContext(BlockStmtListContext.class,0);
		}
		public BlockStmtListInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmtListInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterBlockStmtListInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitBlockStmtListInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitBlockStmtListInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtListInnerContext blockStmtListInner() throws RecognitionException {
		BlockStmtListInnerContext _localctx = new BlockStmtListInnerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_blockStmtListInner);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				blockStmtList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public OutStmtContext outStmt() {
			return getRuleContext(OutStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_stmt);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				callStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				assignStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				returnStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				outStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				ifStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				whileStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				forStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PL0Parser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(PL0Parser.BRACKET_OPEN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(PL0Parser.BRACKET_CLOSE, 0); }
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_callStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			setState(250);
			match(BRACKET_OPEN);
			setState(251);
			parameters();
			setState(252);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParametersInnerRepeatContext parametersInnerRepeat() {
			return getRuleContext(ParametersInnerRepeatContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameters);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case ID:
			case INTEGER:
			case DECIMAL:
			case MINUS:
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				expr();
				setState(255);
				parametersInnerRepeat();
				}
				break;
			case BRACKET_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersInnerRepeatContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(PL0Parser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParametersInnerRepeatContext parametersInnerRepeat() {
			return getRuleContext(ParametersInnerRepeatContext.class,0);
		}
		public ParametersInnerRepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersInnerRepeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterParametersInnerRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitParametersInnerRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitParametersInnerRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersInnerRepeatContext parametersInnerRepeat() throws RecognitionException {
		ParametersInnerRepeatContext _localctx = new ParametersInnerRepeatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parametersInnerRepeat);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(COMMA);
				setState(261);
				expr();
				setState(262);
				parametersInnerRepeat();
				}
				break;
			case BRACKET_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PL0Parser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			lvalue();
			setState(268);
			match(ASSIGNMENT);
			setState(269);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PL0Parser.ID, 0); }
		public ArrayIntSelectionContext arrayIntSelection() {
			return getRuleContext(ArrayIntSelectionContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ID);
			setState(272);
			arrayIntSelection();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayIntSelectionContext extends ParserRuleContext {
		public TerminalNode SQ_OPEN() { return getToken(PL0Parser.SQ_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQ_CLOSE() { return getToken(PL0Parser.SQ_CLOSE, 0); }
		public ArrayIntSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIntSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterArrayIntSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitArrayIntSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitArrayIntSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIntSelectionContext arrayIntSelection() throws RecognitionException {
		ArrayIntSelectionContext _localctx = new ArrayIntSelectionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayIntSelection);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQ_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(SQ_OPEN);
				setState(275);
				expr();
				setState(276);
				match(SQ_CLOSE);
				}
				break;
			case THEN:
			case OR:
			case AND:
			case DO:
			case TO:
			case PLUS:
			case MINUS:
			case MULTIPLICATION:
			case DIVISION:
			case ASSIGNMENT:
			case EQUAL:
			case NOTEQUAL:
			case GT:
			case LT:
			case GTE:
			case LTE:
			case SEMICOLON:
			case COMMA:
			case BRACKET_CLOSE:
			case SQ_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PL0Parser.RETURN, 0); }
		public ReturnStatementChoiceContext returnStatementChoice() {
			return getRuleContext(ReturnStatementChoiceContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(RETURN);
			setState(282);
			returnStatementChoice();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementChoiceContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatementChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterReturnStatementChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitReturnStatementChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitReturnStatementChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementChoiceContext returnStatementChoice() throws RecognitionException {
		ReturnStatementChoiceContext _localctx = new ReturnStatementChoiceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returnStatementChoice);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case ID:
			case INTEGER:
			case DECIMAL:
			case MINUS:
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				expr();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutStmtContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(PL0Parser.OUTPUT, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(PL0Parser.ASSIGNMENT, 0); }
		public OutStmtInnerContext outStmtInner() {
			return getRuleContext(OutStmtInnerContext.class,0);
		}
		public OutStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterOutStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitOutStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitOutStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutStmtContext outStmt() throws RecognitionException {
		OutStmtContext _localctx = new OutStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_outStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(OUTPUT);
			setState(289);
			match(ASSIGNMENT);
			setState(290);
			outStmtInner();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutStmtInnerContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PL0Parser.STRING, 0); }
		public OutStmtInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outStmtInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterOutStmtInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitOutStmtInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitOutStmtInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutStmtInnerContext outStmtInner() throws RecognitionException {
		OutStmtInnerContext _localctx = new OutStmtInnerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_outStmtInner);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case ID:
			case INTEGER:
			case DECIMAL:
			case MINUS:
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				expr();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PL0Parser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PL0Parser.THEN, 0); }
		public BlockStmtListContext blockStmtList() {
			return getRuleContext(BlockStmtListContext.class,0);
		}
		public IfStmtInnerContext ifStmtInner() {
			return getRuleContext(IfStmtInnerContext.class,0);
		}
		public TerminalNode END() { return getToken(PL0Parser.END, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(IF);
			setState(297);
			condition();
			setState(298);
			match(THEN);
			setState(299);
			blockStmtList();
			setState(300);
			ifStmtInner();
			setState(301);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtInnerContext extends ParserRuleContext {
		public TerminalNode SQ_OPEN() { return getToken(PL0Parser.SQ_OPEN, 0); }
		public TerminalNode ELSE() { return getToken(PL0Parser.ELSE, 0); }
		public BlockStmtListContext blockStmtList() {
			return getRuleContext(BlockStmtListContext.class,0);
		}
		public TerminalNode SQ_CLOSE() { return getToken(PL0Parser.SQ_CLOSE, 0); }
		public IfStmtInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmtInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterIfStmtInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitIfStmtInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitIfStmtInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtInnerContext ifStmtInner() throws RecognitionException {
		IfStmtInnerContext _localctx = new IfStmtInnerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ifStmtInner);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQ_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(SQ_OPEN);
				setState(304);
				match(ELSE);
				setState(305);
				blockStmtList();
				setState(306);
				match(SQ_CLOSE);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PL0Parser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO() { return getToken(PL0Parser.DO, 0); }
		public BlockStmtListContext blockStmtList() {
			return getRuleContext(BlockStmtListContext.class,0);
		}
		public TerminalNode END() { return getToken(PL0Parser.END, 0); }
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(WHILE);
			setState(312);
			condition();
			setState(313);
			match(DO);
			setState(314);
			blockStmtList();
			setState(315);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PL0Parser.FOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(PL0Parser.TO, 0); }
		public TerminalNode DO() { return getToken(PL0Parser.DO, 0); }
		public BlockStmtListContext blockStmtList() {
			return getRuleContext(BlockStmtListContext.class,0);
		}
		public TerminalNode END() { return getToken(PL0Parser.END, 0); }
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(FOR);
			setState(318);
			expr();
			setState(319);
			match(TO);
			setState(320);
			expr();
			setState(321);
			match(DO);
			setState(322);
			blockStmtList();
			setState(323);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public ConditionBooleansContext conditionBooleans() {
			return getRuleContext(ConditionBooleansContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PL0Parser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_condition);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case ODD:
			case ID:
			case INTEGER:
			case DECIMAL:
			case MINUS:
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				conditionStatement();
				setState(326);
				conditionBooleans();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(NOT);
				setState(329);
				condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionBooleansContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(PL0Parser.AND, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode OR() { return getToken(PL0Parser.OR, 0); }
		public ConditionBooleansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBooleans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterConditionBooleans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitConditionBooleans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitConditionBooleans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBooleansContext conditionBooleans() throws RecognitionException {
		ConditionBooleansContext _localctx = new ConditionBooleansContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_conditionBooleans);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(AND);
				setState(333);
				condition();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(OR);
				setState(335);
				condition();
				}
				break;
			case THEN:
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionStatementContext extends ParserRuleContext {
		public TerminalNode ODD() { return getToken(PL0Parser.ODD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionalOperationsContext conditionalOperations() {
			return getRuleContext(ConditionalOperationsContext.class,0);
		}
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitConditionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitConditionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditionStatement);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ODD:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(ODD);
				setState(340);
				expr();
				}
				break;
			case INPUT:
			case ID:
			case INTEGER:
			case DECIMAL:
			case MINUS:
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				expr();
				setState(342);
				conditionalOperations();
				setState(343);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalOperationsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(PL0Parser.LT, 0); }
		public TerminalNode LTE() { return getToken(PL0Parser.LTE, 0); }
		public TerminalNode EQUAL() { return getToken(PL0Parser.EQUAL, 0); }
		public TerminalNode GTE() { return getToken(PL0Parser.GTE, 0); }
		public TerminalNode GT() { return getToken(PL0Parser.GT, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PL0Parser.NOTEQUAL, 0); }
		public ConditionalOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOperations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterConditionalOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitConditionalOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitConditionalOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOperationsContext conditionalOperations() throws RecognitionException {
		ConditionalOperationsContext _localctx = new ConditionalOperationsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_conditionalOperations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionInnerContext expressionInner() {
			return getRuleContext(ExpressionInnerContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			term();
			setState(350);
			expressionInner();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionInnerContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PL0Parser.PLUS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionInnerContext expressionInner() {
			return getRuleContext(ExpressionInnerContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PL0Parser.MINUS, 0); }
		public ExpressionInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterExpressionInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitExpressionInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitExpressionInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInnerContext expressionInner() throws RecognitionException {
		ExpressionInnerContext _localctx = new ExpressionInnerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressionInner);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(PLUS);
				setState(353);
				term();
				setState(354);
				expressionInner();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(MINUS);
				setState(357);
				term();
				setState(358);
				expressionInner();
				}
				break;
			case THEN:
			case OR:
			case AND:
			case DO:
			case TO:
			case EQUAL:
			case NOTEQUAL:
			case GT:
			case LT:
			case GTE:
			case LTE:
			case SEMICOLON:
			case COMMA:
			case BRACKET_CLOSE:
			case SQ_CLOSE:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermMultDivFactorContext termMultDivFactor() {
			return getRuleContext(TermMultDivFactorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			factor();
			setState(364);
			termMultDivFactor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermMultDivFactorContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(PL0Parser.MULTIPLICATION, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermMultDivFactorContext termMultDivFactor() {
			return getRuleContext(TermMultDivFactorContext.class,0);
		}
		public TerminalNode DIVISION() { return getToken(PL0Parser.DIVISION, 0); }
		public TermMultDivFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termMultDivFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterTermMultDivFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitTermMultDivFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitTermMultDivFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermMultDivFactorContext termMultDivFactor() throws RecognitionException {
		TermMultDivFactorContext _localctx = new TermMultDivFactorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_termMultDivFactor);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(MULTIPLICATION);
				setState(367);
				factor();
				setState(368);
				termMultDivFactor();
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(DIVISION);
				setState(371);
				factor();
				setState(372);
				termMultDivFactor();
				}
				break;
			case THEN:
			case OR:
			case AND:
			case DO:
			case TO:
			case PLUS:
			case MINUS:
			case EQUAL:
			case NOTEQUAL:
			case GT:
			case LT:
			case GTE:
			case LTE:
			case SEMICOLON:
			case COMMA:
			case BRACKET_CLOSE:
			case SQ_CLOSE:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(PL0Parser.MINUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public DataTypesTerminalsContext dataTypesTerminals() {
			return getRuleContext(DataTypesTerminalsContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(PL0Parser.INPUT, 0); }
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(PL0Parser.BRACKET_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(PL0Parser.BRACKET_CLOSE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL0Listener ) ((PL0Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL0Visitor ) return ((PL0Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_factor);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(MINUS);
				setState(378);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				lvalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				dataTypesTerminals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				match(INPUT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				callStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(383);
				match(BRACKET_OPEN);
				setState(384);
				expr();
				setState(385);
				match(BRACKET_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u0186\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003x\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004|\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0080\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u008f\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u009a\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00a6\b\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00aa\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b9\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00bf\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c6\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00ce\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00e0\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00e4\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00eb\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u00ef\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u00f8\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0103\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u010a\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0118\b \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0003\""+
		"\u011f\b\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0003$\u0127\b$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u0136\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u014b\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u0152\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u015a\b+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u016a\b.\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0003"+
		"0\u0178\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00031\u0184\b1\u00011\u0000\u00002\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`b\u0000\u0003\u0001\u0000\t\n\u0001\u0000\u001c"+
		"\u001d\u0001\u0000#(\u017c\u0000d\u0001\u0000\u0000\u0000\u0002k\u0001"+
		"\u0000\u0000\u0000\u0004n\u0001\u0000\u0000\u0000\u0006w\u0001\u0000\u0000"+
		"\u0000\b{\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u0081"+
		"\u0001\u0000\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000\u0010\u0085"+
		"\u0001\u0000\u0000\u0000\u0012\u008e\u0001\u0000\u0000\u0000\u0014\u0090"+
		"\u0001\u0000\u0000\u0000\u0016\u0099\u0001\u0000\u0000\u0000\u0018\u009b"+
		"\u0001\u0000\u0000\u0000\u001a\u00a5\u0001\u0000\u0000\u0000\u001c\u00a9"+
		"\u0001\u0000\u0000\u0000\u001e\u00ab\u0001\u0000\u0000\u0000 \u00b8\u0001"+
		"\u0000\u0000\u0000\"\u00be\u0001\u0000\u0000\u0000$\u00c5\u0001\u0000"+
		"\u0000\u0000&\u00c7\u0001\u0000\u0000\u0000(\u00cd\u0001\u0000\u0000\u0000"+
		"*\u00cf\u0001\u0000\u0000\u0000,\u00df\u0001\u0000\u0000\u0000.\u00e3"+
		"\u0001\u0000\u0000\u00000\u00ea\u0001\u0000\u0000\u00002\u00ee\u0001\u0000"+
		"\u0000\u00004\u00f7\u0001\u0000\u0000\u00006\u00f9\u0001\u0000\u0000\u0000"+
		"8\u0102\u0001\u0000\u0000\u0000:\u0109\u0001\u0000\u0000\u0000<\u010b"+
		"\u0001\u0000\u0000\u0000>\u010f\u0001\u0000\u0000\u0000@\u0117\u0001\u0000"+
		"\u0000\u0000B\u0119\u0001\u0000\u0000\u0000D\u011e\u0001\u0000\u0000\u0000"+
		"F\u0120\u0001\u0000\u0000\u0000H\u0126\u0001\u0000\u0000\u0000J\u0128"+
		"\u0001\u0000\u0000\u0000L\u0135\u0001\u0000\u0000\u0000N\u0137\u0001\u0000"+
		"\u0000\u0000P\u013d\u0001\u0000\u0000\u0000R\u014a\u0001\u0000\u0000\u0000"+
		"T\u0151\u0001\u0000\u0000\u0000V\u0159\u0001\u0000\u0000\u0000X\u015b"+
		"\u0001\u0000\u0000\u0000Z\u015d\u0001\u0000\u0000\u0000\\\u0169\u0001"+
		"\u0000\u0000\u0000^\u016b\u0001\u0000\u0000\u0000`\u0177\u0001\u0000\u0000"+
		"\u0000b\u0183\u0001\u0000\u0000\u0000de\u0005\u0002\u0000\u0000ef\u0005"+
		"\u0004\u0000\u0000fg\u0005)\u0000\u0000gh\u0003\u0002\u0001\u0000hi\u0005"+
		"\u0004\u0000\u0000ij\u0005+\u0000\u0000j\u0001\u0001\u0000\u0000\u0000"+
		"kl\u0003\u0006\u0003\u0000lm\u0003\u0004\u0002\u0000m\u0003\u0001\u0000"+
		"\u0000\u0000no\u0005\u0005\u0000\u0000op\u0003,\u0016\u0000pq\u0005\u0006"+
		"\u0000\u0000q\u0005\u0001\u0000\u0000\u0000rs\u0003\b\u0004\u0000st\u0005"+
		")\u0000\u0000tu\u0003\u0006\u0003\u0000ux\u0001\u0000\u0000\u0000vx\u0001"+
		"\u0000\u0000\u0000wr\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x\u0007\u0001\u0000\u0000\u0000y|\u0003\n\u0005\u0000z|\u0003\u001e\u000f"+
		"\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\t\u0001\u0000"+
		"\u0000\u0000}\u0080\u0003\u0010\b\u0000~\u0080\u0003\u0014\n\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u000b\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0007\u0000\u0000\u0000\u0082\r\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0007\u0001\u0000\u0000\u0084\u000f\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005\u0007\u0000\u0000\u0086\u0087\u0003\u0018"+
		"\f\u0000\u0087\u0088\u0003\u0012\t\u0000\u0088\u0011\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005,\u0000\u0000\u008a\u008b\u0003\u0018\f\u0000"+
		"\u008b\u008c\u0003\u0012\t\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d"+
		"\u008f\u0001\u0000\u0000\u0000\u008e\u0089\u0001\u0000\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0013\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005\b\u0000\u0000\u0091\u0092\u0003\u001a\r\u0000\u0092\u0093"+
		"\u0003\u0016\u000b\u0000\u0093\u0015\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005,\u0000\u0000\u0095\u0096\u0003\u001a\r\u0000\u0096\u0097\u0003"+
		"\u0016\u000b\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u009a\u0001"+
		"\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u0017\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u001b\u0000\u0000\u009c\u009d\u0005*\u0000\u0000\u009d\u009e\u0003\f"+
		"\u0006\u0000\u009e\u009f\u0005\"\u0000\u0000\u009f\u00a0\u0003\u001c\u000e"+
		"\u0000\u00a0\u0019\u0001\u0000\u0000\u0000\u00a1\u00a6\u0003\u0018\f\u0000"+
		"\u00a2\u00a3\u0005\u001b\u0000\u0000\u00a3\u00a4\u0005*\u0000\u0000\u00a4"+
		"\u00a6\u0003(\u0014\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a6\u001b\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0005\u001b\u0000\u0000\u00a8\u00aa\u0003\u000e\u0007\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u001d"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac\u00ad"+
		"\u0005\u001b\u0000\u0000\u00ad\u00ae\u0005-\u0000\u0000\u00ae\u00af\u0003"+
		"\"\u0011\u0000\u00af\u00b0\u0005.\u0000\u0000\u00b0\u00b1\u0003 \u0010"+
		"\u0000\u00b1\u00b2\u0005)\u0000\u0000\u00b2\u00b3\u0003\u0004\u0002\u0000"+
		"\u00b3\u00b4\u0005\u001b\u0000\u0000\u00b4\u001f\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005*\u0000\u0000\u00b6\u00b9\u0003(\u0014\u0000\u00b7\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9!\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003"+
		"&\u0013\u0000\u00bb\u00bc\u0003$\u0012\u0000\u00bc\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00ba\u0001\u0000\u0000"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf#\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0005,\u0000\u0000\u00c1\u00c2\u0003&\u0013\u0000\u00c2\u00c3"+
		"\u0003$\u0012\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6%\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u001b"+
		"\u0000\u0000\u00c8\u00c9\u0005*\u0000\u0000\u00c9\u00ca\u0003(\u0014\u0000"+
		"\u00ca\'\u0001\u0000\u0000\u0000\u00cb\u00ce\u0003\f\u0006\u0000\u00cc"+
		"\u00ce\u0003*\u0015\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce)\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0019\u0000\u0000\u00d0\u00d1\u0005/\u0000\u0000\u00d1\u00d2\u0005\u001c"+
		"\u0000\u0000\u00d2\u00d3\u00050\u0000\u0000\u00d3\u00d4\u0005\u001a\u0000"+
		"\u0000\u00d4\u00d5\u0003(\u0014\u0000\u00d5+\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0003\n\u0005\u0000\u00d7\u00d8\u0005)\u0000\u0000\u00d8\u00d9"+
		"\u0003.\u0017\u0000\u00d9\u00e0\u0001\u0000\u0000\u0000\u00da\u00db\u0003"+
		"4\u001a\u0000\u00db\u00dc\u0005)\u0000\u0000\u00dc\u00dd\u0003.\u0017"+
		"\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000"+
		"\u0000\u00df\u00d6\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0-\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e4\u0003,\u0016\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"/\u0001\u0000\u0000\u0000\u00e5\u00e6\u00034\u001a\u0000\u00e6\u00e7\u0005"+
		")\u0000\u0000\u00e7\u00e8\u00032\u0019\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb1\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u00030\u0018\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"3\u0001\u0000\u0000\u0000\u00f0\u00f8\u00036\u001b\u0000\u00f1\u00f8\u0003"+
		"<\u001e\u0000\u00f2\u00f8\u0003B!\u0000\u00f3\u00f8\u0003F#\u0000\u00f4"+
		"\u00f8\u0003J%\u0000\u00f5\u00f8\u0003N\'\u0000\u00f6\u00f8\u0003P(\u0000"+
		"\u00f7\u00f0\u0001\u0000\u0000\u0000\u00f7\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f2\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f85\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0005\u001b\u0000\u0000\u00fa\u00fb\u0005-\u0000\u0000\u00fb\u00fc"+
		"\u00038\u001c\u0000\u00fc\u00fd\u0005.\u0000\u0000\u00fd7\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0003Z-\u0000\u00ff\u0100\u0003:\u001d\u0000"+
		"\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000"+
		"\u0102\u00fe\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u01039\u0001\u0000\u0000\u0000\u0104\u0105\u0005,\u0000\u0000\u0105\u0106"+
		"\u0003Z-\u0000\u0106\u0107\u0003:\u001d\u0000\u0107\u010a\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000"+
		"\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a;\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0003>\u001f\u0000\u010c\u010d\u0005\"\u0000\u0000"+
		"\u010d\u010e\u0003Z-\u0000\u010e=\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0005\u001b\u0000\u0000\u0110\u0111\u0003@ \u0000\u0111?\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0005/\u0000\u0000\u0113\u0114\u0003Z-\u0000"+
		"\u0114\u0115\u00050\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116"+
		"\u0118\u0001\u0000\u0000\u0000\u0117\u0112\u0001\u0000\u0000\u0000\u0117"+
		"\u0116\u0001\u0000\u0000\u0000\u0118A\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005\u0011\u0000\u0000\u011a\u011b\u0003D\"\u0000\u011bC\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0003Z-\u0000\u011d\u011f\u0001\u0000\u0000\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000"+
		"\u011fE\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u000f\u0000\u0000\u0121"+
		"\u0122\u0005\"\u0000\u0000\u0122\u0123\u0003H$\u0000\u0123G\u0001\u0000"+
		"\u0000\u0000\u0124\u0127\u0003Z-\u0000\u0125\u0127\u00053\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000"+
		"\u0127I\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u000b\u0000\u0000\u0129"+
		"\u012a\u0003R)\u0000\u012a\u012b\u0005\f\u0000\u0000\u012b\u012c\u0003"+
		"0\u0018\u0000\u012c\u012d\u0003L&\u0000\u012d\u012e\u0005\u0006\u0000"+
		"\u0000\u012eK\u0001\u0000\u0000\u0000\u012f\u0130\u0005/\u0000\u0000\u0130"+
		"\u0131\u0005\r\u0000\u0000\u0131\u0132\u00030\u0018\u0000\u0132\u0133"+
		"\u00050\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0136\u0001"+
		"\u0000\u0000\u0000\u0135\u012f\u0001\u0000\u0000\u0000\u0135\u0134\u0001"+
		"\u0000\u0000\u0000\u0136M\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u0015"+
		"\u0000\u0000\u0138\u0139\u0003R)\u0000\u0139\u013a\u0005\u0016\u0000\u0000"+
		"\u013a\u013b\u00030\u0018\u0000\u013b\u013c\u0005\u0006\u0000\u0000\u013c"+
		"O\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0017\u0000\u0000\u013e\u013f"+
		"\u0003Z-\u0000\u013f\u0140\u0005\u0018\u0000\u0000\u0140\u0141\u0003Z"+
		"-\u0000\u0141\u0142\u0005\u0016\u0000\u0000\u0142\u0143\u00030\u0018\u0000"+
		"\u0143\u0144\u0005\u0006\u0000\u0000\u0144Q\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0003V+\u0000\u0146\u0147\u0003T*\u0000\u0147\u014b\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005\u0014\u0000\u0000\u0149\u014b\u0003R)\u0000"+
		"\u014a\u0145\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000"+
		"\u014bS\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u0013\u0000\u0000\u014d"+
		"\u0152\u0003R)\u0000\u014e\u014f\u0005\u0012\u0000\u0000\u014f\u0152\u0003"+
		"R)\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014c\u0001\u0000\u0000"+
		"\u0000\u0151\u014e\u0001\u0000\u0000\u0000\u0151\u0150\u0001\u0000\u0000"+
		"\u0000\u0152U\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u0010\u0000\u0000"+
		"\u0154\u015a\u0003Z-\u0000\u0155\u0156\u0003Z-\u0000\u0156\u0157\u0003"+
		"X,\u0000\u0157\u0158\u0003Z-\u0000\u0158\u015a\u0001\u0000\u0000\u0000"+
		"\u0159\u0153\u0001\u0000\u0000\u0000\u0159\u0155\u0001\u0000\u0000\u0000"+
		"\u015aW\u0001\u0000\u0000\u0000\u015b\u015c\u0007\u0002\u0000\u0000\u015c"+
		"Y\u0001\u0000\u0000\u0000\u015d\u015e\u0003^/\u0000\u015e\u015f\u0003"+
		"\\.\u0000\u015f[\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u001e\u0000"+
		"\u0000\u0161\u0162\u0003^/\u0000\u0162\u0163\u0003\\.\u0000\u0163\u016a"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u001f\u0000\u0000\u0165\u0166"+
		"\u0003^/\u0000\u0166\u0167\u0003\\.\u0000\u0167\u016a\u0001\u0000\u0000"+
		"\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u0160\u0001\u0000\u0000"+
		"\u0000\u0169\u0164\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u016a]\u0001\u0000\u0000\u0000\u016b\u016c\u0003b1\u0000\u016c"+
		"\u016d\u0003`0\u0000\u016d_\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		" \u0000\u0000\u016f\u0170\u0003b1\u0000\u0170\u0171\u0003`0\u0000\u0171"+
		"\u0178\u0001\u0000\u0000\u0000\u0172\u0173\u0005!\u0000\u0000\u0173\u0174"+
		"\u0003b1\u0000\u0174\u0175\u0003`0\u0000\u0175\u0178\u0001\u0000\u0000"+
		"\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u016e\u0001\u0000\u0000"+
		"\u0000\u0177\u0172\u0001\u0000\u0000\u0000\u0177\u0176\u0001\u0000\u0000"+
		"\u0000\u0178a\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u001f\u0000\u0000"+
		"\u017a\u0184\u0003b1\u0000\u017b\u0184\u0003>\u001f\u0000\u017c\u0184"+
		"\u0003\u000e\u0007\u0000\u017d\u0184\u0005\u000e\u0000\u0000\u017e\u0184"+
		"\u00036\u001b\u0000\u017f\u0180\u0005-\u0000\u0000\u0180\u0181\u0003Z"+
		"-\u0000\u0181\u0182\u0005.\u0000\u0000\u0182\u0184\u0001\u0000\u0000\u0000"+
		"\u0183\u0179\u0001\u0000\u0000\u0000\u0183\u017b\u0001\u0000\u0000\u0000"+
		"\u0183\u017c\u0001\u0000\u0000\u0000\u0183\u017d\u0001\u0000\u0000\u0000"+
		"\u0183\u017e\u0001\u0000\u0000\u0000\u0183\u017f\u0001\u0000\u0000\u0000"+
		"\u0184c\u0001\u0000\u0000\u0000\u001cw{\u007f\u008e\u0099\u00a5\u00a9"+
		"\u00b8\u00be\u00c5\u00cd\u00df\u00e3\u00ea\u00ee\u00f7\u0102\u0109\u0117"+
		"\u011e\u0126\u0135\u014a\u0151\u0159\u0169\u0177\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}