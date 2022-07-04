// $ANTLR 3.5.2 myInterp.g 2022-05-08 16:14:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myInterpLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myInterpLexer() {} 
	public myInterpLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myInterpLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myInterp.g"; }

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:7:7: ( '!=' )
			// myInterp.g:7:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:8:7: ( '%' )
			// myInterp.g:8:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:9:7: ( '%=' )
			// myInterp.g:9:9: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:10:7: ( '&' )
			// myInterp.g:10:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:11:7: ( '(' )
			// myInterp.g:11:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:12:7: ( ')' )
			// myInterp.g:12:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:13:7: ( '*' )
			// myInterp.g:13:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:14:7: ( '*=' )
			// myInterp.g:14:9: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:15:7: ( '+' )
			// myInterp.g:15:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:16:7: ( '+=' )
			// myInterp.g:16:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:17:7: ( ',' )
			// myInterp.g:17:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:18:7: ( '-' )
			// myInterp.g:18:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:19:7: ( '-=' )
			// myInterp.g:19:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:20:7: ( '/' )
			// myInterp.g:20:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:21:7: ( '/=' )
			// myInterp.g:21:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:22:7: ( ';' )
			// myInterp.g:22:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:23:7: ( '<' )
			// myInterp.g:23:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:24:7: ( '<<' )
			// myInterp.g:24:9: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:25:7: ( '<<=' )
			// myInterp.g:25:9: '<<='
			{
			match("<<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:26:7: ( '<=' )
			// myInterp.g:26:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:27:7: ( '=' )
			// myInterp.g:27:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:28:7: ( '==' )
			// myInterp.g:28:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:29:7: ( '>' )
			// myInterp.g:29:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:30:7: ( '>=' )
			// myInterp.g:30:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:31:7: ( '>>' )
			// myInterp.g:31:9: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:32:7: ( '>>=' )
			// myInterp.g:32:9: '>>='
			{
			match(">>="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:33:7: ( '{' )
			// myInterp.g:33:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:34:7: ( '}' )
			// myInterp.g:34:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:260:3: ( 'if' )
			// myInterp.g:260:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:261:8: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
			// myInterp.g:261:11: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myInterp.g:261:15: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myInterp.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:262:7: ( 'printf' )
			// myInterp.g:262:8: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "SCANF"
	public final void mSCANF() throws RecognitionException {
		try {
			int _type = SCANF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:263:7: ( 'scanf' )
			// myInterp.g:263:8: 'scanf'
			{
			match("scanf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANF"

	// $ANTLR start "RETURN_"
	public final void mRETURN_() throws RecognitionException {
		try {
			int _type = RETURN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:264:8: ( 'return' )
			// myInterp.g:264:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN_"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:265:4: ( 'int' )
			// myInterp.g:265:5: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:266:5: ( 'main' )
			// myInterp.g:266:7: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:267:5: ( 'void' )
			// myInterp.g:267:7: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:268:5: ( 'else' )
			// myInterp.g:268:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:269:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myInterp.g:269:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myInterp.g:269:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myInterp.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:270:17: ( ( '0' .. '9' )+ )
			// myInterp.g:270:18: ( '0' .. '9' )+
			{
			// myInterp.g:270:18: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myInterp.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:272:8: ( ( '\\r' )? '\\n' )
			// myInterp.g:272:9: ( '\\r' )? '\\n'
			{
			// myInterp.g:272:9: ( '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// myInterp.g:272:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:273:5: ( ( ' ' | '\\t' )+ )
			// myInterp.g:273:9: ( ' ' | '\\t' )+
			{
			// myInterp.g:273:9: ( ' ' | '\\t' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\t'||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myInterp.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:274:8: ( '/*' ( . )* '*/' )
			// myInterp.g:274:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myInterp.g:274:14: ( . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myInterp.g:274:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:275:8: ( '#include <' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.h>' )
			// myInterp.g:275:10: '#include <' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.h>'
			{
			match("#include <"); 

			// myInterp.g:275:22: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myInterp.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			match(".h>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	@Override
	public void mTokens() throws RecognitionException {
		// myInterp.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | IF | STRING | PRINTF | SCANF | RETURN_ | INT | MAIN | VOID | ELSE | Identifier | Integer_constant | NEWLINE | WS | COMMENT | INCLUDE )
		int alt8=43;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// myInterp.g:1:10: T__19
				{
				mT__19(); 

				}
				break;
			case 2 :
				// myInterp.g:1:16: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// myInterp.g:1:22: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// myInterp.g:1:28: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// myInterp.g:1:34: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// myInterp.g:1:40: T__24
				{
				mT__24(); 

				}
				break;
			case 7 :
				// myInterp.g:1:46: T__25
				{
				mT__25(); 

				}
				break;
			case 8 :
				// myInterp.g:1:52: T__26
				{
				mT__26(); 

				}
				break;
			case 9 :
				// myInterp.g:1:58: T__27
				{
				mT__27(); 

				}
				break;
			case 10 :
				// myInterp.g:1:64: T__28
				{
				mT__28(); 

				}
				break;
			case 11 :
				// myInterp.g:1:70: T__29
				{
				mT__29(); 

				}
				break;
			case 12 :
				// myInterp.g:1:76: T__30
				{
				mT__30(); 

				}
				break;
			case 13 :
				// myInterp.g:1:82: T__31
				{
				mT__31(); 

				}
				break;
			case 14 :
				// myInterp.g:1:88: T__32
				{
				mT__32(); 

				}
				break;
			case 15 :
				// myInterp.g:1:94: T__33
				{
				mT__33(); 

				}
				break;
			case 16 :
				// myInterp.g:1:100: T__34
				{
				mT__34(); 

				}
				break;
			case 17 :
				// myInterp.g:1:106: T__35
				{
				mT__35(); 

				}
				break;
			case 18 :
				// myInterp.g:1:112: T__36
				{
				mT__36(); 

				}
				break;
			case 19 :
				// myInterp.g:1:118: T__37
				{
				mT__37(); 

				}
				break;
			case 20 :
				// myInterp.g:1:124: T__38
				{
				mT__38(); 

				}
				break;
			case 21 :
				// myInterp.g:1:130: T__39
				{
				mT__39(); 

				}
				break;
			case 22 :
				// myInterp.g:1:136: T__40
				{
				mT__40(); 

				}
				break;
			case 23 :
				// myInterp.g:1:142: T__41
				{
				mT__41(); 

				}
				break;
			case 24 :
				// myInterp.g:1:148: T__42
				{
				mT__42(); 

				}
				break;
			case 25 :
				// myInterp.g:1:154: T__43
				{
				mT__43(); 

				}
				break;
			case 26 :
				// myInterp.g:1:160: T__44
				{
				mT__44(); 

				}
				break;
			case 27 :
				// myInterp.g:1:166: T__45
				{
				mT__45(); 

				}
				break;
			case 28 :
				// myInterp.g:1:172: T__46
				{
				mT__46(); 

				}
				break;
			case 29 :
				// myInterp.g:1:178: IF
				{
				mIF(); 

				}
				break;
			case 30 :
				// myInterp.g:1:181: STRING
				{
				mSTRING(); 

				}
				break;
			case 31 :
				// myInterp.g:1:188: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 32 :
				// myInterp.g:1:195: SCANF
				{
				mSCANF(); 

				}
				break;
			case 33 :
				// myInterp.g:1:201: RETURN_
				{
				mRETURN_(); 

				}
				break;
			case 34 :
				// myInterp.g:1:209: INT
				{
				mINT(); 

				}
				break;
			case 35 :
				// myInterp.g:1:213: MAIN
				{
				mMAIN(); 

				}
				break;
			case 36 :
				// myInterp.g:1:218: VOID
				{
				mVOID(); 

				}
				break;
			case 37 :
				// myInterp.g:1:223: ELSE
				{
				mELSE(); 

				}
				break;
			case 38 :
				// myInterp.g:1:228: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 39 :
				// myInterp.g:1:239: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 40 :
				// myInterp.g:1:256: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 41 :
				// myInterp.g:1:264: WS
				{
				mWS(); 

				}
				break;
			case 42 :
				// myInterp.g:1:267: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 43 :
				// myInterp.g:1:275: INCLUDE
				{
				mINCLUDE(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\2\uffff\1\37\3\uffff\1\41\1\43\1\uffff\1\45\1\50\1\uffff\1\53\1\55\1"+
		"\60\2\uffff\1\31\1\uffff\6\31\20\uffff\1\72\5\uffff\1\74\1\uffff\1\75"+
		"\7\31\5\uffff\1\105\6\31\1\uffff\3\31\1\117\1\120\1\121\1\31\1\123\1\31"+
		"\3\uffff\1\125\1\uffff\1\126\2\uffff";
	static final String DFA8_eofS =
		"\127\uffff";
	static final String DFA8_minS =
		"\1\11\1\uffff\1\75\3\uffff\2\75\1\uffff\1\75\1\52\1\uffff\1\74\2\75\2"+
		"\uffff\1\146\1\uffff\1\162\1\143\1\145\1\141\1\157\1\154\20\uffff\1\75"+
		"\5\uffff\1\75\1\uffff\1\60\1\164\1\151\1\141\1\164\2\151\1\163\5\uffff"+
		"\1\60\2\156\1\165\1\156\1\144\1\145\1\uffff\1\164\1\146\1\162\3\60\1\146"+
		"\1\60\1\156\3\uffff\1\60\1\uffff\1\60\2\uffff";
	static final String DFA8_maxS =
		"\1\175\1\uffff\1\75\3\uffff\2\75\1\uffff\2\75\1\uffff\2\75\1\76\2\uffff"+
		"\1\156\1\uffff\1\162\1\143\1\145\1\141\1\157\1\154\20\uffff\1\75\5\uffff"+
		"\1\75\1\uffff\1\172\1\164\1\151\1\141\1\164\2\151\1\163\5\uffff\1\172"+
		"\2\156\1\165\1\156\1\144\1\145\1\uffff\1\164\1\146\1\162\3\172\1\146\1"+
		"\172\1\156\3\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\uffff\1\4\1\5\1\6\2\uffff\1\13\2\uffff\1\20\3\uffff\1\33"+
		"\1\34\1\uffff\1\36\6\uffff\1\46\1\47\1\50\1\51\1\53\1\3\1\2\1\10\1\7\1"+
		"\12\1\11\1\15\1\14\1\17\1\52\1\16\1\uffff\1\24\1\21\1\26\1\25\1\30\1\uffff"+
		"\1\27\10\uffff\1\23\1\22\1\32\1\31\1\35\7\uffff\1\42\11\uffff\1\43\1\44"+
		"\1\45\1\uffff\1\40\1\uffff\1\37\1\41";
	static final String DFA8_specialS =
		"\127\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\34\1\33\2\uffff\1\33\22\uffff\1\34\1\1\1\22\1\35\1\uffff\1\2\1\3\1"+
			"\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\12\32\1\uffff\1\13\1\14"+
			"\1\15\1\16\2\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\30\3\31\1\21\3\31"+
			"\1\26\2\31\1\23\1\31\1\25\1\24\2\31\1\27\4\31\1\17\1\uffff\1\20",
			"",
			"\1\36",
			"",
			"",
			"",
			"\1\40",
			"\1\42",
			"",
			"\1\44",
			"\1\47\22\uffff\1\46",
			"",
			"\1\51\1\52",
			"\1\54",
			"\1\56\1\57",
			"",
			"",
			"\1\61\7\uffff\1\62",
			"",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\71",
			"",
			"",
			"",
			"",
			"",
			"\1\73",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"",
			"",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"",
			"\1\114",
			"\1\115",
			"\1\116",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\122",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\124",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | IF | STRING | PRINTF | SCANF | RETURN_ | INT | MAIN | VOID | ELSE | Identifier | Integer_constant | NEWLINE | WS | COMMENT | INCLUDE );";
		}
	}

}
