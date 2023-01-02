grammar PL0;
@parser::header { package PL0Modules; }
@lexer::header { package PL0Modules; }

//TODO: Add booleans in the future
program : MODULE MAIN SEMICOLON block MAIN DOT;

//globalDeclList -> globals
//stmtList -> body
block : globalDeclList main;

main: statementBlock;
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
constDecl : CONST constVariableDeclDefinition constDeclItemInner;
constDeclItemInner : COMMA constVariableDeclDefinition constDeclItemInner | ;

//variable declaraion, can be int and array
varDecl : VAR variableDeclDefinition varDeclItemInner;
varDeclItemInner: COMMA variableDeclDefinition varDeclItemInner | ;

//actual assignment de
constVariableDeclDefinition: ID COLON dataTypes ASSIGNMENT dataTypesTerminals;
variableVariableDeclDefinition: ID COLON type;
assignedVariableDeclDefinition: ID COLON dataTypes ASSIGNMENT assignedVariableTerminal;

variableDeclDefinition : assignedVariableDeclDefinition | variableVariableDeclDefinition;

//value rhs of assignment
assignedVariableTerminal : ID |
    dataTypesTerminals;

//procedure declaration
procDecl : PROCEDURE ID BRACKET_OPEN procFormalCallChoice BRACKET_CLOSE returnType SEMICOLON statementBlock ID;

//returnTYpe
returnType: COLON dataTypes | ;

//list of parameters
procFormalCallChoice : formalDecl formalDeclInnerRepeat | ;
formalDeclInnerRepeat: COMMA formalDecl formalDeclInnerRepeat | ;
formalDecl : ID COLON type;

type : dataTypes
    | arrType;
arrType: ARRAY SQ_OPEN INTEGER SQ_CLOSE OF dataTypes;

//main body
mainStmtList: decl SEMICOLON stmtListStmtInner | stmt SEMICOLON stmtListStmtInner | ;
stmtListStmtInner: mainStmtList | ;

//statementLists for content to avoid declarations
blockStmtList: stmt SEMICOLON blockStmtListInner | ;
blockStmtListInner: blockStmtList | ;

//actual statements
stmt : callWithoutAssignment
    | assignStmt
    | returnStmt
    | inputStmt
    | outStmt
    | ifStmt
    | whileStmt
    | forStmt;

//function call
callWithoutAssignment: callStmt;
callStmt : ID BRACKET_OPEN parameters BRACKET_CLOSE;

//parameters
parameters: expr parametersInnerRepeat | ;
parametersInnerRepeat: COMMA expr parametersInnerRepeat | ;

//assignment over call or input or expression on variable
assignStmt : assignL assignmentSymbol assignmentTerminal;

//terminal of assignINPUT | ment
assignmentTerminal: callStmt | expr | ID arrayIndex;

//inputStmt
inputStmt: assignL ASSIGNMENT INPUT;

assignL: ID arrayIndex;
arrayIndex: SQ_OPEN expr SQ_CLOSE | ;
assignmentSymbol : ASSIGNMENT;


//return
returnStmt : RETURN returnStatementChoice;
returnStatementChoice: expr | ;

//output, can be an expression or a string
outStmt : OUTPUT ASSIGNMENT outStmtInner;
outStmtInner: assignmentTerminal | STRING;

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
expressionInner: add term expressionInner | sub term expressionInner | ;
term : factor termMultDivFactor;
termMultDivFactor: mul factor termMultDivFactor | div factor termMultDivFactor | ;
factor : dataTypesTerminals
    | lp expr rp
    | ID;

lp: BRACKET_OPEN
    ;

rp: BRACKET_CLOSE
    ;

add: PLUS
    ;

sub: MINUS
    ;

mul: MULTIPLICATION
    ;

div: DIVISION
    ;

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
INTEGER: [0]|[1-9]+[0-9]*|'-'[1-9]+[0-9]*;
DECIMAL: [0]|[1-9]+[0-9]*'.'[0-9]+|'-'[1-9]+[0-9]*'.'[0-9]+;

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







