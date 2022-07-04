// $ANTLR 3.5.2 myInterp.g 2022-05-08 16:14:48

    // import packages here.
    import java.util.HashMap;
    import java.util.Scanner;
    import java.lang.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myInterpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ELSE", "IF", "INCLUDE", 
		"INT", "Identifier", "Integer_constant", "MAIN", "NEWLINE", "PRINTF", 
		"RETURN_", "SCANF", "STRING", "VOID", "WS", "'!='", "'%'", "'%='", "'&'", 
		"'('", "')'", "'*'", "'*='", "'+'", "'+='", "','", "'-'", "'-='", "'/'", 
		"'/='", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", 
		"'>>'", "'>>='", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int COMMENT=4;
	public static final int ELSE=5;
	public static final int IF=6;
	public static final int INCLUDE=7;
	public static final int INT=8;
	public static final int Identifier=9;
	public static final int Integer_constant=10;
	public static final int MAIN=11;
	public static final int NEWLINE=12;
	public static final int PRINTF=13;
	public static final int RETURN_=14;
	public static final int SCANF=15;
	public static final int STRING=16;
	public static final int VOID=17;
	public static final int WS=18;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myInterpParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myInterpParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myInterpParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myInterp.g"; }


	    HashMap memory = new HashMap();
	    boolean TRACEON = false;
	    Scanner scanner = new Scanner(System.in);
	    String str;
	    boolean SKIP;



	// $ANTLR start "prog"
	// myInterp.g:22:1: prog : ( INCLUDE )* ( void_main | int_main ) ;
	public final void prog() throws RecognitionException {
		try {
			// myInterp.g:22:5: ( ( INCLUDE )* ( void_main | int_main ) )
			// myInterp.g:22:6: ( INCLUDE )* ( void_main | int_main )
			{
			// myInterp.g:22:6: ( INCLUDE )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myInterp.g:22:7: INCLUDE
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_prog36); if (state.failed) return;
					}
					break;

				default :
					break loop1;
				}
			}

			// myInterp.g:22:17: ( void_main | int_main )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VOID) ) {
				alt2=1;
			}
			else if ( (LA2_0==INT) ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myInterp.g:22:18: void_main
					{
					pushFollow(FOLLOW_void_main_in_prog41);
					void_main();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myInterp.g:22:28: int_main
					{
					pushFollow(FOLLOW_int_main_in_prog43);
					int_main();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("program:(INCLUDE)* (void_main|int_main)");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "void_main"
	// myInterp.g:24:1: void_main : VOID MAIN '(' ')' ( NEWLINE )* '{' ( statement )* '}' ;
	public final void void_main() throws RecognitionException {
		try {
			// myInterp.g:24:10: ( VOID MAIN '(' ')' ( NEWLINE )* '{' ( statement )* '}' )
			// myInterp.g:24:11: VOID MAIN '(' ')' ( NEWLINE )* '{' ( statement )* '}'
			{
			match(input,VOID,FOLLOW_VOID_in_void_main53); if (state.failed) return;
			match(input,MAIN,FOLLOW_MAIN_in_void_main55); if (state.failed) return;
			match(input,23,FOLLOW_23_in_void_main57); if (state.failed) return;
			match(input,24,FOLLOW_24_in_void_main59); if (state.failed) return;
			// myInterp.g:24:29: ( NEWLINE )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==NEWLINE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myInterp.g:24:30: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_void_main62); if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,45,FOLLOW_45_in_void_main66); if (state.failed) return;
			// myInterp.g:24:45: ( statement )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==IF||(LA4_0 >= INT && LA4_0 <= Identifier)||(LA4_0 >= NEWLINE && LA4_0 <= PRINTF)||LA4_0==SCANF||LA4_0==VOID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myInterp.g:24:45: statement
					{
					pushFollow(FOLLOW_statement_in_void_main69);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,46,FOLLOW_46_in_void_main72); if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("VOID MAIN () { statement*}");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "void_main"



	// $ANTLR start "int_main"
	// myInterp.g:27:1: int_main : INT MAIN '(' ')' ( NEWLINE )* '{' ( statement )* ( return_ )? '}' ;
	public final void int_main() throws RecognitionException {
		try {
			// myInterp.g:27:9: ( INT MAIN '(' ')' ( NEWLINE )* '{' ( statement )* ( return_ )? '}' )
			// myInterp.g:27:10: INT MAIN '(' ')' ( NEWLINE )* '{' ( statement )* ( return_ )? '}'
			{
			match(input,INT,FOLLOW_INT_in_int_main96); if (state.failed) return;
			match(input,MAIN,FOLLOW_MAIN_in_int_main98); if (state.failed) return;
			match(input,23,FOLLOW_23_in_int_main100); if (state.failed) return;
			match(input,24,FOLLOW_24_in_int_main102); if (state.failed) return;
			// myInterp.g:27:27: ( NEWLINE )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==NEWLINE) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myInterp.g:27:28: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_int_main105); if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,45,FOLLOW_45_in_int_main110); if (state.failed) return;
			// myInterp.g:27:44: ( statement )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==IF||(LA6_0 >= INT && LA6_0 <= Identifier)||(LA6_0 >= NEWLINE && LA6_0 <= PRINTF)||LA6_0==SCANF||LA6_0==VOID) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myInterp.g:27:44: statement
					{
					pushFollow(FOLLOW_statement_in_int_main113);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop6;
				}
			}

			// myInterp.g:27:55: ( return_ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==RETURN_) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// myInterp.g:27:55: return_
					{
					pushFollow(FOLLOW_return__in_int_main116);
					return_();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,46,FOLLOW_46_in_int_main119); if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("INT MAIN () { statement* return_?}");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "int_main"



	// $ANTLR start "type"
	// myInterp.g:31:1: type : ( INT | VOID );
	public final void type() throws RecognitionException {
		try {
			// myInterp.g:31:5: ( INT | VOID )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==INT) ) {
				alt8=1;
			}
			else if ( (LA8_0==VOID) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// myInterp.g:31:6: INT
					{
					match(input,INT,FOLLOW_INT_in_type144); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: INT"); }
					}
					break;
				case 2 :
					// myInterp.g:32:6: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_type153); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: VOID"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"


	public static class expr_return extends ParserRuleReturnScope {
		public int value;
	};


	// $ANTLR start "expr"
	// myInterp.g:36:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final myInterpParser.expr_return expr() throws RecognitionException {
		myInterpParser.expr_return retval = new myInterpParser.expr_return();
		retval.start = input.LT(1);

		int e =0;

		try {
			// myInterp.g:37:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// myInterp.g:37:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr188);
			e=multExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {retval.value = e;}
			// myInterp.g:38:9: ( '+' e= multExpr | '-' e= multExpr )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==27) ) {
					alt9=1;
				}
				else if ( (LA9_0==30) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// myInterp.g:38:13: '+' e= multExpr
					{
					match(input,27,FOLLOW_27_in_expr204); if (state.failed) return retval;
					pushFollow(FOLLOW_multExpr_in_expr208);
					e=multExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value += e;}
					}
					break;
				case 2 :
					// myInterp.g:39:13: '-' e= multExpr
					{
					match(input,30,FOLLOW_30_in_expr224); if (state.failed) return retval;
					pushFollow(FOLLOW_multExpr_in_expr228);
					e=multExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value -= e;}
					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// myInterp.g:43:1: multExpr returns [int value] : e= atom ( '*' e= atom | '/' e= atom | '%' e= atom | '<<' e= atom | '>>' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// myInterp.g:44:5: (e= atom ( '*' e= atom | '/' e= atom | '%' e= atom | '<<' e= atom | '>>' e= atom )* )
			// myInterp.g:44:9: e= atom ( '*' e= atom | '/' e= atom | '%' e= atom | '<<' e= atom | '>>' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr266);
			e=atom();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {value = e;}
			// myInterp.g:45:9: ( '*' e= atom | '/' e= atom | '%' e= atom | '<<' e= atom | '>>' e= atom )*
			loop10:
			while (true) {
				int alt10=6;
				switch ( input.LA(1) ) {
				case 25:
					{
					alt10=1;
					}
					break;
				case 32:
					{
					alt10=2;
					}
					break;
				case 20:
					{
					alt10=3;
					}
					break;
				case 36:
					{
					alt10=4;
					}
					break;
				case 43:
					{
					alt10=5;
					}
					break;
				}
				switch (alt10) {
				case 1 :
					// myInterp.g:45:14: '*' e= atom
					{
					match(input,25,FOLLOW_25_in_multExpr284); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_multExpr288);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value *= e;}
					}
					break;
				case 2 :
					// myInterp.g:46:14: '/' e= atom
					{
					match(input,32,FOLLOW_32_in_multExpr305); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_multExpr309);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value /= e;}
					}
					break;
				case 3 :
					// myInterp.g:47:14: '%' e= atom
					{
					match(input,20,FOLLOW_20_in_multExpr326); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_multExpr330);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value %= e;}
					}
					break;
				case 4 :
					// myInterp.g:48:14: '<<' e= atom
					{
					match(input,36,FOLLOW_36_in_multExpr347); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_multExpr351);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value <<= e;}
					}
					break;
				case 5 :
					// myInterp.g:49:14: '>>' e= atom
					{
					match(input,43,FOLLOW_43_in_multExpr368); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_multExpr372);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value >>= e;}
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// myInterp.g:53:1: atom returns [int value] : ( Integer_constant | Identifier | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token Integer_constant1=null;
		Token Identifier2=null;
		ParserRuleReturnScope expr3 =null;

		try {
			// myInterp.g:54:5: ( Integer_constant | Identifier | '(' expr ')' )
			int alt11=3;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt11=1;
				}
				break;
			case Identifier:
				{
				alt11=2;
				}
				break;
			case 23:
				{
				alt11=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myInterp.g:54:9: Integer_constant
					{
					Integer_constant1=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_atom409); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = Integer.parseInt((Integer_constant1!=null?Integer_constant1.getText():null));}
					}
					break;
				case 2 :
					// myInterp.g:55:9: Identifier
					{
					Identifier2=(Token)match(input,Identifier,FOLLOW_Identifier_in_atom421); if (state.failed) return value;
					if ( state.backtracking==0 ) {
					        Integer v = (Integer)memory.get((Identifier2!=null?Identifier2.getText():null));
					        if ( v!=null ) value = v.intValue();
					        else System.err.println("undefined variable "+(Identifier2!=null?Identifier2.getText():null));
					        }
					}
					break;
				case 3 :
					// myInterp.g:61:9: '(' expr ')'
					{
					match(input,23,FOLLOW_23_in_atom441); if (state.failed) return value;
					pushFollow(FOLLOW_expr_in_atom443);
					expr3=expr();
					state._fsp--;
					if (state.failed) return value;
					match(input,24,FOLLOW_24_in_atom445); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = (expr3!=null?((myInterpParser.expr_return)expr3).value:0);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "atom"



	// $ANTLR start "compExpr"
	// myInterp.g:64:1: compExpr returns [int value] : e= atom ( '>' e= atom | '>=' e= atom | '<' e= atom | '<=' e= atom | '==' e= atom | '!=' e= atom ) ;
	public final int compExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// myInterp.g:65:5: (e= atom ( '>' e= atom | '>=' e= atom | '<' e= atom | '<=' e= atom | '==' e= atom | '!=' e= atom ) )
			// myInterp.g:65:10: e= atom ( '>' e= atom | '>=' e= atom | '<' e= atom | '<=' e= atom | '==' e= atom | '!=' e= atom )
			{
			pushFollow(FOLLOW_atom_in_compExpr473);
			e=atom();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {value = e;}
			// myInterp.g:66:3: ( '>' e= atom | '>=' e= atom | '<' e= atom | '<=' e= atom | '==' e= atom | '!=' e= atom )
			int alt12=6;
			switch ( input.LA(1) ) {
			case 41:
				{
				alt12=1;
				}
				break;
			case 42:
				{
				alt12=2;
				}
				break;
			case 35:
				{
				alt12=3;
				}
				break;
			case 38:
				{
				alt12=4;
				}
				break;
			case 40:
				{
				alt12=5;
				}
				break;
			case 19:
				{
				alt12=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myInterp.g:66:5: '>' e= atom
					{
					match(input,41,FOLLOW_41_in_compExpr482); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_compExpr486);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = (value > e) ? 1:0;}
					}
					break;
				case 2 :
					// myInterp.g:67:5: '>=' e= atom
					{
					match(input,42,FOLLOW_42_in_compExpr494); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_compExpr498);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = (value >= e) ? 1:0;}
					}
					break;
				case 3 :
					// myInterp.g:68:5: '<' e= atom
					{
					match(input,35,FOLLOW_35_in_compExpr506); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_compExpr510);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = (value < e) ? 1:0;}
					}
					break;
				case 4 :
					// myInterp.g:69:5: '<=' e= atom
					{
					match(input,38,FOLLOW_38_in_compExpr518); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_compExpr522);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = (value <= e) ? 1:0;}
					}
					break;
				case 5 :
					// myInterp.g:70:5: '==' e= atom
					{
					match(input,40,FOLLOW_40_in_compExpr530); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_compExpr534);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = (value == e) ? 1:0;}
					}
					break;
				case 6 :
					// myInterp.g:71:5: '!=' e= atom
					{
					match(input,19,FOLLOW_19_in_compExpr542); if (state.failed) return value;
					pushFollow(FOLLOW_atom_in_compExpr546);
					e=atom();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = (value != e) ? 1:0;}
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "compExpr"



	// $ANTLR start "overloaded_op"
	// myInterp.g:76:1: overloaded_op : Identifier ( '+=' e= atom | '-=' e= atom | '*=' e= atom | '/=' e= atom | '%=' e= atom | '>>=' e= atom | '<<=' e= atom ) ;
	public final void overloaded_op() throws RecognitionException {
		Token Identifier4=null;
		int e =0;

		try {
			// myInterp.g:76:14: ( Identifier ( '+=' e= atom | '-=' e= atom | '*=' e= atom | '/=' e= atom | '%=' e= atom | '>>=' e= atom | '<<=' e= atom ) )
			// myInterp.g:76:19: Identifier ( '+=' e= atom | '-=' e= atom | '*=' e= atom | '/=' e= atom | '%=' e= atom | '>>=' e= atom | '<<=' e= atom )
			{
			Identifier4=(Token)match(input,Identifier,FOLLOW_Identifier_in_overloaded_op585); if (state.failed) return;
			// myInterp.g:77:9: ( '+=' e= atom | '-=' e= atom | '*=' e= atom | '/=' e= atom | '%=' e= atom | '>>=' e= atom | '<<=' e= atom )
			int alt13=7;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt13=1;
				}
				break;
			case 31:
				{
				alt13=2;
				}
				break;
			case 26:
				{
				alt13=3;
				}
				break;
			case 33:
				{
				alt13=4;
				}
				break;
			case 21:
				{
				alt13=5;
				}
				break;
			case 44:
				{
				alt13=6;
				}
				break;
			case 37:
				{
				alt13=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// myInterp.g:77:11: '+=' e= atom
					{
					match(input,28,FOLLOW_28_in_overloaded_op608); if (state.failed) return;
					pushFollow(FOLLOW_atom_in_overloaded_op612);
					e=atom();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
									Integer v = (Integer)memory.get((Identifier4!=null?Identifier4.getText():null));
									if ( v==null ) System.err.println("undefined variable "+(Identifier4!=null?Identifier4.getText():null));    		  		
					    		  		else {
					    		  			v = v + e;
					    		  			memory.put((Identifier4!=null?Identifier4.getText():null), new Integer(v));
					    		  			System.out.println((Identifier4!=null?Identifier4.getText():null) + " = " + v);	   	
					    		  		}
					    		  	}
					}
					break;
				case 2 :
					// myInterp.g:87:15: '-=' e= atom
					{
					match(input,31,FOLLOW_31_in_overloaded_op640); if (state.failed) return;
					pushFollow(FOLLOW_atom_in_overloaded_op644);
					e=atom();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
									Integer v = (Integer)memory.get((Identifier4!=null?Identifier4.getText():null));
									if ( v==null ) System.err.println("undefined variable "+(Identifier4!=null?Identifier4.getText():null));    		  		
					    		  		else {
					    		  			v = v - e;
					    		  			memory.put((Identifier4!=null?Identifier4.getText():null), new Integer(v));
					    		  			System.out.println((Identifier4!=null?Identifier4.getText():null) + " = " + v);	   	
					    		  		}
					    		  	}
					}
					break;
				case 3 :
					// myInterp.g:97:15: '*=' e= atom
					{
					match(input,26,FOLLOW_26_in_overloaded_op680); if (state.failed) return;
					pushFollow(FOLLOW_atom_in_overloaded_op684);
					e=atom();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
									Integer v = (Integer)memory.get((Identifier4!=null?Identifier4.getText():null));
									if ( v==null ) System.err.println("undefined variable "+(Identifier4!=null?Identifier4.getText():null));    		  		
					    		  		else {
					    		  			v = v * e;
					    		  			memory.put((Identifier4!=null?Identifier4.getText():null), new Integer(v));
					    		  			System.out.println((Identifier4!=null?Identifier4.getText():null) + " = " + v);	   	
					    		  		}
					    		  	}
					}
					break;
				case 4 :
					// myInterp.g:107:15: '/=' e= atom
					{
					match(input,33,FOLLOW_33_in_overloaded_op720); if (state.failed) return;
					pushFollow(FOLLOW_atom_in_overloaded_op724);
					e=atom();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
									Integer v = (Integer)memory.get((Identifier4!=null?Identifier4.getText():null));
									if ( v==null ) System.err.println("undefined variable "+(Identifier4!=null?Identifier4.getText():null));    		  		
					    		  		else {
					    		  			v = v / e;
					    		  			memory.put((Identifier4!=null?Identifier4.getText():null), new Integer(v));
					    		  			System.out.println((Identifier4!=null?Identifier4.getText():null) + " = " + v);	   	
					    		  		}
					    		  	}
					}
					break;
				case 5 :
					// myInterp.g:117:15: '%=' e= atom
					{
					match(input,21,FOLLOW_21_in_overloaded_op760); if (state.failed) return;
					pushFollow(FOLLOW_atom_in_overloaded_op764);
					e=atom();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
									Integer v = (Integer)memory.get((Identifier4!=null?Identifier4.getText():null));
									if ( v==null ) System.err.println("undefined variable "+(Identifier4!=null?Identifier4.getText():null));    		  		
					    		  		else {
					    		  			v = v % e;
					    		  			memory.put((Identifier4!=null?Identifier4.getText():null), new Integer(v));
					    		  			System.out.println((Identifier4!=null?Identifier4.getText():null) + " = " + v);	   	
					    		  		}
					    		  	}
					}
					break;
				case 6 :
					// myInterp.g:127:15: '>>=' e= atom
					{
					match(input,44,FOLLOW_44_in_overloaded_op794); if (state.failed) return;
					pushFollow(FOLLOW_atom_in_overloaded_op798);
					e=atom();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
									Integer v = (Integer)memory.get((Identifier4!=null?Identifier4.getText():null));
									if ( v==null ) System.err.println("undefined variable "+(Identifier4!=null?Identifier4.getText():null));    		  		
					    		  		else {
					    		  			v = v >> e;
					    		  			memory.put((Identifier4!=null?Identifier4.getText():null), new Integer(v));
					    		  			System.out.println((Identifier4!=null?Identifier4.getText():null) + " = " + v);	   	
					    		  		}
					    		  	}
					}
					break;
				case 7 :
					// myInterp.g:137:15: '<<=' e= atom
					{
					match(input,37,FOLLOW_37_in_overloaded_op826); if (state.failed) return;
					pushFollow(FOLLOW_atom_in_overloaded_op830);
					e=atom();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
									Integer v = (Integer)memory.get((Identifier4!=null?Identifier4.getText():null));
									if ( v==null ) System.err.println("undefined variable "+(Identifier4!=null?Identifier4.getText():null));    		  		
					    		  		else {
					    		  			v = v << e;
					    		  			memory.put((Identifier4!=null?Identifier4.getText():null), new Integer(v));
					    		  			System.out.println((Identifier4!=null?Identifier4.getText():null) + " = " + v);	   	
					    		  		}
					    		  	}
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "overloaded_op"



	// $ANTLR start "statement"
	// myInterp.g:150:1: statement : ( type a= Identifier ( '=' b= expr )? ( ',' a= Identifier ( '=' b= expr )? )* ';' NEWLINE |a= Identifier '=' b= expr ( ',' a= Identifier '=' b= expr )* ';' NEWLINE | IF '(' compExpr ')' if_statements ( ( ELSE )=> ELSE if_statements )? | overloaded_op ';' NEWLINE | PRINTF printf_statement | SCANF scanf_statement | NEWLINE );
	public final void statement() throws RecognitionException {
		Token a=null;
		ParserRuleReturnScope b =null;
		int compExpr5 =0;

		try {
			// myInterp.g:150:10: ( type a= Identifier ( '=' b= expr )? ( ',' a= Identifier ( '=' b= expr )? )* ';' NEWLINE |a= Identifier '=' b= expr ( ',' a= Identifier '=' b= expr )* ';' NEWLINE | IF '(' compExpr ')' if_statements ( ( ELSE )=> ELSE if_statements )? | overloaded_op ';' NEWLINE | PRINTF printf_statement | SCANF scanf_statement | NEWLINE )
			int alt19=7;
			switch ( input.LA(1) ) {
			case INT:
			case VOID:
				{
				alt19=1;
				}
				break;
			case Identifier:
				{
				int LA19_2 = input.LA(2);
				if ( (LA19_2==39) ) {
					alt19=2;
				}
				else if ( (LA19_2==21||LA19_2==26||LA19_2==28||LA19_2==31||LA19_2==33||LA19_2==37||LA19_2==44) ) {
					alt19=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt19=3;
				}
				break;
			case PRINTF:
				{
				alt19=5;
				}
				break;
			case SCANF:
				{
				alt19=6;
				}
				break;
			case NEWLINE:
				{
				alt19=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// myInterp.g:150:12: type a= Identifier ( '=' b= expr )? ( ',' a= Identifier ( '=' b= expr )? )* ';' NEWLINE
					{
					pushFollow(FOLLOW_type_in_statement894);
					type();
					state._fsp--;
					if (state.failed) return;
					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement902); if (state.failed) return;
					if ( state.backtracking==0 ) {
						   	if (SKIP == false){
								memory.put((a!=null?a.getText():null), new Integer(0)); 
							   	System.out.println((a!=null?a.getText():null) + " = 0");	   	
						   	}

						   }
					// myInterp.g:159:5: ( '=' b= expr )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==39) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// myInterp.g:159:6: '=' b= expr
							{
							match(input,39,FOLLOW_39_in_statement915); if (state.failed) return;
							pushFollow(FOLLOW_expr_in_statement919);
							b=expr();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {
								   	if (SKIP == false){
									   	memory.put((a!=null?a.getText():null), new Integer((b!=null?((myInterpParser.expr_return)b).value:0))); 
									   	System.out.println((a!=null?a.getText():null) + " = " + (b!=null?((myInterpParser.expr_return)b).value:0));
									}
								   }
							}
							break;

					}

					// myInterp.g:166:5: ( ',' a= Identifier ( '=' b= expr )? )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==29) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// myInterp.g:166:6: ',' a= Identifier ( '=' b= expr )?
							{
							match(input,29,FOLLOW_29_in_statement934); if (state.failed) return;
							a=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement938); if (state.failed) return;
							if ( state.backtracking==0 ) {
								   	if (SKIP == false){
									   	memory.put((a!=null?a.getText():null), new Integer(0)); 
									   	System.out.println((a!=null?a.getText():null) + " = 0");
									}
								   }
							// myInterp.g:173:5: ( '=' b= expr )?
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==39) ) {
								alt15=1;
							}
							switch (alt15) {
								case 1 :
									// myInterp.g:173:6: '=' b= expr
									{
									match(input,39,FOLLOW_39_in_statement951); if (state.failed) return;
									pushFollow(FOLLOW_expr_in_statement955);
									b=expr();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) {
										   	if (SKIP == false){
											   	memory.put((b!=null?input.toString(b.start,b.stop):null), new Integer((b!=null?((myInterpParser.expr_return)b).value:0))); 
											   	System.out.println((a!=null?a.getText():null) + " = " + (b!=null?((myInterpParser.expr_return)b).value:0));
											}
										   }
									}
									break;

							}

							}
							break;

						default :
							break loop16;
						}
					}

					match(input,34,FOLLOW_34_in_statement977); if (state.failed) return;
					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement980); if (state.failed) return;
					}
					break;
				case 2 :
					// myInterp.g:182:5: a= Identifier '=' b= expr ( ',' a= Identifier '=' b= expr )* ';' NEWLINE
					{
					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement988); if (state.failed) return;
					match(input,39,FOLLOW_39_in_statement990); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_statement994);
					b=expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
						   	if (SKIP == false){
							   	memory.put((a!=null?a.getText():null), new Integer((b!=null?((myInterpParser.expr_return)b).value:0))); 
							   	System.out.println((a!=null?a.getText():null) + " = " + (b!=null?((myInterpParser.expr_return)b).value:0));
							}
						   }
					// myInterp.g:189:5: ( ',' a= Identifier '=' b= expr )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==29) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// myInterp.g:189:6: ',' a= Identifier '=' b= expr
							{
							match(input,29,FOLLOW_29_in_statement1008); if (state.failed) return;
							a=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement1012); if (state.failed) return;
							match(input,39,FOLLOW_39_in_statement1014); if (state.failed) return;
							pushFollow(FOLLOW_expr_in_statement1018);
							b=expr();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {
								   	if (SKIP == false){
									   	memory.put((a!=null?a.getText():null), new Integer((b!=null?((myInterpParser.expr_return)b).value:0))); 
									   	System.out.println((a!=null?a.getText():null) + " = " + (b!=null?((myInterpParser.expr_return)b).value:0));	   	
								   	}
								   }
							}
							break;

						default :
							break loop17;
						}
					}

					match(input,34,FOLLOW_34_in_statement1033); if (state.failed) return;
					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement1035); if (state.failed) return;
					}
					break;
				case 3 :
					// myInterp.g:197:12: IF '(' compExpr ')' if_statements ( ( ELSE )=> ELSE if_statements )?
					{
					match(input,IF,FOLLOW_IF_in_statement1048); if (state.failed) return;
					match(input,23,FOLLOW_23_in_statement1050); if (state.failed) return;
					pushFollow(FOLLOW_compExpr_in_statement1052);
					compExpr5=compExpr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					           	if (SKIP == false){
							   	if (TRACEON) System.out.println("statement: IF \'(\' (comExpr) \')\' if_then_statement");
							   	if (compExpr5 > 0){
							   		System.out.println("True");
							   		SKIP = false;
							   	}  
							   	else {
							   		System.out.println("False");
							   		SKIP = true;
							   	}
							}
					           }
					match(input,24,FOLLOW_24_in_statement1079); if (state.failed) return;
					pushFollow(FOLLOW_if_statements_in_statement1081);
					if_statements();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {SKIP = !SKIP;}
					// myInterp.g:211:46: ( ( ELSE )=> ELSE if_statements )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==ELSE) ) {
						int LA18_1 = input.LA(2);
						if ( (synpred1_myInterp()) ) {
							alt18=1;
						}
					}
					switch (alt18) {
						case 1 :
							// myInterp.g:211:47: ( ELSE )=> ELSE if_statements
							{
							match(input,ELSE,FOLLOW_ELSE_in_statement1092); if (state.failed) return;
							pushFollow(FOLLOW_if_statements_in_statement1094);
							if_statements();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( state.backtracking==0 ) {SKIP = false;}
					}
					break;
				case 4 :
					// myInterp.g:212:12: overloaded_op ';' NEWLINE
					{
					pushFollow(FOLLOW_overloaded_op_in_statement1112);
					overloaded_op();
					state._fsp--;
					if (state.failed) return;
					match(input,34,FOLLOW_34_in_statement1114); if (state.failed) return;
					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement1117); if (state.failed) return;
					}
					break;
				case 5 :
					// myInterp.g:213:12: PRINTF printf_statement
					{
					match(input,PRINTF,FOLLOW_PRINTF_in_statement1130); if (state.failed) return;
					pushFollow(FOLLOW_printf_statement_in_statement1133);
					printf_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statement: PRINTF  printf_statement"); }
					}
					break;
				case 6 :
					// myInterp.g:214:12: SCANF scanf_statement
					{
					match(input,SCANF,FOLLOW_SCANF_in_statement1149); if (state.failed) return;
					pushFollow(FOLLOW_scanf_statement_in_statement1152);
					scanf_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statement: SCANF  scanf_statement"); }
					}
					break;
				case 7 :
					// myInterp.g:215:12: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement1168); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "if_statements"
	// myInterp.g:219:1: if_statements : ( statement | '{' ( statement )* '}' );
	public final void if_statements() throws RecognitionException {
		try {
			// myInterp.g:219:14: ( statement | '{' ( statement )* '}' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==IF||(LA21_0 >= INT && LA21_0 <= Identifier)||(LA21_0 >= NEWLINE && LA21_0 <= PRINTF)||LA21_0==SCANF||LA21_0==VOID) ) {
				alt21=1;
			}
			else if ( (LA21_0==45) ) {
				alt21=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// myInterp.g:219:16: statement
					{
					pushFollow(FOLLOW_statement_in_if_statements1187);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myInterp.g:220:10: '{' ( statement )* '}'
					{
					match(input,45,FOLLOW_45_in_if_statements1198); if (state.failed) return;
					// myInterp.g:220:14: ( statement )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==IF||(LA20_0 >= INT && LA20_0 <= Identifier)||(LA20_0 >= NEWLINE && LA20_0 <= PRINTF)||LA20_0==SCANF||LA20_0==VOID) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// myInterp.g:220:14: statement
							{
							pushFollow(FOLLOW_statement_in_if_statements1200);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop20;
						}
					}

					match(input,46,FOLLOW_46_in_if_statements1203); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_statements"



	// $ANTLR start "printf_statement"
	// myInterp.g:224:1: printf_statement : '(' STRING ( ',' a= Identifier )* ')' ';' ;
	public final void printf_statement() throws RecognitionException {
		Token a=null;
		Token STRING6=null;

		try {
			// myInterp.g:224:18: ( '(' STRING ( ',' a= Identifier )* ')' ';' )
			// myInterp.g:224:20: '(' STRING ( ',' a= Identifier )* ')' ';'
			{
			match(input,23,FOLLOW_23_in_printf_statement1226); if (state.failed) return;
			STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_printf_statement1229); if (state.failed) return;
			if ( state.backtracking==0 ) {str = (STRING6!=null?STRING6.getText():null);}
			// myInterp.g:225:6: ( ',' a= Identifier )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==29) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// myInterp.g:225:7: ',' a= Identifier
					{
					match(input,29,FOLLOW_29_in_printf_statement1239); if (state.failed) return;
					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_printf_statement1243); if (state.failed) return;
					if ( state.backtracking==0 ) {
							   	if (SKIP == false){
								   	Integer v = (Integer)memory.get((a!=null?a.getText():null));
								   	if ( v==null ) System.err.println("undefined variable "+ (a!=null?a.getText():null));
								   	else str = str.replaceFirst("%d",v.toString());
								}
							   }
					}
					break;

				default :
					break loop22;
				}
			}

			match(input,24,FOLLOW_24_in_printf_statement1260); if (state.failed) return;
			match(input,34,FOLLOW_34_in_printf_statement1262); if (state.failed) return;
			if ( state.backtracking==0 ) {if (SKIP == false) System.out.println(str.substring(1, str.length() - 1));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printf_statement"



	// $ANTLR start "scanf_statement"
	// myInterp.g:237:1: scanf_statement : '(' STRING ( ',' '&' a= Identifier )* ')' ';' ;
	public final void scanf_statement() throws RecognitionException {
		Token a=null;

		try {
			// myInterp.g:237:17: ( '(' STRING ( ',' '&' a= Identifier )* ')' ';' )
			// myInterp.g:237:19: '(' STRING ( ',' '&' a= Identifier )* ')' ';'
			{
			match(input,23,FOLLOW_23_in_scanf_statement1288); if (state.failed) return;
			match(input,STRING,FOLLOW_STRING_in_scanf_statement1291); if (state.failed) return;
			// myInterp.g:238:5: ( ',' '&' a= Identifier )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==29) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// myInterp.g:238:6: ',' '&' a= Identifier
					{
					match(input,29,FOLLOW_29_in_scanf_statement1299); if (state.failed) return;
					match(input,22,FOLLOW_22_in_scanf_statement1301); if (state.failed) return;
					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_scanf_statement1304); if (state.failed) return;
					if ( state.backtracking==0 ) {
							  	if (SKIP == false){
								  	if ( (Integer)memory.get((a!=null?a.getText():null))==null ) System.err.println("undefined variable "+ (a!=null?a.getText():null));
								  	else{
								  		Integer v = scanner.nextInt();
								  		memory.put((a!=null?a.getText():null), new Integer(v));
								  		System.out.println((a!=null?a.getText():null) + " = " + v);
								  	}
								}
							  }
					}
					break;

				default :
					break loop23;
				}
			}

			match(input,24,FOLLOW_24_in_scanf_statement1319); if (state.failed) return;
			match(input,34,FOLLOW_34_in_scanf_statement1321); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "scanf_statement"



	// $ANTLR start "return_"
	// myInterp.g:253:1: return_ : RETURN_ ( Integer_constant ';' | Identifier ';' | ';' ) ;
	public final void return_() throws RecognitionException {
		try {
			// myInterp.g:253:8: ( RETURN_ ( Integer_constant ';' | Identifier ';' | ';' ) )
			// myInterp.g:253:9: RETURN_ ( Integer_constant ';' | Identifier ';' | ';' )
			{
			match(input,RETURN_,FOLLOW_RETURN__in_return_1349); if (state.failed) return;
			// myInterp.g:253:17: ( Integer_constant ';' | Identifier ';' | ';' )
			int alt24=3;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt24=1;
				}
				break;
			case Identifier:
				{
				alt24=2;
				}
				break;
			case 34:
				{
				alt24=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// myInterp.g:253:18: Integer_constant ';'
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_return_1352); if (state.failed) return;
					match(input,34,FOLLOW_34_in_return_1354); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("return_:RETURN Integer_constant ;"); }
					}
					break;
				case 2 :
					// myInterp.g:254:9: Identifier ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_return_1365); if (state.failed) return;
					match(input,34,FOLLOW_34_in_return_1367); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("return_:RETURN Identifier ;"); }
					}
					break;
				case 3 :
					// myInterp.g:255:9: ';'
					{
					match(input,34,FOLLOW_34_in_return_1378); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("return_:RETURN ;"); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "return_"

	// $ANTLR start synpred1_myInterp
	public final void synpred1_myInterp_fragment() throws RecognitionException {
		// myInterp.g:211:47: ( ELSE )
		// myInterp.g:211:48: ELSE
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred1_myInterp1087); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_myInterp

	// Delegated rules

	public final boolean synpred1_myInterp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_myInterp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_INCLUDE_in_prog36 = new BitSet(new long[]{0x0000000000020180L});
	public static final BitSet FOLLOW_void_main_in_prog41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_main_in_prog43 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_void_main53 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MAIN_in_void_main55 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_void_main57 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_void_main59 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_void_main62 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_45_in_void_main66 = new BitSet(new long[]{0x000040000002B340L});
	public static final BitSet FOLLOW_statement_in_void_main69 = new BitSet(new long[]{0x000040000002B340L});
	public static final BitSet FOLLOW_46_in_void_main72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_int_main96 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MAIN_in_int_main98 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_int_main100 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_int_main102 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_int_main105 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_45_in_int_main110 = new BitSet(new long[]{0x000040000002F340L});
	public static final BitSet FOLLOW_statement_in_int_main113 = new BitSet(new long[]{0x000040000002F340L});
	public static final BitSet FOLLOW_return__in_int_main116 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_int_main119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr188 = new BitSet(new long[]{0x0000000048000002L});
	public static final BitSet FOLLOW_27_in_expr204 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_multExpr_in_expr208 = new BitSet(new long[]{0x0000000048000002L});
	public static final BitSet FOLLOW_30_in_expr224 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_multExpr_in_expr228 = new BitSet(new long[]{0x0000000048000002L});
	public static final BitSet FOLLOW_atom_in_multExpr266 = new BitSet(new long[]{0x0000081102100002L});
	public static final BitSet FOLLOW_25_in_multExpr284 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_multExpr288 = new BitSet(new long[]{0x0000081102100002L});
	public static final BitSet FOLLOW_32_in_multExpr305 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_multExpr309 = new BitSet(new long[]{0x0000081102100002L});
	public static final BitSet FOLLOW_20_in_multExpr326 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_multExpr330 = new BitSet(new long[]{0x0000081102100002L});
	public static final BitSet FOLLOW_36_in_multExpr347 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_multExpr351 = new BitSet(new long[]{0x0000081102100002L});
	public static final BitSet FOLLOW_43_in_multExpr368 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_multExpr372 = new BitSet(new long[]{0x0000081102100002L});
	public static final BitSet FOLLOW_Integer_constant_in_atom409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_atom421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_atom441 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_expr_in_atom443 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_atom445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_compExpr473 = new BitSet(new long[]{0x0000074800080000L});
	public static final BitSet FOLLOW_41_in_compExpr482 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_compExpr486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_compExpr494 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_compExpr498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_compExpr506 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_compExpr510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_compExpr518 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_compExpr522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_compExpr530 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_compExpr534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_compExpr542 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_compExpr546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op585 = new BitSet(new long[]{0x0000102294200000L});
	public static final BitSet FOLLOW_28_in_overloaded_op608 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_overloaded_op612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_overloaded_op640 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_overloaded_op644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_overloaded_op680 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_overloaded_op684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_overloaded_op720 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_overloaded_op724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_overloaded_op760 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_overloaded_op764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_overloaded_op794 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_overloaded_op798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_overloaded_op826 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_atom_in_overloaded_op830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_statement894 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_statement902 = new BitSet(new long[]{0x0000008420000000L});
	public static final BitSet FOLLOW_39_in_statement915 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_expr_in_statement919 = new BitSet(new long[]{0x0000000420000000L});
	public static final BitSet FOLLOW_29_in_statement934 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_statement938 = new BitSet(new long[]{0x0000008420000000L});
	public static final BitSet FOLLOW_39_in_statement951 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_expr_in_statement955 = new BitSet(new long[]{0x0000000420000000L});
	public static final BitSet FOLLOW_34_in_statement977 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_statement980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement988 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_statement990 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_expr_in_statement994 = new BitSet(new long[]{0x0000000420000000L});
	public static final BitSet FOLLOW_29_in_statement1008 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_statement1012 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_statement1014 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_expr_in_statement1018 = new BitSet(new long[]{0x0000000420000000L});
	public static final BitSet FOLLOW_34_in_statement1033 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_statement1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement1048 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_statement1050 = new BitSet(new long[]{0x0000000000800600L});
	public static final BitSet FOLLOW_compExpr_in_statement1052 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_statement1079 = new BitSet(new long[]{0x000020000002B340L});
	public static final BitSet FOLLOW_if_statements_in_statement1081 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ELSE_in_statement1092 = new BitSet(new long[]{0x000020000002B340L});
	public static final BitSet FOLLOW_if_statements_in_statement1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_overloaded_op_in_statement1112 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_statement1114 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_statement1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_statement1130 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_printf_statement_in_statement1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCANF_in_statement1149 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_scanf_statement_in_statement1152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_statement1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_if_statements1187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_if_statements1198 = new BitSet(new long[]{0x000040000002B340L});
	public static final BitSet FOLLOW_statement_in_if_statements1200 = new BitSet(new long[]{0x000040000002B340L});
	public static final BitSet FOLLOW_46_in_if_statements1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_printf_statement1226 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_printf_statement1229 = new BitSet(new long[]{0x0000000021000000L});
	public static final BitSet FOLLOW_29_in_printf_statement1239 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_printf_statement1243 = new BitSet(new long[]{0x0000000021000000L});
	public static final BitSet FOLLOW_24_in_printf_statement1260 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_printf_statement1262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_scanf_statement1288 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_scanf_statement1291 = new BitSet(new long[]{0x0000000021000000L});
	public static final BitSet FOLLOW_29_in_scanf_statement1299 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_scanf_statement1301 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Identifier_in_scanf_statement1304 = new BitSet(new long[]{0x0000000021000000L});
	public static final BitSet FOLLOW_24_in_scanf_statement1319 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_scanf_statement1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN__in_return_1349 = new BitSet(new long[]{0x0000000400000600L});
	public static final BitSet FOLLOW_Integer_constant_in_return_1352 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_return_1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_return_1365 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_return_1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_return_1378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred1_myInterp1087 = new BitSet(new long[]{0x0000000000000002L});
}
