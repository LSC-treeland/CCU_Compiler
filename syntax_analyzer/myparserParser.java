// $ANTLR 3.5.2 myparser.g 2022-04-29 22:11:33

    // import packages here.


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myparserParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CASE", "CHAR", "COMMENT", 
		"CONTINUE", "DEFAULT", "DOUBLE", "ELSE", "FLOAT", "FOR", "Floating_point_constant", 
		"IF", "INCLUDE", "INT", "Identifier", "Integer_constant", "LONG", "MAIN", 
		"PRINTF", "RETURN_", "SCANF", "SHORT", "STRING", "SWITCH", "VOID", "WHILE", 
		"WS", "'!='", "'%'", "'%='", "'&'", "'('", "')'", "'*'", "'*='", "'+'", 
		"'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'/='", "':'", "';'", 
		"'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int BREAK=4;
	public static final int CASE=5;
	public static final int CHAR=6;
	public static final int COMMENT=7;
	public static final int CONTINUE=8;
	public static final int DEFAULT=9;
	public static final int DOUBLE=10;
	public static final int ELSE=11;
	public static final int FLOAT=12;
	public static final int FOR=13;
	public static final int Floating_point_constant=14;
	public static final int IF=15;
	public static final int INCLUDE=16;
	public static final int INT=17;
	public static final int Identifier=18;
	public static final int Integer_constant=19;
	public static final int LONG=20;
	public static final int MAIN=21;
	public static final int PRINTF=22;
	public static final int RETURN_=23;
	public static final int SCANF=24;
	public static final int SHORT=25;
	public static final int STRING=26;
	public static final int SWITCH=27;
	public static final int VOID=28;
	public static final int WHILE=29;
	public static final int WS=30;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myparserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myparserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myparser.g"; }


	    boolean TRACEON = true;



	// $ANTLR start "program"
	// myparser.g:15:1: program : ( INCLUDE )* ( void_main | int_main ) ;
	public final void program() throws RecognitionException {
		try {
			// myparser.g:15:8: ( ( INCLUDE )* ( void_main | int_main ) )
			// myparser.g:15:9: ( INCLUDE )* ( void_main | int_main )
			{
			// myparser.g:15:9: ( INCLUDE )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myparser.g:15:10: INCLUDE
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_program36); 
					}
					break;

				default :
					break loop1;
				}
			}

			// myparser.g:15:20: ( void_main | int_main )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VOID) ) {
				alt2=1;
			}
			else if ( (LA2_0==INT) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myparser.g:15:21: void_main
					{
					pushFollow(FOLLOW_void_main_in_program41);
					void_main();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:15:31: int_main
					{
					pushFollow(FOLLOW_int_main_in_program43);
					int_main();
					state._fsp--;

					}
					break;

			}

			if (TRACEON) System.out.println("program:(INCLUDE)* (void_main|int_main)");
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
	// $ANTLR end "program"



	// $ANTLR start "void_main"
	// myparser.g:17:1: void_main : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void void_main() throws RecognitionException {
		try {
			// myparser.g:17:10: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// myparser.g:17:11: VOID MAIN '(' ')' '{' declarations statements '}'
			{
			match(input,VOID,FOLLOW_VOID_in_void_main53); 
			match(input,MAIN,FOLLOW_MAIN_in_void_main55); 
			match(input,35,FOLLOW_35_in_void_main57); 
			match(input,36,FOLLOW_36_in_void_main59); 
			match(input,56,FOLLOW_56_in_void_main61); 
			pushFollow(FOLLOW_declarations_in_void_main63);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_void_main65);
			statements();
			state._fsp--;

			match(input,57,FOLLOW_57_in_void_main67); 
			if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");
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
	// myparser.g:20:1: int_main : INT MAIN '(' ')' '{' declarations statements ( return_ )? '}' ;
	public final void int_main() throws RecognitionException {
		try {
			// myparser.g:20:9: ( INT MAIN '(' ')' '{' declarations statements ( return_ )? '}' )
			// myparser.g:20:10: INT MAIN '(' ')' '{' declarations statements ( return_ )? '}'
			{
			match(input,INT,FOLLOW_INT_in_int_main91); 
			match(input,MAIN,FOLLOW_MAIN_in_int_main93); 
			match(input,35,FOLLOW_35_in_int_main95); 
			match(input,36,FOLLOW_36_in_int_main97); 
			match(input,56,FOLLOW_56_in_int_main99); 
			pushFollow(FOLLOW_declarations_in_int_main101);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_int_main103);
			statements();
			state._fsp--;

			// myparser.g:20:55: ( return_ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==RETURN_) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// myparser.g:20:55: return_
					{
					pushFollow(FOLLOW_return__in_int_main105);
					return_();
					state._fsp--;

					}
					break;

			}

			match(input,57,FOLLOW_57_in_int_main108); 
			if (TRACEON) System.out.println("INT MAIN () {declarations statements return_?}");
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



	// $ANTLR start "declarations"
	// myparser.g:24:1: declarations : ( type Identifier ';' declarations | type Identifier '=' ( Integer_constant | Floating_point_constant | STRING ) ';' declarations |);
	public final void declarations() throws RecognitionException {
		try {
			// myparser.g:24:13: ( type Identifier ';' declarations | type Identifier '=' ( Integer_constant | Floating_point_constant | STRING ) ';' declarations |)
			int alt4=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1==37) ) {
					int LA4_9 = input.LA(3);
					if ( (LA4_9==Identifier) ) {
						int LA4_10 = input.LA(4);
						if ( (LA4_10==49) ) {
							alt4=1;
						}
						else if ( (LA4_10==52) ) {
							alt4=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_1==Identifier) ) {
					int LA4_10 = input.LA(3);
					if ( (LA4_10==49) ) {
						alt4=1;
					}
					else if ( (LA4_10==52) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==37) ) {
					int LA4_11 = input.LA(3);
					if ( (LA4_11==Identifier) ) {
						int LA4_10 = input.LA(4);
						if ( (LA4_10==49) ) {
							alt4=1;
						}
						else if ( (LA4_10==52) ) {
							alt4=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_2==Identifier) ) {
					int LA4_10 = input.LA(3);
					if ( (LA4_10==49) ) {
						alt4=1;
					}
					else if ( (LA4_10==52) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOID:
				{
				int LA4_3 = input.LA(2);
				if ( (LA4_3==37) ) {
					int LA4_12 = input.LA(3);
					if ( (LA4_12==Identifier) ) {
						int LA4_10 = input.LA(4);
						if ( (LA4_10==49) ) {
							alt4=1;
						}
						else if ( (LA4_10==52) ) {
							alt4=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_3==Identifier) ) {
					int LA4_10 = input.LA(3);
					if ( (LA4_10==49) ) {
						alt4=1;
					}
					else if ( (LA4_10==52) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4==37) ) {
					int LA4_13 = input.LA(3);
					if ( (LA4_13==Identifier) ) {
						int LA4_10 = input.LA(4);
						if ( (LA4_10==49) ) {
							alt4=1;
						}
						else if ( (LA4_10==52) ) {
							alt4=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_4==Identifier) ) {
					int LA4_10 = input.LA(3);
					if ( (LA4_10==49) ) {
						alt4=1;
					}
					else if ( (LA4_10==52) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG:
				{
				int LA4_5 = input.LA(2);
				if ( (LA4_5==37) ) {
					int LA4_14 = input.LA(3);
					if ( (LA4_14==Identifier) ) {
						int LA4_10 = input.LA(4);
						if ( (LA4_10==49) ) {
							alt4=1;
						}
						else if ( (LA4_10==52) ) {
							alt4=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_5==Identifier) ) {
					int LA4_10 = input.LA(3);
					if ( (LA4_10==49) ) {
						alt4=1;
					}
					else if ( (LA4_10==52) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA4_6 = input.LA(2);
				if ( (LA4_6==37) ) {
					int LA4_15 = input.LA(3);
					if ( (LA4_15==Identifier) ) {
						int LA4_10 = input.LA(4);
						if ( (LA4_10==49) ) {
							alt4=1;
						}
						else if ( (LA4_10==52) ) {
							alt4=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_6==Identifier) ) {
					int LA4_10 = input.LA(3);
					if ( (LA4_10==49) ) {
						alt4=1;
					}
					else if ( (LA4_10==52) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT:
				{
				int LA4_7 = input.LA(2);
				if ( (LA4_7==37) ) {
					int LA4_16 = input.LA(3);
					if ( (LA4_16==Identifier) ) {
						int LA4_10 = input.LA(4);
						if ( (LA4_10==49) ) {
							alt4=1;
						}
						else if ( (LA4_10==52) ) {
							alt4=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_7==Identifier) ) {
					int LA4_10 = input.LA(3);
					if ( (LA4_10==49) ) {
						alt4=1;
					}
					else if ( (LA4_10==52) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BREAK:
			case CASE:
			case CONTINUE:
			case DEFAULT:
			case ELSE:
			case FOR:
			case Floating_point_constant:
			case IF:
			case Identifier:
			case Integer_constant:
			case PRINTF:
			case RETURN_:
			case SCANF:
			case SWITCH:
			case WHILE:
			case 35:
			case 40:
			case 43:
			case 44:
			case 57:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myparser.g:24:14: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations133);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_declarations135); 
					match(input,49,FOLLOW_49_in_declarations137); 
					pushFollow(FOLLOW_declarations_in_declarations139);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("declarations: type Identifier : declarations"); 
					}
					break;
				case 2 :
					// myparser.g:25:14: type Identifier '=' ( Integer_constant | Floating_point_constant | STRING ) ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations155);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_declarations157); 
					match(input,52,FOLLOW_52_in_declarations159); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant||input.LA(1)==STRING ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,49,FOLLOW_49_in_declarations169); 
					pushFollow(FOLLOW_declarations_in_declarations171);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("type Identifier '=' (Integer_constant|Floating_point_constant|STRING) ';' declarations"); 
					}
					break;
				case 3 :
					// myparser.g:26:14: 
					{
					 if (TRACEON) System.out.println("declarations: ");
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
	// $ANTLR end "declarations"



	// $ANTLR start "type"
	// myparser.g:28:1: type : ( INT | CHAR | VOID | FLOAT | LONG | DOUBLE | SHORT | INT '*' | CHAR '*' | VOID '*' | FLOAT '*' | LONG '*' | DOUBLE '*' | SHORT '*' );
	public final void type() throws RecognitionException {
		try {
			// myparser.g:28:5: ( INT | CHAR | VOID | FLOAT | LONG | DOUBLE | SHORT | INT '*' | CHAR '*' | VOID '*' | FLOAT '*' | LONG '*' | DOUBLE '*' | SHORT '*' )
			int alt5=14;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA5_1 = input.LA(2);
				if ( (LA5_1==37) ) {
					alt5=8;
				}
				else if ( (LA5_1==Identifier) ) {
					alt5=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA5_2 = input.LA(2);
				if ( (LA5_2==37) ) {
					alt5=9;
				}
				else if ( (LA5_2==Identifier) ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOID:
				{
				int LA5_3 = input.LA(2);
				if ( (LA5_3==37) ) {
					alt5=10;
				}
				else if ( (LA5_3==Identifier) ) {
					alt5=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA5_4 = input.LA(2);
				if ( (LA5_4==37) ) {
					alt5=11;
				}
				else if ( (LA5_4==Identifier) ) {
					alt5=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG:
				{
				int LA5_5 = input.LA(2);
				if ( (LA5_5==37) ) {
					alt5=12;
				}
				else if ( (LA5_5==Identifier) ) {
					alt5=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA5_6 = input.LA(2);
				if ( (LA5_6==37) ) {
					alt5=13;
				}
				else if ( (LA5_6==Identifier) ) {
					alt5=6;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT:
				{
				int LA5_7 = input.LA(2);
				if ( (LA5_7==37) ) {
					alt5=14;
				}
				else if ( (LA5_7==Identifier) ) {
					alt5=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// myparser.g:28:6: INT
					{
					match(input,INT,FOLLOW_INT_in_type194); 
					 if (TRACEON) System.out.println("type: INT"); 
					}
					break;
				case 2 :
					// myparser.g:29:6: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type203); 
					if (TRACEON) System.out.println("type: CHAR"); 
					}
					break;
				case 3 :
					// myparser.g:30:6: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_type212); 
					if (TRACEON) System.out.println("type: VOID"); 
					}
					break;
				case 4 :
					// myparser.g:31:6: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type221); 
					if (TRACEON) System.out.println("type: FLOAT"); 
					}
					break;
				case 5 :
					// myparser.g:32:6: LONG
					{
					match(input,LONG,FOLLOW_LONG_in_type230); 
					if (TRACEON) System.out.println("type: LONG"); 
					}
					break;
				case 6 :
					// myparser.g:33:6: DOUBLE
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type239); 
					if (TRACEON) System.out.println("type: DOUBLE"); 
					}
					break;
				case 7 :
					// myparser.g:34:6: SHORT
					{
					match(input,SHORT,FOLLOW_SHORT_in_type248); 
					if (TRACEON) System.out.println("type: SHORT"); 
					}
					break;
				case 8 :
					// myparser.g:35:6: INT '*'
					{
					match(input,INT,FOLLOW_INT_in_type257); 
					match(input,37,FOLLOW_37_in_type258); 
					 if (TRACEON) System.out.println("type: INT*"); 
					}
					break;
				case 9 :
					// myparser.g:36:6: CHAR '*'
					{
					match(input,CHAR,FOLLOW_CHAR_in_type267); 
					match(input,37,FOLLOW_37_in_type268); 
					if (TRACEON) System.out.println("type: CHAR*"); 
					}
					break;
				case 10 :
					// myparser.g:37:6: VOID '*'
					{
					match(input,VOID,FOLLOW_VOID_in_type277); 
					match(input,37,FOLLOW_37_in_type278); 
					if (TRACEON) System.out.println("type: VOID*"); 
					}
					break;
				case 11 :
					// myparser.g:38:6: FLOAT '*'
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type287); 
					match(input,37,FOLLOW_37_in_type288); 
					if (TRACEON) System.out.println("type: FLOAT*"); 
					}
					break;
				case 12 :
					// myparser.g:39:6: LONG '*'
					{
					match(input,LONG,FOLLOW_LONG_in_type297); 
					match(input,37,FOLLOW_37_in_type298); 
					if (TRACEON) System.out.println("type: LONG*"); 
					}
					break;
				case 13 :
					// myparser.g:40:6: DOUBLE '*'
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type307); 
					match(input,37,FOLLOW_37_in_type308); 
					if (TRACEON) System.out.println("type: DOUBLE*"); 
					}
					break;
				case 14 :
					// myparser.g:41:6: SHORT '*'
					{
					match(input,SHORT,FOLLOW_SHORT_in_type317); 
					match(input,37,FOLLOW_37_in_type318); 
					if (TRACEON) System.out.println("type: SHORT*"); 
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



	// $ANTLR start "statements"
	// myparser.g:46:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myparser.g:46:11: ( statement statements |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= BREAK && LA6_0 <= CASE)||(LA6_0 >= CONTINUE && LA6_0 <= DEFAULT)||LA6_0==ELSE||LA6_0==FOR||LA6_0==IF||LA6_0==Identifier||LA6_0==PRINTF||LA6_0==SCANF||LA6_0==SWITCH||LA6_0==WHILE||LA6_0==40||LA6_0==44) ) {
				alt6=1;
			}
			else if ( (LA6_0==RETURN_||LA6_0==57) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// myparser.g:46:12: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements335);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements337);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:47:10: 
					{
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
	// $ANTLR end "statements"



	// $ANTLR start "arith_expression"
	// myparser.g:49:1: arith_expression : multExpr ( '+' multExpr | '-' multExpr )* ;
	public final void arith_expression() throws RecognitionException {
		try {
			// myparser.g:49:17: ( multExpr ( '+' multExpr | '-' multExpr )* )
			// myparser.g:49:19: multExpr ( '+' multExpr | '-' multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression354);
			multExpr();
			state._fsp--;

			// myparser.g:50:11: ( '+' multExpr | '-' multExpr )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==39) ) {
					alt7=1;
				}
				else if ( (LA7_0==43) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// myparser.g:50:13: '+' multExpr
					{
					match(input,39,FOLLOW_39_in_arith_expression368); 
					pushFollow(FOLLOW_multExpr_in_arith_expression370);
					multExpr();
					state._fsp--;

					if (TRACEON) System.out.println("arith_expression: multExpr +"); 
					}
					break;
				case 2 :
					// myparser.g:51:6: '-' multExpr
					{
					match(input,43,FOLLOW_43_in_arith_expression379); 
					pushFollow(FOLLOW_multExpr_in_arith_expression381);
					multExpr();
					state._fsp--;

					if (TRACEON) System.out.println("arith_expression: multExpr -"); 
					}
					break;

				default :
					break loop7;
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
	}
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myparser.g:55:1: multExpr : signExpr ( '*' signExpr | '/' signExpr | '%' signExpr )* ;
	public final void multExpr() throws RecognitionException {
		try {
			// myparser.g:55:9: ( signExpr ( '*' signExpr | '/' signExpr | '%' signExpr )* )
			// myparser.g:55:11: signExpr ( '*' signExpr | '/' signExpr | '%' signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr430);
			signExpr();
			state._fsp--;

			// myparser.g:56:11: ( '*' signExpr | '/' signExpr | '%' signExpr )*
			loop8:
			while (true) {
				int alt8=4;
				switch ( input.LA(1) ) {
				case 37:
					{
					alt8=1;
					}
					break;
				case 46:
					{
					alt8=2;
					}
					break;
				case 32:
					{
					alt8=3;
					}
					break;
				}
				switch (alt8) {
				case 1 :
					// myparser.g:56:13: '*' signExpr
					{
					match(input,37,FOLLOW_37_in_multExpr444); 
					pushFollow(FOLLOW_signExpr_in_multExpr446);
					signExpr();
					state._fsp--;

					if (TRACEON) System.out.println("multExpr: signExpr * "); 
					}
					break;
				case 2 :
					// myparser.g:57:13: '/' signExpr
					{
					match(input,46,FOLLOW_46_in_multExpr462); 
					pushFollow(FOLLOW_signExpr_in_multExpr464);
					signExpr();
					state._fsp--;

					if (TRACEON) System.out.println("multExpr: signExpr / "); 
					}
					break;
				case 3 :
					// myparser.g:58:13: '%' signExpr
					{
					match(input,32,FOLLOW_32_in_multExpr480); 
					pushFollow(FOLLOW_signExpr_in_multExpr482);
					signExpr();
					state._fsp--;

					if (TRACEON) System.out.println("multExpr: signExpr % "); 
					}
					break;

				default :
					break loop8;
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
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myparser.g:62:1: signExpr : ( primaryExpr | '-' primaryExpr );
	public final void signExpr() throws RecognitionException {
		try {
			// myparser.g:62:9: ( primaryExpr | '-' primaryExpr )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Floating_point_constant||(LA9_0 >= Identifier && LA9_0 <= Integer_constant)||LA9_0==35) ) {
				alt9=1;
			}
			else if ( (LA9_0==43) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// myparser.g:62:11: primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr503);
					primaryExpr();
					state._fsp--;

					if (TRACEON) System.out.println("signExpr: primaryExpr"); 
					}
					break;
				case 2 :
					// myparser.g:63:11: '-' primaryExpr
					{
					match(input,43,FOLLOW_43_in_signExpr517); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr519);
					primaryExpr();
					state._fsp--;

					if (TRACEON) System.out.println("signExpr: primaryExpr -"); 
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
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myparser.g:66:1: primaryExpr : ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' );
	public final void primaryExpr() throws RecognitionException {
		try {
			// myparser.g:66:12: ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' )
			int alt10=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt10=1;
				}
				break;
			case Floating_point_constant:
				{
				alt10=2;
				}
				break;
			case Identifier:
				{
				alt10=3;
				}
				break;
			case 35:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// myparser.g:66:14: Integer_constant
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr535); 
					}
					break;
				case 2 :
					// myparser.g:67:14: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr550); 
					}
					break;
				case 3 :
					// myparser.g:68:14: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr565); 
					}
					break;
				case 4 :
					// myparser.g:69:8: '(' arith_expression ')'
					{
					match(input,35,FOLLOW_35_in_primaryExpr574); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr576);
					arith_expression();
					state._fsp--;

					match(input,36,FOLLOW_36_in_primaryExpr578); 
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
	// $ANTLR end "primaryExpr"



	// $ANTLR start "comp_op"
	// myparser.g:72:1: comp_op : ( Identifier '>=' ( Integer_constant | Floating_point_constant ) | Identifier '==' ( Integer_constant | Floating_point_constant ) | Identifier '<=' ( Integer_constant | Floating_point_constant ) | Identifier '!=' ( Integer_constant | Floating_point_constant ) | Identifier '>' ( Integer_constant | Floating_point_constant ) | Identifier '<' ( Integer_constant | Floating_point_constant ) | ( Integer_constant | Floating_point_constant ) '>=' Identifier | ( Integer_constant | Floating_point_constant ) '==' Identifier | ( Integer_constant | Floating_point_constant ) '<=' Identifier | ( Integer_constant | Floating_point_constant ) '!=' Identifier | ( Integer_constant | Floating_point_constant ) '>' Identifier | ( Integer_constant | Floating_point_constant ) '<' Identifier | Identifier '>=' Identifier | Identifier '==' Identifier | Identifier '<=' Identifier | Identifier '!=' Identifier | Identifier '>' Identifier | Identifier '<' Identifier );
	public final void comp_op() throws RecognitionException {
		try {
			// myparser.g:72:8: ( Identifier '>=' ( Integer_constant | Floating_point_constant ) | Identifier '==' ( Integer_constant | Floating_point_constant ) | Identifier '<=' ( Integer_constant | Floating_point_constant ) | Identifier '!=' ( Integer_constant | Floating_point_constant ) | Identifier '>' ( Integer_constant | Floating_point_constant ) | Identifier '<' ( Integer_constant | Floating_point_constant ) | ( Integer_constant | Floating_point_constant ) '>=' Identifier | ( Integer_constant | Floating_point_constant ) '==' Identifier | ( Integer_constant | Floating_point_constant ) '<=' Identifier | ( Integer_constant | Floating_point_constant ) '!=' Identifier | ( Integer_constant | Floating_point_constant ) '>' Identifier | ( Integer_constant | Floating_point_constant ) '<' Identifier | Identifier '>=' Identifier | Identifier '==' Identifier | Identifier '<=' Identifier | Identifier '!=' Identifier | Identifier '>' Identifier | Identifier '<' Identifier )
			int alt11=18;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case 55:
					{
					int LA11_3 = input.LA(3);
					if ( (LA11_3==Floating_point_constant||LA11_3==Integer_constant) ) {
						alt11=1;
					}
					else if ( (LA11_3==Identifier) ) {
						alt11=13;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 53:
					{
					int LA11_4 = input.LA(3);
					if ( (LA11_4==Floating_point_constant||LA11_4==Integer_constant) ) {
						alt11=2;
					}
					else if ( (LA11_4==Identifier) ) {
						alt11=14;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 51:
					{
					int LA11_5 = input.LA(3);
					if ( (LA11_5==Floating_point_constant||LA11_5==Integer_constant) ) {
						alt11=3;
					}
					else if ( (LA11_5==Identifier) ) {
						alt11=15;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 31:
					{
					int LA11_6 = input.LA(3);
					if ( (LA11_6==Floating_point_constant||LA11_6==Integer_constant) ) {
						alt11=4;
					}
					else if ( (LA11_6==Identifier) ) {
						alt11=16;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 54:
					{
					int LA11_7 = input.LA(3);
					if ( (LA11_7==Floating_point_constant||LA11_7==Integer_constant) ) {
						alt11=5;
					}
					else if ( (LA11_7==Identifier) ) {
						alt11=17;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 50:
					{
					int LA11_8 = input.LA(3);
					if ( (LA11_8==Floating_point_constant||LA11_8==Integer_constant) ) {
						alt11=6;
					}
					else if ( (LA11_8==Identifier) ) {
						alt11=18;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA11_0==Floating_point_constant||LA11_0==Integer_constant) ) {
				switch ( input.LA(2) ) {
				case 55:
					{
					alt11=7;
					}
					break;
				case 53:
					{
					alt11=8;
					}
					break;
				case 51:
					{
					alt11=9;
					}
					break;
				case 31:
					{
					alt11=10;
					}
					break;
				case 54:
					{
					alt11=11;
					}
					break;
				case 50:
					{
					alt11=12;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// myparser.g:72:10: Identifier '>=' ( Integer_constant | Floating_point_constant )
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op597); 
					match(input,55,FOLLOW_55_in_comp_op599); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if (TRACEON) System.out.println("comp_op: Identifier >= constant"); 
					}
					break;
				case 2 :
					// myparser.g:73:24: Identifier '==' ( Integer_constant | Floating_point_constant )
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op632); 
					match(input,53,FOLLOW_53_in_comp_op634); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if (TRACEON) System.out.println("comp_op: Identifier == constant"); 
					}
					break;
				case 3 :
					// myparser.g:74:24: Identifier '<=' ( Integer_constant | Floating_point_constant )
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op667); 
					match(input,51,FOLLOW_51_in_comp_op669); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if (TRACEON) System.out.println("comp_op: Identifier <= constant"); 
					}
					break;
				case 4 :
					// myparser.g:75:24: Identifier '!=' ( Integer_constant | Floating_point_constant )
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op702); 
					match(input,31,FOLLOW_31_in_comp_op704); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if (TRACEON) System.out.println("comp_op: Identifier != constant"); 
					}
					break;
				case 5 :
					// myparser.g:76:24: Identifier '>' ( Integer_constant | Floating_point_constant )
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op737); 
					match(input,54,FOLLOW_54_in_comp_op739); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if (TRACEON) System.out.println("comp_op: Identifier > constant"); 
					}
					break;
				case 6 :
					// myparser.g:77:24: Identifier '<' ( Integer_constant | Floating_point_constant )
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op772); 
					match(input,50,FOLLOW_50_in_comp_op774); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if (TRACEON) System.out.println("comp_op: Identifier < constant"); 
					}
					break;
				case 7 :
					// myparser.g:78:24: ( Integer_constant | Floating_point_constant ) '>=' Identifier
					{
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,55,FOLLOW_55_in_comp_op813); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op815); 
					if (TRACEON) System.out.println("comp_op: constant >= Identifier"); 
					}
					break;
				case 8 :
					// myparser.g:79:24: ( Integer_constant | Floating_point_constant ) '==' Identifier
					{
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,53,FOLLOW_53_in_comp_op848); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op850); 
					if (TRACEON) System.out.println("comp_op: constant == Identifier"); 
					}
					break;
				case 9 :
					// myparser.g:80:24: ( Integer_constant | Floating_point_constant ) '<=' Identifier
					{
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,51,FOLLOW_51_in_comp_op883); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op885); 
					if (TRACEON) System.out.println("comp_op: constant <= Identifier"); 
					}
					break;
				case 10 :
					// myparser.g:81:24: ( Integer_constant | Floating_point_constant ) '!=' Identifier
					{
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,31,FOLLOW_31_in_comp_op918); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op920); 
					if (TRACEON) System.out.println("comp_op: constant != Identifier"); 
					}
					break;
				case 11 :
					// myparser.g:82:24: ( Integer_constant | Floating_point_constant ) '>' Identifier
					{
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,54,FOLLOW_54_in_comp_op953); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op955); 
					if (TRACEON) System.out.println("comp_op: constant > Identifier"); 
					}
					break;
				case 12 :
					// myparser.g:83:24: ( Integer_constant | Floating_point_constant ) '<' Identifier
					{
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,50,FOLLOW_50_in_comp_op988); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op990); 
					if (TRACEON) System.out.println("comp_op: constant < Identifier"); 
					}
					break;
				case 13 :
					// myparser.g:84:24: Identifier '>=' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1017); 
					match(input,55,FOLLOW_55_in_comp_op1019); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1021); 
					if (TRACEON) System.out.println("comp_op: Identifier >= Identifier"); 
					}
					break;
				case 14 :
					// myparser.g:85:24: Identifier '==' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1048); 
					match(input,53,FOLLOW_53_in_comp_op1050); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1052); 
					if (TRACEON) System.out.println("comp_op: Identifier == Identifier"); 
					}
					break;
				case 15 :
					// myparser.g:86:24: Identifier '<=' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1079); 
					match(input,51,FOLLOW_51_in_comp_op1081); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1083); 
					if (TRACEON) System.out.println("comp_op: Identifier <= Identifier"); 
					}
					break;
				case 16 :
					// myparser.g:87:24: Identifier '!=' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1110); 
					match(input,31,FOLLOW_31_in_comp_op1112); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1114); 
					if (TRACEON) System.out.println("comp_op: Identifier != Identifier"); 
					}
					break;
				case 17 :
					// myparser.g:88:24: Identifier '>' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1141); 
					match(input,54,FOLLOW_54_in_comp_op1143); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1145); 
					if (TRACEON) System.out.println("comp_op: Identifier > Identifier"); 
					}
					break;
				case 18 :
					// myparser.g:89:24: Identifier '<' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1172); 
					match(input,50,FOLLOW_50_in_comp_op1174); 
					match(input,Identifier,FOLLOW_Identifier_in_comp_op1176); 
					if (TRACEON) System.out.println("comp_op: Identifier < Identifier"); 
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
	// $ANTLR end "comp_op"



	// $ANTLR start "increment_decrement_op"
	// myparser.g:93:1: increment_decrement_op : ( Identifier '++' | Identifier '--' | '++' Identifier | '--' Identifier );
	public final void increment_decrement_op() throws RecognitionException {
		try {
			// myparser.g:93:23: ( Identifier '++' | Identifier '--' | '++' Identifier | '--' Identifier )
			int alt12=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA12_1 = input.LA(2);
				if ( (LA12_1==40) ) {
					alt12=1;
				}
				else if ( (LA12_1==44) ) {
					alt12=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 40:
				{
				alt12=3;
				}
				break;
			case 44:
				{
				alt12=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myparser.g:93:24: Identifier '++'
					{
					match(input,Identifier,FOLLOW_Identifier_in_increment_decrement_op1208); 
					match(input,40,FOLLOW_40_in_increment_decrement_op1210); 
					if (TRACEON) System.out.println("increment_decrement_op: Identifier ++"); 
					}
					break;
				case 2 :
					// myparser.g:94:24: Identifier '--'
					{
					match(input,Identifier,FOLLOW_Identifier_in_increment_decrement_op1238); 
					match(input,44,FOLLOW_44_in_increment_decrement_op1240); 
					if (TRACEON) System.out.println("increment_decrement_op: Identifier --"); 
					}
					break;
				case 3 :
					// myparser.g:95:24: '++' Identifier
					{
					match(input,40,FOLLOW_40_in_increment_decrement_op1268); 
					match(input,Identifier,FOLLOW_Identifier_in_increment_decrement_op1270); 
					if (TRACEON) System.out.println("increment_decrement_op: ++ Identifier "); 
					}
					break;
				case 4 :
					// myparser.g:96:24: '--' Identifier
					{
					match(input,44,FOLLOW_44_in_increment_decrement_op1298); 
					match(input,Identifier,FOLLOW_Identifier_in_increment_decrement_op1300); 
					if (TRACEON) System.out.println("increment_decrement_op: -- Identifier "); 
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
	// $ANTLR end "increment_decrement_op"



	// $ANTLR start "statement"
	// myparser.g:99:1: statement : ( Identifier '=' arith_expression ';' | Identifier '=' '&' Identifier ';' | overloaded_op ';' | IF '(' ( arith_expression | comp_op | increment_decrement_op ) ')' if_then_statements | ELSE else_statements | WHILE '(' ( arith_expression | comp_op | increment_decrement_op ) ')' while_statements | FOR '(' declarations ( arith_expression | comp_op ) ';' ( Identifier '=' arith_expression | increment_decrement_op ) ')' for_statements | PRINTF printf_statement | SCANF scanf_statement | SWITCH '(' ( arith_expression | comp_op ) ')' swtich_statements | CASE ( Integer_constant | Floating_point_constant ) ':' statement | DEFAULT ':' statement | increment_decrement_op ';' | BREAK ';' | CONTINUE ';' );
	public final void statement() throws RecognitionException {
		try {
			// myparser.g:99:10: ( Identifier '=' arith_expression ';' | Identifier '=' '&' Identifier ';' | overloaded_op ';' | IF '(' ( arith_expression | comp_op | increment_decrement_op ) ')' if_then_statements | ELSE else_statements | WHILE '(' ( arith_expression | comp_op | increment_decrement_op ) ')' while_statements | FOR '(' declarations ( arith_expression | comp_op ) ';' ( Identifier '=' arith_expression | increment_decrement_op ) ')' for_statements | PRINTF printf_statement | SCANF scanf_statement | SWITCH '(' ( arith_expression | comp_op ) ')' swtich_statements | CASE ( Integer_constant | Floating_point_constant ) ':' statement | DEFAULT ':' statement | increment_decrement_op ';' | BREAK ';' | CONTINUE ';' )
			int alt18=15;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				switch ( input.LA(2) ) {
				case 52:
					{
					int LA18_14 = input.LA(3);
					if ( (LA18_14==34) ) {
						alt18=2;
					}
					else if ( (LA18_14==Floating_point_constant||(LA18_14 >= Identifier && LA18_14 <= Integer_constant)||LA18_14==35||LA18_14==43) ) {
						alt18=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 40:
				case 44:
					{
					alt18=13;
					}
					break;
				case 33:
				case 38:
				case 41:
				case 45:
				case 47:
					{
					alt18=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case IF:
				{
				alt18=4;
				}
				break;
			case ELSE:
				{
				alt18=5;
				}
				break;
			case WHILE:
				{
				alt18=6;
				}
				break;
			case FOR:
				{
				alt18=7;
				}
				break;
			case PRINTF:
				{
				alt18=8;
				}
				break;
			case SCANF:
				{
				alt18=9;
				}
				break;
			case SWITCH:
				{
				alt18=10;
				}
				break;
			case CASE:
				{
				alt18=11;
				}
				break;
			case DEFAULT:
				{
				alt18=12;
				}
				break;
			case 40:
			case 44:
				{
				alt18=13;
				}
				break;
			case BREAK:
				{
				alt18=14;
				}
				break;
			case CONTINUE:
				{
				alt18=15;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// myparser.g:99:12: Identifier '=' arith_expression ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement1355); 
					match(input,52,FOLLOW_52_in_statement1357); 
					pushFollow(FOLLOW_arith_expression_in_statement1359);
					arith_expression();
					state._fsp--;

					match(input,49,FOLLOW_49_in_statement1361); 
					if (TRACEON) System.out.println("statement: Identifier \'=\' arith_expression \';\'"); 
					}
					break;
				case 2 :
					// myparser.g:100:12: Identifier '=' '&' Identifier ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement1377); 
					match(input,52,FOLLOW_52_in_statement1379); 
					match(input,34,FOLLOW_34_in_statement1381); 
					match(input,Identifier,FOLLOW_Identifier_in_statement1383); 
					match(input,49,FOLLOW_49_in_statement1385); 
					if (TRACEON) System.out.println("statement: Identifier \'=\' \'&\' Identifier ;"); 
					}
					break;
				case 3 :
					// myparser.g:101:12: overloaded_op ';'
					{
					pushFollow(FOLLOW_overloaded_op_in_statement1401);
					overloaded_op();
					state._fsp--;

					match(input,49,FOLLOW_49_in_statement1403); 
					if (TRACEON) System.out.println("statement: overloaded_op ;"); 
					}
					break;
				case 4 :
					// myparser.g:102:12: IF '(' ( arith_expression | comp_op | increment_decrement_op ) ')' if_then_statements
					{
					match(input,IF,FOLLOW_IF_in_statement1418); 
					match(input,35,FOLLOW_35_in_statement1420); 
					// myparser.g:102:19: ( arith_expression | comp_op | increment_decrement_op )
					int alt13=3;
					switch ( input.LA(1) ) {
					case Integer_constant:
						{
						int LA13_1 = input.LA(2);
						if ( (LA13_1==31||(LA13_1 >= 50 && LA13_1 <= 51)||(LA13_1 >= 53 && LA13_1 <= 55)) ) {
							alt13=2;
						}
						else if ( (LA13_1==32||(LA13_1 >= 36 && LA13_1 <= 37)||LA13_1==39||LA13_1==43||LA13_1==46) ) {
							alt13=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 13, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Floating_point_constant:
						{
						int LA13_2 = input.LA(2);
						if ( (LA13_2==31||(LA13_2 >= 50 && LA13_2 <= 51)||(LA13_2 >= 53 && LA13_2 <= 55)) ) {
							alt13=2;
						}
						else if ( (LA13_2==32||(LA13_2 >= 36 && LA13_2 <= 37)||LA13_2==39||LA13_2==43||LA13_2==46) ) {
							alt13=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 13, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Identifier:
						{
						switch ( input.LA(2) ) {
						case 31:
						case 50:
						case 51:
						case 53:
						case 54:
						case 55:
							{
							alt13=2;
							}
							break;
						case 40:
						case 44:
							{
							alt13=3;
							}
							break;
						case 32:
						case 36:
						case 37:
						case 39:
						case 43:
						case 46:
							{
							alt13=1;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 13, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 35:
					case 43:
						{
						alt13=1;
						}
						break;
					case 40:
					case 44:
						{
						alt13=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// myparser.g:102:20: arith_expression
							{
							pushFollow(FOLLOW_arith_expression_in_statement1423);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myparser.g:102:37: comp_op
							{
							pushFollow(FOLLOW_comp_op_in_statement1425);
							comp_op();
							state._fsp--;

							}
							break;
						case 3 :
							// myparser.g:102:45: increment_decrement_op
							{
							pushFollow(FOLLOW_increment_decrement_op_in_statement1427);
							increment_decrement_op();
							state._fsp--;

							}
							break;

					}

					match(input,36,FOLLOW_36_in_statement1430); 
					pushFollow(FOLLOW_if_then_statements_in_statement1432);
					if_then_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: IF \'(\' (arith_expression|comparison_expression|increment_decrement_op) \')\' if_then_statements"); 
					}
					break;
				case 5 :
					// myparser.g:103:12: ELSE else_statements
					{
					match(input,ELSE,FOLLOW_ELSE_in_statement1448); 
					pushFollow(FOLLOW_else_statements_in_statement1451);
					else_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: (ELSE  else_statements)"); 
					}
					break;
				case 6 :
					// myparser.g:104:12: WHILE '(' ( arith_expression | comp_op | increment_decrement_op ) ')' while_statements
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement1467); 
					match(input,35,FOLLOW_35_in_statement1469); 
					// myparser.g:104:22: ( arith_expression | comp_op | increment_decrement_op )
					int alt14=3;
					switch ( input.LA(1) ) {
					case Integer_constant:
						{
						int LA14_1 = input.LA(2);
						if ( (LA14_1==31||(LA14_1 >= 50 && LA14_1 <= 51)||(LA14_1 >= 53 && LA14_1 <= 55)) ) {
							alt14=2;
						}
						else if ( (LA14_1==32||(LA14_1 >= 36 && LA14_1 <= 37)||LA14_1==39||LA14_1==43||LA14_1==46) ) {
							alt14=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 14, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Floating_point_constant:
						{
						int LA14_2 = input.LA(2);
						if ( (LA14_2==31||(LA14_2 >= 50 && LA14_2 <= 51)||(LA14_2 >= 53 && LA14_2 <= 55)) ) {
							alt14=2;
						}
						else if ( (LA14_2==32||(LA14_2 >= 36 && LA14_2 <= 37)||LA14_2==39||LA14_2==43||LA14_2==46) ) {
							alt14=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 14, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Identifier:
						{
						switch ( input.LA(2) ) {
						case 31:
						case 50:
						case 51:
						case 53:
						case 54:
						case 55:
							{
							alt14=2;
							}
							break;
						case 40:
						case 44:
							{
							alt14=3;
							}
							break;
						case 32:
						case 36:
						case 37:
						case 39:
						case 43:
						case 46:
							{
							alt14=1;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 14, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 35:
					case 43:
						{
						alt14=1;
						}
						break;
					case 40:
					case 44:
						{
						alt14=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}
					switch (alt14) {
						case 1 :
							// myparser.g:104:23: arith_expression
							{
							pushFollow(FOLLOW_arith_expression_in_statement1472);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myparser.g:104:40: comp_op
							{
							pushFollow(FOLLOW_comp_op_in_statement1474);
							comp_op();
							state._fsp--;

							}
							break;
						case 3 :
							// myparser.g:104:48: increment_decrement_op
							{
							pushFollow(FOLLOW_increment_decrement_op_in_statement1476);
							increment_decrement_op();
							state._fsp--;

							}
							break;

					}

					match(input,36,FOLLOW_36_in_statement1479); 
					pushFollow(FOLLOW_while_statements_in_statement1481);
					while_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: WHILE \'(\' (arith_expression|comparison_expression|increment_decrement_op) \')\' while_statements"); 
					}
					break;
				case 7 :
					// myparser.g:105:12: FOR '(' declarations ( arith_expression | comp_op ) ';' ( Identifier '=' arith_expression | increment_decrement_op ) ')' for_statements
					{
					match(input,FOR,FOLLOW_FOR_in_statement1497); 
					match(input,35,FOLLOW_35_in_statement1499); 
					pushFollow(FOLLOW_declarations_in_statement1501);
					declarations();
					state._fsp--;

					// myparser.g:105:33: ( arith_expression | comp_op )
					int alt15=2;
					switch ( input.LA(1) ) {
					case Integer_constant:
						{
						int LA15_1 = input.LA(2);
						if ( (LA15_1==31||(LA15_1 >= 50 && LA15_1 <= 51)||(LA15_1 >= 53 && LA15_1 <= 55)) ) {
							alt15=2;
						}
						else if ( (LA15_1==32||LA15_1==37||LA15_1==39||LA15_1==43||LA15_1==46||LA15_1==49) ) {
							alt15=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 15, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Floating_point_constant:
						{
						int LA15_2 = input.LA(2);
						if ( (LA15_2==31||(LA15_2 >= 50 && LA15_2 <= 51)||(LA15_2 >= 53 && LA15_2 <= 55)) ) {
							alt15=2;
						}
						else if ( (LA15_2==32||LA15_2==37||LA15_2==39||LA15_2==43||LA15_2==46||LA15_2==49) ) {
							alt15=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 15, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Identifier:
						{
						int LA15_3 = input.LA(2);
						if ( (LA15_3==31||(LA15_3 >= 50 && LA15_3 <= 51)||(LA15_3 >= 53 && LA15_3 <= 55)) ) {
							alt15=2;
						}
						else if ( (LA15_3==32||LA15_3==37||LA15_3==39||LA15_3==43||LA15_3==46||LA15_3==49) ) {
							alt15=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 15, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 35:
					case 43:
						{
						alt15=1;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// myparser.g:105:34: arith_expression
							{
							pushFollow(FOLLOW_arith_expression_in_statement1504);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myparser.g:105:51: comp_op
							{
							pushFollow(FOLLOW_comp_op_in_statement1506);
							comp_op();
							state._fsp--;

							}
							break;

					}

					match(input,49,FOLLOW_49_in_statement1509); 
					// myparser.g:105:64: ( Identifier '=' arith_expression | increment_decrement_op )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==Identifier) ) {
						int LA16_1 = input.LA(2);
						if ( (LA16_1==52) ) {
							alt16=1;
						}
						else if ( (LA16_1==40||LA16_1==44) ) {
							alt16=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 16, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA16_0==40||LA16_0==44) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// myparser.g:105:65: Identifier '=' arith_expression
							{
							match(input,Identifier,FOLLOW_Identifier_in_statement1512); 
							match(input,52,FOLLOW_52_in_statement1514); 
							pushFollow(FOLLOW_arith_expression_in_statement1516);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myparser.g:105:97: increment_decrement_op
							{
							pushFollow(FOLLOW_increment_decrement_op_in_statement1518);
							increment_decrement_op();
							state._fsp--;

							}
							break;

					}

					match(input,36,FOLLOW_36_in_statement1521); 
					pushFollow(FOLLOW_for_statements_in_statement1523);
					for_statements();
					state._fsp--;

					if (TRACEON) System.out.println("FOR ( declarations (arith_expression|comparison_expression) ; (Identifier '=' arith_expression|increment_decrement_op) ) for_statements"); 
					}
					break;
				case 8 :
					// myparser.g:106:12: PRINTF printf_statement
					{
					match(input,PRINTF,FOLLOW_PRINTF_in_statement1539); 
					pushFollow(FOLLOW_printf_statement_in_statement1542);
					printf_statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement: PRINTF  printf_statement"); 
					}
					break;
				case 9 :
					// myparser.g:107:12: SCANF scanf_statement
					{
					match(input,SCANF,FOLLOW_SCANF_in_statement1558); 
					pushFollow(FOLLOW_scanf_statement_in_statement1561);
					scanf_statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement: SCANF  scanf_statement"); 
					}
					break;
				case 10 :
					// myparser.g:108:12: SWITCH '(' ( arith_expression | comp_op ) ')' swtich_statements
					{
					match(input,SWITCH,FOLLOW_SWITCH_in_statement1577); 
					match(input,35,FOLLOW_35_in_statement1579); 
					// myparser.g:108:23: ( arith_expression | comp_op )
					int alt17=2;
					switch ( input.LA(1) ) {
					case Integer_constant:
						{
						int LA17_1 = input.LA(2);
						if ( (LA17_1==31||(LA17_1 >= 50 && LA17_1 <= 51)||(LA17_1 >= 53 && LA17_1 <= 55)) ) {
							alt17=2;
						}
						else if ( (LA17_1==32||(LA17_1 >= 36 && LA17_1 <= 37)||LA17_1==39||LA17_1==43||LA17_1==46) ) {
							alt17=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 17, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Floating_point_constant:
						{
						int LA17_2 = input.LA(2);
						if ( (LA17_2==31||(LA17_2 >= 50 && LA17_2 <= 51)||(LA17_2 >= 53 && LA17_2 <= 55)) ) {
							alt17=2;
						}
						else if ( (LA17_2==32||(LA17_2 >= 36 && LA17_2 <= 37)||LA17_2==39||LA17_2==43||LA17_2==46) ) {
							alt17=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 17, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Identifier:
						{
						int LA17_3 = input.LA(2);
						if ( (LA17_3==31||(LA17_3 >= 50 && LA17_3 <= 51)||(LA17_3 >= 53 && LA17_3 <= 55)) ) {
							alt17=2;
						}
						else if ( (LA17_3==32||(LA17_3 >= 36 && LA17_3 <= 37)||LA17_3==39||LA17_3==43||LA17_3==46) ) {
							alt17=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 17, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 35:
					case 43:
						{
						alt17=1;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}
					switch (alt17) {
						case 1 :
							// myparser.g:108:24: arith_expression
							{
							pushFollow(FOLLOW_arith_expression_in_statement1582);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myparser.g:108:41: comp_op
							{
							pushFollow(FOLLOW_comp_op_in_statement1584);
							comp_op();
							state._fsp--;

							}
							break;

					}

					match(input,36,FOLLOW_36_in_statement1587); 
					pushFollow(FOLLOW_swtich_statements_in_statement1589);
					swtich_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: SWITCH ( (arith_expression|comparison_expression) ) swtich_statements"); 
					}
					break;
				case 11 :
					// myparser.g:109:12: CASE ( Integer_constant | Floating_point_constant ) ':' statement
					{
					match(input,CASE,FOLLOW_CASE_in_statement1604); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,48,FOLLOW_48_in_statement1612); 
					pushFollow(FOLLOW_statement_in_statement1614);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement : CASE (Integer_constant|Floating_point_constant) : statement"); 
					}
					break;
				case 12 :
					// myparser.g:110:12: DEFAULT ':' statement
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_statement1629); 
					match(input,48,FOLLOW_48_in_statement1631); 
					pushFollow(FOLLOW_statement_in_statement1633);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement : DEFAULT : statement"); 
					}
					break;
				case 13 :
					// myparser.g:111:12: increment_decrement_op ';'
					{
					pushFollow(FOLLOW_increment_decrement_op_in_statement1648);
					increment_decrement_op();
					state._fsp--;

					match(input,49,FOLLOW_49_in_statement1650); 
					if (TRACEON) System.out.println("statement : increment_decrement_op"); 
					}
					break;
				case 14 :
					// myparser.g:112:12: BREAK ';'
					{
					match(input,BREAK,FOLLOW_BREAK_in_statement1665); 
					match(input,49,FOLLOW_49_in_statement1667); 
					if (TRACEON) System.out.println("statement: BREAK ;"); 
					}
					break;
				case 15 :
					// myparser.g:113:12: CONTINUE ';'
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1682); 
					match(input,49,FOLLOW_49_in_statement1684); 
					if (TRACEON) System.out.println("statement: CONTINUE ;"); 
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



	// $ANTLR start "if_then_statements"
	// myparser.g:116:1: if_then_statements : ( statement | '{' statements '}' );
	public final void if_then_statements() throws RecognitionException {
		try {
			// myparser.g:116:19: ( statement | '{' statements '}' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( ((LA19_0 >= BREAK && LA19_0 <= CASE)||(LA19_0 >= CONTINUE && LA19_0 <= DEFAULT)||LA19_0==ELSE||LA19_0==FOR||LA19_0==IF||LA19_0==Identifier||LA19_0==PRINTF||LA19_0==SCANF||LA19_0==SWITCH||LA19_0==WHILE||LA19_0==40||LA19_0==44) ) {
				alt19=1;
			}
			else if ( (LA19_0==56) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// myparser.g:116:21: statement
					{
					pushFollow(FOLLOW_statement_in_if_then_statements1706);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("if_then_statements: statement"); 
					}
					break;
				case 2 :
					// myparser.g:117:21: '{' statements '}'
					{
					match(input,56,FOLLOW_56_in_if_then_statements1730); 
					pushFollow(FOLLOW_statements_in_if_then_statements1732);
					statements();
					state._fsp--;

					match(input,57,FOLLOW_57_in_if_then_statements1734); 
					if (TRACEON) System.out.println("if_then_statements: \'{\' statements \'}\'"); 
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
	// $ANTLR end "if_then_statements"



	// $ANTLR start "else_statements"
	// myparser.g:120:1: else_statements : ( statement | '{' statements '}' );
	public final void else_statements() throws RecognitionException {
		try {
			// myparser.g:120:17: ( statement | '{' statements '}' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= BREAK && LA20_0 <= CASE)||(LA20_0 >= CONTINUE && LA20_0 <= DEFAULT)||LA20_0==ELSE||LA20_0==FOR||LA20_0==IF||LA20_0==Identifier||LA20_0==PRINTF||LA20_0==SCANF||LA20_0==SWITCH||LA20_0==WHILE||LA20_0==40||LA20_0==44) ) {
				alt20=1;
			}
			else if ( (LA20_0==56) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// myparser.g:120:19: statement
					{
					pushFollow(FOLLOW_statement_in_else_statements1755);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("else_statements :statement"); 
					}
					break;
				case 2 :
					// myparser.g:121:21: '{' statements '}'
					{
					match(input,56,FOLLOW_56_in_else_statements1779); 
					pushFollow(FOLLOW_statements_in_else_statements1781);
					statements();
					state._fsp--;

					match(input,57,FOLLOW_57_in_else_statements1783); 
					if (TRACEON) System.out.println("else_statements: \'{\' statements \'}\'"); 
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
	// $ANTLR end "else_statements"



	// $ANTLR start "else_if_statements"
	// myparser.g:124:1: else_if_statements : ( statement | '{' statements '}' );
	public final void else_if_statements() throws RecognitionException {
		try {
			// myparser.g:124:19: ( statement | '{' statements '}' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( ((LA21_0 >= BREAK && LA21_0 <= CASE)||(LA21_0 >= CONTINUE && LA21_0 <= DEFAULT)||LA21_0==ELSE||LA21_0==FOR||LA21_0==IF||LA21_0==Identifier||LA21_0==PRINTF||LA21_0==SCANF||LA21_0==SWITCH||LA21_0==WHILE||LA21_0==40||LA21_0==44) ) {
				alt21=1;
			}
			else if ( (LA21_0==56) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// myparser.g:124:20: statement
					{
					pushFollow(FOLLOW_statement_in_else_if_statements1819);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("else_if_statements :statement"); 
					}
					break;
				case 2 :
					// myparser.g:125:21: '{' statements '}'
					{
					match(input,56,FOLLOW_56_in_else_if_statements1843); 
					pushFollow(FOLLOW_statements_in_else_if_statements1845);
					statements();
					state._fsp--;

					match(input,57,FOLLOW_57_in_else_if_statements1847); 
					if (TRACEON) System.out.println("else_if_statements: \'{\' statements \'}\'"); 
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
	// $ANTLR end "else_if_statements"



	// $ANTLR start "swtich_statements"
	// myparser.g:128:1: swtich_statements : '{' statements '}' ;
	public final void swtich_statements() throws RecognitionException {
		try {
			// myparser.g:128:19: ( '{' statements '}' )
			// myparser.g:128:22: '{' statements '}'
			{
			match(input,56,FOLLOW_56_in_swtich_statements1871); 
			pushFollow(FOLLOW_statements_in_swtich_statements1873);
			statements();
			state._fsp--;

			match(input,57,FOLLOW_57_in_swtich_statements1875); 
			if (TRACEON) System.out.println("swtich_statements :  { statements }"); 
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
	// $ANTLR end "swtich_statements"



	// $ANTLR start "for_statements"
	// myparser.g:131:1: for_statements : ( statement | '{' statements '}' );
	public final void for_statements() throws RecognitionException {
		try {
			// myparser.g:131:15: ( statement | '{' statements '}' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= BREAK && LA22_0 <= CASE)||(LA22_0 >= CONTINUE && LA22_0 <= DEFAULT)||LA22_0==ELSE||LA22_0==FOR||LA22_0==IF||LA22_0==Identifier||LA22_0==PRINTF||LA22_0==SCANF||LA22_0==SWITCH||LA22_0==WHILE||LA22_0==40||LA22_0==44) ) {
				alt22=1;
			}
			else if ( (LA22_0==56) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// myparser.g:131:17: statement
					{
					pushFollow(FOLLOW_statement_in_for_statements1915);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("for_statements: statement"); 
					}
					break;
				case 2 :
					// myparser.g:132:17: '{' statements '}'
					{
					match(input,56,FOLLOW_56_in_for_statements1935); 
					pushFollow(FOLLOW_statements_in_for_statements1937);
					statements();
					state._fsp--;

					match(input,57,FOLLOW_57_in_for_statements1939); 
					if (TRACEON) System.out.println("for_statements: \'{\' statements \'}\'"); 
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
	// $ANTLR end "for_statements"



	// $ANTLR start "while_statements"
	// myparser.g:135:1: while_statements : ( statement | '{' statements '}' );
	public final void while_statements() throws RecognitionException {
		try {
			// myparser.g:135:17: ( statement | '{' statements '}' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= BREAK && LA23_0 <= CASE)||(LA23_0 >= CONTINUE && LA23_0 <= DEFAULT)||LA23_0==ELSE||LA23_0==FOR||LA23_0==IF||LA23_0==Identifier||LA23_0==PRINTF||LA23_0==SCANF||LA23_0==SWITCH||LA23_0==WHILE||LA23_0==40||LA23_0==44) ) {
				alt23=1;
			}
			else if ( (LA23_0==56) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// myparser.g:135:19: statement
					{
					pushFollow(FOLLOW_statement_in_while_statements1963);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("while_statements: statement"); 
					}
					break;
				case 2 :
					// myparser.g:136:19: '{' statements '}'
					{
					match(input,56,FOLLOW_56_in_while_statements1985); 
					pushFollow(FOLLOW_statements_in_while_statements1987);
					statements();
					state._fsp--;

					match(input,57,FOLLOW_57_in_while_statements1989); 
					if (TRACEON) System.out.println("while_statements: \'{\' statements \'}\'"); 
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
	// $ANTLR end "while_statements"



	// $ANTLR start "printf_statement"
	// myparser.g:139:1: printf_statement : '(' STRING ( ',' Identifier )* ')' ';' ;
	public final void printf_statement() throws RecognitionException {
		try {
			// myparser.g:139:18: ( '(' STRING ( ',' Identifier )* ')' ';' )
			// myparser.g:139:20: '(' STRING ( ',' Identifier )* ')' ';'
			{
			match(input,35,FOLLOW_35_in_printf_statement2010); 
			match(input,STRING,FOLLOW_STRING_in_printf_statement2013); 
			// myparser.g:139:32: ( ',' Identifier )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==42) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// myparser.g:139:33: ',' Identifier
					{
					match(input,42,FOLLOW_42_in_printf_statement2016); 
					match(input,Identifier,FOLLOW_Identifier_in_printf_statement2018); 
					}
					break;

				default :
					break loop24;
				}
			}

			match(input,36,FOLLOW_36_in_printf_statement2022); 
			match(input,49,FOLLOW_49_in_printf_statement2024); 
			if (TRACEON) System.out.println("printf_statement : \'(\' statement STRING (\',\' Identifier)* \')\'"); 
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
	// myparser.g:142:1: scanf_statement : '(' STRING ( ',' '&' Identifier )* ')' ';' ;
	public final void scanf_statement() throws RecognitionException {
		try {
			// myparser.g:142:17: ( '(' STRING ( ',' '&' Identifier )* ')' ';' )
			// myparser.g:142:19: '(' STRING ( ',' '&' Identifier )* ')' ';'
			{
			match(input,35,FOLLOW_35_in_scanf_statement2044); 
			match(input,STRING,FOLLOW_STRING_in_scanf_statement2047); 
			// myparser.g:142:31: ( ',' '&' Identifier )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==42) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// myparser.g:142:32: ',' '&' Identifier
					{
					match(input,42,FOLLOW_42_in_scanf_statement2050); 
					match(input,34,FOLLOW_34_in_scanf_statement2052); 
					match(input,Identifier,FOLLOW_Identifier_in_scanf_statement2054); 
					}
					break;

				default :
					break loop25;
				}
			}

			match(input,36,FOLLOW_36_in_scanf_statement2058); 
			match(input,49,FOLLOW_49_in_scanf_statement2060); 
			if (TRACEON) System.out.println("scanf_statement : \'(\' statement STRING (\',\' \'&\' Identifier)* \')\'"); 
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



	// $ANTLR start "overloaded_op"
	// myparser.g:145:1: overloaded_op : ( Identifier ( '+=' ( Identifier ) )+ | Identifier ( '-=' ( Identifier ) )+ | Identifier ( '/=' ( Identifier ) )+ | Identifier ( '*=' ( Identifier ) )+ | Identifier ( '%=' ( Identifier ) )+ );
	public final void overloaded_op() throws RecognitionException {
		try {
			// myparser.g:145:14: ( Identifier ( '+=' ( Identifier ) )+ | Identifier ( '-=' ( Identifier ) )+ | Identifier ( '/=' ( Identifier ) )+ | Identifier ( '*=' ( Identifier ) )+ | Identifier ( '%=' ( Identifier ) )+ )
			int alt31=5;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case 41:
					{
					alt31=1;
					}
					break;
				case 45:
					{
					alt31=2;
					}
					break;
				case 47:
					{
					alt31=3;
					}
					break;
				case 38:
					{
					alt31=4;
					}
					break;
				case 33:
					{
					alt31=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// myparser.g:145:15: Identifier ( '+=' ( Identifier ) )+
					{
					match(input,Identifier,FOLLOW_Identifier_in_overloaded_op2083); 
					// myparser.g:145:26: ( '+=' ( Identifier ) )+
					int cnt26=0;
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==41) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// myparser.g:145:27: '+=' ( Identifier )
							{
							match(input,41,FOLLOW_41_in_overloaded_op2086); 
							// myparser.g:145:32: ( Identifier )
							// myparser.g:145:33: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_overloaded_op2089); 
							}

							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}

					if (TRACEON) System.out.println("Identifier (\'+=\' (Identifier))+"); 
					}
					break;
				case 2 :
					// myparser.g:146:15: Identifier ( '-=' ( Identifier ) )+
					{
					match(input,Identifier,FOLLOW_Identifier_in_overloaded_op2110); 
					// myparser.g:146:26: ( '-=' ( Identifier ) )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==45) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// myparser.g:146:27: '-=' ( Identifier )
							{
							match(input,45,FOLLOW_45_in_overloaded_op2113); 
							// myparser.g:146:32: ( Identifier )
							// myparser.g:146:33: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_overloaded_op2116); 
							}

							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					if (TRACEON) System.out.println("Identifier (\'-=\' (Identifier))+"); 
					}
					break;
				case 3 :
					// myparser.g:147:15: Identifier ( '/=' ( Identifier ) )+
					{
					match(input,Identifier,FOLLOW_Identifier_in_overloaded_op2137); 
					// myparser.g:147:26: ( '/=' ( Identifier ) )+
					int cnt28=0;
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==47) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// myparser.g:147:27: '/=' ( Identifier )
							{
							match(input,47,FOLLOW_47_in_overloaded_op2140); 
							// myparser.g:147:32: ( Identifier )
							// myparser.g:147:33: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_overloaded_op2143); 
							}

							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					if (TRACEON) System.out.println("Identifier (\'/=\' (Identifier))+"); 
					}
					break;
				case 4 :
					// myparser.g:148:15: Identifier ( '*=' ( Identifier ) )+
					{
					match(input,Identifier,FOLLOW_Identifier_in_overloaded_op2164); 
					// myparser.g:148:26: ( '*=' ( Identifier ) )+
					int cnt29=0;
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==38) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// myparser.g:148:27: '*=' ( Identifier )
							{
							match(input,38,FOLLOW_38_in_overloaded_op2167); 
							// myparser.g:148:32: ( Identifier )
							// myparser.g:148:33: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_overloaded_op2170); 
							}

							}
							break;

						default :
							if ( cnt29 >= 1 ) break loop29;
							EarlyExitException eee = new EarlyExitException(29, input);
							throw eee;
						}
						cnt29++;
					}

					if (TRACEON) System.out.println("Identifier (\'*=\' (Identifier))+"); 
					}
					break;
				case 5 :
					// myparser.g:149:15: Identifier ( '%=' ( Identifier ) )+
					{
					match(input,Identifier,FOLLOW_Identifier_in_overloaded_op2191); 
					// myparser.g:149:26: ( '%=' ( Identifier ) )+
					int cnt30=0;
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==33) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// myparser.g:149:27: '%=' ( Identifier )
							{
							match(input,33,FOLLOW_33_in_overloaded_op2194); 
							// myparser.g:149:32: ( Identifier )
							// myparser.g:149:33: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_overloaded_op2197); 
							}

							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
							EarlyExitException eee = new EarlyExitException(30, input);
							throw eee;
						}
						cnt30++;
					}

					if (TRACEON) System.out.println("Identifier (\'%=\' (Identifier))+"); 
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
	// $ANTLR end "overloaded_op"



	// $ANTLR start "return_"
	// myparser.g:152:1: return_ : RETURN_ ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' | ';' ) ;
	public final void return_() throws RecognitionException {
		try {
			// myparser.g:152:8: ( RETURN_ ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' | ';' ) )
			// myparser.g:152:9: RETURN_ ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' | ';' )
			{
			match(input,RETURN_,FOLLOW_RETURN__in_return_2227); 
			// myparser.g:152:17: ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' | ';' )
			int alt32=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt32=1;
				}
				break;
			case Floating_point_constant:
				{
				alt32=2;
				}
				break;
			case Identifier:
				{
				alt32=3;
				}
				break;
			case 49:
				{
				alt32=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// myparser.g:152:18: Integer_constant ';'
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_return_2230); 
					match(input,49,FOLLOW_49_in_return_2232); 
					 if (TRACEON) System.out.println("return_:RETURN Integer_constant ;"); 
					}
					break;
				case 2 :
					// myparser.g:153:9: Floating_point_constant ';'
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_return_2243); 
					match(input,49,FOLLOW_49_in_return_2245); 
					 if (TRACEON) System.out.println("return_:RETURN Floating_point_constant ;"); 
					}
					break;
				case 3 :
					// myparser.g:154:9: Identifier ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_return_2256); 
					match(input,49,FOLLOW_49_in_return_2258); 
					 if (TRACEON) System.out.println("return_:RETURN Identifier ;"); 
					}
					break;
				case 4 :
					// myparser.g:155:9: ';'
					{
					match(input,49,FOLLOW_49_in_return_2269); 
					 if (TRACEON) System.out.println("return_:RETURN ;"); 
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

	// Delegated rules



	public static final BitSet FOLLOW_INCLUDE_in_program36 = new BitSet(new long[]{0x0000000010030000L});
	public static final BitSet FOLLOW_void_main_in_program41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_main_in_program43 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_void_main53 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_MAIN_in_void_main55 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_void_main57 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_void_main59 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_void_main61 = new BitSet(new long[]{0x020011003B56BF70L});
	public static final BitSet FOLLOW_declarations_in_void_main63 = new BitSet(new long[]{0x020011002944AB30L});
	public static final BitSet FOLLOW_statements_in_void_main65 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_void_main67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_int_main91 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_MAIN_in_int_main93 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_int_main95 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_int_main97 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_int_main99 = new BitSet(new long[]{0x020011003BD6BF70L});
	public static final BitSet FOLLOW_declarations_in_int_main101 = new BitSet(new long[]{0x0200110029C4AB30L});
	public static final BitSet FOLLOW_statements_in_int_main103 = new BitSet(new long[]{0x0200000000800000L});
	public static final BitSet FOLLOW_return__in_int_main105 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_int_main108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations133 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_declarations135 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarations137 = new BitSet(new long[]{0x0000000012121440L});
	public static final BitSet FOLLOW_declarations_in_declarations139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations155 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_declarations157 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_declarations159 = new BitSet(new long[]{0x0000000004084000L});
	public static final BitSet FOLLOW_set_in_declarations161 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarations169 = new BitSet(new long[]{0x0000000012121440L});
	public static final BitSet FOLLOW_declarations_in_declarations171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_type230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_type248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type257 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_type258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type267 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_type268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type277 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_type278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type287 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_type288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_type297 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_type298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type307 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_type308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_type317 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_type318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements335 = new BitSet(new long[]{0x000011002944AB30L});
	public static final BitSet FOLLOW_statements_in_statements337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression354 = new BitSet(new long[]{0x0000088000000002L});
	public static final BitSet FOLLOW_39_in_arith_expression368 = new BitSet(new long[]{0x00000808000C4000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression370 = new BitSet(new long[]{0x0000088000000002L});
	public static final BitSet FOLLOW_43_in_arith_expression379 = new BitSet(new long[]{0x00000808000C4000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression381 = new BitSet(new long[]{0x0000088000000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr430 = new BitSet(new long[]{0x0000402100000002L});
	public static final BitSet FOLLOW_37_in_multExpr444 = new BitSet(new long[]{0x00000808000C4000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr446 = new BitSet(new long[]{0x0000402100000002L});
	public static final BitSet FOLLOW_46_in_multExpr462 = new BitSet(new long[]{0x00000808000C4000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr464 = new BitSet(new long[]{0x0000402100000002L});
	public static final BitSet FOLLOW_32_in_multExpr480 = new BitSet(new long[]{0x00000808000C4000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr482 = new BitSet(new long[]{0x0000402100000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_signExpr517 = new BitSet(new long[]{0x00000008000C4000L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_primaryExpr574 = new BitSet(new long[]{0x00000808000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr576 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_primaryExpr578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op597 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_comp_op599 = new BitSet(new long[]{0x0000000000084000L});
	public static final BitSet FOLLOW_set_in_comp_op601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op632 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_comp_op634 = new BitSet(new long[]{0x0000000000084000L});
	public static final BitSet FOLLOW_set_in_comp_op636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op667 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_comp_op669 = new BitSet(new long[]{0x0000000000084000L});
	public static final BitSet FOLLOW_set_in_comp_op671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op702 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_comp_op704 = new BitSet(new long[]{0x0000000000084000L});
	public static final BitSet FOLLOW_set_in_comp_op706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op737 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_comp_op739 = new BitSet(new long[]{0x0000000000084000L});
	public static final BitSet FOLLOW_set_in_comp_op741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op772 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_comp_op774 = new BitSet(new long[]{0x0000000000084000L});
	public static final BitSet FOLLOW_set_in_comp_op776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_comp_op807 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_comp_op813 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_comp_op842 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_comp_op848 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_comp_op877 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_comp_op883 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_comp_op912 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_comp_op918 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_comp_op947 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_comp_op953 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_comp_op982 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_comp_op988 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1017 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_comp_op1019 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1048 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_comp_op1050 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1079 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_comp_op1081 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1110 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_comp_op1112 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1141 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_comp_op1143 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1172 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_comp_op1174 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comp_op1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_increment_decrement_op1208 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_increment_decrement_op1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_increment_decrement_op1238 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_increment_decrement_op1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_increment_decrement_op1268 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_increment_decrement_op1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_increment_decrement_op1298 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_increment_decrement_op1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement1355 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_statement1357 = new BitSet(new long[]{0x00000808000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1359 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement1377 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_statement1379 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_statement1381 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_statement1383 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_overloaded_op_in_statement1401 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement1418 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_statement1420 = new BitSet(new long[]{0x00001908000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1423 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_comp_op_in_statement1425 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_increment_decrement_op_in_statement1427 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_statement1430 = new BitSet(new long[]{0x010011002944AB30L});
	public static final BitSet FOLLOW_if_then_statements_in_statement1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_statement1448 = new BitSet(new long[]{0x010011002944AB30L});
	public static final BitSet FOLLOW_else_statements_in_statement1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement1467 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_statement1469 = new BitSet(new long[]{0x00001908000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1472 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_comp_op_in_statement1474 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_increment_decrement_op_in_statement1476 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_statement1479 = new BitSet(new long[]{0x010011002944AB30L});
	public static final BitSet FOLLOW_while_statements_in_statement1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_statement1497 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_statement1499 = new BitSet(new long[]{0x00000808121E5440L});
	public static final BitSet FOLLOW_declarations_in_statement1501 = new BitSet(new long[]{0x00000808000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1504 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_comp_op_in_statement1506 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement1509 = new BitSet(new long[]{0x0000110000040000L});
	public static final BitSet FOLLOW_Identifier_in_statement1512 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_statement1514 = new BitSet(new long[]{0x00000808000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1516 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_increment_decrement_op_in_statement1518 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_statement1521 = new BitSet(new long[]{0x010011002944AB30L});
	public static final BitSet FOLLOW_for_statements_in_statement1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_statement1539 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_printf_statement_in_statement1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCANF_in_statement1558 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_scanf_statement_in_statement1561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_statement1577 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_statement1579 = new BitSet(new long[]{0x00000808000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1582 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_comp_op_in_statement1584 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_statement1587 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_swtich_statements_in_statement1589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_statement1604 = new BitSet(new long[]{0x0000000000084000L});
	public static final BitSet FOLLOW_set_in_statement1606 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement1612 = new BitSet(new long[]{0x000011002944AB30L});
	public static final BitSet FOLLOW_statement_in_statement1614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_statement1629 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement1631 = new BitSet(new long[]{0x000011002944AB30L});
	public static final BitSet FOLLOW_statement_in_statement1633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_increment_decrement_op_in_statement1648 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_statement1665 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement1667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_statement1682 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_if_then_statements1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_if_then_statements1730 = new BitSet(new long[]{0x020011002944AB30L});
	public static final BitSet FOLLOW_statements_in_if_then_statements1732 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_if_then_statements1734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_else_statements1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_else_statements1779 = new BitSet(new long[]{0x020011002944AB30L});
	public static final BitSet FOLLOW_statements_in_else_statements1781 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_else_statements1783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_else_if_statements1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_else_if_statements1843 = new BitSet(new long[]{0x020011002944AB30L});
	public static final BitSet FOLLOW_statements_in_else_if_statements1845 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_else_if_statements1847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_swtich_statements1871 = new BitSet(new long[]{0x020011002944AB30L});
	public static final BitSet FOLLOW_statements_in_swtich_statements1873 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_swtich_statements1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_for_statements1915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_for_statements1935 = new BitSet(new long[]{0x020011002944AB30L});
	public static final BitSet FOLLOW_statements_in_for_statements1937 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_for_statements1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_while_statements1963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_while_statements1985 = new BitSet(new long[]{0x020011002944AB30L});
	public static final BitSet FOLLOW_statements_in_while_statements1987 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_while_statements1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_printf_statement2010 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_printf_statement2013 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_42_in_printf_statement2016 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_printf_statement2018 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_36_in_printf_statement2022 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_printf_statement2024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_scanf_statement2044 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_scanf_statement2047 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_42_in_scanf_statement2050 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_scanf_statement2052 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_scanf_statement2054 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_36_in_scanf_statement2058 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_scanf_statement2060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op2083 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_overloaded_op2086 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op2089 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op2110 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_overloaded_op2113 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op2116 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op2137 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_overloaded_op2140 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op2143 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op2164 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_overloaded_op2167 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op2170 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op2191 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_overloaded_op2194 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op2197 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_RETURN__in_return_2227 = new BitSet(new long[]{0x00020000000C4000L});
	public static final BitSet FOLLOW_Integer_constant_in_return_2230 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_return_2232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_return_2243 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_return_2245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_return_2256 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_return_2258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_return_2269 = new BitSet(new long[]{0x0000000000000002L});
}
