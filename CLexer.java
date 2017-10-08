// Generated from C.g4 by ANTLR 4.5.3

	import java.io.*;
	import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, FLOAT=4, LONG=5, DOUBLE=6, CHAR=7, VOID=8, SHORT=9, 
		BOOL=10, CONST=11, SIGNED=12, UNSIGNED=13, COMM=14, PRINTF=15, STRUCT=16, 
		INCLUDE=17, RETURN=18, CONTINUE=19, BREAK=20, IF=21, ELSE=22, WHILE=23, 
		FOR=24, LEFTPAR=25, RIGHTPAR=26, LEFTSQ=27, RIGHTSQ=28, LEFTCURL=29, RIGHTCURL=30, 
		ASSIGNMENT=31, LT=32, GT=33, EQ=34, PLUSPLUS=35, MINUSMINUS=36, NEQ=37, 
		GE=38, LE=39, PLUS=40, MINUS=41, MOD=42, ASTERIK=43, DIV=44, HAT=45, NOT=46, 
		TILDA=47, OR=48, AND=49, ANDAND=50, OROR=51, COMMA=52, SEMICOL=53, DOT=54, 
		LSHIFT=55, RSHIFT=56, DIGIT=57, IDENTIFIER=58, IDENTIFIERSTRING=59, DIGITDIGIT=60, 
		WS=61;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "INT", "FLOAT", "LONG", "DOUBLE", "CHAR", "VOID", "SHORT", 
		"BOOL", "CONST", "SIGNED", "UNSIGNED", "COMM", "PRINTF", "STRUCT", "INCLUDE", 
		"RETURN", "CONTINUE", "BREAK", "IF", "ELSE", "WHILE", "FOR", "LEFTPAR", 
		"RIGHTPAR", "LEFTSQ", "RIGHTSQ", "LEFTCURL", "RIGHTCURL", "ASSIGNMENT", 
		"LT", "GT", "EQ", "PLUSPLUS", "MINUSMINUS", "NEQ", "GE", "LE", "PLUS", 
		"MINUS", "MOD", "ASTERIK", "DIV", "HAT", "NOT", "TILDA", "OR", "AND", 
		"ANDAND", "OROR", "COMMA", "SEMICOL", "DOT", "LSHIFT", "RSHIFT", "DIGIT", 
		"IDENTIFIER", "IDENTIFIERSTRING", "DIGITDIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'typedef'", "'\"'", "'int'", "'float'", "'long'", "'double'", "'char'", 
		"'void'", "'short'", "'bool'", "'const'", "'signed'", "'unsigned'", null, 
		"'printf'", "'struct'", "'#include '", "'return'", "'continue'", "'break'", 
		"'if'", "'else'", "'while'", "'for'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "'='", "'<'", "'>'", "'=='", "'++'", "'--'", "'!='", "'>='", "'<='", 
		"'+'", "'-'", "'%'", "'*'", "'/'", "'^'", "'!'", "'~'", "'|'", "'&'", 
		"'&&'", "'||'", "','", "';'", "'.'", "'<<'", "'>>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INT", "FLOAT", "LONG", "DOUBLE", "CHAR", "VOID", "SHORT", 
		"BOOL", "CONST", "SIGNED", "UNSIGNED", "COMM", "PRINTF", "STRUCT", "INCLUDE", 
		"RETURN", "CONTINUE", "BREAK", "IF", "ELSE", "WHILE", "FOR", "LEFTPAR", 
		"RIGHTPAR", "LEFTSQ", "RIGHTSQ", "LEFTCURL", "RIGHTCURL", "ASSIGNMENT", 
		"LT", "GT", "EQ", "PLUSPLUS", "MINUSMINUS", "NEQ", "GE", "LE", "PLUS", 
		"MINUS", "MOD", "ASTERIK", "DIV", "HAT", "NOT", "TILDA", "OR", "AND", 
		"ANDAND", "OROR", "COMMA", "SEMICOL", "DOT", "LSHIFT", "RSHIFT", "DIGIT", 
		"IDENTIFIER", "IDENTIFIERSTRING", "DIGITDIGIT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


		ArrayList<String> globalList = new ArrayList<String>();
		ArrayList<String> newList = new ArrayList<String>();
		ArrayList<String> callers = new ArrayList<String>();
		FileWriter fileWriter;


	public CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2?\u0183\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00cd"+
		"\n\17\f\17\16\17\u00d0\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3("+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\38\39\39\39\3:\6:\u015f\n:\r:\16:\u0160\3;\3;\7;\u0165\n;\f;\16;"+
		"\u0168\13;\3<\6<\u016b\n<\r<\16<\u016c\3=\5=\u0170\n=\3=\6=\u0173\n=\r"+
		"=\16=\u0174\3=\3=\6=\u0179\n=\r=\16=\u017a\3>\6>\u017e\n>\r>\16>\u017f"+
		"\3>\3>\2\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?\3\2\7\4\2\f\f\17\17\3\2\62;\5\2C\\aac|\6\2\62"+
		";C\\aac|\5\2\13\f\17\17\"\"\u018a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0085\3\2\2\2"+
		"\7\u0087\3\2\2\2\t\u008b\3\2\2\2\13\u0091\3\2\2\2\r\u0096\3\2\2\2\17\u009d"+
		"\3\2\2\2\21\u00a2\3\2\2\2\23\u00a7\3\2\2\2\25\u00ad\3\2\2\2\27\u00b2\3"+
		"\2\2\2\31\u00b8\3\2\2\2\33\u00bf\3\2\2\2\35\u00c8\3\2\2\2\37\u00d3\3\2"+
		"\2\2!\u00da\3\2\2\2#\u00e1\3\2\2\2%\u00eb\3\2\2\2\'\u00f2\3\2\2\2)\u00fb"+
		"\3\2\2\2+\u0101\3\2\2\2-\u0104\3\2\2\2/\u0109\3\2\2\2\61\u010f\3\2\2\2"+
		"\63\u0113\3\2\2\2\65\u0115\3\2\2\2\67\u0117\3\2\2\29\u0119\3\2\2\2;\u011b"+
		"\3\2\2\2=\u011d\3\2\2\2?\u011f\3\2\2\2A\u0121\3\2\2\2C\u0123\3\2\2\2E"+
		"\u0125\3\2\2\2G\u0128\3\2\2\2I\u012b\3\2\2\2K\u012e\3\2\2\2M\u0131\3\2"+
		"\2\2O\u0134\3\2\2\2Q\u0137\3\2\2\2S\u0139\3\2\2\2U\u013b\3\2\2\2W\u013d"+
		"\3\2\2\2Y\u013f\3\2\2\2[\u0141\3\2\2\2]\u0143\3\2\2\2_\u0145\3\2\2\2a"+
		"\u0147\3\2\2\2c\u0149\3\2\2\2e\u014b\3\2\2\2g\u014e\3\2\2\2i\u0151\3\2"+
		"\2\2k\u0153\3\2\2\2m\u0155\3\2\2\2o\u0157\3\2\2\2q\u015a\3\2\2\2s\u015e"+
		"\3\2\2\2u\u0162\3\2\2\2w\u016a\3\2\2\2y\u016f\3\2\2\2{\u017d\3\2\2\2}"+
		"~\7v\2\2~\177\7{\2\2\177\u0080\7r\2\2\u0080\u0081\7g\2\2\u0081\u0082\7"+
		"f\2\2\u0082\u0083\7g\2\2\u0083\u0084\7h\2\2\u0084\4\3\2\2\2\u0085\u0086"+
		"\7$\2\2\u0086\6\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a"+
		"\7v\2\2\u008a\b\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7n\2\2\u008d\u008e"+
		"\7q\2\2\u008e\u008f\7c\2\2\u008f\u0090\7v\2\2\u0090\n\3\2\2\2\u0091\u0092"+
		"\7n\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094\u0095\7i\2\2\u0095"+
		"\f\3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098\7q\2\2\u0098\u0099\7w\2\2\u0099"+
		"\u009a\7d\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c\16\3\2\2\2\u009d"+
		"\u009e\7e\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7t\2\2"+
		"\u00a1\20\3\2\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7"+
		"k\2\2\u00a5\u00a6\7f\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9"+
		"\7j\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\24\3\2\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"\u00b1\7n\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7q\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7v\2\2\u00b7\30\3\2\2\2\u00b8"+
		"\u00b9\7u\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7i\2\2\u00bb\u00bc\7p\2\2"+
		"\u00bc\u00bd\7g\2\2\u00bd\u00be\7f\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7"+
		"w\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4"+
		"\7i\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7f\2\2\u00c7"+
		"\34\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00ce\3\2"+
		"\2\2\u00cb\u00cd\n\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\b\17\2\2\u00d2\36\3\2\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5"+
		"\7t\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7h\2\2\u00d9 \3\2\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7v\2\2\u00dc"+
		"\u00dd\7t\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7v\2\2"+
		"\u00e0\"\3\2\2\2\u00e1\u00e2\7%\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p"+
		"\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8"+
		"\7f\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7\"\2\2\u00ea$\3\2\2\2\u00eb\u00ec"+
		"\7t\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7w\2\2\u00ef"+
		"\u00f0\7t\2\2\u00f0\u00f1\7p\2\2\u00f1&\3\2\2\2\u00f2\u00f3\7e\2\2\u00f3"+
		"\u00f4\7q\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7k\2\2"+
		"\u00f7\u00f8\7p\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7g\2\2\u00fa(\3\2\2"+
		"\2\u00fb\u00fc\7d\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff"+
		"\7c\2\2\u00ff\u0100\7m\2\2\u0100*\3\2\2\2\u0101\u0102\7k\2\2\u0102\u0103"+
		"\7h\2\2\u0103,\3\2\2\2\u0104\u0105\7g\2\2\u0105\u0106\7n\2\2\u0106\u0107"+
		"\7u\2\2\u0107\u0108\7g\2\2\u0108.\3\2\2\2\u0109\u010a\7y\2\2\u010a\u010b"+
		"\7j\2\2\u010b\u010c\7k\2\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2\u010e"+
		"\60\3\2\2\2\u010f\u0110\7h\2\2\u0110\u0111\7q\2\2\u0111\u0112\7t\2\2\u0112"+
		"\62\3\2\2\2\u0113\u0114\7*\2\2\u0114\64\3\2\2\2\u0115\u0116\7+\2\2\u0116"+
		"\66\3\2\2\2\u0117\u0118\7]\2\2\u01188\3\2\2\2\u0119\u011a\7_\2\2\u011a"+
		":\3\2\2\2\u011b\u011c\7}\2\2\u011c<\3\2\2\2\u011d\u011e\7\177\2\2\u011e"+
		">\3\2\2\2\u011f\u0120\7?\2\2\u0120@\3\2\2\2\u0121\u0122\7>\2\2\u0122B"+
		"\3\2\2\2\u0123\u0124\7@\2\2\u0124D\3\2\2\2\u0125\u0126\7?\2\2\u0126\u0127"+
		"\7?\2\2\u0127F\3\2\2\2\u0128\u0129\7-\2\2\u0129\u012a\7-\2\2\u012aH\3"+
		"\2\2\2\u012b\u012c\7/\2\2\u012c\u012d\7/\2\2\u012dJ\3\2\2\2\u012e\u012f"+
		"\7#\2\2\u012f\u0130\7?\2\2\u0130L\3\2\2\2\u0131\u0132\7@\2\2\u0132\u0133"+
		"\7?\2\2\u0133N\3\2\2\2\u0134\u0135\7>\2\2\u0135\u0136\7?\2\2\u0136P\3"+
		"\2\2\2\u0137\u0138\7-\2\2\u0138R\3\2\2\2\u0139\u013a\7/\2\2\u013aT\3\2"+
		"\2\2\u013b\u013c\7\'\2\2\u013cV\3\2\2\2\u013d\u013e\7,\2\2\u013eX\3\2"+
		"\2\2\u013f\u0140\7\61\2\2\u0140Z\3\2\2\2\u0141\u0142\7`\2\2\u0142\\\3"+
		"\2\2\2\u0143\u0144\7#\2\2\u0144^\3\2\2\2\u0145\u0146\7\u0080\2\2\u0146"+
		"`\3\2\2\2\u0147\u0148\7~\2\2\u0148b\3\2\2\2\u0149\u014a\7(\2\2\u014ad"+
		"\3\2\2\2\u014b\u014c\7(\2\2\u014c\u014d\7(\2\2\u014df\3\2\2\2\u014e\u014f"+
		"\7~\2\2\u014f\u0150\7~\2\2\u0150h\3\2\2\2\u0151\u0152\7.\2\2\u0152j\3"+
		"\2\2\2\u0153\u0154\7=\2\2\u0154l\3\2\2\2\u0155\u0156\7\60\2\2\u0156n\3"+
		"\2\2\2\u0157\u0158\7>\2\2\u0158\u0159\7>\2\2\u0159p\3\2\2\2\u015a\u015b"+
		"\7@\2\2\u015b\u015c\7@\2\2\u015cr\3\2\2\2\u015d\u015f\t\3\2\2\u015e\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"t\3\2\2\2\u0162\u0166\t\4\2\2\u0163\u0165\t\5\2\2\u0164\u0163\3\2\2\2"+
		"\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167v\3"+
		"\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\t\5\2\2\u016a\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dx\3\2\2\2"+
		"\u016e\u0170\7/\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172"+
		"\3\2\2\2\u0171\u0173\t\3\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\13"+
		"\2\2\2\u0177\u0179\t\3\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017bz\3\2\2\2\u017c\u017e\t\6\2\2"+
		"\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\b>\2\2\u0182|\3\2\2\2\13\2\u00ce"+
		"\u0160\u0166\u016c\u016f\u0174\u017a\u017f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}