// Generated from C.g4 by ANTLR 4.5.3

	import java.io.*;
	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
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
	public static final int
		RULE_codefile = 0, RULE_lines = 1, RULE_struct = 2, RULE_printfStatement = 3, 
		RULE_ignoreComments = 4, RULE_returnStatement = 5, RULE_declareVariable = 6, 
		RULE_breakStatement = 7, RULE_continueStatement = 8, RULE_include = 9, 
		RULE_forloop = 10, RULE_whileloop = 11, RULE_ifstatement = 12, RULE_arraydeclaration = 13, 
		RULE_expression = 14, RULE_assignment = 15, RULE_funcDeclare = 16, RULE_argumentlist = 17, 
		RULE_argument = 18, RULE_funcDefinition = 19, RULE_funcCall = 20, RULE_calllist = 21, 
		RULE_call = 22, RULE_digitorid = 23, RULE_alltypes = 24, RULE_everyexp = 25;
	public static final String[] ruleNames = {
		"codefile", "lines", "struct", "printfStatement", "ignoreComments", "returnStatement", 
		"declareVariable", "breakStatement", "continueStatement", "include", "forloop", 
		"whileloop", "ifstatement", "arraydeclaration", "expression", "assignment", 
		"funcDeclare", "argumentlist", "argument", "funcDefinition", "funcCall", 
		"calllist", "call", "digitorid", "alltypes", "everyexp"
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

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		ArrayList<String> globalList = new ArrayList<String>();
		ArrayList<String> newList = new ArrayList<String>();
		ArrayList<String> callers = new ArrayList<String>();
		FileWriter fileWriter;

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodefileContext extends ParserRuleContext {
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public CodefileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codefile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCodefile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCodefile(this);
		}
	}

	public final CodefileContext codefile() throws RecognitionException {
		CodefileContext _localctx = new CodefileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codefile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			lines();
			}
			_ctx.stop = _input.LT(-1);

				try {
					fileWriter = new FileWriter("output.DOT");
				}
				catch (IOException e){
					System.out.println("fileWriter failed");
				}
				PrintWriter printWriter = new PrintWriter(fileWriter);
				printWriter.print("digraph x{\n");
				Collections.reverse(globalList);
				for (int i=0; i<globalList.size();i++){
					if (globalList.get(i).equals("Defined main")){
						for (int j=i;j<globalList.size();j++){
							newList.add(globalList.get(j));
						}
					}
				}
				for (String s: newList){
					if (s.split(" ")[0].equals("Defined")){
						callers.add(s.split(" ")[1]);
					}
				}
				System.out.println("Starting generating callgraph");
				int counter = 1;
				int callerIndex = 0;
				String callerFunc = "";
				while (counter < newList.size()){
					while (newList.get(counter).split(" ")[0].equals("Called")){
						printWriter.write(callers.get(callerIndex)+"->"+newList.get(counter).split(" ")[1]+"\n");
						counter++;
					}
					callerIndex++;
					counter++;
				}
				printWriter.write("}");
				printWriter.close();

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinesContext extends ParserRuleContext {
		public DeclareVariableContext declareVariable() {
			return getRuleContext(DeclareVariableContext.class,0);
		}
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FuncDeclareContext funcDeclare() {
			return getRuleContext(FuncDeclareContext.class,0);
		}
		public FuncDefinitionContext funcDefinition() {
			return getRuleContext(FuncDefinitionContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public IgnoreCommentsContext ignoreComments() {
			return getRuleContext(IgnoreCommentsContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ArraydeclarationContext arraydeclaration() {
			return getRuleContext(ArraydeclarationContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PrintfStatementContext printfStatement() {
			return getRuleContext(PrintfStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLines(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lines);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				declareVariable();
				setState(55);
				lines();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				include();
				setState(58);
				lines();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				forloop();
				setState(61);
				lines();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				assignment();
				setState(64);
				lines();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				funcDeclare();
				setState(67);
				lines();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				funcDefinition();
				setState(70);
				lines();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				funcCall();
				setState(73);
				lines();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				ignoreComments();
				setState(76);
				lines();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				whileloop();
				setState(79);
				lines();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(81);
				ifstatement();
				setState(82);
				lines();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(84);
				arraydeclaration();
				setState(85);
				lines();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(87);
				returnStatement();
				setState(88);
				lines();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(90);
				printfStatement();
				setState(91);
				lines();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(93);
				breakStatement();
				setState(94);
				lines();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(96);
				continueStatement();
				setState(97);
				lines();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(99);
				struct();
				setState(100);
				lines();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CParser.STRUCT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CParser.IDENTIFIER, i);
		}
		public TerminalNode LEFTCURL() { return getToken(CParser.LEFTCURL, 0); }
		public TerminalNode RIGHTCURL() { return getToken(CParser.RIGHTCURL, 0); }
		public TerminalNode SEMICOL() { return getToken(CParser.SEMICOL, 0); }
		public List<DeclareVariableContext> declareVariable() {
			return getRuleContexts(DeclareVariableContext.class);
		}
		public DeclareVariableContext declareVariable(int i) {
			return getRuleContext(DeclareVariableContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_struct);
		int _la;
		try {
			setState(131);
			switch (_input.LA(1)) {
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(STRUCT);
				setState(106);
				match(IDENTIFIER);
				setState(107);
				match(LEFTCURL);
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(108);
						declareVariable();
						}
						break;
					case 2:
						{
						setState(109);
						assignment();
						}
						break;
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << BOOL) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << ASTERIK) | (1L << IDENTIFIER))) != 0) );
				setState(114);
				match(RIGHTCURL);
				setState(115);
				match(SEMICOL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__0);
				setState(118);
				match(STRUCT);
				setState(119);
				match(IDENTIFIER);
				setState(120);
				match(LEFTCURL);
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(121);
						declareVariable();
						}
						break;
					case 2:
						{
						setState(122);
						assignment();
						}
						break;
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << BOOL) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << ASTERIK) | (1L << IDENTIFIER))) != 0) );
				setState(127);
				match(RIGHTCURL);
				setState(128);
				match(IDENTIFIER);
				setState(129);
				match(SEMICOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintfStatementContext extends ParserRuleContext {
		public Token PRINTF;
		public TerminalNode PRINTF() { return getToken(CParser.PRINTF, 0); }
		public TerminalNode LEFTPAR() { return getToken(CParser.LEFTPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(CParser.RIGHTPAR, 0); }
		public TerminalNode SEMICOL() { return getToken(CParser.SEMICOL, 0); }
		public PrintfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterPrintfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitPrintfStatement(this);
		}
	}

	public final PrintfStatementContext printfStatement() throws RecognitionException {
		PrintfStatementContext _localctx = new PrintfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((PrintfStatementContext)_localctx).PRINTF = match(PRINTF);
			setState(134);
			match(LEFTPAR);
			setState(135);
			expression();
			setState(136);
			match(RIGHTPAR);
			setState(137);
			match(SEMICOL);
			 globalList.add("Called "+ ((PrintfStatementContext)_localctx).PRINTF.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoreCommentsContext extends ParserRuleContext {
		public TerminalNode COMM() { return getToken(CParser.COMM, 0); }
		public IgnoreCommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoreComments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIgnoreComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIgnoreComments(this);
		}
	}

	public final IgnoreCommentsContext ignoreComments() throws RecognitionException {
		IgnoreCommentsContext _localctx = new IgnoreCommentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ignoreComments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(COMM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CParser.RETURN, 0); }
		public TerminalNode SEMICOL() { return getToken(CParser.SEMICOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(RETURN);
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(143);
				expression();
				}
				break;
			case 2:
				{
				setState(144);
				funcCall();
				}
				break;
			}
			setState(147);
			match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareVariableContext extends ParserRuleContext {
		public AlltypesContext alltypes() {
			return getRuleContext(AlltypesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOL() { return getToken(CParser.SEMICOL, 0); }
		public TerminalNode ASTERIK() { return getToken(CParser.ASTERIK, 0); }
		public DeclareVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclareVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclareVariable(this);
		}
	}

	public final DeclareVariableContext declareVariable() throws RecognitionException {
		DeclareVariableContext _localctx = new DeclareVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declareVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			alltypes();
			setState(151);
			_la = _input.LA(1);
			if (_la==ASTERIK) {
				{
				setState(150);
				match(ASTERIK);
				}
			}

			setState(153);
			match(IDENTIFIER);
			setState(154);
			match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CParser.BREAK, 0); }
		public TerminalNode SEMICOL() { return getToken(CParser.SEMICOL, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(BREAK);
			setState(157);
			match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(CParser.CONTINUE, 0); }
		public TerminalNode SEMICOL() { return getToken(CParser.SEMICOL, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(CONTINUE);
			setState(160);
			match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(CParser.INCLUDE, 0); }
		public TerminalNode LT() { return getToken(CParser.LT, 0); }
		public TerminalNode GT() { return getToken(CParser.GT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CParser.IDENTIFIER, i);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_include);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(INCLUDE);
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==LT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(164);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				{
				setState(165);
				match(IDENTIFIER);
				setState(166);
				matchWildcard();
				setState(167);
				match(IDENTIFIER);
				}
				}
				break;
			}
			setState(170);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==GT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CParser.FOR, 0); }
		public TerminalNode LEFTPAR() { return getToken(CParser.LEFTPAR, 0); }
		public List<TerminalNode> SEMICOL() { return getTokens(CParser.SEMICOL); }
		public TerminalNode SEMICOL(int i) {
			return getToken(CParser.SEMICOL, i);
		}
		public TerminalNode RIGHTPAR() { return getToken(CParser.RIGHTPAR, 0); }
		public TerminalNode LEFTCURL() { return getToken(CParser.LEFTCURL, 0); }
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public TerminalNode RIGHTCURL() { return getToken(CParser.RIGHTCURL, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitForloop(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(FOR);
			setState(173);
			match(LEFTPAR);
			setState(175);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << CHAR) | (1L << SHORT) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << ASTERIK) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(174);
				assignment();
				}
			}

			setState(177);
			match(SEMICOL);
			setState(179);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASTERIK) | (1L << DIGIT) | (1L << IDENTIFIER) | (1L << DIGITDIGIT))) != 0)) {
				{
				setState(178);
				expression();
				}
			}

			setState(181);
			match(SEMICOL);
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(183);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASTERIK) | (1L << DIGIT) | (1L << IDENTIFIER) | (1L << DIGITDIGIT))) != 0)) {
					{
					setState(182);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(185);
				assignment();
				}
				break;
			}
			setState(188);
			match(RIGHTPAR);
			setState(189);
			match(LEFTCURL);
			setState(190);
			lines();
			setState(191);
			match(RIGHTCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CParser.WHILE, 0); }
		public TerminalNode LEFTPAR() { return getToken(CParser.LEFTPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(CParser.RIGHTPAR, 0); }
		public TerminalNode LEFTCURL() { return getToken(CParser.LEFTCURL, 0); }
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public TerminalNode RIGHTCURL() { return getToken(CParser.RIGHTCURL, 0); }
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitWhileloop(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(WHILE);
			setState(194);
			match(LEFTPAR);
			setState(195);
			expression();
			setState(196);
			match(RIGHTPAR);
			setState(197);
			match(LEFTCURL);
			setState(198);
			lines();
			setState(199);
			match(RIGHTCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(CParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(CParser.IF, i);
		}
		public List<TerminalNode> LEFTPAR() { return getTokens(CParser.LEFTPAR); }
		public TerminalNode LEFTPAR(int i) {
			return getToken(CParser.LEFTPAR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHTPAR() { return getTokens(CParser.RIGHTPAR); }
		public TerminalNode RIGHTPAR(int i) {
			return getToken(CParser.RIGHTPAR, i);
		}
		public List<TerminalNode> LEFTCURL() { return getTokens(CParser.LEFTCURL); }
		public TerminalNode LEFTCURL(int i) {
			return getToken(CParser.LEFTCURL, i);
		}
		public List<LinesContext> lines() {
			return getRuleContexts(LinesContext.class);
		}
		public LinesContext lines(int i) {
			return getRuleContext(LinesContext.class,i);
		}
		public List<TerminalNode> RIGHTCURL() { return getTokens(CParser.RIGHTCURL); }
		public TerminalNode RIGHTCURL(int i) {
			return getToken(CParser.RIGHTCURL, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(CParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CParser.ELSE, i);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifstatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(IF);
			setState(202);
			match(LEFTPAR);
			setState(203);
			expression();
			setState(204);
			match(RIGHTPAR);
			setState(205);
			match(LEFTCURL);
			setState(206);
			lines();
			setState(207);
			match(RIGHTCURL);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(ELSE);
					setState(209);
					match(IF);
					setState(210);
					match(LEFTPAR);
					setState(211);
					expression();
					setState(212);
					match(RIGHTPAR);
					setState(213);
					match(LEFTCURL);
					setState(214);
					lines();
					setState(215);
					match(RIGHTCURL);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(227);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(222);
				match(ELSE);
				setState(223);
				match(LEFTCURL);
				setState(224);
				lines();
				setState(225);
				match(RIGHTCURL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraydeclarationContext extends ParserRuleContext {
		public AlltypesContext alltypes() {
			return getRuleContext(AlltypesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode LEFTSQ() { return getToken(CParser.LEFTSQ, 0); }
		public DigitoridContext digitorid() {
			return getRuleContext(DigitoridContext.class,0);
		}
		public TerminalNode RIGHTSQ() { return getToken(CParser.RIGHTSQ, 0); }
		public TerminalNode SEMICOL() { return getToken(CParser.SEMICOL, 0); }
		public TerminalNode ASTERIK() { return getToken(CParser.ASTERIK, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(CParser.ASSIGNMENT, 0); }
		public TerminalNode LEFTCURL() { return getToken(CParser.LEFTCURL, 0); }
		public CalllistContext calllist() {
			return getRuleContext(CalllistContext.class,0);
		}
		public TerminalNode RIGHTCURL() { return getToken(CParser.RIGHTCURL, 0); }
		public ArraydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArraydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArraydeclaration(this);
		}
	}

	public final ArraydeclarationContext arraydeclaration() throws RecognitionException {
		ArraydeclarationContext _localctx = new ArraydeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arraydeclaration);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				alltypes();
				setState(231);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(230);
					match(ASTERIK);
					}
				}

				setState(233);
				match(IDENTIFIER);
				setState(234);
				match(LEFTSQ);
				setState(235);
				digitorid();
				setState(236);
				match(RIGHTSQ);
				setState(237);
				match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				alltypes();
				setState(241);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(240);
					match(ASTERIK);
					}
				}

				setState(243);
				match(IDENTIFIER);
				setState(244);
				match(LEFTSQ);
				setState(245);
				digitorid();
				setState(246);
				match(RIGHTSQ);
				setState(247);
				match(ASSIGNMENT);
				setState(248);
				match(LEFTCURL);
				setState(249);
				calllist();
				setState(250);
				match(RIGHTCURL);
				setState(251);
				match(SEMICOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode DIGITDIGIT() { return getToken(CParser.DIGITDIGIT, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(CParser.DIGIT, 0); }
		public List<EveryexpContext> everyexp() {
			return getRuleContexts(EveryexpContext.class);
		}
		public EveryexpContext everyexp(int i) {
			return getRuleContext(EveryexpContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ASTERIK() { return getTokens(CParser.ASTERIK); }
		public TerminalNode ASTERIK(int i) {
			return getToken(CParser.ASTERIK, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(256);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(255);
					match(ASTERIK);
					}
				}

				setState(258);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(259);
				match(DIGITDIGIT);
				}
				break;
			case 3:
				{
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						match(ASTERIK);
						}
						} 
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(266);
				funcCall();
				}
				break;
			case 4:
				{
				setState(267);
				match(DIGIT);
				}
				break;
			}
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					everyexp();
					setState(271);
					expression();
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CParser.ASSIGNMENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASTERIK() { return getToken(CParser.ASTERIK, 0); }
		public List<TerminalNode> SEMICOL() { return getTokens(CParser.SEMICOL); }
		public TerminalNode SEMICOL(int i) {
			return getToken(CParser.SEMICOL, i);
		}
		public List<TerminalNode> INT() { return getTokens(CParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(CParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(CParser.DOUBLE, i);
		}
		public List<TerminalNode> LONG() { return getTokens(CParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(CParser.LONG, i);
		}
		public List<TerminalNode> SHORT() { return getTokens(CParser.SHORT); }
		public TerminalNode SHORT(int i) {
			return getToken(CParser.SHORT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(CParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(CParser.FLOAT, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(CParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(CParser.CHAR, i);
		}
		public TerminalNode LEFTSQ() { return getToken(CParser.LEFTSQ, 0); }
		public TerminalNode RIGHTSQ() { return getToken(CParser.RIGHTSQ, 0); }
		public TerminalNode PLUSPLUS() { return getToken(CParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(CParser.MINUSMINUS, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		int _la;
		try {
			int _alt;
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << SHORT))) != 0)) {
					{
					{
					setState(278);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << SHORT))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(284);
					match(ASTERIK);
					}
				}

				setState(287);
				match(IDENTIFIER);
				setState(288);
				match(ASSIGNMENT);
				setState(289);
				expression();
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(290);
					match(SEMICOL);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CHAR) {
					{
					{
					setState(293);
					match(CHAR);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(299);
					match(ASTERIK);
					}
				}

				setState(302);
				match(IDENTIFIER);
				setState(303);
				match(ASSIGNMENT);
				setState(308);
				switch (_input.LA(1)) {
				case T__1:
					{
					{
					setState(304);
					match(T__1);
					setState(305);
					match(IDENTIFIER);
					setState(306);
					match(T__1);
					}
					}
					break;
				case IDENTIFIER:
					{
					setState(307);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(310);
						match(SEMICOL);
						}
						} 
					}
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(316);
					match(ASTERIK);
					}
				}

				setState(319);
				match(IDENTIFIER);
				setState(320);
				match(LEFTSQ);
				setState(321);
				expression();
				setState(322);
				match(RIGHTSQ);
				setState(323);
				match(ASSIGNMENT);
				setState(324);
				expression();
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						match(SEMICOL);
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				match(IDENTIFIER);
				setState(332);
				match(PLUSPLUS);
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(333);
					match(SEMICOL);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				match(IDENTIFIER);
				setState(337);
				match(MINUSMINUS);
				setState(339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(338);
					match(SEMICOL);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				match(PLUSPLUS);
				setState(342);
				match(IDENTIFIER);
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(343);
					match(SEMICOL);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				match(MINUSMINUS);
				setState(347);
				match(IDENTIFIER);
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(348);
					match(SEMICOL);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclareContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public AlltypesContext alltypes() {
			return getRuleContext(AlltypesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode LEFTPAR() { return getToken(CParser.LEFTPAR, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(CParser.RIGHTPAR, 0); }
		public TerminalNode SEMICOL() { return getToken(CParser.SEMICOL, 0); }
		public FuncDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFuncDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFuncDeclare(this);
		}
	}

	public final FuncDeclareContext funcDeclare() throws RecognitionException {
		FuncDeclareContext _localctx = new FuncDeclareContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcDeclare);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				alltypes();
				setState(354);
				((FuncDeclareContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(355);
				match(LEFTPAR);
				setState(356);
				argumentlist();
				setState(357);
				match(RIGHTPAR);
				setState(358);
				match(SEMICOL);
				globalList.add("Declared "+ ((FuncDeclareContext)_localctx).IDENTIFIER.getText());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				alltypes();
				setState(362);
				((FuncDeclareContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(363);
				match(LEFTPAR);
				setState(364);
				match(RIGHTPAR);
				setState(365);
				match(SEMICOL);
				globalList.add("Declared "+ ((FuncDeclareContext)_localctx).IDENTIFIER.getText());
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentlistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CParser.COMMA, i);
		}
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArgumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArgumentlist(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argumentlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(370);
			argument();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				setState(372);
				argument();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public AlltypesContext alltypes() {
			return getRuleContext(AlltypesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode AND() { return getToken(CParser.AND, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			alltypes();
			setState(380);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(379);
				match(AND);
				}
			}

			setState(382);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefinitionContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public AlltypesContext alltypes() {
			return getRuleContext(AlltypesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode LEFTPAR() { return getToken(CParser.LEFTPAR, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(CParser.RIGHTPAR, 0); }
		public TerminalNode LEFTCURL() { return getToken(CParser.LEFTCURL, 0); }
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public TerminalNode RIGHTCURL() { return getToken(CParser.RIGHTCURL, 0); }
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFuncDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFuncDefinition(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcDefinition);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				alltypes();
				setState(385);
				((FuncDefinitionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(386);
				match(LEFTPAR);
				setState(387);
				argumentlist();
				setState(388);
				match(RIGHTPAR);
				setState(389);
				match(LEFTCURL);
				setState(390);
				lines();
				setState(391);
				match(RIGHTCURL);
				 globalList.add("Defined "+ ((FuncDefinitionContext)_localctx).IDENTIFIER.getText());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				alltypes();
				setState(395);
				((FuncDefinitionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(396);
				match(LEFTPAR);
				setState(397);
				match(RIGHTPAR);
				setState(398);
				match(LEFTCURL);
				setState(399);
				lines();
				setState(400);
				match(RIGHTCURL);
				globalList.add("Defined "+ ((FuncDefinitionContext)_localctx).IDENTIFIER.getText());
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode LEFTPAR() { return getToken(CParser.LEFTPAR, 0); }
		public CalllistContext calllist() {
			return getRuleContext(CalllistContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(CParser.RIGHTPAR, 0); }
		public TerminalNode ASTERIK() { return getToken(CParser.ASTERIK, 0); }
		public List<TerminalNode> SEMICOL() { return getTokens(CParser.SEMICOL); }
		public TerminalNode SEMICOL(int i) {
			return getToken(CParser.SEMICOL, i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcCall);
		int _la;
		try {
			int _alt;
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(405);
					match(ASTERIK);
					}
				}

				setState(408);
				((FuncCallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(409);
				match(LEFTPAR);
				setState(410);
				calllist();
				setState(411);
				match(RIGHTPAR);
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(412);
						match(SEMICOL);
						}
						} 
					}
					setState(417);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				globalList.add("Called "+ ((FuncCallContext)_localctx).IDENTIFIER.getText());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				((FuncCallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(421);
				match(LEFTPAR);
				setState(422);
				match(RIGHTPAR);
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(423);
						match(SEMICOL);
						}
						} 
					}
					setState(428);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				globalList.add("Called "+ ((FuncCallContext)_localctx).IDENTIFIER.getText());
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalllistContext extends ParserRuleContext {
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CParser.COMMA, i);
		}
		public CalllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCalllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCalllist(this);
		}
	}

	public final CalllistContext calllist() throws RecognitionException {
		CalllistContext _localctx = new CalllistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_calllist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(432);
			call();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(433);
				match(COMMA);
				setState(434);
				call();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode DIGITDIGIT() { return getToken(CParser.DIGITDIGIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(CParser.DIGIT, 0); }
		public TerminalNode ASTERIK() { return getToken(CParser.ASTERIK, 0); }
		public TerminalNode AND() { return getToken(CParser.AND, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(441);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(440);
					match(ASTERIK);
					}
				}

				setState(444);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(443);
					match(AND);
					}
				}

				setState(446);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(447);
					match(ASTERIK);
					}
					break;
				}
				setState(450);
				funcCall();
				}
				break;
			case 3:
				{
				setState(451);
				match(DIGITDIGIT);
				}
				break;
			case 4:
				{
				setState(452);
				expression();
				}
				break;
			case 5:
				{
				setState(453);
				match(DIGIT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitoridContext extends ParserRuleContext {
		public TerminalNode DIGITDIGIT() { return getToken(CParser.DIGITDIGIT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public TerminalNode ASTERIK() { return getToken(CParser.ASTERIK, 0); }
		public TerminalNode DIGIT() { return getToken(CParser.DIGIT, 0); }
		public DigitoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDigitorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDigitorid(this);
		}
	}

	public final DigitoridContext digitorid() throws RecognitionException {
		DigitoridContext _localctx = new DigitoridContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_digitorid);
		int _la;
		try {
			setState(462);
			switch (_input.LA(1)) {
			case DIGITDIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(DIGITDIGIT);
				}
				break;
			case ASTERIK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(457);
					match(ASTERIK);
					}
				}

				setState(460);
				match(IDENTIFIER);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(DIGIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlltypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(CParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(CParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CParser.FLOAT, 0); }
		public TerminalNode LONG() { return getToken(CParser.LONG, 0); }
		public TerminalNode SHORT() { return getToken(CParser.SHORT, 0); }
		public TerminalNode BOOL() { return getToken(CParser.BOOL, 0); }
		public TerminalNode VOID() { return getToken(CParser.VOID, 0); }
		public AlltypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alltypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAlltypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAlltypes(this);
		}
	}

	public final AlltypesContext alltypes() throws RecognitionException {
		AlltypesContext _localctx = new AlltypesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alltypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EveryexpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CParser.LT, 0); }
		public TerminalNode GT() { return getToken(CParser.GT, 0); }
		public TerminalNode EQ() { return getToken(CParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(CParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CParser.MINUS, 0); }
		public TerminalNode NEQ() { return getToken(CParser.NEQ, 0); }
		public TerminalNode GE() { return getToken(CParser.GE, 0); }
		public TerminalNode LE() { return getToken(CParser.LE, 0); }
		public TerminalNode MOD() { return getToken(CParser.MOD, 0); }
		public TerminalNode ASTERIK() { return getToken(CParser.ASTERIK, 0); }
		public TerminalNode DIV() { return getToken(CParser.DIV, 0); }
		public TerminalNode HAT() { return getToken(CParser.HAT, 0); }
		public TerminalNode OR() { return getToken(CParser.OR, 0); }
		public TerminalNode AND() { return getToken(CParser.AND, 0); }
		public TerminalNode OROR() { return getToken(CParser.OROR, 0); }
		public TerminalNode ANDAND() { return getToken(CParser.ANDAND, 0); }
		public TerminalNode LSHIFT() { return getToken(CParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(CParser.RSHIFT, 0); }
		public EveryexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_everyexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEveryexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEveryexp(this);
		}
	}

	public final EveryexpContext everyexp() throws RecognitionException {
		EveryexpContext _localctx = new EveryexpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_everyexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << EQ) | (1L << NEQ) | (1L << GE) | (1L << LE) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << ASTERIK) | (1L << DIV) | (1L << HAT) | (1L << OR) | (1L << AND) | (1L << ANDAND) | (1L << OROR) | (1L << LSHIFT) | (1L << RSHIFT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u01d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\3\4\6\4q\n\4\r\4\16\4r\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4~\n\4\r\4\16\4\177\3\4\3\4\3\4\3\4\5\4"+
		"\u0086\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u0094\n"+
		"\7\3\7\3\7\3\b\3\b\5\b\u009a\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ab\n\13\3\13\3\13\3\f\3\f\3\f\5\f"+
		"\u00b2\n\f\3\f\3\f\5\f\u00b6\n\f\3\f\3\f\5\f\u00ba\n\f\3\f\5\f\u00bd\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u00dc\n\16\f\16\16\16\u00df\13\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e6"+
		"\n\16\3\17\3\17\5\17\u00ea\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00f4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0100\n\17\3\20\5\20\u0103\n\20\3\20\3\20\3\20\7\20\u0108\n\20\f\20\16"+
		"\20\u010b\13\20\3\20\3\20\5\20\u010f\n\20\3\20\3\20\3\20\7\20\u0114\n"+
		"\20\f\20\16\20\u0117\13\20\3\21\7\21\u011a\n\21\f\21\16\21\u011d\13\21"+
		"\3\21\5\21\u0120\n\21\3\21\3\21\3\21\3\21\5\21\u0126\n\21\3\21\7\21\u0129"+
		"\n\21\f\21\16\21\u012c\13\21\3\21\5\21\u012f\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0137\n\21\3\21\7\21\u013a\n\21\f\21\16\21\u013d\13\21"+
		"\3\21\5\21\u0140\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0149\n"+
		"\21\f\21\16\21\u014c\13\21\3\21\3\21\3\21\5\21\u0151\n\21\3\21\3\21\3"+
		"\21\5\21\u0156\n\21\3\21\3\21\3\21\5\21\u015b\n\21\3\21\3\21\3\21\5\21"+
		"\u0160\n\21\5\21\u0162\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0173\n\22\3\23\3\23\3\23\7\23"+
		"\u0178\n\23\f\23\16\23\u017b\13\23\3\24\3\24\5\24\u017f\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0196\n\25\3\26\5\26\u0199\n\26\3\26\3"+
		"\26\3\26\3\26\3\26\7\26\u01a0\n\26\f\26\16\26\u01a3\13\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\7\26\u01ab\n\26\f\26\16\26\u01ae\13\26\3\26\5\26\u01b1"+
		"\n\26\3\27\3\27\3\27\7\27\u01b6\n\27\f\27\16\27\u01b9\13\27\3\30\5\30"+
		"\u01bc\n\30\3\30\5\30\u01bf\n\30\3\30\3\30\5\30\u01c3\n\30\3\30\3\30\3"+
		"\30\3\30\5\30\u01c9\n\30\3\31\3\31\5\31\u01cd\n\31\3\31\3\31\5\31\u01d1"+
		"\n\31\3\32\3\32\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\2\7\4\2\4\4\"\"\4\2\4\4##\4\2\5\b\13\13\3\2\5"+
		"\f\6\2\"$\'/\62\659:\u020a\2\66\3\2\2\2\4i\3\2\2\2\6\u0085\3\2\2\2\b\u0087"+
		"\3\2\2\2\n\u008e\3\2\2\2\f\u0090\3\2\2\2\16\u0097\3\2\2\2\20\u009e\3\2"+
		"\2\2\22\u00a1\3\2\2\2\24\u00a4\3\2\2\2\26\u00ae\3\2\2\2\30\u00c3\3\2\2"+
		"\2\32\u00cb\3\2\2\2\34\u00ff\3\2\2\2\36\u010e\3\2\2\2 \u0161\3\2\2\2\""+
		"\u0172\3\2\2\2$\u0174\3\2\2\2&\u017c\3\2\2\2(\u0195\3\2\2\2*\u01b0\3\2"+
		"\2\2,\u01b2\3\2\2\2.\u01c8\3\2\2\2\60\u01d0\3\2\2\2\62\u01d2\3\2\2\2\64"+
		"\u01d4\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\289\5\16\b\29:\5\4\3\2:j\3\2\2"+
		"\2;<\5\24\13\2<=\5\4\3\2=j\3\2\2\2>?\5\26\f\2?@\5\4\3\2@j\3\2\2\2AB\5"+
		" \21\2BC\5\4\3\2Cj\3\2\2\2DE\5\"\22\2EF\5\4\3\2Fj\3\2\2\2GH\5(\25\2HI"+
		"\5\4\3\2Ij\3\2\2\2JK\5*\26\2KL\5\4\3\2Lj\3\2\2\2MN\5\n\6\2NO\5\4\3\2O"+
		"j\3\2\2\2PQ\5\30\r\2QR\5\4\3\2Rj\3\2\2\2ST\5\32\16\2TU\5\4\3\2Uj\3\2\2"+
		"\2VW\5\34\17\2WX\5\4\3\2Xj\3\2\2\2YZ\5\f\7\2Z[\5\4\3\2[j\3\2\2\2\\]\5"+
		"\b\5\2]^\5\4\3\2^j\3\2\2\2_`\5\20\t\2`a\5\4\3\2aj\3\2\2\2bc\5\22\n\2c"+
		"d\5\4\3\2dj\3\2\2\2ef\5\6\4\2fg\5\4\3\2gj\3\2\2\2hj\3\2\2\2i8\3\2\2\2"+
		"i;\3\2\2\2i>\3\2\2\2iA\3\2\2\2iD\3\2\2\2iG\3\2\2\2iJ\3\2\2\2iM\3\2\2\2"+
		"iP\3\2\2\2iS\3\2\2\2iV\3\2\2\2iY\3\2\2\2i\\\3\2\2\2i_\3\2\2\2ib\3\2\2"+
		"\2ie\3\2\2\2ih\3\2\2\2j\5\3\2\2\2kl\7\22\2\2lm\7<\2\2mp\7\37\2\2nq\5\16"+
		"\b\2oq\5 \21\2pn\3\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2"+
		"\2\2tu\7 \2\2uv\7\67\2\2v\u0086\3\2\2\2wx\7\3\2\2xy\7\22\2\2yz\7<\2\2"+
		"z}\7\37\2\2{~\5\16\b\2|~\5 \21\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7 \2\2\u0082"+
		"\u0083\7<\2\2\u0083\u0084\7\67\2\2\u0084\u0086\3\2\2\2\u0085k\3\2\2\2"+
		"\u0085w\3\2\2\2\u0086\7\3\2\2\2\u0087\u0088\7\21\2\2\u0088\u0089\7\33"+
		"\2\2\u0089\u008a\5\36\20\2\u008a\u008b\7\34\2\2\u008b\u008c\7\67\2\2\u008c"+
		"\u008d\b\5\1\2\u008d\t\3\2\2\2\u008e\u008f\7\20\2\2\u008f\13\3\2\2\2\u0090"+
		"\u0093\7\24\2\2\u0091\u0094\5\36\20\2\u0092\u0094\5*\26\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\7\67\2\2\u0096\r\3\2\2\2\u0097\u0099\5\62\32\2\u0098\u009a\7-\2"+
		"\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\7<\2\2\u009c\u009d\7\67\2\2\u009d\17\3\2\2\2\u009e\u009f\7\26\2\2\u009f"+
		"\u00a0\7\67\2\2\u00a0\21\3\2\2\2\u00a1\u00a2\7\25\2\2\u00a2\u00a3\7\67"+
		"\2\2\u00a3\23\3\2\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00aa\t\2\2\2\u00a6\u00ab"+
		"\7<\2\2\u00a7\u00a8\7<\2\2\u00a8\u00a9\13\2\2\2\u00a9\u00ab\7<\2\2\u00aa"+
		"\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\t\3"+
		"\2\2\u00ad\25\3\2\2\2\u00ae\u00af\7\32\2\2\u00af\u00b1\7\33\2\2\u00b0"+
		"\u00b2\5 \21\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\7\67\2\2\u00b4\u00b6\5\36\20\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bc\7\67\2\2\u00b8\u00ba\5"+
		"\36\20\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00bd\5 \21\2\u00bc\u00b9\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\7\34\2\2\u00bf\u00c0\7\37\2\2\u00c0\u00c1\5\4\3\2\u00c1"+
		"\u00c2\7 \2\2\u00c2\27\3\2\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00c5\7\33\2"+
		"\2\u00c5\u00c6\5\36\20\2\u00c6\u00c7\7\34\2\2\u00c7\u00c8\7\37\2\2\u00c8"+
		"\u00c9\5\4\3\2\u00c9\u00ca\7 \2\2\u00ca\31\3\2\2\2\u00cb\u00cc\7\27\2"+
		"\2\u00cc\u00cd\7\33\2\2\u00cd\u00ce\5\36\20\2\u00ce\u00cf\7\34\2\2\u00cf"+
		"\u00d0\7\37\2\2\u00d0\u00d1\5\4\3\2\u00d1\u00dd\7 \2\2\u00d2\u00d3\7\30"+
		"\2\2\u00d3\u00d4\7\27\2\2\u00d4\u00d5\7\33\2\2\u00d5\u00d6\5\36\20\2\u00d6"+
		"\u00d7\7\34\2\2\u00d7\u00d8\7\37\2\2\u00d8\u00d9\5\4\3\2\u00d9\u00da\7"+
		" \2\2\u00da\u00dc\3\2\2\2\u00db\u00d2\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e5\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00e0\u00e1\7\30\2\2\u00e1\u00e2\7\37\2\2\u00e2\u00e3\5\4\3\2\u00e3"+
		"\u00e4\7 \2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\33\3\2\2\2\u00e7\u00e9\5\62\32\2\u00e8\u00ea\7-\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7<\2\2\u00ec"+
		"\u00ed\7\35\2\2\u00ed\u00ee\5\60\31\2\u00ee\u00ef\7\36\2\2\u00ef\u00f0"+
		"\7\67\2\2\u00f0\u0100\3\2\2\2\u00f1\u00f3\5\62\32\2\u00f2\u00f4\7-\2\2"+
		"\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6"+
		"\7<\2\2\u00f6\u00f7\7\35\2\2\u00f7\u00f8\5\60\31\2\u00f8\u00f9\7\36\2"+
		"\2\u00f9\u00fa\7!\2\2\u00fa\u00fb\7\37\2\2\u00fb\u00fc\5,\27\2\u00fc\u00fd"+
		"\7 \2\2\u00fd\u00fe\7\67\2\2\u00fe\u0100\3\2\2\2\u00ff\u00e7\3\2\2\2\u00ff"+
		"\u00f1\3\2\2\2\u0100\35\3\2\2\2\u0101\u0103\7-\2\2\u0102\u0101\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u010f\7<\2\2\u0105\u010f"+
		"\7>\2\2\u0106\u0108\7-\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010f\5*\26\2\u010d\u010f\7;\2\2\u010e\u0102\3\2\2\2\u010e"+
		"\u0105\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0115\3\2"+
		"\2\2\u0110\u0111\5\64\33\2\u0111\u0112\5\36\20\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0110\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\37\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\t\4\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\7-\2\2\u011f\u011e\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7<\2\2\u0122"+
		"\u0123\7!\2\2\u0123\u0125\5\36\20\2\u0124\u0126\7\67\2\2\u0125\u0124\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126\u0162\3\2\2\2\u0127\u0129\7\t\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\7-\2\2\u012e"+
		"\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7<"+
		"\2\2\u0131\u0136\7!\2\2\u0132\u0133\7\4\2\2\u0133\u0134\7<\2\2\u0134\u0137"+
		"\7\4\2\2\u0135\u0137\7<\2\2\u0136\u0132\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013b\3\2\2\2\u0138\u013a\7\67\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3"+
		"\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0162\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u0140\7-\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7<\2\2\u0142\u0143\7\35\2\2\u0143"+
		"\u0144\5\36\20\2\u0144\u0145\7\36\2\2\u0145\u0146\7!\2\2\u0146\u014a\5"+
		"\36\20\2\u0147\u0149\7\67\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2"+
		"\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0162\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014d\u014e\7<\2\2\u014e\u0150\7%\2\2\u014f\u0151\7\67\2\2\u0150"+
		"\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0162\3\2\2\2\u0152\u0153\7<"+
		"\2\2\u0153\u0155\7&\2\2\u0154\u0156\7\67\2\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0162\3\2\2\2\u0157\u0158\7%\2\2\u0158\u015a\7<\2"+
		"\2\u0159\u015b\7\67\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u0162\3\2\2\2\u015c\u015d\7&\2\2\u015d\u015f\7<\2\2\u015e\u0160\7\67"+
		"\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161"+
		"\u011b\3\2\2\2\u0161\u012a\3\2\2\2\u0161\u013f\3\2\2\2\u0161\u014d\3\2"+
		"\2\2\u0161\u0152\3\2\2\2\u0161\u0157\3\2\2\2\u0161\u015c\3\2\2\2\u0162"+
		"!\3\2\2\2\u0163\u0164\5\62\32\2\u0164\u0165\7<\2\2\u0165\u0166\7\33\2"+
		"\2\u0166\u0167\5$\23\2\u0167\u0168\7\34\2\2\u0168\u0169\7\67\2\2\u0169"+
		"\u016a\b\22\1\2\u016a\u0173\3\2\2\2\u016b\u016c\5\62\32\2\u016c\u016d"+
		"\7<\2\2\u016d\u016e\7\33\2\2\u016e\u016f\7\34\2\2\u016f\u0170\7\67\2\2"+
		"\u0170\u0171\b\22\1\2\u0171\u0173\3\2\2\2\u0172\u0163\3\2\2\2\u0172\u016b"+
		"\3\2\2\2\u0173#\3\2\2\2\u0174\u0179\5&\24\2\u0175\u0176\7\66\2\2\u0176"+
		"\u0178\5&\24\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a%\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e"+
		"\5\62\32\2\u017d\u017f\7\63\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2"+
		"\2\u017f\u0180\3\2\2\2\u0180\u0181\7<\2\2\u0181\'\3\2\2\2\u0182\u0183"+
		"\5\62\32\2\u0183\u0184\7<\2\2\u0184\u0185\7\33\2\2\u0185\u0186\5$\23\2"+
		"\u0186\u0187\7\34\2\2\u0187\u0188\7\37\2\2\u0188\u0189\5\4\3\2\u0189\u018a"+
		"\7 \2\2\u018a\u018b\b\25\1\2\u018b\u0196\3\2\2\2\u018c\u018d\5\62\32\2"+
		"\u018d\u018e\7<\2\2\u018e\u018f\7\33\2\2\u018f\u0190\7\34\2\2\u0190\u0191"+
		"\7\37\2\2\u0191\u0192\5\4\3\2\u0192\u0193\7 \2\2\u0193\u0194\b\25\1\2"+
		"\u0194\u0196\3\2\2\2\u0195\u0182\3\2\2\2\u0195\u018c\3\2\2\2\u0196)\3"+
		"\2\2\2\u0197\u0199\7-\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\7<\2\2\u019b\u019c\7\33\2\2\u019c\u019d\5,"+
		"\27\2\u019d\u01a1\7\34\2\2\u019e\u01a0\7\67\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\b\26\1\2\u01a5\u01b1\3\2\2\2\u01a6"+
		"\u01a7\7<\2\2\u01a7\u01a8\7\33\2\2\u01a8\u01ac\7\34\2\2\u01a9\u01ab\7"+
		"\67\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b1\b\26"+
		"\1\2\u01b0\u0198\3\2\2\2\u01b0\u01a6\3\2\2\2\u01b1+\3\2\2\2\u01b2\u01b7"+
		"\5.\30\2\u01b3\u01b4\7\66\2\2\u01b4\u01b6\5.\30\2\u01b5\u01b3\3\2\2\2"+
		"\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8-\3"+
		"\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bc\7-\2\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bf\7\63\2\2\u01be\u01bd\3"+
		"\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c9\7<\2\2\u01c1"+
		"\u01c3\7-\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c9\5*\26\2\u01c5\u01c9\7>\2\2\u01c6\u01c9\5\36\20\2\u01c7"+
		"\u01c9\7;\2\2\u01c8\u01bb\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c8\u01c5\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9/\3\2\2\2\u01ca\u01d1"+
		"\7>\2\2\u01cb\u01cd\7-\2\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d1\7<\2\2\u01cf\u01d1\7;\2\2\u01d0\u01ca\3\2\2"+
		"\2\u01d0\u01cc\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\61\3\2\2\2\u01d2\u01d3"+
		"\t\5\2\2\u01d3\63\3\2\2\2\u01d4\u01d5\t\6\2\2\u01d5\65\3\2\2\2\65ipr}"+
		"\177\u0085\u0093\u0099\u00aa\u00b1\u00b5\u00b9\u00bc\u00dd\u00e5\u00e9"+
		"\u00f3\u00ff\u0102\u0109\u010e\u0115\u011b\u011f\u0125\u012a\u012e\u0136"+
		"\u013b\u013f\u014a\u0150\u0155\u015a\u015f\u0161\u0172\u0179\u017e\u0195"+
		"\u0198\u01a1\u01ac\u01b0\u01b7\u01bb\u01be\u01c2\u01c8\u01cc\u01d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}