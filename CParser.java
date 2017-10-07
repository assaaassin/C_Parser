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
		T__0=1, INT=2, FLOAT=3, LONG=4, DOUBLE=5, CHAR=6, VOID=7, SHORT=8, BOOL=9, 
		CONST=10, SIGNED=11, UNSIGNED=12, COMM=13, PRINTF=14, INCLUDE=15, RETURN=16, 
		CONTINUE=17, BREAK=18, IF=19, ELSE=20, WHILE=21, FOR=22, LEFTPAR=23, RIGHTPAR=24, 
		LEFTSQ=25, RIGHTSQ=26, LEFTCURL=27, RIGHTCURL=28, ASSIGNMENT=29, LT=30, 
		GT=31, EQ=32, PLUSPLUS=33, MINUSMINUS=34, NEQ=35, GE=36, LE=37, PLUS=38, 
		MINUS=39, MOD=40, ASTERIK=41, DIV=42, HAT=43, NOT=44, TILDA=45, OR=46, 
		AND=47, ANDAND=48, OROR=49, COMMA=50, SEMICOL=51, DOT=52, LSHIFT=53, RSHIFT=54, 
		DIGIT=55, IDENTIFIER=56, IDENTIFIERSTRING=57, DIGITDIGIT=58, WS=59;
	public static final int
		RULE_codefile = 0, RULE_lines = 1, RULE_printfStatement = 2, RULE_ignoreComments = 3, 
		RULE_returnStatement = 4, RULE_declareVariable = 5, RULE_include = 6, 
		RULE_forloop = 7, RULE_whileloop = 8, RULE_ifstatement = 9, RULE_arraydeclaration = 10, 
		RULE_expression = 11, RULE_assignment = 12, RULE_funcDeclare = 13, RULE_argumentlist = 14, 
		RULE_argument = 15, RULE_funcDefinition = 16, RULE_funcCall = 17, RULE_calllist = 18, 
		RULE_call = 19, RULE_digitorid = 20, RULE_alltypes = 21, RULE_everyexp = 22;
	public static final String[] ruleNames = {
		"codefile", "lines", "printfStatement", "ignoreComments", "returnStatement", 
		"declareVariable", "include", "forloop", "whileloop", "ifstatement", "arraydeclaration", 
		"expression", "assignment", "funcDeclare", "argumentlist", "argument", 
		"funcDefinition", "funcCall", "calllist", "call", "digitorid", "alltypes", 
		"everyexp"
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
			setState(46);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				declareVariable();
				setState(49);
				lines();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				include();
				setState(52);
				lines();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				forloop();
				setState(55);
				lines();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				assignment();
				setState(58);
				lines();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				funcDeclare();
				setState(61);
				lines();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				funcDefinition();
				setState(64);
				lines();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				funcCall();
				setState(67);
				lines();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				ignoreComments();
				setState(70);
				lines();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(72);
				whileloop();
				setState(73);
				lines();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				ifstatement();
				setState(76);
				lines();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(78);
				arraydeclaration();
				setState(79);
				lines();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(81);
				returnStatement();
				setState(82);
				lines();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(84);
				printfStatement();
				setState(85);
				lines();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
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
		enterRule(_localctx, 4, RULE_printfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((PrintfStatementContext)_localctx).PRINTF = match(PRINTF);
			setState(91);
			match(LEFTPAR);
			setState(92);
			expression();
			setState(93);
			match(RIGHTPAR);
			setState(94);
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
		enterRule(_localctx, 6, RULE_ignoreComments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		enterRule(_localctx, 8, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(RETURN);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(100);
				expression();
				}
				break;
			case 2:
				{
				setState(101);
				funcCall();
				}
				break;
			}
			setState(104);
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
		enterRule(_localctx, 10, RULE_declareVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			alltypes();
			setState(108);
			_la = _input.LA(1);
			if (_la==ASTERIK) {
				{
				setState(107);
				match(ASTERIK);
				}
			}

			setState(110);
			match(IDENTIFIER);
			setState(111);
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
		enterRule(_localctx, 12, RULE_include);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(INCLUDE);
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==LT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(115);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				{
				setState(116);
				match(IDENTIFIER);
				setState(117);
				matchWildcard();
				setState(118);
				match(IDENTIFIER);
				}
				}
				break;
			}
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==GT) ) {
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
		enterRule(_localctx, 14, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(FOR);
			setState(124);
			match(LEFTPAR);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << CHAR) | (1L << SHORT) | (1L << ASTERIK) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(125);
				assignment();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(SEMICOL);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASTERIK) | (1L << DIGIT) | (1L << IDENTIFIER) | (1L << DIGITDIGIT))) != 0)) {
				{
				{
				setState(132);
				expression();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(SEMICOL);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASTERIK) | (1L << DIGIT) | (1L << IDENTIFIER) | (1L << DIGITDIGIT))) != 0)) {
				{
				{
				setState(139);
				expression();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(RIGHTPAR);
			setState(146);
			match(LEFTCURL);
			setState(147);
			lines();
			setState(148);
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
		enterRule(_localctx, 16, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(WHILE);
			setState(151);
			match(LEFTPAR);
			setState(152);
			expression();
			setState(153);
			match(RIGHTPAR);
			setState(154);
			match(LEFTCURL);
			setState(155);
			lines();
			setState(156);
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
		enterRule(_localctx, 18, RULE_ifstatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IF);
			setState(159);
			match(LEFTPAR);
			setState(160);
			expression();
			setState(161);
			match(RIGHTPAR);
			setState(162);
			match(LEFTCURL);
			setState(163);
			lines();
			setState(164);
			match(RIGHTCURL);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(ELSE);
					setState(166);
					match(IF);
					setState(167);
					match(LEFTPAR);
					setState(168);
					expression();
					setState(169);
					match(RIGHTPAR);
					setState(170);
					match(LEFTCURL);
					setState(171);
					lines();
					setState(172);
					match(RIGHTCURL);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(184);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(179);
				match(ELSE);
				setState(180);
				match(LEFTCURL);
				setState(181);
				lines();
				setState(182);
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
		enterRule(_localctx, 20, RULE_arraydeclaration);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				alltypes();
				setState(188);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(187);
					match(ASTERIK);
					}
				}

				setState(190);
				match(IDENTIFIER);
				setState(191);
				match(LEFTSQ);
				setState(192);
				digitorid();
				setState(193);
				match(RIGHTSQ);
				setState(194);
				match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				alltypes();
				setState(198);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(197);
					match(ASTERIK);
					}
				}

				setState(200);
				match(IDENTIFIER);
				setState(201);
				match(LEFTSQ);
				setState(202);
				digitorid();
				setState(203);
				match(RIGHTSQ);
				setState(204);
				match(ASSIGNMENT);
				setState(205);
				match(LEFTCURL);
				setState(206);
				calllist();
				setState(207);
				match(RIGHTCURL);
				setState(208);
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
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(213);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(212);
					match(ASTERIK);
					}
				}

				setState(215);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(216);
				match(DIGITDIGIT);
				}
				break;
			case 3:
				{
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(217);
						match(ASTERIK);
						}
						} 
					}
					setState(222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(223);
				funcCall();
				}
				break;
			case 4:
				{
				setState(224);
				match(DIGIT);
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					everyexp();
					setState(228);
					expression();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 24, RULE_assignment);
		int _la;
		try {
			int _alt;
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << SHORT))) != 0)) {
					{
					{
					setState(235);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << SHORT))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(241);
					match(ASTERIK);
					}
				}

				setState(244);
				match(IDENTIFIER);
				setState(245);
				match(ASSIGNMENT);
				setState(246);
				expression();
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(247);
					match(SEMICOL);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CHAR) {
					{
					{
					setState(250);
					match(CHAR);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(256);
					match(ASTERIK);
					}
				}

				setState(259);
				match(IDENTIFIER);
				setState(260);
				match(ASSIGNMENT);
				setState(265);
				switch (_input.LA(1)) {
				case T__0:
					{
					{
					setState(261);
					match(T__0);
					setState(262);
					match(IDENTIFIER);
					setState(263);
					match(T__0);
					}
					}
					break;
				case IDENTIFIER:
					{
					setState(264);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(267);
						match(SEMICOL);
						}
						} 
					}
					setState(272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(273);
					match(ASTERIK);
					}
				}

				setState(276);
				match(IDENTIFIER);
				setState(277);
				match(LEFTSQ);
				setState(278);
				expression();
				setState(279);
				match(RIGHTSQ);
				setState(280);
				match(ASSIGNMENT);
				setState(281);
				expression();
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(282);
						match(SEMICOL);
						}
						} 
					}
					setState(287);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 26, RULE_funcDeclare);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				alltypes();
				setState(291);
				((FuncDeclareContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(292);
				match(LEFTPAR);
				setState(293);
				argumentlist();
				setState(294);
				match(RIGHTPAR);
				setState(295);
				match(SEMICOL);
				globalList.add("Declared "+ ((FuncDeclareContext)_localctx).IDENTIFIER.getText());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				alltypes();
				setState(299);
				((FuncDeclareContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(300);
				match(LEFTPAR);
				setState(301);
				match(RIGHTPAR);
				setState(302);
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
		enterRule(_localctx, 28, RULE_argumentlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(307);
			argument();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(308);
				match(COMMA);
				setState(309);
				argument();
				}
				}
				setState(314);
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
		enterRule(_localctx, 30, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			alltypes();
			setState(317);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(316);
				match(AND);
				}
			}

			setState(319);
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
		enterRule(_localctx, 32, RULE_funcDefinition);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				alltypes();
				setState(322);
				((FuncDefinitionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(323);
				match(LEFTPAR);
				setState(324);
				argumentlist();
				setState(325);
				match(RIGHTPAR);
				setState(326);
				match(LEFTCURL);
				setState(327);
				lines();
				setState(328);
				match(RIGHTCURL);
				 globalList.add("Defined "+ ((FuncDefinitionContext)_localctx).IDENTIFIER.getText());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				alltypes();
				setState(332);
				((FuncDefinitionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(333);
				match(LEFTPAR);
				setState(334);
				match(RIGHTPAR);
				setState(335);
				match(LEFTCURL);
				setState(336);
				lines();
				setState(337);
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
		enterRule(_localctx, 34, RULE_funcCall);
		int _la;
		try {
			int _alt;
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(342);
					match(ASTERIK);
					}
				}

				setState(345);
				((FuncCallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(346);
				match(LEFTPAR);
				setState(347);
				calllist();
				setState(348);
				match(RIGHTPAR);
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(349);
						match(SEMICOL);
						}
						} 
					}
					setState(354);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				globalList.add("Called "+ ((FuncCallContext)_localctx).IDENTIFIER.getText());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				((FuncCallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(358);
				match(LEFTPAR);
				setState(359);
				match(RIGHTPAR);
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(360);
						match(SEMICOL);
						}
						} 
					}
					setState(365);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 36, RULE_calllist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(369);
			call();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(370);
				match(COMMA);
				setState(371);
				call();
				}
				}
				setState(376);
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
		enterRule(_localctx, 38, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(378);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(377);
					match(ASTERIK);
					}
				}

				setState(381);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(380);
					match(AND);
					}
				}

				setState(383);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(384);
					match(ASTERIK);
					}
					break;
				}
				setState(387);
				funcCall();
				}
				break;
			case 3:
				{
				setState(388);
				match(DIGITDIGIT);
				}
				break;
			case 4:
				{
				setState(389);
				expression();
				}
				break;
			case 5:
				{
				setState(390);
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
		enterRule(_localctx, 40, RULE_digitorid);
		int _la;
		try {
			setState(399);
			switch (_input.LA(1)) {
			case DIGITDIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(DIGITDIGIT);
				}
				break;
			case ASTERIK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				_la = _input.LA(1);
				if (_la==ASTERIK) {
					{
					setState(394);
					match(ASTERIK);
					}
				}

				setState(397);
				match(IDENTIFIER);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
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
		enterRule(_localctx, 42, RULE_alltypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		enterRule(_localctx, 44, RULE_everyexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u0198\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\5\6i\n\6\3\6\3\6\3\7\3\7\5\7o\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bz\n\b\3\b\3\b\3\t\3\t\3\t\7\t\u0081\n\t\f\t\16\t\u0084\13\t"+
		"\3\t\3\t\7\t\u0088\n\t\f\t\16\t\u008b\13\t\3\t\3\t\7\t\u008f\n\t\f\t\16"+
		"\t\u0092\13\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00bb\n\13\3\f\3\f\5\f\u00bf\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00c9\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d5\n\f\3"+
		"\r\5\r\u00d8\n\r\3\r\3\r\3\r\7\r\u00dd\n\r\f\r\16\r\u00e0\13\r\3\r\3\r"+
		"\5\r\u00e4\n\r\3\r\3\r\3\r\7\r\u00e9\n\r\f\r\16\r\u00ec\13\r\3\16\7\16"+
		"\u00ef\n\16\f\16\16\16\u00f2\13\16\3\16\5\16\u00f5\n\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00fb\n\16\3\16\7\16\u00fe\n\16\f\16\16\16\u0101\13\16\3\16"+
		"\5\16\u0104\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010c\n\16\3\16\7"+
		"\16\u010f\n\16\f\16\16\16\u0112\13\16\3\16\5\16\u0115\n\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u011e\n\16\f\16\16\16\u0121\13\16\5\16\u0123"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0134\n\17\3\20\3\20\3\20\7\20\u0139\n\20\f\20\16\20\u013c"+
		"\13\20\3\21\3\21\5\21\u0140\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u0157\n\22\3\23\5\23\u015a\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u0161"+
		"\n\23\f\23\16\23\u0164\13\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u016c"+
		"\n\23\f\23\16\23\u016f\13\23\3\23\5\23\u0172\n\23\3\24\3\24\3\24\7\24"+
		"\u0177\n\24\f\24\16\24\u017a\13\24\3\25\5\25\u017d\n\25\3\25\5\25\u0180"+
		"\n\25\3\25\3\25\5\25\u0184\n\25\3\25\3\25\3\25\3\25\5\25\u018a\n\25\3"+
		"\26\3\26\5\26\u018e\n\26\3\26\3\26\5\26\u0192\n\26\3\27\3\27\3\30\3\30"+
		"\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\7\4\2\3"+
		"\3  \4\2\3\3!!\4\2\4\7\n\n\3\2\4\13\6\2 \"%-\60\63\678\u01bd\2\60\3\2"+
		"\2\2\4Z\3\2\2\2\6\\\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\fl\3\2\2\2\16s\3\2\2"+
		"\2\20}\3\2\2\2\22\u0098\3\2\2\2\24\u00a0\3\2\2\2\26\u00d4\3\2\2\2\30\u00e3"+
		"\3\2\2\2\32\u0122\3\2\2\2\34\u0133\3\2\2\2\36\u0135\3\2\2\2 \u013d\3\2"+
		"\2\2\"\u0156\3\2\2\2$\u0171\3\2\2\2&\u0173\3\2\2\2(\u0189\3\2\2\2*\u0191"+
		"\3\2\2\2,\u0193\3\2\2\2.\u0195\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\63"+
		"\5\f\7\2\63\64\5\4\3\2\64[\3\2\2\2\65\66\5\16\b\2\66\67\5\4\3\2\67[\3"+
		"\2\2\289\5\20\t\29:\5\4\3\2:[\3\2\2\2;<\5\32\16\2<=\5\4\3\2=[\3\2\2\2"+
		">?\5\34\17\2?@\5\4\3\2@[\3\2\2\2AB\5\"\22\2BC\5\4\3\2C[\3\2\2\2DE\5$\23"+
		"\2EF\5\4\3\2F[\3\2\2\2GH\5\b\5\2HI\5\4\3\2I[\3\2\2\2JK\5\22\n\2KL\5\4"+
		"\3\2L[\3\2\2\2MN\5\24\13\2NO\5\4\3\2O[\3\2\2\2PQ\5\26\f\2QR\5\4\3\2R["+
		"\3\2\2\2ST\5\n\6\2TU\5\4\3\2U[\3\2\2\2VW\5\6\4\2WX\5\4\3\2X[\3\2\2\2Y"+
		"[\3\2\2\2Z\62\3\2\2\2Z\65\3\2\2\2Z8\3\2\2\2Z;\3\2\2\2Z>\3\2\2\2ZA\3\2"+
		"\2\2ZD\3\2\2\2ZG\3\2\2\2ZJ\3\2\2\2ZM\3\2\2\2ZP\3\2\2\2ZS\3\2\2\2ZV\3\2"+
		"\2\2ZY\3\2\2\2[\5\3\2\2\2\\]\7\20\2\2]^\7\31\2\2^_\5\30\r\2_`\7\32\2\2"+
		"`a\7\65\2\2ab\b\4\1\2b\7\3\2\2\2cd\7\17\2\2d\t\3\2\2\2eh\7\22\2\2fi\5"+
		"\30\r\2gi\5$\23\2hf\3\2\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\65\2\2k"+
		"\13\3\2\2\2ln\5,\27\2mo\7+\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7:\2\2"+
		"qr\7\65\2\2r\r\3\2\2\2st\7\21\2\2ty\t\2\2\2uz\7:\2\2vw\7:\2\2wx\13\2\2"+
		"\2xz\7:\2\2yu\3\2\2\2yv\3\2\2\2z{\3\2\2\2{|\t\3\2\2|\17\3\2\2\2}~\7\30"+
		"\2\2~\u0082\7\31\2\2\177\u0081\5\32\16\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0089\7\65\2\2\u0086\u0088\5\30\r\2\u0087\u0086\3"+
		"\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0090\7\65\2\2\u008d\u008f\5"+
		"\30\r\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\32"+
		"\2\2\u0094\u0095\7\35\2\2\u0095\u0096\5\4\3\2\u0096\u0097\7\36\2\2\u0097"+
		"\21\3\2\2\2\u0098\u0099\7\27\2\2\u0099\u009a\7\31\2\2\u009a\u009b\5\30"+
		"\r\2\u009b\u009c\7\32\2\2\u009c\u009d\7\35\2\2\u009d\u009e\5\4\3\2\u009e"+
		"\u009f\7\36\2\2\u009f\23\3\2\2\2\u00a0\u00a1\7\25\2\2\u00a1\u00a2\7\31"+
		"\2\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\7\32\2\2\u00a4\u00a5\7\35\2\2\u00a5"+
		"\u00a6\5\4\3\2\u00a6\u00b2\7\36\2\2\u00a7\u00a8\7\26\2\2\u00a8\u00a9\7"+
		"\25\2\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\32\2\2"+
		"\u00ac\u00ad\7\35\2\2\u00ad\u00ae\5\4\3\2\u00ae\u00af\7\36\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00ba\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\26"+
		"\2\2\u00b6\u00b7\7\35\2\2\u00b7\u00b8\5\4\3\2\u00b8\u00b9\7\36\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\25\3\2\2"+
		"\2\u00bc\u00be\5,\27\2\u00bd\u00bf\7+\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7:\2\2\u00c1\u00c2\7\33\2\2\u00c2"+
		"\u00c3\5*\26\2\u00c3\u00c4\7\34\2\2\u00c4\u00c5\7\65\2\2\u00c5\u00d5\3"+
		"\2\2\2\u00c6\u00c8\5,\27\2\u00c7\u00c9\7+\2\2\u00c8\u00c7\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7:\2\2\u00cb\u00cc\7\33"+
		"\2\2\u00cc\u00cd\5*\26\2\u00cd\u00ce\7\34\2\2\u00ce\u00cf\7\37\2\2\u00cf"+
		"\u00d0\7\35\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2\7\36\2\2\u00d2\u00d3\7"+
		"\65\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00bc\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d5"+
		"\27\3\2\2\2\u00d6\u00d8\7+\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d9\u00e4\7:\2\2\u00da\u00e4\7<\2\2\u00db\u00dd"+
		"\7+\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\5$"+
		"\23\2\u00e2\u00e4\79\2\2\u00e3\u00d7\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3"+
		"\u00de\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6\5."+
		"\30\2\u00e6\u00e7\5\30\r\2\u00e7\u00e9\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\31\3\2\2"+
		"\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\t\4\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f5\7+\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7:\2\2\u00f7\u00f8\7\37\2\2\u00f8"+
		"\u00fa\5\30\r\2\u00f9\u00fb\7\65\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fb\u0123\3\2\2\2\u00fc\u00fe\7\b\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\7+\2\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7:\2\2\u0106\u010b\7\37"+
		"\2\2\u0107\u0108\7\3\2\2\u0108\u0109\7:\2\2\u0109\u010c\7\3\2\2\u010a"+
		"\u010c\7:\2\2\u010b\u0107\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u0110\3\2"+
		"\2\2\u010d\u010f\7\65\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0123\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0115\7+\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\7:\2\2\u0117\u0118\7\33\2\2\u0118\u0119\5\30"+
		"\r\2\u0119\u011a\7\34\2\2\u011a\u011b\7\37\2\2\u011b\u011f\5\30\r\2\u011c"+
		"\u011e\7\65\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u00f0\3\2\2\2\u0122\u00ff\3\2\2\2\u0122\u0114\3\2\2\2\u0123\33\3\2\2"+
		"\2\u0124\u0125\5,\27\2\u0125\u0126\7:\2\2\u0126\u0127\7\31\2\2\u0127\u0128"+
		"\5\36\20\2\u0128\u0129\7\32\2\2\u0129\u012a\7\65\2\2\u012a\u012b\b\17"+
		"\1\2\u012b\u0134\3\2\2\2\u012c\u012d\5,\27\2\u012d\u012e\7:\2\2\u012e"+
		"\u012f\7\31\2\2\u012f\u0130\7\32\2\2\u0130\u0131\7\65\2\2\u0131\u0132"+
		"\b\17\1\2\u0132\u0134\3\2\2\2\u0133\u0124\3\2\2\2\u0133\u012c\3\2\2\2"+
		"\u0134\35\3\2\2\2\u0135\u013a\5 \21\2\u0136\u0137\7\64\2\2\u0137\u0139"+
		"\5 \21\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\37\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013f\5,\27"+
		"\2\u013e\u0140\7\61\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\7:\2\2\u0142!\3\2\2\2\u0143\u0144\5,\27\2\u0144"+
		"\u0145\7:\2\2\u0145\u0146\7\31\2\2\u0146\u0147\5\36\20\2\u0147\u0148\7"+
		"\32\2\2\u0148\u0149\7\35\2\2\u0149\u014a\5\4\3\2\u014a\u014b\7\36\2\2"+
		"\u014b\u014c\b\22\1\2\u014c\u0157\3\2\2\2\u014d\u014e\5,\27\2\u014e\u014f"+
		"\7:\2\2\u014f\u0150\7\31\2\2\u0150\u0151\7\32\2\2\u0151\u0152\7\35\2\2"+
		"\u0152\u0153\5\4\3\2\u0153\u0154\7\36\2\2\u0154\u0155\b\22\1\2\u0155\u0157"+
		"\3\2\2\2\u0156\u0143\3\2\2\2\u0156\u014d\3\2\2\2\u0157#\3\2\2\2\u0158"+
		"\u015a\7+\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\7:\2\2\u015c\u015d\7\31\2\2\u015d\u015e\5&\24\2\u015e"+
		"\u0162\7\32\2\2\u015f\u0161\7\65\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3"+
		"\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0166\b\23\1\2\u0166\u0172\3\2\2\2\u0167\u0168\7"+
		":\2\2\u0168\u0169\7\31\2\2\u0169\u016d\7\32\2\2\u016a\u016c\7\65\2\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\b\23\1\2\u0171"+
		"\u0159\3\2\2\2\u0171\u0167\3\2\2\2\u0172%\3\2\2\2\u0173\u0178\5(\25\2"+
		"\u0174\u0175\7\64\2\2\u0175\u0177\5(\25\2\u0176\u0174\3\2\2\2\u0177\u017a"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\'\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017d\7+\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017f\3\2\2\2\u017e\u0180\7\61\2\2\u017f\u017e\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u018a\7:\2\2\u0182\u0184\7+\2"+
		"\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u018a"+
		"\5$\23\2\u0186\u018a\7<\2\2\u0187\u018a\5\30\r\2\u0188\u018a\79\2\2\u0189"+
		"\u017c\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u0188\3\2\2\2\u018a)\3\2\2\2\u018b\u0192\7<\2\2\u018c\u018e"+
		"\7+\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0192\7:\2\2\u0190\u0192\79\2\2\u0191\u018b\3\2\2\2\u0191\u018d\3\2\2"+
		"\2\u0191\u0190\3\2\2\2\u0192+\3\2\2\2\u0193\u0194\t\5\2\2\u0194-\3\2\2"+
		"\2\u0195\u0196\t\6\2\2\u0196/\3\2\2\2+Zhny\u0082\u0089\u0090\u00b2\u00ba"+
		"\u00be\u00c8\u00d4\u00d7\u00de\u00e3\u00ea\u00f0\u00f4\u00fa\u00ff\u0103"+
		"\u010b\u0110\u0114\u011f\u0122\u0133\u013a\u013f\u0156\u0159\u0162\u016d"+
		"\u0171\u0178\u017c\u017f\u0183\u0189\u018d\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}