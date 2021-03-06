lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
LONG_TYPE : 'long';
DOUBLE_TYPE : 'double'; 
SHORT_TYPR : 'short';
WHILE_    : 'while';
IF_       : 'if';
ELSE_     : 'else';
FOR_      : 'for';
BREAK_    : 'break';
CONTINUE_ : 'continue';
SWITCH_   : 'switch';
CASE_     : 'case';
DEFAULT_  : 'default';
RETURN_ : 'return';
MAIN_ : 'main';
PRINTF_ : 'printf';
SCANF_ : 'scanf';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
LT_OP : '<';
GT_OP : '>';
PLUS_OP : '+';
MINUS_OP : '-';
MULTI_OP : '*';
DIVID_OP : '/';
MOD_OP : '%';
COMPL_OP : '~';
ASSIGN_OP : '=';
PLUS_E_OP : '+=';
MINUS_E_OP : '-=';
MULTI_E_OP : '*=';
DIVID_E_OP : '/=';
MOD_E_OP : '%=';
AND_OP : '&&';
OR_OP : '||';
BIT_OR_OP : '|';
NOT_OP : '!';
XOR_OP : '^';
COMMA_ : ',';
SEMIC_ : ';';
COLON_ : ':';
QUESTION_ : '?';
AMPERSAND_ : '&';
SL_BRACK : '(';
SR_BRACK : ')';
ML_BRACK : '[';
MR_BRACK : ']';
BL_BRACK : '{';
BR_BRACK : '}';

PRE_PROCESS : '#'(.)*'\n';

STRING_ : '"'(.)*'"';
CHAR_ : ('\''(.)*'\'');

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';


NEW_LINE: '\n' {skip();};

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t')+ {skip();}
    ;
