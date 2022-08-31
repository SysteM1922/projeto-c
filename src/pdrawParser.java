// Generated from pdraw.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pdrawParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, COMMENT=61, TYPE=62, STATUS=63, COLOUR=64, BOOLEAN=65, NUMBER=66, 
		STRING=67, PATTERN=68, ID=69, HEX=70, DEGREE=71, LITERALCOLOUR=72, WS=73;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_arg = 2, RULE_action = 3, RULE_elif = 4, 
		RULE_els = 5, RULE_declaration = 6, RULE_chg = 7, RULE_attribution = 8, 
		RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "arg", "action", "elif", "els", "declaration", "chg", 
			"attribution", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'as'", "'raise'", "'lower'", "'if'", "'then'", "'{'", 
			"'}'", "'for'", "'in'", "'range'", "'do'", "'while'", "'function'", "'('", 
			"','", "')'", "'return'", "'print('", "'add'", "'to'", "'remove'", "'from'", 
			"'move to'", "'move by'", "'rotate by'", "'change'", "'elif'", "'else'", 
			"'='", "'-heading'", "'-status'", "'-posx'", "'-posy'", "'-colour'", 
			"'-thickness'", "'-pattern'", "'status='", "'posx='", "'posy='", "'heading='", 
			"'colour='", "'thickness='", "'pattern='", "'['", "']'", "'-'", "'^'", 
			"'*'", "'/'", "'%'", "'+'", "'!'", "'and'", "'or'", "'=='", "'get'", 
			"'length of'", "'input num'", "'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "COMMENT", "TYPE", "STATUS", "COLOUR", "BOOLEAN", "NUMBER", "STRING", 
			"PATTERN", "ID", "HEX", "DEGREE", "LITERALCOLOUR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "pdraw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pdrawParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pdrawParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << COMMENT) | (1L << TYPE) | (1L << STATUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLOUR - 64)) | (1L << (BOOLEAN - 64)) | (1L << (NUMBER - 64)) | (1L << (STRING - 64)) | (1L << (PATTERN - 64)) | (1L << (ID - 64)) | (1L << (DEGREE - 64)))) != 0)) {
				{
				{
				setState(20);
				stat();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(EOF);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PenCommandContext extends StatContext {
		public Token op;
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public PenCommandContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterPenCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitPenCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitPenCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentContext extends StatContext {
		public TerminalNode COMMENT() { return getToken(pdrawParser.COMMENT, 0); }
		public CommentContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportContext extends StatContext {
		public TerminalNode STRING() { return getToken(pdrawParser.STRING, 0); }
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ImportContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitImport(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopContext extends StatContext {
		public Token r;
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForLoopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAddContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ArrayAddContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterArrayAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitArrayAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitArrayAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrContext extends StatContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public AttrContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionContext extends StatContext {
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public FunctionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayRemoveContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ArrayRemoveContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterArrayRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitArrayRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitArrayRemove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDIDContext extends StatContext {
		public List<TerminalNode> ID() { return getTokens(pdrawParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pdrawParser.ID, i);
		}
		public IDIDContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterIDID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitIDID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitIDID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElifElseStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<ElifContext> elif() {
			return getRuleContexts(ElifContext.class);
		}
		public ElifContext elif(int i) {
			return getRuleContext(ElifContext.class,i);
		}
		public ElsContext els() {
			return getRuleContext(ElsContext.class,0);
		}
		public IfElifElseStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterIfElifElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitIfElifElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitIfElifElseStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoActionContext extends StatContext {
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public DoActionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterDoAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitDoAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitDoAction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaContext extends StatContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclaContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitDecla(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileLoopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GoExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GoExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterGoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitGoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitGoExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new CommentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(COMMENT);
				}
				break;
			case 2:
				_localctx = new ImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(T__0);
				setState(30);
				match(STRING);
				setState(31);
				match(T__1);
				setState(32);
				match(ID);
				}
				break;
			case 3:
				_localctx = new DeclaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				declaration();
				}
				break;
			case 4:
				_localctx = new AttrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				attribution();
				}
				break;
			case 5:
				_localctx = new PenCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				((PenCommandContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
					((PenCommandContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(36);
				match(ID);
				}
				break;
			case 6:
				_localctx = new DoActionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				match(ID);
				setState(38);
				action();
				}
				break;
			case 7:
				_localctx = new IfElifElseStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(39);
				match(T__4);
				setState(40);
				expr(0);
				setState(41);
				match(T__5);
				setState(42);
				match(T__6);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << COMMENT) | (1L << TYPE) | (1L << STATUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLOUR - 64)) | (1L << (BOOLEAN - 64)) | (1L << (NUMBER - 64)) | (1L << (STRING - 64)) | (1L << (PATTERN - 64)) | (1L << (ID - 64)) | (1L << (DEGREE - 64)))) != 0)) {
					{
					{
					setState(43);
					stat();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(T__7);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(50);
					elif();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(56);
					els();
					}
				}

				}
				break;
			case 8:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				match(T__8);
				setState(60);
				match(ID);
				setState(61);
				match(T__9);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(62);
					((ForLoopContext)_localctx).r = match(T__10);
					}
				}

				setState(65);
				expr(0);
				setState(66);
				match(T__11);
				setState(67);
				match(T__6);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << COMMENT) | (1L << TYPE) | (1L << STATUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLOUR - 64)) | (1L << (BOOLEAN - 64)) | (1L << (NUMBER - 64)) | (1L << (STRING - 64)) | (1L << (PATTERN - 64)) | (1L << (ID - 64)) | (1L << (DEGREE - 64)))) != 0)) {
					{
					{
					setState(68);
					stat();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(T__7);
				}
				break;
			case 9:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				match(T__12);
				setState(77);
				expr(0);
				setState(78);
				match(T__11);
				setState(79);
				match(T__6);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << COMMENT) | (1L << TYPE) | (1L << STATUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLOUR - 64)) | (1L << (BOOLEAN - 64)) | (1L << (NUMBER - 64)) | (1L << (STRING - 64)) | (1L << (PATTERN - 64)) | (1L << (ID - 64)) | (1L << (DEGREE - 64)))) != 0)) {
					{
					{
					setState(80);
					stat();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__7);
				}
				break;
			case 10:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(88);
				match(T__13);
				setState(89);
				match(ID);
				setState(90);
				match(T__14);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					{
					setState(91);
					arg();
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(92);
						match(T__15);
						setState(93);
						arg();
						}
						}
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(101);
				match(T__16);
				setState(102);
				match(T__11);
				setState(103);
				match(T__6);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << COMMENT) | (1L << TYPE) | (1L << STATUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLOUR - 64)) | (1L << (BOOLEAN - 64)) | (1L << (NUMBER - 64)) | (1L << (STRING - 64)) | (1L << (PATTERN - 64)) | (1L << (ID - 64)) | (1L << (DEGREE - 64)))) != 0)) {
					{
					{
					setState(104);
					stat();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(110);
					match(T__17);
					setState(111);
					expr(0);
					}
				}

				setState(114);
				match(T__7);
				}
				break;
			case 11:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(115);
				match(T__18);
				setState(116);
				expr(0);
				setState(117);
				match(T__16);
				}
				break;
			case 12:
				_localctx = new ArrayAddContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(119);
				match(T__19);
				setState(120);
				expr(0);
				setState(121);
				match(T__20);
				setState(122);
				match(ID);
				}
				break;
			case 13:
				_localctx = new ArrayRemoveContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(124);
				match(T__21);
				setState(125);
				expr(0);
				setState(126);
				match(T__22);
				setState(127);
				match(ID);
				}
				break;
			case 14:
				_localctx = new IDIDContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(129);
				match(ID);
				setState(130);
				match(ID);
				}
				break;
			case 15:
				_localctx = new GoExprContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(131);
				expr(0);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(pdrawParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(TYPE);
			setState(135);
			match(ID);
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

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PenChangeToContext extends ActionContext {
		public List<ChgContext> chg() {
			return getRuleContexts(ChgContext.class);
		}
		public ChgContext chg(int i) {
			return getRuleContext(ChgContext.class,i);
		}
		public PenChangeToContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterPenChangeTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitPenChangeTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitPenChangeTo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PenRotateBYContext extends ActionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PenRotateBYContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterPenRotateBY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitPenRotateBY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitPenRotateBY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PenMoveToContext extends ActionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PenMoveToContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterPenMoveTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitPenMoveTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitPenMoveTo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PenMoveByContext extends ActionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PenMoveByContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterPenMoveBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitPenMoveBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitPenMoveBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_action);
		int _la;
		try {
			int _alt;
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new PenMoveToContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__23);
				setState(138);
				match(T__14);
				setState(139);
				expr(0);
				setState(140);
				match(T__15);
				setState(141);
				expr(0);
				setState(142);
				match(T__16);
				}
				break;
			case T__24:
				_localctx = new PenMoveByContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__24);
				setState(145);
				match(T__14);
				setState(146);
				expr(0);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(147);
					match(T__15);
					setState(148);
					expr(0);
					}
				}

				setState(151);
				match(T__16);
				}
				break;
			case T__25:
				_localctx = new PenRotateBYContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__25);
				setState(154);
				expr(0);
				}
				break;
			case T__26:
				_localctx = new PenChangeToContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(T__26);
				setState(157); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(156);
						chg();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(159); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ElifContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			match(T__27);
			setState(164);
			expr(0);
			setState(165);
			match(T__5);
			setState(166);
			match(T__6);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << COMMENT) | (1L << TYPE) | (1L << STATUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLOUR - 64)) | (1L << (BOOLEAN - 64)) | (1L << (NUMBER - 64)) | (1L << (STRING - 64)) | (1L << (PATTERN - 64)) | (1L << (ID - 64)) | (1L << (DEGREE - 64)))) != 0)) {
				{
				{
				setState(167);
				stat();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__7);
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

	public static class ElsContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_els; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterEls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitEls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitEls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsContext els() throws RecognitionException {
		ElsContext _localctx = new ElsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_els);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(175);
			match(T__28);
			setState(176);
			match(T__5);
			setState(177);
			match(T__6);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << COMMENT) | (1L << TYPE) | (1L << STATUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLOUR - 64)) | (1L << (BOOLEAN - 64)) | (1L << (NUMBER - 64)) | (1L << (STRING - 64)) | (1L << (PATTERN - 64)) | (1L << (ID - 64)) | (1L << (DEGREE - 64)))) != 0)) {
				{
				{
				setState(178);
				stat();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(T__7);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(pdrawParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(TYPE);
			setState(187);
			match(ID);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(188);
				match(T__29);
				setState(189);
				expr(0);
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

	public static class ChgContext extends ParserRuleContext {
		public Token prop;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ChgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterChg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitChg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitChg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChgContext chg() throws RecognitionException {
		ChgContext _localctx = new ChgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_chg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((ChgContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
				((ChgContext)_localctx).prop = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(193);
			match(T__29);
			setState(194);
			expr(0);
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

	public static class AttributionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitAttribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitAttribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(197);
			match(T__29);
			setState(198);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprPatternContext extends ExprContext {
		public TerminalNode PATTERN() { return getToken(pdrawParser.PATTERN, 0); }
		public ExprPatternContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEqualsContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprEqualsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(pdrawParser.STRING, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLengthContext extends ExprContext {
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ExprLengthContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprLength(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(pdrawParser.BOOLEAN, 0); }
		public ExprBooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprInputContext extends ExprContext {
		public Token op;
		public TerminalNode STRING() { return getToken(pdrawParser.STRING, 0); }
		public ExprInputContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprColourContext extends ExprContext {
		public TerminalNode COLOUR() { return getToken(pdrawParser.COLOUR, 0); }
		public ExprColourContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprColour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprColour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprColour(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndORContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAndORContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprAndOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprAndOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprAndOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrayContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprArrayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprMultDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprMultDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprMultDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprGetContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ExprGetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprGet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDegreeContext extends ExprContext {
		public TerminalNode DEGREE() { return getToken(pdrawParser.DEGREE, 0); }
		public ExprDegreeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprDegree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprDegree(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPenContext extends ExprContext {
		public ExprContext posx;
		public ExprContext posy;
		public ExprContext thickness;
		public List<TerminalNode> STATUS() { return getTokens(pdrawParser.STATUS); }
		public TerminalNode STATUS(int i) {
			return getToken(pdrawParser.STATUS, i);
		}
		public List<TerminalNode> DEGREE() { return getTokens(pdrawParser.DEGREE); }
		public TerminalNode DEGREE(int i) {
			return getToken(pdrawParser.DEGREE, i);
		}
		public List<TerminalNode> COLOUR() { return getTokens(pdrawParser.COLOUR); }
		public TerminalNode COLOUR(int i) {
			return getToken(pdrawParser.COLOUR, i);
		}
		public List<TerminalNode> PATTERN() { return getTokens(pdrawParser.PATTERN); }
		public TerminalNode PATTERN(int i) {
			return getToken(pdrawParser.PATTERN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprPenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprPen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprPen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprPen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprActionContext extends ExprContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ExprActionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprAction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunctionContext extends ExprContext {
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(pdrawParser.NUMBER, 0); }
		public ExprNumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatusContext extends ExprContext {
		public TerminalNode STATUS() { return getToken(pdrawParser.STATUS, 0); }
		public ExprStatusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprStatus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(pdrawParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPlusMinusContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprPlusMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprExponentContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprExponentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdrawVisitor ) return ((pdrawVisitor<? extends T>)visitor).visitExprExponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(201);
				match(T__14);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
					{
					setState(216);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__37:
						{
						setState(202);
						match(T__37);
						setState(203);
						match(STATUS);
						}
						break;
					case T__38:
						{
						setState(204);
						match(T__38);
						setState(205);
						((ExprPenContext)_localctx).posx = expr(0);
						}
						break;
					case T__39:
						{
						setState(206);
						match(T__39);
						setState(207);
						((ExprPenContext)_localctx).posy = expr(0);
						}
						break;
					case T__40:
						{
						setState(208);
						match(T__40);
						setState(209);
						match(DEGREE);
						}
						break;
					case T__41:
						{
						setState(210);
						match(T__41);
						setState(211);
						match(COLOUR);
						}
						break;
					case T__42:
						{
						setState(212);
						match(T__42);
						setState(213);
						((ExprPenContext)_localctx).thickness = expr(0);
						}
						break;
					case T__43:
						{
						setState(214);
						match(T__43);
						setState(215);
						match(PATTERN);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						setState(239);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(218);
							match(T__15);
							setState(219);
							match(T__37);
							setState(220);
							match(STATUS);
							}
							break;
						case 2:
							{
							setState(221);
							match(T__15);
							setState(222);
							match(T__38);
							setState(223);
							((ExprPenContext)_localctx).posx = expr(0);
							}
							break;
						case 3:
							{
							setState(224);
							match(T__15);
							setState(225);
							match(T__39);
							setState(226);
							((ExprPenContext)_localctx).posy = expr(0);
							}
							break;
						case 4:
							{
							setState(227);
							match(T__15);
							setState(228);
							match(T__40);
							setState(229);
							match(DEGREE);
							}
							break;
						case 5:
							{
							setState(230);
							match(T__15);
							setState(231);
							match(T__41);
							setState(232);
							match(COLOUR);
							}
							break;
						case 6:
							{
							setState(233);
							match(T__15);
							setState(234);
							match(T__42);
							setState(235);
							((ExprPenContext)_localctx).thickness = expr(0);
							}
							break;
						case 7:
							{
							setState(236);
							match(T__15);
							setState(237);
							match(T__43);
							setState(238);
							match(PATTERN);
							}
							break;
						}
						}
						setState(243);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(246);
				match(T__16);
				}
				break;
			case 2:
				{
				_localctx = new ExprActionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				action();
				}
				break;
			case 3:
				{
				_localctx = new ExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(T__44);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (T__23 - 15)) | (1L << (T__24 - 15)) | (1L << (T__25 - 15)) | (1L << (T__26 - 15)) | (1L << (T__44 - 15)) | (1L << (T__46 - 15)) | (1L << (T__52 - 15)) | (1L << (T__56 - 15)) | (1L << (T__57 - 15)) | (1L << (T__58 - 15)) | (1L << (T__59 - 15)) | (1L << (STATUS - 15)) | (1L << (COLOUR - 15)) | (1L << (BOOLEAN - 15)) | (1L << (NUMBER - 15)) | (1L << (STRING - 15)) | (1L << (PATTERN - 15)) | (1L << (ID - 15)) | (1L << (DEGREE - 15)))) != 0)) {
					{
					setState(249);
					expr(0);
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(250);
						match(T__15);
						setState(251);
						expr(0);
						}
						}
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(259);
				match(T__45);
				}
				break;
			case 4:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(T__14);
				setState(261);
				expr(0);
				setState(262);
				match(T__16);
				}
				break;
			case 5:
				{
				_localctx = new ExprMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(T__46);
				setState(265);
				expr(19);
				}
				break;
			case 6:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(T__52);
				setState(267);
				expr(15);
				}
				break;
			case 7:
				{
				_localctx = new ExprGetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(T__56);
				setState(269);
				expr(0);
				setState(270);
				match(T__22);
				setState(271);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ExprLengthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(T__57);
				setState(274);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ExprInputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				((ExprInputContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__58 || _la==T__59) ) {
					((ExprInputContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(276);
				match(T__14);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(277);
					match(STRING);
					}
				}

				setState(280);
				match(T__16);
				}
				break;
			case 10:
				{
				_localctx = new ExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				match(ID);
				setState(282);
				match(T__14);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (T__23 - 15)) | (1L << (T__24 - 15)) | (1L << (T__25 - 15)) | (1L << (T__26 - 15)) | (1L << (T__44 - 15)) | (1L << (T__46 - 15)) | (1L << (T__52 - 15)) | (1L << (T__56 - 15)) | (1L << (T__57 - 15)) | (1L << (T__58 - 15)) | (1L << (T__59 - 15)) | (1L << (STATUS - 15)) | (1L << (COLOUR - 15)) | (1L << (BOOLEAN - 15)) | (1L << (NUMBER - 15)) | (1L << (STRING - 15)) | (1L << (PATTERN - 15)) | (1L << (ID - 15)) | (1L << (DEGREE - 15)))) != 0)) {
					{
					setState(283);
					expr(0);
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(284);
						match(T__15);
						setState(285);
						expr(0);
						}
						}
						setState(290);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(293);
				match(T__16);
				}
				break;
			case 11:
				{
				_localctx = new ExprNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				match(NUMBER);
				}
				break;
			case 12:
				{
				_localctx = new ExprStatusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(STATUS);
				}
				break;
			case 13:
				{
				_localctx = new ExprBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				match(BOOLEAN);
				}
				break;
			case 14:
				{
				_localctx = new ExprColourContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(COLOUR);
				}
				break;
			case 15:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(STRING);
				}
				break;
			case 16:
				{
				_localctx = new ExprDegreeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				match(DEGREE);
				}
				break;
			case 17:
				{
				_localctx = new ExprPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(PATTERN);
				}
				break;
			case 18:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprExponentContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(305);
						match(T__47);
						setState(306);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new ExprMultDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(308);
						((ExprMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
							((ExprMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(309);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new ExprPlusMinusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(311);
						((ExprPlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__46 || _la==T__51) ) {
							((ExprPlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(312);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new ExprAndORContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(314);
						((ExprAndORContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__54) ) {
							((ExprAndORContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(315);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprEqualsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(316);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(317);
						match(T__55);
						setState(318);
						expr(14);
						}
						break;
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u0147\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3\3"+
		"\3\7\3\66\n\3\f\3\16\39\13\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\3"+
		"\3\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3T"+
		"\n\3\f\3\16\3W\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16\3"+
		"d\13\3\5\3f\n\3\3\3\3\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\3\3\5\3s\n"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u0087\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0098\n\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u00a0\n\5\r\5\16\5"+
		"\u00a1\5\5\u00a4\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u00ab\n\6\f\6\16\6\u00ae"+
		"\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00b6\n\7\f\7\16\7\u00b9\13\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\5\b\u00c1\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00db\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00f2\n\13"+
		"\f\13\16\13\u00f5\13\13\5\13\u00f7\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u00ff\n\13\f\13\16\13\u0102\13\13\5\13\u0104\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0119\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0121\n"+
		"\13\f\13\16\13\u0124\13\13\5\13\u0126\n\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0131\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0142\n\13\f\13\16\13\u0145"+
		"\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\b\3\2\5\6\3\2!\'\3\2=>"+
		"\3\2\63\65\4\2\61\61\66\66\3\289\2\u0186\2\31\3\2\2\2\4\u0086\3\2\2\2"+
		"\6\u0088\3\2\2\2\b\u00a3\3\2\2\2\n\u00a5\3\2\2\2\f\u00b1\3\2\2\2\16\u00bc"+
		"\3\2\2\2\20\u00c2\3\2\2\2\22\u00c6\3\2\2\2\24\u0130\3\2\2\2\26\30\5\4"+
		"\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2"+
		"\2\2\33\31\3\2\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36\u0087\7?\2\2\37 \7\3"+
		"\2\2 !\7E\2\2!\"\7\4\2\2\"\u0087\7G\2\2#\u0087\5\16\b\2$\u0087\5\22\n"+
		"\2%&\t\2\2\2&\u0087\7G\2\2\'(\7G\2\2(\u0087\5\b\5\2)*\7\7\2\2*+\5\24\13"+
		"\2+,\7\b\2\2,\60\7\t\2\2-/\5\4\3\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60"+
		"\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\67\7\n\2\2\64\66\5\n\6\2\65"+
		"\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29\67\3\2\2"+
		"\2:<\5\f\7\2;:\3\2\2\2;<\3\2\2\2<\u0087\3\2\2\2=>\7\13\2\2>?\7G\2\2?A"+
		"\7\f\2\2@B\7\r\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\5\24\13\2DE\7\16\2"+
		"\2EI\7\t\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2"+
		"\2KI\3\2\2\2LM\7\n\2\2M\u0087\3\2\2\2NO\7\17\2\2OP\5\24\13\2PQ\7\16\2"+
		"\2QU\7\t\2\2RT\5\4\3\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2"+
		"\2WU\3\2\2\2XY\7\n\2\2Y\u0087\3\2\2\2Z[\7\20\2\2[\\\7G\2\2\\e\7\21\2\2"+
		"]b\5\6\4\2^_\7\22\2\2_a\5\6\4\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2"+
		"\2cf\3\2\2\2db\3\2\2\2e]\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\23\2\2hi\7\16"+
		"\2\2im\7\t\2\2jl\5\4\3\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nr\3\2"+
		"\2\2om\3\2\2\2pq\7\24\2\2qs\5\24\13\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2t\u0087"+
		"\7\n\2\2uv\7\25\2\2vw\5\24\13\2wx\7\23\2\2x\u0087\3\2\2\2yz\7\26\2\2z"+
		"{\5\24\13\2{|\7\27\2\2|}\7G\2\2}\u0087\3\2\2\2~\177\7\30\2\2\177\u0080"+
		"\5\24\13\2\u0080\u0081\7\31\2\2\u0081\u0082\7G\2\2\u0082\u0087\3\2\2\2"+
		"\u0083\u0084\7G\2\2\u0084\u0087\7G\2\2\u0085\u0087\5\24\13\2\u0086\36"+
		"\3\2\2\2\u0086\37\3\2\2\2\u0086#\3\2\2\2\u0086$\3\2\2\2\u0086%\3\2\2\2"+
		"\u0086\'\3\2\2\2\u0086)\3\2\2\2\u0086=\3\2\2\2\u0086N\3\2\2\2\u0086Z\3"+
		"\2\2\2\u0086u\3\2\2\2\u0086y\3\2\2\2\u0086~\3\2\2\2\u0086\u0083\3\2\2"+
		"\2\u0086\u0085\3\2\2\2\u0087\5\3\2\2\2\u0088\u0089\7@\2\2\u0089\u008a"+
		"\7G\2\2\u008a\7\3\2\2\2\u008b\u008c\7\32\2\2\u008c\u008d\7\21\2\2\u008d"+
		"\u008e\5\24\13\2\u008e\u008f\7\22\2\2\u008f\u0090\5\24\13\2\u0090\u0091"+
		"\7\23\2\2\u0091\u00a4\3\2\2\2\u0092\u0093\7\33\2\2\u0093\u0094\7\21\2"+
		"\2\u0094\u0097\5\24\13\2\u0095\u0096\7\22\2\2\u0096\u0098\5\24\13\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\23"+
		"\2\2\u009a\u00a4\3\2\2\2\u009b\u009c\7\34\2\2\u009c\u00a4\5\24\13\2\u009d"+
		"\u009f\7\35\2\2\u009e\u00a0\5\20\t\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u008b\3\2\2\2\u00a3\u0092\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009d\3\2"+
		"\2\2\u00a4\t\3\2\2\2\u00a5\u00a6\7\36\2\2\u00a6\u00a7\5\24\13\2\u00a7"+
		"\u00a8\7\b\2\2\u00a8\u00ac\7\t\2\2\u00a9\u00ab\5\4\3\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0\13\3\2\2"+
		"\2\u00b1\u00b2\7\37\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b7\7\t\2\2\u00b4"+
		"\u00b6\5\4\3\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\n\2\2\u00bb\r\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd\u00c0\7G\2\2\u00be"+
		"\u00bf\7 \2\2\u00bf\u00c1\5\24\13\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\17\3\2\2\2\u00c2\u00c3\t\3\2\2\u00c3\u00c4\7 \2\2\u00c4\u00c5"+
		"\5\24\13\2\u00c5\21\3\2\2\2\u00c6\u00c7\7G\2\2\u00c7\u00c8\7 \2\2\u00c8"+
		"\u00c9\5\24\13\2\u00c9\23\3\2\2\2\u00ca\u00cb\b\13\1\2\u00cb\u00f6\7\21"+
		"\2\2\u00cc\u00cd\7(\2\2\u00cd\u00db\7A\2\2\u00ce\u00cf\7)\2\2\u00cf\u00db"+
		"\5\24\13\2\u00d0\u00d1\7*\2\2\u00d1\u00db\5\24\13\2\u00d2\u00d3\7+\2\2"+
		"\u00d3\u00db\7I\2\2\u00d4\u00d5\7,\2\2\u00d5\u00db\7B\2\2\u00d6\u00d7"+
		"\7-\2\2\u00d7\u00db\5\24\13\2\u00d8\u00d9\7.\2\2\u00d9\u00db\7F\2\2\u00da"+
		"\u00cc\3\2\2\2\u00da\u00ce\3\2\2\2\u00da\u00d0\3\2\2\2\u00da\u00d2\3\2"+
		"\2\2\u00da\u00d4\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00f3\3\2\2\2\u00dc\u00dd\7\22\2\2\u00dd\u00de\7(\2\2\u00de\u00f2\7A"+
		"\2\2\u00df\u00e0\7\22\2\2\u00e0\u00e1\7)\2\2\u00e1\u00f2\5\24\13\2\u00e2"+
		"\u00e3\7\22\2\2\u00e3\u00e4\7*\2\2\u00e4\u00f2\5\24\13\2\u00e5\u00e6\7"+
		"\22\2\2\u00e6\u00e7\7+\2\2\u00e7\u00f2\7I\2\2\u00e8\u00e9\7\22\2\2\u00e9"+
		"\u00ea\7,\2\2\u00ea\u00f2\7B\2\2\u00eb\u00ec\7\22\2\2\u00ec\u00ed\7-\2"+
		"\2\u00ed\u00f2\5\24\13\2\u00ee\u00ef\7\22\2\2\u00ef\u00f0\7.\2\2\u00f0"+
		"\u00f2\7F\2\2\u00f1\u00dc\3\2\2\2\u00f1\u00df\3\2\2\2\u00f1\u00e2\3\2"+
		"\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1"+
		"\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00da\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0131\7\23\2\2\u00f9\u0131\5"+
		"\b\5\2\u00fa\u0103\7/\2\2\u00fb\u0100\5\24\13\2\u00fc\u00fd\7\22\2\2\u00fd"+
		"\u00ff\5\24\13\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u00fb\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0131\7\60"+
		"\2\2\u0106\u0107\7\21\2\2\u0107\u0108\5\24\13\2\u0108\u0109\7\23\2\2\u0109"+
		"\u0131\3\2\2\2\u010a\u010b\7\61\2\2\u010b\u0131\5\24\13\25\u010c\u010d"+
		"\7\67\2\2\u010d\u0131\5\24\13\21\u010e\u010f\7;\2\2\u010f\u0110\5\24\13"+
		"\2\u0110\u0111\7\31\2\2\u0111\u0112\7G\2\2\u0112\u0131\3\2\2\2\u0113\u0114"+
		"\7<\2\2\u0114\u0131\7G\2\2\u0115\u0116\t\4\2\2\u0116\u0118\7\21\2\2\u0117"+
		"\u0119\7E\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u0131\7\23\2\2\u011b\u011c\7G\2\2\u011c\u0125\7\21\2\2\u011d"+
		"\u0122\5\24\13\2\u011e\u011f\7\22\2\2\u011f\u0121\5\24\13\2\u0120\u011e"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0131\7\23\2\2\u0128\u0131\7D\2\2\u0129"+
		"\u0131\7A\2\2\u012a\u0131\7C\2\2\u012b\u0131\7B\2\2\u012c\u0131\7E\2\2"+
		"\u012d\u0131\7I\2\2\u012e\u0131\7F\2\2\u012f\u0131\7G\2\2\u0130\u00ca"+
		"\3\2\2\2\u0130\u00f9\3\2\2\2\u0130\u00fa\3\2\2\2\u0130\u0106\3\2\2\2\u0130"+
		"\u010a\3\2\2\2\u0130\u010c\3\2\2\2\u0130\u010e\3\2\2\2\u0130\u0113\3\2"+
		"\2\2\u0130\u0115\3\2\2\2\u0130\u011b\3\2\2\2\u0130\u0128\3\2\2\2\u0130"+
		"\u0129\3\2\2\2\u0130\u012a\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2"+
		"\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0143\3\2\2\2\u0132\u0133\f\24\2\2\u0133\u0134\7\62\2\2\u0134\u0142\5"+
		"\24\13\25\u0135\u0136\f\23\2\2\u0136\u0137\t\5\2\2\u0137\u0142\5\24\13"+
		"\24\u0138\u0139\f\22\2\2\u0139\u013a\t\6\2\2\u013a\u0142\5\24\13\23\u013b"+
		"\u013c\f\20\2\2\u013c\u013d\t\7\2\2\u013d\u0142\5\24\13\21\u013e\u013f"+
		"\f\17\2\2\u013f\u0140\7:\2\2\u0140\u0142\5\24\13\20\u0141\u0132\3\2\2"+
		"\2\u0141\u0135\3\2\2\2\u0141\u0138\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u013e"+
		"\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\25\3\2\2\2\u0145\u0143\3\2\2\2 \31\60\67;AIUbemr\u0086\u0097\u00a1\u00a3"+
		"\u00ac\u00b7\u00c0\u00da\u00f1\u00f3\u00f6\u0100\u0103\u0118\u0122\u0125"+
		"\u0130\u0141\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}