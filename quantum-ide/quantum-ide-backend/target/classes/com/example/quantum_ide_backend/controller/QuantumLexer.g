lexer grammar QuantumLexer;

options { language = Java; }

@lexer::header {
    package quantumCompilerPackage;
}

// ==== PAROLE CHIAVE QUANTISTICHE ====
QUBIT     : 'QUBIT';
REGISTER  : 'REGISTER';
MEASURE   : 'MEASURE';
RESET     : 'RESET';

// ==== GATE BASE ====
H         : 'H';
X         : 'X';
Y         : 'Y';
Z         : 'Z';
CNOT      : 'CNOT';
CX        : 'CX';       // alias CNOT
CY        : 'CY';
CZ        : 'CZ';
RX        : 'RX';
RY        : 'RY';
RZ        : 'RZ';
S         : 'S';
T         : 'T';
SWAP      : 'SWAP';
ISWAP     : 'ISWAP';
CCX       : 'CCX';      // Toffoli
CSWAP     : 'CSWAP';
U1        : 'U1';
U2        : 'U2';
U3        : 'U3';

// ==== COSTANTI MATEMATICHE ====
PI        : 'PI';
EULER     : 'E';
SQRT2     : 'SQRT2';

// ==== VALORI BINARI ====
ZERO      : '0';
ONE       : '1';

// ==== OPERATORI MATEMATICI ====
PLUS      : '+';
MINUS     : '-';
TIMES     : '*';
DIV       : '/';
POW       : '^';
MOD       : '%';

// ==== OPERATORI LOGICI E BOOLEANI ====
AND       : '&&';
OR        : '||';
NOT       : '!';
EQ        : '==';
NEQ       : '!=';
LT        : '<';
GT        : '>';
LE        : '<=';
GE        : '>=';

TRUE      : 'true';
FALSE     : 'false';

// ==== FUNZIONI MATEMATICHE ====
SIN       : 'sin';
COS       : 'cos';
TAN       : 'tan';
LOG       : 'log';
SQRT      : 'sqrt';
EXP       : 'exp';

// ==== CONTROLLO DI FLUSSO ====
IF        : 'if';
ELSE      : 'else';
WHILE     : 'while';
FOR       : 'for';
RETURN    : 'return';
BREAK     : 'break';
CONTINUE  : 'continue';

// ==== TIPOLOGIE ====
GATE      : 'gate';
FUNC      : 'func';
BIT       : 'BIT';       // per registri classici
INTTYPE   : 'INT';       // interi (per parametri)
FLOATTYPE : 'FLOAT';     // numeri float

// ==== SIMBOLI ====
SEMI      : ';';
COMMA     : ',';
LPAREN    : '(';
RPAREN    : ')';
LBRACE    : '{';
RBRACE    : '}';
LBRACK    : '[';
RBRACK    : ']';
ASSIGN    : '=';
ARROW     : '->';

// ==== IDENTIFICATORI ====
ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

// ==== NUMERI ====
INT : '0'..'9'+ ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')+ EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

// ==== COMMENTI ====
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// ==== SPAZI ====
WS  : ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;} ;

// ==== STRINGHE E CARATTERI ====
STRING : '"' ( ESC_SEQ | ~('\\'|'"') )* '"' ;
CHAR   : '\'' ( ESC_SEQ | ~('\''|'\\') ) '\'' ;

// ==== FRAMMENTI ====
fragment EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
fragment HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;
fragment ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;
fragment OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;
fragment UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
