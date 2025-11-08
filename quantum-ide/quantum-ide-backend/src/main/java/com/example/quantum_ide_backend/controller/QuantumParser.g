parser grammar QuantumParser;

options {
   tokenVocab=QuantumLexer;   
   language=Java;
   k = 1;
   output=AST;
}

tokens {PROGRAM; GATE_DECL; GATE_APPLY; PARAMS; FUNC_DECL; FUNCTION_CALL; BLOCK;}

@parser::header{
   package quantumCompilerPackage;
}

// ==================== PARSER RULES ====================

program
    : statement+ EOF -> ^(PROGRAM statement+)
    ;

// -------------------- STATEMENT --------------------
statement
    : qubitDecl SEMI!
    | bitDecl SEMI!
    | gateDecl
    | funcDecl
    | gateApply SEMI!
    | measureStmt SEMI!
    | resetStmt SEMI!
    | controlFlow
    | expr SEMI!
    ;

// -------------------- DICHIARAZIONI --------------------
qubitDecl
    : QUBIT^ ID                               // single qubit
    | REGISTER^ ID LBRACK! INT RBRACK!        // registro di qubit
    ;

bitDecl
    : BIT^ ID                                 // singolo bit classico
    | REGISTER^ ID LBRACK! INT RBRACK!        // registro di bit
    ;

// -------------------- GATE E FUNZIONI --------------------
gateDecl
    : GATE^ ID LPAREN! paramList? RPAREN! block
    ;

funcDecl
    : FUNC^ ID LPAREN! paramList? RPAREN! block
    ;

paramList
    : ID (COMMA! ID)*    
    ;

// -------------------- APPLICAZIONE GATE --------------------
gateApply
    // Single-qubit gates without parameters
    : (H | X | Y | Z | S | T)^ ID

    // Single-qubit gates with angle parameter
    | (RX | RY | RZ)^ LPAREN! expr RPAREN! ID

    // Two-qubit gates
    | (SWAP | ISWAP | CNOT)^ ID COMMA! ID

    // Three-qubit gates
    | (CCX | CSWAP)^ ID COMMA! ID COMMA! ID

    // Universal gates
    | U1^ LPAREN! expr RPAREN! ID
    | U2^ LPAREN! expr COMMA! expr RPAREN! ID
    | U3^ LPAREN! expr COMMA! expr COMMA! expr RPAREN! ID
    ;

// -------------------- MISURA E RESET --------------------
measureStmt
    : MEASURE^ ID ARROW! ID
    ;

resetStmt
    : RESET^ ID
    ;

// -------------------- CONTROLLO DI FLUSSO --------------------
controlFlow
    : ifStmt
    | whileStmt
    | forStmt
    | breakStmt
    | continueStmt
    ;

ifStmt
    : IF^ LPAREN! expr RPAREN! block (ELSE! block)?
    ;

whileStmt
    : WHILE^ LPAREN! expr RPAREN! block
    ;

forStmt
    : FOR^ LPAREN! (expr? SEMI! expr? SEMI! expr?) RPAREN! block
    ;

breakStmt
    : BREAK^ SEMI!
    ;

continueStmt
    : CONTINUE^ SEMI!
    ;

// -------------------- BLOCCHI --------------------
block
    : LBRACE! statement* RBRACE!
    ;
// -------------------- ESPRESSIONI --------------------
expr
    : assignExpr
    ;

assignExpr
    : logicalOrExpr (ASSIGN^ assignExpr)?
    ;

logicalOrExpr
    : logicalAndExpr (OR^ logicalAndExpr)*
    ;

logicalAndExpr
    : equalityExpr (AND^ equalityExpr)*
    ;

equalityExpr
    : relationalExpr ((EQ^|NEQ^) relationalExpr)*
    ;

relationalExpr
    : addExpr ((LT^|LE^|GT^|GE^) addExpr)*
    ;

addExpr
    : mulExpr ((PLUS^|MINUS^) mulExpr)*
    ;

mulExpr
    : powExpr ((TIMES^|DIV^|MOD^) powExpr)*
    ;

powExpr
    : unaryExpr (POW^ unaryExpr)*
    ;

unaryExpr
    : NOT^ unaryExpr
    | primary
    ;

primary
    : LPAREN! expr RPAREN!
    | functionCall
    | literal
    | ID
    ;

// -------------------- FUNZIONI MATEMATICHE --------------------
functionCall
    : (SIN | COS | TAN | LOG | SQRT | EXP)^ LPAREN! expr RPAREN!
    ;

// -------------------- LETTERALI --------------------
literal
    : INT
    | FLOAT
    | ZERO
    | ONE
    | TRUE
    | FALSE
    | PI
    | EULER
    | STRING
    | CHAR
    ;
