grammar PL0;
@parser::header { package PL0Modules; }
@lexer::header { package PL0Modules; }

//TODO: Add decimal types

program : MODULE MAIN SEMICOLON block MAIN DOT;

//globalDeclList -> globals
//stmtList -> body
block : globalDeclList statementBlock;
statementBlock: BEGIN mainStmtList END;

//globalDecl -> declarations allowed in global scope
globalDeclList : globalDecl SEMICOLON globalDeclList | ;

//global declaraions
globalDecl : decl | procDecl;

//local declarations
decl : constDecl
    | varDecl;

dataTypes: INT | FLOAT;
dataTypesTerminals: INTEGER | DECIMAL;

//const declaration, can only be int
constDecl : CONST dataTypes constDeclItemInner;
constDeclItemInner : COMMA dataTypes constDeclItemInner | ;

//variable declaraion, can be int and array
varDecl : VAR variableDeclDefinition varDeclItemInner;
varDeclItemInner: COMMA variableDeclDefinition varDeclItemInner | ;

//actual assignment de
variableDeclDefinition : ID COLON dataTypes EQUAL constExpr | ID COLON type;

//value rhs of assignment
constExpr : ID
    dataTypesTerminals;

//procedure declaration
procDecl : PROCEDURE ID BRACKET_OPEN procFormalCallChoice BRACKET_CLOSE returnType SEMICOLON statementBlock ID;

//returnTYpe
returnType: COLON type | ;

//list of parameters
procFormalCallChoice : formalDecl formalDeclInnerRepeat | ;
formalDeclInnerRepeat: COMMA formalDecl formalDeclInnerRepeat | ;
formalDecl : ID COLON type;

type : dataTypes
    | arrType;
arrType: ARRAY SQ_OPEN INTEGER SQ_CLOSE OF type;

//main body
mainStmtList: decl SEMICOLON stmtListStmtInner | stmt SEMICOLON stmtListStmtInner | ;
stmtListStmtInner: mainStmtList | ;

//statementLists for content to avoid declarations
blockStmtList: stmt SEMICOLON blockStmtListInner | ;
blockStmtListInner: blockStmtList | ;

//actual statements
stmt : callStmt
    | assignStmt
    | returnStmt
    | outStmt
    | ifStmt
    | whileStmt
    | forStmt;

//function call
callStmt : ID BRACKET_OPEN parameters BRACKET_CLOSE;

//parameters
parameters: expr parametersInnerRepeat | ;
parametersInnerRepeat: COMMA expr parametersInnerRepeat | ;

//parameters : paremeterExpression | ;
//paremeterExpression : expr parameterExtension;
//parameterExtension: COMMA expr parameters | ;

//assignment statements
assignStmt : lvalue ASSIGNMENT expr;
lvalue : ID arrayIntSelection;
arrayIntSelection : SQ_OPEN expr SQ_CLOSE | ;

//return
returnStmt : RETURN returnStatementChoice;
returnStatementChoice: expr | ;

outStmt : OUTPUT ASSIGNMENT outStmtInner;
outStmtInner: expr | STRING;

//if statement
ifStmt : IF condition THEN blockStmtList ifStmtInner END;
ifStmtInner: SQ_OPEN ELSE blockStmtList SQ_CLOSE | ;

//loops
whileStmt : WHILE condition DO blockStmtList END;
forStmt : FOR expr TO expr DO blockStmtList END;

//conditions for loops and if
condition : conditionStatement conditionBooleans
   | NOT condition;
conditionBooleans: AND condition | OR condition | ;

//condition statement can either be odd or expressiosn with conditions
conditionStatement : ODD expr
    | expr conditionalOperations expr;

//operations for contitions
conditionalOperations : LT
    | LTE
    | EQUAL
    | GTE
    | GT
    | NOTEQUAL;

//expressionsn with factors
expr : term expressionInner;
expressionInner: PLUS term expressionInner | MINUS term expressionInner | ;
term : factor termMultDivFactor;
termMultDivFactor: MULTIPLICATION factor termMultDivFactor | DIVISION factor termMultDivFactor | ;
factor : MINUS factor
    | lvalue
    | dataTypesTerminals
    | INPUT
    | callStmt
    | BRACKET_OPEN expr BRACKET_CLOSE;

//Spaces and non-graphical characters
WS: ('\n' | '\t' | ' ') -> skip;

//keywords
MODULE: 'module';
PROCEDURE: 'procedure';
MAIN: 'main';
BEGIN: 'begin';
END: 'end';
CONST: 'const';
VAR: 'var';
INT: 'int';
FLOAT: 'float';
IF: 'if';
THEN: 'then';
ELSE: 'else';
INPUT: 'input';
OUTPUT: 'output';
ODD: 'odd';
RETURN: 'return';

//Boolean operators
OR: 'or';
AND: 'and';
NOT: 'not';

//While loop
WHILE: 'while';
DO: 'do';

//For Loop
FOR: 'for';
TO: 'to';

//Extended tokens for arrays
ARRAY: 'array';
OF: 'of';

//Variables and values
ID: ([a-zA-Z_][a-zA-Z0-9_]*);
INTEGER: [0]|[1-9]+[0-9]*;
DECIMAL: [0]|[1-9]+[0-9]*'.'[0-9]+;

//operators
PLUS: '+';
MINUS: '-';
MULTIPLICATION: '*';
DIVISION: '/';
ASSIGNMENT: ':=';
EQUAL: '=';
NOTEQUAL: '<>';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';

//Punctuations
SEMICOLON: ';';
COLON: ':';
DOT: '.';
COMMA: ',';
BRACKET_OPEN: '(';
BRACKET_CLOSE: ')';
SQ_OPEN: '[';
SQ_CLOSE: ']';

//Comments
COMMENT: ('#'([a-zA-Z0-9_ ]|~[a-zA-Z0-9\n])*) -> skip;
COMMENT_MULTILINE: ('##'([a-zA-Z0-9_ ]|~[a-zA-Z0-9])*'##') -> skip;

//String
STRING: ('"'([a-zA-Z0-9_ ]|~[a-zA-Z0-9\n])*'"');







