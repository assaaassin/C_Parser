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
		T__0=1, INT=2, FLOAT=3, LONG=4, DOUBLE=5, CHAR=6, VOID=7, SHORT=8, BOOL=9, 
		CONST=10, SIGNED=11, UNSIGNED=12, COMM=13, PRINTF=14, INCLUDE=15, RETURN=16, 
		CONTINUE=17, BREAK=18, IF=19, ELSE=20, WHILE=21, FOR=22, LEFTPAR=23, RIGHTPAR=24, 
		LEFTSQ=25, RIGHTSQ=26, LEFTCURL=27, RIGHTCURL=28, ASSIGNMENT=29, LT=30, 
		GT=31, EQ=32, PLUSPLUS=33, MINUSMINUS=34, NEQ=35, GE=36, LE=37, PLUS=38, 
		MINUS=39, MOD=40, ASTERIK=41, DIV=42, HAT=43, NOT=44, TILDA=45, OR=46, 
		AND=47, ANDAND=48, OROR=49, COMMA=50, SEMICOL=51, DOT=52, LSHIFT=53, RSHIFT=54, 
		DIGIT=55, IDENTIFIER=56, IDENTIFIERSTRING=57, DIGITDIGIT=58, WS=59;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "INT", "FLOAT", "LONG", "DOUBLE", "CHAR", "VOID", "SHORT", "BOOL", 
		"CONST", "SIGNED", "UNSIGNED", "COMM", "PRINTF", "INCLUDE", "RETURN", 
		"CONTINUE", "BREAK", "IF", "ELSE", "WHILE", "FOR", "LEFTPAR", "RIGHTPAR", 
		"LEFTSQ", "RIGHTSQ", "LEFTCURL", "RIGHTCURL", "ASSIGNMENT", "LT", "GT", 
		"EQ", "PLUSPLUS", "MINUSMINUS", "NEQ", "GE", "LE", "PLUS", "MINUS", "MOD", 
		"ASTERIK", "DIV", "HAT", "NOT", "TILDA", "OR", "AND", "ANDAND", "OROR", 
		"COMMA", "SEMICOL", "DOT", "LSHIFT", "RSHIFT", "DIGIT", "IDENTIFIER", 
		"IDENTIFIERSTRING", "DIGITDIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", "'int'", "'float'", "'long'", "'double'", "'char'", "'void'", 
		"'short'", "'bool'", "'const'", "'signed'", "'unsigned'", null, "'printf'", 
		"'#include '", "'return'", "'continue'", "'break'", "'if'", "'else'", 
		"'while'", "'for'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'='", "'<'", 
		"'>'", "'=='", "'++'", "'--'", "'!='", "'>='", "'<='", "'+'", "'-'", "'%'", 
		"'*'", "'/'", "'^'", "'!'", "'~'", "'|'", "'&'", "'&&'", "'||'", "','", 
		"';'", "'.'", "'<<'", "'>>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "INT", "FLOAT", "LONG", "DOUBLE", "CHAR", "VOID", "SHORT", 
		"BOOL", "CONST", "SIGNED", "UNSIGNED", "COMM", "PRINTF", "INCLUDE", "RETURN", 
		"CONTINUE", "BREAK", "IF", "ELSE", "WHILE", "FOR", "LEFTPAR", "RIGHTPAR", 
		"LEFTSQ", "RIGHTSQ", "LEFTCURL", "RIGHTCURL", "ASSIGNMENT", "LT", "GT", 
		"EQ", "PLUSPLUS", "MINUSMINUS", "NEQ", "GE", "LE", "PLUS", "MINUS", "MOD", 
		"ASTERIK", "DIV", "HAT", "NOT", "TILDA", "OR", "AND", "ANDAND", "OROR", 
		"COMMA", "SEMICOL", "DOT", "LSHIFT", "RSHIFT", "DIGIT", "IDENTIFIER", 
		"IDENTIFIERSTRING", "DIGITDIGIT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u0170\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\7\16\u00c1\n\16\f\16\16\16\u00c4\13\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\38\68\u014c\n8\r8\168\u014d\39\39\79\u0152\n9\f9\169\u0155"+
		"\139\3:\6:\u0158\n:\r:\16:\u0159\3;\5;\u015d\n;\3;\6;\u0160\n;\r;\16;"+
		"\u0161\3;\3;\6;\u0166\n;\r;\16;\u0167\3<\6<\u016b\n<\r<\16<\u016c\3<\3"+
		"<\2\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q:s;u<w=\3\2\7\4\2\f\f\17\17\3\2\62;\5\2C\\aac|\6\2\62;C\\aac"+
		"|\5\2\13\f\17\17\"\"\u0177\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7\177\3\2\2\2\t\u0085\3\2\2\2\13\u008a"+
		"\3\2\2\2\r\u0091\3\2\2\2\17\u0096\3\2\2\2\21\u009b\3\2\2\2\23\u00a1\3"+
		"\2\2\2\25\u00a6\3\2\2\2\27\u00ac\3\2\2\2\31\u00b3\3\2\2\2\33\u00bc\3\2"+
		"\2\2\35\u00c7\3\2\2\2\37\u00ce\3\2\2\2!\u00d8\3\2\2\2#\u00df\3\2\2\2%"+
		"\u00e8\3\2\2\2\'\u00ee\3\2\2\2)\u00f1\3\2\2\2+\u00f6\3\2\2\2-\u00fc\3"+
		"\2\2\2/\u0100\3\2\2\2\61\u0102\3\2\2\2\63\u0104\3\2\2\2\65\u0106\3\2\2"+
		"\2\67\u0108\3\2\2\29\u010a\3\2\2\2;\u010c\3\2\2\2=\u010e\3\2\2\2?\u0110"+
		"\3\2\2\2A\u0112\3\2\2\2C\u0115\3\2\2\2E\u0118\3\2\2\2G\u011b\3\2\2\2I"+
		"\u011e\3\2\2\2K\u0121\3\2\2\2M\u0124\3\2\2\2O\u0126\3\2\2\2Q\u0128\3\2"+
		"\2\2S\u012a\3\2\2\2U\u012c\3\2\2\2W\u012e\3\2\2\2Y\u0130\3\2\2\2[\u0132"+
		"\3\2\2\2]\u0134\3\2\2\2_\u0136\3\2\2\2a\u0138\3\2\2\2c\u013b\3\2\2\2e"+
		"\u013e\3\2\2\2g\u0140\3\2\2\2i\u0142\3\2\2\2k\u0144\3\2\2\2m\u0147\3\2"+
		"\2\2o\u014b\3\2\2\2q\u014f\3\2\2\2s\u0157\3\2\2\2u\u015c\3\2\2\2w\u016a"+
		"\3\2\2\2yz\7$\2\2z\4\3\2\2\2{|\7k\2\2|}\7p\2\2}~\7v\2\2~\6\3\2\2\2\177"+
		"\u0080\7h\2\2\u0080\u0081\7n\2\2\u0081\u0082\7q\2\2\u0082\u0083\7c\2\2"+
		"\u0083\u0084\7v\2\2\u0084\b\3\2\2\2\u0085\u0086\7n\2\2\u0086\u0087\7q"+
		"\2\2\u0087\u0088\7p\2\2\u0088\u0089\7i\2\2\u0089\n\3\2\2\2\u008a\u008b"+
		"\7f\2\2\u008b\u008c\7q\2\2\u008c\u008d\7w\2\2\u008d\u008e\7d\2\2\u008e"+
		"\u008f\7n\2\2\u008f\u0090\7g\2\2\u0090\f\3\2\2\2\u0091\u0092\7e\2\2\u0092"+
		"\u0093\7j\2\2\u0093\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095\16\3\2\2\2\u0096"+
		"\u0097\7x\2\2\u0097\u0098\7q\2\2\u0098\u0099\7k\2\2\u0099\u009a\7f\2\2"+
		"\u009a\20\3\2\2\2\u009b\u009c\7u\2\2\u009c\u009d\7j\2\2\u009d\u009e\7"+
		"q\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7v\2\2\u00a0\22\3\2\2\2\u00a1\u00a2"+
		"\7d\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7n\2\2\u00a5"+
		"\24\3\2\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7u\2\2\u00aa\u00ab\7v\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7u\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7i\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\u00b2\7f\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7"+
		"p\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7i\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7f\2\2\u00bb\32\3\2\2\2\u00bc\u00bd"+
		"\7\61\2\2\u00bd\u00be\7\61\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c1\n\2\2\2"+
		"\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\b\16\2\2"+
		"\u00c6\34\3\2\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7"+
		"k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7h\2\2\u00cd\36"+
		"\3\2\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1"+
		"\u00d2\7e\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7f\2\2"+
		"\u00d5\u00d6\7g\2\2\u00d6\u00d7\7\"\2\2\u00d7 \3\2\2\2\u00d8\u00d9\7t"+
		"\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7p\2\2\u00de\"\3\2\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1"+
		"\7q\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7k\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7g\2\2\u00e7$\3\2\2\2\u00e8"+
		"\u00e9\7d\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7c\2\2"+
		"\u00ec\u00ed\7m\2\2\u00ed&\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7h\2"+
		"\2\u00f0(\3\2\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7"+
		"u\2\2\u00f4\u00f5\7g\2\2\u00f5*\3\2\2\2\u00f6\u00f7\7y\2\2\u00f7\u00f8"+
		"\7j\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		",\3\2\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7t\2\2\u00ff"+
		".\3\2\2\2\u0100\u0101\7*\2\2\u0101\60\3\2\2\2\u0102\u0103\7+\2\2\u0103"+
		"\62\3\2\2\2\u0104\u0105\7]\2\2\u0105\64\3\2\2\2\u0106\u0107\7_\2\2\u0107"+
		"\66\3\2\2\2\u0108\u0109\7}\2\2\u01098\3\2\2\2\u010a\u010b\7\177\2\2\u010b"+
		":\3\2\2\2\u010c\u010d\7?\2\2\u010d<\3\2\2\2\u010e\u010f\7>\2\2\u010f>"+
		"\3\2\2\2\u0110\u0111\7@\2\2\u0111@\3\2\2\2\u0112\u0113\7?\2\2\u0113\u0114"+
		"\7?\2\2\u0114B\3\2\2\2\u0115\u0116\7-\2\2\u0116\u0117\7-\2\2\u0117D\3"+
		"\2\2\2\u0118\u0119\7/\2\2\u0119\u011a\7/\2\2\u011aF\3\2\2\2\u011b\u011c"+
		"\7#\2\2\u011c\u011d\7?\2\2\u011dH\3\2\2\2\u011e\u011f\7@\2\2\u011f\u0120"+
		"\7?\2\2\u0120J\3\2\2\2\u0121\u0122\7>\2\2\u0122\u0123\7?\2\2\u0123L\3"+
		"\2\2\2\u0124\u0125\7-\2\2\u0125N\3\2\2\2\u0126\u0127\7/\2\2\u0127P\3\2"+
		"\2\2\u0128\u0129\7\'\2\2\u0129R\3\2\2\2\u012a\u012b\7,\2\2\u012bT\3\2"+
		"\2\2\u012c\u012d\7\61\2\2\u012dV\3\2\2\2\u012e\u012f\7`\2\2\u012fX\3\2"+
		"\2\2\u0130\u0131\7#\2\2\u0131Z\3\2\2\2\u0132\u0133\7\u0080\2\2\u0133\\"+
		"\3\2\2\2\u0134\u0135\7~\2\2\u0135^\3\2\2\2\u0136\u0137\7(\2\2\u0137`\3"+
		"\2\2\2\u0138\u0139\7(\2\2\u0139\u013a\7(\2\2\u013ab\3\2\2\2\u013b\u013c"+
		"\7~\2\2\u013c\u013d\7~\2\2\u013dd\3\2\2\2\u013e\u013f\7.\2\2\u013ff\3"+
		"\2\2\2\u0140\u0141\7=\2\2\u0141h\3\2\2\2\u0142\u0143\7\60\2\2\u0143j\3"+
		"\2\2\2\u0144\u0145\7>\2\2\u0145\u0146\7>\2\2\u0146l\3\2\2\2\u0147\u0148"+
		"\7@\2\2\u0148\u0149\7@\2\2\u0149n\3\2\2\2\u014a\u014c\t\3\2\2\u014b\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"p\3\2\2\2\u014f\u0153\t\4\2\2\u0150\u0152\t\5\2\2\u0151\u0150\3\2\2\2"+
		"\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154r\3"+
		"\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\t\5\2\2\u0157\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015at\3\2\2\2"+
		"\u015b\u015d\7/\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f"+
		"\3\2\2\2\u015e\u0160\t\3\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\13"+
		"\2\2\2\u0164\u0166\t\3\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168v\3\2\2\2\u0169\u016b\t\6\2\2"+
		"\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b<\2\2\u016fx\3\2\2\2\13\2\u00c2"+
		"\u014d\u0153\u0159\u015c\u0161\u0167\u016c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}