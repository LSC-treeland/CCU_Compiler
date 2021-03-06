// $ANTLR 3.5.2 mylexer.g 2022-03-25 19:47:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int AMPERSAND_=4;
	public static final int AND_OP=5;
	public static final int ASSIGN_OP=6;
	public static final int BIT_OR_OP=7;
	public static final int BL_BRACK=8;
	public static final int BREAK_=9;
	public static final int BR_BRACK=10;
	public static final int CASE_=11;
	public static final int CHAR_=12;
	public static final int CHAR_TYPE=13;
	public static final int COLON_=14;
	public static final int COMMA_=15;
	public static final int COMMENT1=16;
	public static final int COMMENT2=17;
	public static final int COMPL_OP=18;
	public static final int CONTINUE_=19;
	public static final int DEC_NUM=20;
	public static final int DEFAULT_=21;
	public static final int DIGIT=22;
	public static final int DIVID_E_OP=23;
	public static final int DIVID_OP=24;
	public static final int DOUBLE_TYPE=25;
	public static final int ELSE_=26;
	public static final int EQ_OP=27;
	public static final int FLOAT_NUM=28;
	public static final int FLOAT_NUM1=29;
	public static final int FLOAT_NUM2=30;
	public static final int FLOAT_NUM3=31;
	public static final int FLOAT_TYPE=32;
	public static final int FOR_=33;
	public static final int GE_OP=34;
	public static final int GT_OP=35;
	public static final int ID=36;
	public static final int IF_=37;
	public static final int INT_TYPE=38;
	public static final int LETTER=39;
	public static final int LE_OP=40;
	public static final int LONG_TYPE=41;
	public static final int LSHIFT_OP=42;
	public static final int LT_OP=43;
	public static final int MAIN_=44;
	public static final int MINUS_E_OP=45;
	public static final int MINUS_OP=46;
	public static final int ML_BRACK=47;
	public static final int MM_OP=48;
	public static final int MOD_E_OP=49;
	public static final int MOD_OP=50;
	public static final int MR_BRACK=51;
	public static final int MULTI_E_OP=52;
	public static final int MULTI_OP=53;
	public static final int NEW_LINE=54;
	public static final int NE_OP=55;
	public static final int NOT_OP=56;
	public static final int OR_OP=57;
	public static final int PLUS_E_OP=58;
	public static final int PLUS_OP=59;
	public static final int PP_OP=60;
	public static final int PRE_PROCESS=61;
	public static final int PRINTF_=62;
	public static final int QUESTION_=63;
	public static final int RETURN_=64;
	public static final int RSHIFT_OP=65;
	public static final int SCANF_=66;
	public static final int SEMIC_=67;
	public static final int SHORT_TYPR=68;
	public static final int SL_BRACK=69;
	public static final int SR_BRACK=70;
	public static final int STRING_=71;
	public static final int SWITCH_=72;
	public static final int VOID_TYPE=73;
	public static final int WHILE_=74;
	public static final int WS=75;
	public static final int XOR_OP=76;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:10:11: ( 'int' )
			// mylexer.g:10:13: 'int'
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
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:11:11: ( 'char' )
			// mylexer.g:11:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:12:11: ( 'void' )
			// mylexer.g:12:13: 'void'
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
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:13:11: ( 'float' )
			// mylexer.g:13:13: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:14:11: ( 'long' )
			// mylexer.g:14:13: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:15:13: ( 'double' )
			// mylexer.g:15:15: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "SHORT_TYPR"
	public final void mSHORT_TYPR() throws RecognitionException {
		try {
			int _type = SHORT_TYPR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:16:12: ( 'short' )
			// mylexer.g:16:14: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT_TYPR"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:11: ( 'while' )
			// mylexer.g:17:13: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_"

	// $ANTLR start "IF_"
	public final void mIF_() throws RecognitionException {
		try {
			int _type = IF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:18:11: ( 'if' )
			// mylexer.g:18:13: 'if'
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
	// $ANTLR end "IF_"

	// $ANTLR start "ELSE_"
	public final void mELSE_() throws RecognitionException {
		try {
			int _type = ELSE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:19:11: ( 'else' )
			// mylexer.g:19:13: 'else'
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
	// $ANTLR end "ELSE_"

	// $ANTLR start "FOR_"
	public final void mFOR_() throws RecognitionException {
		try {
			int _type = FOR_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:20:11: ( 'for' )
			// mylexer.g:20:13: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR_"

	// $ANTLR start "BREAK_"
	public final void mBREAK_() throws RecognitionException {
		try {
			int _type = BREAK_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:21:11: ( 'break' )
			// mylexer.g:21:13: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK_"

	// $ANTLR start "CONTINUE_"
	public final void mCONTINUE_() throws RecognitionException {
		try {
			int _type = CONTINUE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:11: ( 'continue' )
			// mylexer.g:22:13: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE_"

	// $ANTLR start "SWITCH_"
	public final void mSWITCH_() throws RecognitionException {
		try {
			int _type = SWITCH_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:23:11: ( 'switch' )
			// mylexer.g:23:13: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_"

	// $ANTLR start "CASE_"
	public final void mCASE_() throws RecognitionException {
		try {
			int _type = CASE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:24:11: ( 'case' )
			// mylexer.g:24:13: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE_"

	// $ANTLR start "DEFAULT_"
	public final void mDEFAULT_() throws RecognitionException {
		try {
			int _type = DEFAULT_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:25:11: ( 'default' )
			// mylexer.g:25:13: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT_"

	// $ANTLR start "RETURN_"
	public final void mRETURN_() throws RecognitionException {
		try {
			int _type = RETURN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:26:9: ( 'return' )
			// mylexer.g:26:11: 'return'
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

	// $ANTLR start "MAIN_"
	public final void mMAIN_() throws RecognitionException {
		try {
			int _type = MAIN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:27:7: ( 'main' )
			// mylexer.g:27:9: 'main'
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
	// $ANTLR end "MAIN_"

	// $ANTLR start "PRINTF_"
	public final void mPRINTF_() throws RecognitionException {
		try {
			int _type = PRINTF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:28:9: ( 'printf' )
			// mylexer.g:28:11: 'printf'
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
	// $ANTLR end "PRINTF_"

	// $ANTLR start "SCANF_"
	public final void mSCANF_() throws RecognitionException {
		try {
			int _type = SCANF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:29:8: ( 'scanf' )
			// mylexer.g:29:10: 'scanf'
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
	// $ANTLR end "SCANF_"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:35:7: ( '==' )
			// mylexer.g:35:9: '=='
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
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:36:7: ( '<=' )
			// mylexer.g:36:9: '<='
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
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:37:7: ( '>=' )
			// mylexer.g:37:9: '>='
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
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:38:7: ( '!=' )
			// mylexer.g:38:9: '!='
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
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:39:7: ( '++' )
			// mylexer.g:39:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:40:7: ( '--' )
			// mylexer.g:40:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:41:11: ( '<<' )
			// mylexer.g:41:13: '<<'
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
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:42:11: ( '>>' )
			// mylexer.g:42:13: '>>'
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
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "LT_OP"
	public final void mLT_OP() throws RecognitionException {
		try {
			int _type = LT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:43:7: ( '<' )
			// mylexer.g:43:9: '<'
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
	// $ANTLR end "LT_OP"

	// $ANTLR start "GT_OP"
	public final void mGT_OP() throws RecognitionException {
		try {
			int _type = GT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:44:7: ( '>' )
			// mylexer.g:44:9: '>'
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
	// $ANTLR end "GT_OP"

	// $ANTLR start "PLUS_OP"
	public final void mPLUS_OP() throws RecognitionException {
		try {
			int _type = PLUS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:45:9: ( '+' )
			// mylexer.g:45:11: '+'
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
	// $ANTLR end "PLUS_OP"

	// $ANTLR start "MINUS_OP"
	public final void mMINUS_OP() throws RecognitionException {
		try {
			int _type = MINUS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:46:10: ( '-' )
			// mylexer.g:46:12: '-'
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
	// $ANTLR end "MINUS_OP"

	// $ANTLR start "MULTI_OP"
	public final void mMULTI_OP() throws RecognitionException {
		try {
			int _type = MULTI_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:47:10: ( '*' )
			// mylexer.g:47:12: '*'
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
	// $ANTLR end "MULTI_OP"

	// $ANTLR start "DIVID_OP"
	public final void mDIVID_OP() throws RecognitionException {
		try {
			int _type = DIVID_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:48:10: ( '/' )
			// mylexer.g:48:12: '/'
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
	// $ANTLR end "DIVID_OP"

	// $ANTLR start "MOD_OP"
	public final void mMOD_OP() throws RecognitionException {
		try {
			int _type = MOD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:49:8: ( '%' )
			// mylexer.g:49:10: '%'
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
	// $ANTLR end "MOD_OP"

	// $ANTLR start "COMPL_OP"
	public final void mCOMPL_OP() throws RecognitionException {
		try {
			int _type = COMPL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:50:10: ( '~' )
			// mylexer.g:50:12: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPL_OP"

	// $ANTLR start "ASSIGN_OP"
	public final void mASSIGN_OP() throws RecognitionException {
		try {
			int _type = ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:51:11: ( '=' )
			// mylexer.g:51:13: '='
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
	// $ANTLR end "ASSIGN_OP"

	// $ANTLR start "PLUS_E_OP"
	public final void mPLUS_E_OP() throws RecognitionException {
		try {
			int _type = PLUS_E_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:52:11: ( '+=' )
			// mylexer.g:52:13: '+='
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
	// $ANTLR end "PLUS_E_OP"

	// $ANTLR start "MINUS_E_OP"
	public final void mMINUS_E_OP() throws RecognitionException {
		try {
			int _type = MINUS_E_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:53:12: ( '-=' )
			// mylexer.g:53:14: '-='
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
	// $ANTLR end "MINUS_E_OP"

	// $ANTLR start "MULTI_E_OP"
	public final void mMULTI_E_OP() throws RecognitionException {
		try {
			int _type = MULTI_E_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:12: ( '*=' )
			// mylexer.g:54:14: '*='
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
	// $ANTLR end "MULTI_E_OP"

	// $ANTLR start "DIVID_E_OP"
	public final void mDIVID_E_OP() throws RecognitionException {
		try {
			int _type = DIVID_E_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:55:12: ( '/=' )
			// mylexer.g:55:14: '/='
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
	// $ANTLR end "DIVID_E_OP"

	// $ANTLR start "MOD_E_OP"
	public final void mMOD_E_OP() throws RecognitionException {
		try {
			int _type = MOD_E_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:56:10: ( '%=' )
			// mylexer.g:56:12: '%='
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
	// $ANTLR end "MOD_E_OP"

	// $ANTLR start "AND_OP"
	public final void mAND_OP() throws RecognitionException {
		try {
			int _type = AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:57:8: ( '&&' )
			// mylexer.g:57:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_OP"

	// $ANTLR start "OR_OP"
	public final void mOR_OP() throws RecognitionException {
		try {
			int _type = OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:58:7: ( '||' )
			// mylexer.g:58:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_OP"

	// $ANTLR start "BIT_OR_OP"
	public final void mBIT_OR_OP() throws RecognitionException {
		try {
			int _type = BIT_OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:59:11: ( '|' )
			// mylexer.g:59:13: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_OR_OP"

	// $ANTLR start "NOT_OP"
	public final void mNOT_OP() throws RecognitionException {
		try {
			int _type = NOT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:60:8: ( '!' )
			// mylexer.g:60:10: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_OP"

	// $ANTLR start "XOR_OP"
	public final void mXOR_OP() throws RecognitionException {
		try {
			int _type = XOR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:61:8: ( '^' )
			// mylexer.g:61:10: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR_OP"

	// $ANTLR start "COMMA_"
	public final void mCOMMA_() throws RecognitionException {
		try {
			int _type = COMMA_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:62:8: ( ',' )
			// mylexer.g:62:10: ','
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
	// $ANTLR end "COMMA_"

	// $ANTLR start "SEMIC_"
	public final void mSEMIC_() throws RecognitionException {
		try {
			int _type = SEMIC_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:63:8: ( ';' )
			// mylexer.g:63:10: ';'
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
	// $ANTLR end "SEMIC_"

	// $ANTLR start "COLON_"
	public final void mCOLON_() throws RecognitionException {
		try {
			int _type = COLON_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:64:8: ( ':' )
			// mylexer.g:64:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON_"

	// $ANTLR start "QUESTION_"
	public final void mQUESTION_() throws RecognitionException {
		try {
			int _type = QUESTION_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:65:11: ( '?' )
			// mylexer.g:65:13: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION_"

	// $ANTLR start "AMPERSAND_"
	public final void mAMPERSAND_() throws RecognitionException {
		try {
			int _type = AMPERSAND_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:66:12: ( '&' )
			// mylexer.g:66:14: '&'
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
	// $ANTLR end "AMPERSAND_"

	// $ANTLR start "SL_BRACK"
	public final void mSL_BRACK() throws RecognitionException {
		try {
			int _type = SL_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:67:10: ( '(' )
			// mylexer.g:67:12: '('
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
	// $ANTLR end "SL_BRACK"

	// $ANTLR start "SR_BRACK"
	public final void mSR_BRACK() throws RecognitionException {
		try {
			int _type = SR_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:68:10: ( ')' )
			// mylexer.g:68:12: ')'
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
	// $ANTLR end "SR_BRACK"

	// $ANTLR start "ML_BRACK"
	public final void mML_BRACK() throws RecognitionException {
		try {
			int _type = ML_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:69:10: ( '[' )
			// mylexer.g:69:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ML_BRACK"

	// $ANTLR start "MR_BRACK"
	public final void mMR_BRACK() throws RecognitionException {
		try {
			int _type = MR_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:70:10: ( ']' )
			// mylexer.g:70:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MR_BRACK"

	// $ANTLR start "BL_BRACK"
	public final void mBL_BRACK() throws RecognitionException {
		try {
			int _type = BL_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:71:10: ( '{' )
			// mylexer.g:71:12: '{'
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
	// $ANTLR end "BL_BRACK"

	// $ANTLR start "BR_BRACK"
	public final void mBR_BRACK() throws RecognitionException {
		try {
			int _type = BR_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:72:10: ( '}' )
			// mylexer.g:72:12: '}'
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
	// $ANTLR end "BR_BRACK"

	// $ANTLR start "PRE_PROCESS"
	public final void mPRE_PROCESS() throws RecognitionException {
		try {
			int _type = PRE_PROCESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:74:13: ( '#' ( . )* '\\n' )
			// mylexer.g:74:15: '#' ( . )* '\\n'
			{
			match('#'); 
			// mylexer.g:74:18: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\n') ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// mylexer.g:74:19: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
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
	// $ANTLR end "PRE_PROCESS"

	// $ANTLR start "STRING_"
	public final void mSTRING_() throws RecognitionException {
		try {
			int _type = STRING_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:76:9: ( '\"' ( . )* '\"' )
			// mylexer.g:76:11: '\"' ( . )* '\"'
			{
			match('\"'); 
			// mylexer.g:76:14: ( . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\"') ) {
					alt2=2;
				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// mylexer.g:76:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
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
	// $ANTLR end "STRING_"

	// $ANTLR start "CHAR_"
	public final void mCHAR_() throws RecognitionException {
		try {
			int _type = CHAR_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:77:7: ( ( '\\'' ( . )* '\\'' ) )
			// mylexer.g:77:9: ( '\\'' ( . )* '\\'' )
			{
			// mylexer.g:77:9: ( '\\'' ( . )* '\\'' )
			// mylexer.g:77:10: '\\'' ( . )* '\\''
			{
			match('\''); 
			// mylexer.g:77:14: ( . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\'') ) {
					alt3=2;
				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// mylexer.g:77:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop3;
				}
			}

			match('\''); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:79:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// mylexer.g:79:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// mylexer.g:79:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// mylexer.g:79:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:79:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:79:28: ( DIGIT )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// mylexer.g:
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
							break loop4;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:81:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:81:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:81:14: ( LETTER | DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// mylexer.g:
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
					break loop6;
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
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:83:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt7=3;
			alt7 = dfa7.predict(input);
			switch (alt7) {
				case 1 :
					// mylexer.g:83:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:83:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// mylexer.g:83:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mylexer.g:84:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:84:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:84:22: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// mylexer.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match('.'); 
			// mylexer.g:84:33: ( DIGIT )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// mylexer.g:
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
					break loop9;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mylexer.g:85:20: ( '.' ( DIGIT )+ )
			// mylexer.g:85:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:85:25: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// mylexer.g:
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// mylexer.g:86:20: ( ( DIGIT )+ )
			// mylexer.g:86:22: ( DIGIT )+
			{
			// mylexer.g:86:22: ( DIGIT )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// mylexer.g:
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
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:90:10: ( '//' ( . )* '\\n' )
			// mylexer.g:90:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:90:16: ( . )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\n') ) {
					alt12=2;
				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mylexer.g:90:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop12;
				}
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
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:91:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// mylexer.g:91:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// mylexer.g:91:17: ( options {greedy=false; } : . )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='*') ) {
					int LA13_1 = input.LA(2);
					if ( (LA13_1=='/') ) {
						alt13=2;
					}
					else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
						alt13=1;
					}

				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:91:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop13;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:94:9: ( '\\n' )
			// mylexer.g:94:11: '\\n'
			{
			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mylexer.g:96:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mylexer.g:97:16: ( '0' .. '9' )
			// mylexer.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:100:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// mylexer.g:100:7: ( ' ' | '\\r' | '\\t' )+
			{
			// mylexer.g:100:7: ( ' ' | '\\r' | '\\t' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\t'||LA14_0=='\r'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
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

	@Override
	public void mTokens() throws RecognitionException {
		// mylexer.g:1:8: ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | LONG_TYPE | DOUBLE_TYPE | SHORT_TYPR | WHILE_ | IF_ | ELSE_ | FOR_ | BREAK_ | CONTINUE_ | SWITCH_ | CASE_ | DEFAULT_ | RETURN_ | MAIN_ | PRINTF_ | SCANF_ | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | LT_OP | GT_OP | PLUS_OP | MINUS_OP | MULTI_OP | DIVID_OP | MOD_OP | COMPL_OP | ASSIGN_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP | MOD_E_OP | AND_OP | OR_OP | BIT_OR_OP | NOT_OP | XOR_OP | COMMA_ | SEMIC_ | COLON_ | QUESTION_ | AMPERSAND_ | SL_BRACK | SR_BRACK | ML_BRACK | MR_BRACK | BL_BRACK | BR_BRACK | PRE_PROCESS | STRING_ | CHAR_ | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | NEW_LINE | WS )
		int alt15=68;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// mylexer.g:1:10: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 2 :
				// mylexer.g:1:19: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 3 :
				// mylexer.g:1:29: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 4 :
				// mylexer.g:1:39: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 5 :
				// mylexer.g:1:50: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 6 :
				// mylexer.g:1:60: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 7 :
				// mylexer.g:1:72: SHORT_TYPR
				{
				mSHORT_TYPR(); 

				}
				break;
			case 8 :
				// mylexer.g:1:83: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 9 :
				// mylexer.g:1:90: IF_
				{
				mIF_(); 

				}
				break;
			case 10 :
				// mylexer.g:1:94: ELSE_
				{
				mELSE_(); 

				}
				break;
			case 11 :
				// mylexer.g:1:100: FOR_
				{
				mFOR_(); 

				}
				break;
			case 12 :
				// mylexer.g:1:105: BREAK_
				{
				mBREAK_(); 

				}
				break;
			case 13 :
				// mylexer.g:1:112: CONTINUE_
				{
				mCONTINUE_(); 

				}
				break;
			case 14 :
				// mylexer.g:1:122: SWITCH_
				{
				mSWITCH_(); 

				}
				break;
			case 15 :
				// mylexer.g:1:130: CASE_
				{
				mCASE_(); 

				}
				break;
			case 16 :
				// mylexer.g:1:136: DEFAULT_
				{
				mDEFAULT_(); 

				}
				break;
			case 17 :
				// mylexer.g:1:145: RETURN_
				{
				mRETURN_(); 

				}
				break;
			case 18 :
				// mylexer.g:1:153: MAIN_
				{
				mMAIN_(); 

				}
				break;
			case 19 :
				// mylexer.g:1:159: PRINTF_
				{
				mPRINTF_(); 

				}
				break;
			case 20 :
				// mylexer.g:1:167: SCANF_
				{
				mSCANF_(); 

				}
				break;
			case 21 :
				// mylexer.g:1:174: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 22 :
				// mylexer.g:1:180: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 23 :
				// mylexer.g:1:186: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 24 :
				// mylexer.g:1:192: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 25 :
				// mylexer.g:1:198: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 26 :
				// mylexer.g:1:204: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 27 :
				// mylexer.g:1:210: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 28 :
				// mylexer.g:1:220: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 29 :
				// mylexer.g:1:230: LT_OP
				{
				mLT_OP(); 

				}
				break;
			case 30 :
				// mylexer.g:1:236: GT_OP
				{
				mGT_OP(); 

				}
				break;
			case 31 :
				// mylexer.g:1:242: PLUS_OP
				{
				mPLUS_OP(); 

				}
				break;
			case 32 :
				// mylexer.g:1:250: MINUS_OP
				{
				mMINUS_OP(); 

				}
				break;
			case 33 :
				// mylexer.g:1:259: MULTI_OP
				{
				mMULTI_OP(); 

				}
				break;
			case 34 :
				// mylexer.g:1:268: DIVID_OP
				{
				mDIVID_OP(); 

				}
				break;
			case 35 :
				// mylexer.g:1:277: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 36 :
				// mylexer.g:1:284: COMPL_OP
				{
				mCOMPL_OP(); 

				}
				break;
			case 37 :
				// mylexer.g:1:293: ASSIGN_OP
				{
				mASSIGN_OP(); 

				}
				break;
			case 38 :
				// mylexer.g:1:303: PLUS_E_OP
				{
				mPLUS_E_OP(); 

				}
				break;
			case 39 :
				// mylexer.g:1:313: MINUS_E_OP
				{
				mMINUS_E_OP(); 

				}
				break;
			case 40 :
				// mylexer.g:1:324: MULTI_E_OP
				{
				mMULTI_E_OP(); 

				}
				break;
			case 41 :
				// mylexer.g:1:335: DIVID_E_OP
				{
				mDIVID_E_OP(); 

				}
				break;
			case 42 :
				// mylexer.g:1:346: MOD_E_OP
				{
				mMOD_E_OP(); 

				}
				break;
			case 43 :
				// mylexer.g:1:355: AND_OP
				{
				mAND_OP(); 

				}
				break;
			case 44 :
				// mylexer.g:1:362: OR_OP
				{
				mOR_OP(); 

				}
				break;
			case 45 :
				// mylexer.g:1:368: BIT_OR_OP
				{
				mBIT_OR_OP(); 

				}
				break;
			case 46 :
				// mylexer.g:1:378: NOT_OP
				{
				mNOT_OP(); 

				}
				break;
			case 47 :
				// mylexer.g:1:385: XOR_OP
				{
				mXOR_OP(); 

				}
				break;
			case 48 :
				// mylexer.g:1:392: COMMA_
				{
				mCOMMA_(); 

				}
				break;
			case 49 :
				// mylexer.g:1:399: SEMIC_
				{
				mSEMIC_(); 

				}
				break;
			case 50 :
				// mylexer.g:1:406: COLON_
				{
				mCOLON_(); 

				}
				break;
			case 51 :
				// mylexer.g:1:413: QUESTION_
				{
				mQUESTION_(); 

				}
				break;
			case 52 :
				// mylexer.g:1:423: AMPERSAND_
				{
				mAMPERSAND_(); 

				}
				break;
			case 53 :
				// mylexer.g:1:434: SL_BRACK
				{
				mSL_BRACK(); 

				}
				break;
			case 54 :
				// mylexer.g:1:443: SR_BRACK
				{
				mSR_BRACK(); 

				}
				break;
			case 55 :
				// mylexer.g:1:452: ML_BRACK
				{
				mML_BRACK(); 

				}
				break;
			case 56 :
				// mylexer.g:1:461: MR_BRACK
				{
				mMR_BRACK(); 

				}
				break;
			case 57 :
				// mylexer.g:1:470: BL_BRACK
				{
				mBL_BRACK(); 

				}
				break;
			case 58 :
				// mylexer.g:1:479: BR_BRACK
				{
				mBR_BRACK(); 

				}
				break;
			case 59 :
				// mylexer.g:1:488: PRE_PROCESS
				{
				mPRE_PROCESS(); 

				}
				break;
			case 60 :
				// mylexer.g:1:500: STRING_
				{
				mSTRING_(); 

				}
				break;
			case 61 :
				// mylexer.g:1:508: CHAR_
				{
				mCHAR_(); 

				}
				break;
			case 62 :
				// mylexer.g:1:514: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 63 :
				// mylexer.g:1:522: ID
				{
				mID(); 

				}
				break;
			case 64 :
				// mylexer.g:1:525: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 65 :
				// mylexer.g:1:535: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 66 :
				// mylexer.g:1:544: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 67 :
				// mylexer.g:1:553: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 68 :
				// mylexer.g:1:562: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA7_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA7_eofS =
		"\5\uffff";
	static final String DFA7_minS =
		"\2\56\3\uffff";
	static final String DFA7_maxS =
		"\2\71\3\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA7_specialS =
		"\5\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "83:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA15_eotS =
		"\1\uffff\15\52\1\103\1\106\1\111\1\113\1\116\1\121\1\123\1\127\1\131\1"+
		"\uffff\1\133\1\135\16\uffff\2\136\4\uffff\1\52\1\141\22\52\35\uffff\1"+
		"\136\1\164\1\uffff\5\52\1\172\14\52\1\uffff\1\u0087\1\52\1\u0089\1\u008a"+
		"\1\52\1\uffff\1\u008c\6\52\1\u0093\2\52\1\u0096\1\52\1\uffff\1\52\2\uffff"+
		"\1\u0099\1\uffff\2\52\1\u009c\1\52\1\u009e\1\u009f\1\uffff\1\u00a0\1\52"+
		"\1\uffff\2\52\1\uffff\1\u00a4\1\52\1\uffff\1\u00a6\3\uffff\1\u00a7\1\u00a8"+
		"\1\52\1\uffff\1\u00aa\3\uffff\1\u00ab\2\uffff";
	static final String DFA15_eofS =
		"\u00ac\uffff";
	static final String DFA15_minS =
		"\1\11\1\146\1\141\1\157\1\154\1\157\1\145\1\143\1\150\1\154\1\162\1\145"+
		"\1\141\1\162\1\75\1\74\2\75\1\53\1\55\1\75\1\52\1\75\1\uffff\1\46\1\174"+
		"\16\uffff\2\56\4\uffff\1\164\1\60\1\141\1\156\1\163\1\151\1\157\1\162"+
		"\1\156\1\165\1\146\1\157\1\151\1\141\1\151\1\163\1\145\1\164\2\151\35"+
		"\uffff\1\56\1\60\1\uffff\1\162\1\164\1\145\1\144\1\141\1\60\1\147\1\142"+
		"\1\141\1\162\1\164\1\156\1\154\1\145\1\141\1\165\2\156\1\uffff\1\60\1"+
		"\151\2\60\1\164\1\uffff\1\60\1\154\1\165\1\164\1\143\1\146\1\145\1\60"+
		"\1\153\1\162\1\60\1\164\1\uffff\1\156\2\uffff\1\60\1\uffff\1\145\1\154"+
		"\1\60\1\150\2\60\1\uffff\1\60\1\156\1\uffff\1\146\1\165\1\uffff\1\60\1"+
		"\164\1\uffff\1\60\3\uffff\2\60\1\145\1\uffff\1\60\3\uffff\1\60\2\uffff";
	static final String DFA15_maxS =
		"\1\176\1\156\5\157\1\167\1\150\1\154\1\162\1\145\1\141\1\162\2\75\1\76"+
		"\6\75\1\uffff\1\46\1\174\16\uffff\2\71\4\uffff\1\164\1\172\1\141\1\156"+
		"\1\163\1\151\1\157\1\162\1\156\1\165\1\146\1\157\1\151\1\141\1\151\1\163"+
		"\1\145\1\164\2\151\35\uffff\1\71\1\172\1\uffff\1\162\1\164\1\145\1\144"+
		"\1\141\1\172\1\147\1\142\1\141\1\162\1\164\1\156\1\154\1\145\1\141\1\165"+
		"\2\156\1\uffff\1\172\1\151\2\172\1\164\1\uffff\1\172\1\154\1\165\1\164"+
		"\1\143\1\146\1\145\1\172\1\153\1\162\1\172\1\164\1\uffff\1\156\2\uffff"+
		"\1\172\1\uffff\1\145\1\154\1\172\1\150\2\172\1\uffff\1\172\1\156\1\uffff"+
		"\1\146\1\165\1\uffff\1\172\1\164\1\uffff\1\172\3\uffff\2\172\1\145\1\uffff"+
		"\1\172\3\uffff\1\172\2\uffff";
	static final String DFA15_acceptS =
		"\27\uffff\1\44\2\uffff\1\57\1\60\1\61\1\62\1\63\1\65\1\66\1\67\1\70\1"+
		"\71\1\72\1\73\1\74\1\75\2\uffff\1\77\1\100\1\103\1\104\24\uffff\1\25\1"+
		"\45\1\26\1\33\1\35\1\27\1\34\1\36\1\30\1\56\1\31\1\46\1\37\1\32\1\47\1"+
		"\40\1\50\1\41\1\51\1\101\1\102\1\42\1\52\1\43\1\53\1\64\1\54\1\55\1\76"+
		"\2\uffff\1\11\22\uffff\1\1\5\uffff\1\13\14\uffff\1\2\1\uffff\1\17\1\3"+
		"\1\uffff\1\5\6\uffff\1\12\2\uffff\1\22\2\uffff\1\4\2\uffff\1\7\1\uffff"+
		"\1\24\1\10\1\14\3\uffff\1\6\1\uffff\1\16\1\21\1\23\1\uffff\1\20\1\15";
	static final String DFA15_specialS =
		"\u00ac\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\55\1\54\2\uffff\1\55\22\uffff\1\55\1\21\1\46\1\45\1\uffff\1\26\1\30"+
			"\1\47\1\37\1\40\1\24\1\22\1\33\1\23\1\53\1\25\1\50\11\51\1\35\1\34\1"+
			"\17\1\16\1\20\1\36\1\uffff\32\52\1\41\1\uffff\1\42\1\32\1\52\1\uffff"+
			"\1\52\1\12\1\2\1\6\1\11\1\4\2\52\1\1\2\52\1\5\1\14\2\52\1\15\1\52\1\13"+
			"\1\7\2\52\1\3\1\10\3\52\1\43\1\31\1\44\1\27",
			"\1\57\7\uffff\1\56",
			"\1\62\6\uffff\1\60\6\uffff\1\61",
			"\1\63",
			"\1\64\2\uffff\1\65",
			"\1\66",
			"\1\70\11\uffff\1\67",
			"\1\73\4\uffff\1\71\16\uffff\1\72",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\105\1\104",
			"\1\107\1\110",
			"\1\112",
			"\1\114\21\uffff\1\115",
			"\1\117\17\uffff\1\120",
			"\1\122",
			"\1\126\4\uffff\1\125\15\uffff\1\124",
			"\1\130",
			"",
			"\1\132",
			"\1\134",
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
			"\1\53\1\uffff\12\53",
			"\1\53\1\uffff\12\137",
			"",
			"",
			"",
			"",
			"\1\140",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
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
			"\1\53\1\uffff\12\137",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0088",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u008b",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0094",
			"\1\u0095",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0097",
			"",
			"\1\u0098",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u009a",
			"\1\u009b",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u009d",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00a1",
			"",
			"\1\u00a2",
			"\1\u00a3",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00a5",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00a9",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | LONG_TYPE | DOUBLE_TYPE | SHORT_TYPR | WHILE_ | IF_ | ELSE_ | FOR_ | BREAK_ | CONTINUE_ | SWITCH_ | CASE_ | DEFAULT_ | RETURN_ | MAIN_ | PRINTF_ | SCANF_ | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | LT_OP | GT_OP | PLUS_OP | MINUS_OP | MULTI_OP | DIVID_OP | MOD_OP | COMPL_OP | ASSIGN_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP | MOD_E_OP | AND_OP | OR_OP | BIT_OR_OP | NOT_OP | XOR_OP | COMMA_ | SEMIC_ | COLON_ | QUESTION_ | AMPERSAND_ | SL_BRACK | SR_BRACK | ML_BRACK | MR_BRACK | BL_BRACK | BR_BRACK | PRE_PROCESS | STRING_ | CHAR_ | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | NEW_LINE | WS );";
		}
	}

}
