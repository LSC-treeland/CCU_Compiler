grammar myInterp;

options {
   language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
    import java.util.Scanner;
    import java.lang.*;
}

@members {
    HashMap memory = new HashMap();
    boolean TRACEON = false;
    Scanner scanner = new Scanner(System.in);
    String str;
    boolean SKIP;
}

prog:(INCLUDE)* (void_main|int_main)  {if (TRACEON) System.out.println("program:(INCLUDE)* (void_main|int_main)");};

void_main:VOID MAIN '(' ')' (NEWLINE)* '{'  statement* '}'
        {if (TRACEON) System.out.println("VOID MAIN () { statement*}");};
        
int_main:INT MAIN '(' ')' (NEWLINE)*  '{'  statement* return_? '}'
        {if (TRACEON) System.out.println("INT MAIN () { statement* return_?}");};
        

type:INT { if (TRACEON) System.out.println("type: INT"); }
   | VOID {if (TRACEON) System.out.println("type: VOID"); }
   ;

        
expr returns [int value]
    :   e=multExpr {$value = $e.value;}
        (   '+' e=multExpr {$value += $e.value;}
        |   '-' e=multExpr {$value -= $e.value;}
        )*
    ;

multExpr returns [int value]
    :   e=atom {$value = $e.value;} 
        (    '*' e=atom {$value *= $e.value;}
        |    '/' e=atom {$value /= $e.value;}
        |    '%' e=atom {$value \%= $e.value;}
        |    '<<' e=atom {$value <<= $e.value;}
        |    '>>' e=atom {$value >>= $e.value;}
        )*
    ; 

atom returns [int value]
    :   Integer_constant {$value = Integer.parseInt($Integer_constant.text);}
    |   Identifier
        {
        Integer v = (Integer)memory.get($Identifier.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$Identifier.text);
        }
    |   '(' expr ')' {$value = $expr.value;}
    ;

compExpr returns [int value]
    :    e=atom {$value = $e.value;} 
	 (	'>' e=atom {$value = ($value > $e.value) ? 1:0;}
	 |	'>=' e=atom {$value = ($value >= $e.value) ? 1:0;}
	 |	'<' e=atom {$value = ($value < $e.value) ? 1:0;}
	 |	'<=' e=atom {$value = ($value <= $e.value) ? 1:0;}
	 |	'==' e=atom {$value = ($value == $e.value) ? 1:0;}
	 |	'!=' e=atom {$value = ($value != $e.value) ? 1:0;}
	 )
        ;
        
     
overloaded_op:    Identifier           
    		  (	'+=' e=atom 
    		  	{
				Integer v = (Integer)memory.get($Identifier.text);
				if ( v==null ) System.err.println("undefined variable "+$Identifier.text);    		  		
    		  		else {
    		  			v = v + $e.value;
    		  			memory.put($Identifier.text, new Integer(v));
    		  			System.out.println($Identifier.text + " = " + v);	   	
    		  		}
    		  	}
    		  |     '-=' e=atom 
    		  	{
				Integer v = (Integer)memory.get($Identifier.text);
				if ( v==null ) System.err.println("undefined variable "+$Identifier.text);    		  		
    		  		else {
    		  			v = v - $e.value;
    		  			memory.put($Identifier.text, new Integer(v));
    		  			System.out.println($Identifier.text + " = " + v);	   	
    		  		}
    		  	}    		  
    		  |     '*=' e=atom 
    		  	{
				Integer v = (Integer)memory.get($Identifier.text);
				if ( v==null ) System.err.println("undefined variable "+$Identifier.text);    		  		
    		  		else {
    		  			v = v * $e.value;
    		  			memory.put($Identifier.text, new Integer(v));
    		  			System.out.println($Identifier.text + " = " + v);	   	
    		  		}
    		  	}    		  
    		  |     '/=' e=atom 
    		  	{
				Integer v = (Integer)memory.get($Identifier.text);
				if ( v==null ) System.err.println("undefined variable "+$Identifier.text);    		  		
    		  		else {
    		  			v = v / $e.value;
    		  			memory.put($Identifier.text, new Integer(v));
    		  			System.out.println($Identifier.text + " = " + v);	   	
    		  		}
    		  	}    		  
    		  |     '%=' e=atom 
    		  	{
				Integer v = (Integer)memory.get($Identifier.text);
				if ( v==null ) System.err.println("undefined variable "+$Identifier.text);    		  		
    		  		else {
    		  			v = v \% $e.value;
    		  			memory.put($Identifier.text, new Integer(v));
    		  			System.out.println($Identifier.text + " = " + v);	   	
    		  		}
    		  	}  
    		  |     '>>=' e=atom 
    		  	{
				Integer v = (Integer)memory.get($Identifier.text);
				if ( v==null ) System.err.println("undefined variable "+$Identifier.text);    		  		
    		  		else {
    		  			v = v >> $e.value;
    		  			memory.put($Identifier.text, new Integer(v));
    		  			System.out.println($Identifier.text + " = " + v);	   	
    		  		}
    		  	}
    		  |     '<<=' e=atom 
    		  	{
				Integer v = (Integer)memory.get($Identifier.text);
				if ( v==null ) System.err.println("undefined variable "+$Identifier.text);    		  		
    		  		else {
    		  			v = v << $e.value;
    		  			memory.put($Identifier.text, new Integer(v));
    		  			System.out.println($Identifier.text + " = " + v);	   	
    		  		}
    		  	}  		  
    		  )        
                  ;
  
statement: type
	   a=Identifier
	   {
	   	if (SKIP == false){
			memory.put($a.text, new Integer(0)); 
		   	System.out.println($a.text + " = 0");	   	
	   	}

	   }
	   ('=' b=expr
	   {
	   	if (SKIP == false){
		   	memory.put($a.text, new Integer($b.value)); 
		   	System.out.println($a.text + " = " + $b.value);
		}
	   })?
	   (',' a=Identifier
	   {
	   	if (SKIP == false){
		   	memory.put($a.text, new Integer(0)); 
		   	System.out.println($a.text + " = 0");
		}
	   }
	   ('=' b=expr
	   {
	   	if (SKIP == false){
		   	memory.put($b.text, new Integer($b.value)); 
		   	System.out.println($a.text + " = " + $b.value);
		}
	   })?
	   )* 
	   ';'  NEWLINE
	 | a=Identifier '=' b=expr 
	   {
	   	if (SKIP == false){
		   	memory.put($a.text, new Integer($b.value)); 
		   	System.out.println($a.text + " = " + $b.value);
		}
	   }
	   (',' a=Identifier '=' b=expr
	   {
	   	if (SKIP == false){
		   	memory.put($a.text, new Integer($b.value)); 
		   	System.out.println($a.text + " = " + $b.value);	   	
	   	}
	   })* 
	   ';' NEWLINE
         | IF '(' compExpr
           {
           	if (SKIP == false){
		   	if (TRACEON) System.out.println("statement: IF \'(\' (comExpr) \')\' if_then_statement");
		   	if ($compExpr.value > 0){
		   		System.out.println("True");
		   		SKIP = false;
		   	}  
		   	else {
		   		System.out.println("False");
		   		SKIP = true;
		   	}
		}
           } 
           ')' if_statements{SKIP = !SKIP;}  ((ELSE) => ELSE if_statements)?  {SKIP = false;}
         | overloaded_op ';'  NEWLINE
         | PRINTF  printf_statement  {if (TRACEON) System.out.println("statement: PRINTF  printf_statement"); }
         | SCANF  scanf_statement  {if (TRACEON) System.out.println("statement: SCANF  scanf_statement"); }
         | NEWLINE
         ;	


if_statements: statement
	      | '{' statement* '}'
	      ;		  

  
printf_statement : '('  STRING{str = $STRING.text;} 
		   (',' a=Identifier
		   {
		   	if (SKIP == false){
			   	Integer v = (Integer)memory.get($a.text);
			   	if ( v==null ) System.err.println("undefined variable "+ $a.text);
			   	else str = str.replaceFirst("\%d",v.toString());
			}
		   })* 
		   ')' ';' 
		   {if (SKIP == false) System.out.println(str.substring(1, str.length() - 1));}
		 ;
		    
scanf_statement : '('  STRING 
		  (',' '&'a=Identifier 
		  {
		  	if (SKIP == false){
			  	if ( (Integer)memory.get($a.text)==null ) System.err.println("undefined variable "+ $a.text);
			  	else{
			  		Integer v = scanner.nextInt();
			  		memory.put($a.text, new Integer(v));
			  		System.out.println($a.text + " = " + v);
			  	}
			}
		  })*
		  ')' ';' 
	        ;			  

		   
return_:RETURN_ (Integer_constant ';'{ if (TRACEON) System.out.println("return_:RETURN Integer_constant ;"); }
       |Identifier ';'{ if (TRACEON) System.out.println("return_:RETURN Identifier ;"); }
       |';'{ if (TRACEON) System.out.println("return_:RETURN ;"); })
       ;				  
	
	
/* description of the tokens */
IF: 'if';
STRING :  '"' ~('\r' | '\n' | '"')* '"' ;
PRINTF:'printf';
SCANF :'scanf';
RETURN_:'return';
INT:'int';
MAIN: 'main';
VOID: 'void';
ELSE: 'else';
Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;

NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};
INCLUDE: '#include <'('a'..'z' | 'A'..'Z' | '_'|'0'..'9')*'.h>';
