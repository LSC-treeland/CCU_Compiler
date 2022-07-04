grammar myparser;

options {
   language = Java;
}

@header {
    // import packages here.
}

@members {
    boolean TRACEON = true;
}

program:(INCLUDE)* (void_main|int_main)  {if (TRACEON) System.out.println("program:(INCLUDE)* (void_main|int_main)");};

void_main:VOID MAIN '(' ')' '{' declarations statements '}'
        {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");};
        
int_main:INT MAIN '(' ')' '{' declarations statements return_? '}'
        {if (TRACEON) System.out.println("INT MAIN () {declarations statements return_?}");};
        

declarations:type Identifier ';' declarations{ if (TRACEON) System.out.println("declarations: type Identifier : declarations"); }
           | type Identifier '=' (Integer_constant|Floating_point_constant|STRING) ';' declarations{ if (TRACEON) System.out.println("type Identifier '=' (Integer_constant|Floating_point_constant|STRING) ';' declarations"); }
           | { if (TRACEON) System.out.println("declarations: ");} ;

type:INT { if (TRACEON) System.out.println("type: INT"); }
   | CHAR {if (TRACEON) System.out.println("type: CHAR"); }
   | VOID {if (TRACEON) System.out.println("type: VOID"); }
   | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
   | LONG {if (TRACEON) System.out.println("type: LONG"); }
   | DOUBLE {if (TRACEON) System.out.println("type: DOUBLE"); }
   | SHORT {if (TRACEON) System.out.println("type: SHORT"); }
   | INT'*' { if (TRACEON) System.out.println("type: INT*"); }
   | CHAR'*' {if (TRACEON) System.out.println("type: CHAR*"); }
   | VOID'*' {if (TRACEON) System.out.println("type: VOID*"); }
   | FLOAT'*' {if (TRACEON) System.out.println("type: FLOAT*"); }
   | LONG'*' {if (TRACEON) System.out.println("type: LONG*"); }
   | DOUBLE'*' {if (TRACEON) System.out.println("type: DOUBLE*"); }
   | SHORT'*' {if (TRACEON) System.out.println("type: SHORT*"); }
   ;


   
statements:statement statements
        |;

arith_expression: multExpr
          ( '+' multExpr {if (TRACEON) System.out.println("arith_expression: multExpr +"); }
	  | '-' multExpr {if (TRACEON) System.out.println("arith_expression: multExpr -"); }
                  )*
                  ;

multExpr: signExpr
          ( '*' signExpr {if (TRACEON) System.out.println("multExpr: signExpr * "); }
          | '/' signExpr {if (TRACEON) System.out.println("multExpr: signExpr / "); }
          | '%' signExpr {if (TRACEON) System.out.println("multExpr: signExpr \% "); }
		  )*
		  ;

signExpr: primaryExpr {if (TRACEON) System.out.println("signExpr: primaryExpr"); }
        | '-' primaryExpr {if (TRACEON) System.out.println("signExpr: primaryExpr -"); }
		;
		  
primaryExpr: Integer_constant
           | Floating_point_constant
           | Identifier
		   | '(' arith_expression ')'
           ;

comp_op: Identifier '>=' (Integer_constant|Floating_point_constant) {if (TRACEON) System.out.println("comp_op: Identifier >= constant"); }
                      |Identifier '==' (Integer_constant|Floating_point_constant) {if (TRACEON) System.out.println("comp_op: Identifier == constant"); }
                      |Identifier '<=' (Integer_constant|Floating_point_constant) {if (TRACEON) System.out.println("comp_op: Identifier <= constant"); }
                      |Identifier '!=' (Integer_constant|Floating_point_constant) {if (TRACEON) System.out.println("comp_op: Identifier != constant"); }
                      |Identifier '>' (Integer_constant|Floating_point_constant) {if (TRACEON) System.out.println("comp_op: Identifier > constant"); }
                      |Identifier '<' (Integer_constant|Floating_point_constant) {if (TRACEON) System.out.println("comp_op: Identifier < constant"); }
                      |(Integer_constant|Floating_point_constant) '>=' Identifier {if (TRACEON) System.out.println("comp_op: constant >= Identifier"); }
                      |(Integer_constant|Floating_point_constant) '==' Identifier {if (TRACEON) System.out.println("comp_op: constant == Identifier"); }
                      |(Integer_constant|Floating_point_constant) '<=' Identifier {if (TRACEON) System.out.println("comp_op: constant <= Identifier"); }
                      |(Integer_constant|Floating_point_constant) '!=' Identifier {if (TRACEON) System.out.println("comp_op: constant != Identifier"); }
                      |(Integer_constant|Floating_point_constant) '>' Identifier {if (TRACEON) System.out.println("comp_op: constant > Identifier"); }
                      |(Integer_constant|Floating_point_constant) '<' Identifier {if (TRACEON) System.out.println("comp_op: constant < Identifier"); }
                      |Identifier '>=' Identifier {if (TRACEON) System.out.println("comp_op: Identifier >= Identifier"); }
                      |Identifier '==' Identifier {if (TRACEON) System.out.println("comp_op: Identifier == Identifier"); }
                      |Identifier '<=' Identifier {if (TRACEON) System.out.println("comp_op: Identifier <= Identifier"); }
                      |Identifier '!=' Identifier {if (TRACEON) System.out.println("comp_op: Identifier != Identifier"); }
                      |Identifier '>' Identifier {if (TRACEON) System.out.println("comp_op: Identifier > Identifier"); }
                      |Identifier '<' Identifier {if (TRACEON) System.out.println("comp_op: Identifier < Identifier"); }

                      ;

increment_decrement_op:Identifier '++'  {if (TRACEON) System.out.println("increment_decrement_op: Identifier ++"); }
                      |Identifier '--'  {if (TRACEON) System.out.println("increment_decrement_op: Identifier --"); }
                      |'++' Identifier  {if (TRACEON) System.out.println("increment_decrement_op: ++ Identifier "); }
                      |'--' Identifier  {if (TRACEON) System.out.println("increment_decrement_op: -- Identifier "); }
                      ;
                      
statement: Identifier '=' arith_expression ';'  {if (TRACEON) System.out.println("statement: Identifier \'=\' arith_expression \';\'"); }
         | Identifier '=' '&' Identifier ';'  {if (TRACEON) System.out.println("statement: Identifier \'=\' \'&\' Identifier ;"); }
         | overloaded_op ';' {if (TRACEON) System.out.println("statement: overloaded_op ;"); }
         | IF '(' (arith_expression|comp_op|increment_decrement_op) ')' if_then_statements  {if (TRACEON) System.out.println("statement: IF \'(\' (arith_expression|comparison_expression|increment_decrement_op) \')\' if_then_statements"); }
         | ELSE  else_statements  {if (TRACEON) System.out.println("statement: (ELSE  else_statements)"); }
         | WHILE '(' (arith_expression|comp_op|increment_decrement_op) ')' while_statements  {if (TRACEON) System.out.println("statement: WHILE \'(\' (arith_expression|comparison_expression|increment_decrement_op) \')\' while_statements"); }
         | FOR '(' declarations (arith_expression|comp_op) ';' (Identifier '=' arith_expression|increment_decrement_op) ')' for_statements  {if (TRACEON) System.out.println("FOR ( declarations (arith_expression|comparison_expression) ; (Identifier '=' arith_expression|increment_decrement_op) ) for_statements"); }
         | PRINTF  printf_statement  {if (TRACEON) System.out.println("statement: PRINTF  printf_statement"); }
         | SCANF  scanf_statement  {if (TRACEON) System.out.println("statement: SCANF  scanf_statement"); }
         | SWITCH '(' (arith_expression|comp_op) ')' swtich_statements {if (TRACEON) System.out.println("statement: SWITCH ( (arith_expression|comparison_expression) ) swtich_statements"); }
         | CASE (Integer_constant|Floating_point_constant) ':' statement {if (TRACEON) System.out.println("statement : CASE (Integer_constant|Floating_point_constant) : statement"); }
         | DEFAULT ':' statement {if (TRACEON) System.out.println("statement : DEFAULT : statement"); }
         | increment_decrement_op ';' {if (TRACEON) System.out.println("statement : increment_decrement_op"); }
         | BREAK ';' {if (TRACEON) System.out.println("statement: BREAK ;"); }
         | CONTINUE ';' {if (TRACEON) System.out.println("statement: CONTINUE ;"); }
         ;		 

if_then_statements: statement {if (TRACEON) System.out.println("if_then_statements: statement"); }
                  | '{' statements '}' {if (TRACEON) System.out.println("if_then_statements: \'{\' statements \'}\'"); }
		  ;
				  
else_statements : statement {if (TRACEON) System.out.println("else_statements :statement"); }
                  | '{' statements '}' {if (TRACEON) System.out.println("else_statements: \'{\' statements \'}\'"); }
		  ;     
                  
else_if_statements:statement {if (TRACEON) System.out.println("else_if_statements :statement"); }
                  | '{' statements '}' {if (TRACEON) System.out.println("else_if_statements: \'{\' statements \'}\'"); }
		  ;  				  

swtich_statements :  '{' statements '}' {if (TRACEON) System.out.println("swtich_statements :  { statements }"); }
                 ;
             
for_statements: statement {if (TRACEON) System.out.println("for_statements: statement"); }
              | '{' statements '}' {if (TRACEON) System.out.println("for_statements: \'{\' statements \'}\'"); }
              ;

while_statements: statement {if (TRACEON) System.out.println("while_statements: statement"); }
                | '{' statements '}' {if (TRACEON) System.out.println("while_statements: \'{\' statements \'}\'"); }
		;      
  
printf_statement : '('  STRING (',' Identifier)* ')' ';' {if (TRACEON) System.out.println("printf_statement : \'(\' statement STRING (\',\' Identifier)* \')\'"); }
		 ;
		    
scanf_statement : '('  STRING (',' '&' Identifier)* ')' ';' {if (TRACEON) System.out.println("scanf_statement : \'(\' statement STRING (\',\' \'&\' Identifier)* \')\'"); }
	        ;			  

overloaded_op:Identifier ('+=' (Identifier))+ {if (TRACEON) System.out.println("Identifier (\'+=\' (Identifier))+"); }
             |Identifier ('-=' (Identifier))+ {if (TRACEON) System.out.println("Identifier (\'-=\' (Identifier))+"); }
             |Identifier ('/=' (Identifier))+ {if (TRACEON) System.out.println("Identifier (\'/=\' (Identifier))+"); }
             |Identifier ('*=' (Identifier))+ {if (TRACEON) System.out.println("Identifier (\'*=\' (Identifier))+"); }
             |Identifier ('%=' (Identifier))+ {if (TRACEON) System.out.println("Identifier (\'\%=\' (Identifier))+"); }
             ;
		   
return_:RETURN_ (Integer_constant ';'{ if (TRACEON) System.out.println("return_:RETURN Integer_constant ;"); }
       |Floating_point_constant ';'{ if (TRACEON) System.out.println("return_:RETURN Floating_point_constant ;"); }
       |Identifier ';'{ if (TRACEON) System.out.println("return_:RETURN Identifier ;"); }
       |';'{ if (TRACEON) System.out.println("return_:RETURN ;"); })
       ;				  
	
	
/* description of the tokens */
IF: 'if';
STRING :  '"' ~('\r' | '\n' | '"')* '"' ;
CHAR : 'char';
PRINTF:'printf';
SCANF :'scanf';
RETURN_:'return';
DOUBLE:'double';
FLOAT:'float';
INT:'int';
MAIN: 'main';
VOID: 'void';
LONG: 'long';
SHORT: 'short';
WHILE: 'while';
FOR: 'for';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
BREAK: 'break';
CONTINUE : 'continue';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};
INCLUDE: '#include <'('a'..'z' | 'A'..'Z' | '_'|'0'..'9')*'.h>';
