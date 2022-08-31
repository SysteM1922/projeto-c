// Generated from pens.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pensParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STATUS=15, NUMBER=16, 
		HEX=17, COLOUR=18, PATTERN=19, ID=20, LITERALCOLOUR=21, DEGREE=22, WS=23, 
		COMMENT=24, NEWLINE=25;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_pen = 2, RULE_posX = 3, RULE_posY = 4, 
		RULE_thickness = 5, RULE_expr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "pen", "posX", "posY", "thickness", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "'status='", "'posx='", "'posy='", "'heading='", 
			"'colour='", "'thickness='", "'pattern='", "')'", "'-'", "'*'", "'/'", 
			"'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STATUS", "NUMBER", "HEX", "COLOUR", "PATTERN", "ID", 
			"LITERALCOLOUR", "DEGREE", "WS", "COMMENT", "NEWLINE"
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
	public String getGrammarFileName() { return "pens.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pensParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pensParser.EOF, 0); }
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
			if ( listener instanceof pensListener ) ((pensListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(14);
				stat();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
	public static class DeclaContext extends StatContext {
		public PenContext pen() {
			return getRuleContext(PenContext.class,0);
		}
		public DeclaContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			_localctx = new DeclaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			pen();
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

	public static class PenContext extends ParserRuleContext {
		public PenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pen; }
	 
		public PenContext() { }
		public void copyFrom(PenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PenDefinitionContext extends PenContext {
		public TerminalNode ID() { return getToken(pensParser.ID, 0); }
		public TerminalNode STATUS() { return getToken(pensParser.STATUS, 0); }
		public PosXContext posX() {
			return getRuleContext(PosXContext.class,0);
		}
		public PosYContext posY() {
			return getRuleContext(PosYContext.class,0);
		}
		public TerminalNode DEGREE() { return getToken(pensParser.DEGREE, 0); }
		public TerminalNode COLOUR() { return getToken(pensParser.COLOUR, 0); }
		public ThicknessContext thickness() {
			return getRuleContext(ThicknessContext.class,0);
		}
		public TerminalNode PATTERN() { return getToken(pensParser.PATTERN, 0); }
		public PenDefinitionContext(PenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterPenDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitPenDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitPenDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenContext pen() throws RecognitionException {
		PenContext _localctx = new PenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pen);
		int _la;
		try {
			_localctx = new PenDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			match(ID);
			setState(26);
			match(T__1);
			setState(27);
			match(T__2);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(28);
				match(STATUS);
				}
			}

			setState(31);
			match(T__1);
			setState(32);
			match(T__3);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << STATUS) | (1L << NUMBER) | (1L << COLOUR) | (1L << PATTERN) | (1L << DEGREE))) != 0)) {
				{
				setState(33);
				posX();
				}
			}

			setState(36);
			match(T__1);
			setState(37);
			match(T__4);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << STATUS) | (1L << NUMBER) | (1L << COLOUR) | (1L << PATTERN) | (1L << DEGREE))) != 0)) {
				{
				setState(38);
				posY();
				}
			}

			setState(41);
			match(T__1);
			setState(42);
			match(T__5);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEGREE) {
				{
				setState(43);
				match(DEGREE);
				}
			}

			setState(46);
			match(T__1);
			setState(47);
			match(T__6);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOUR) {
				{
				setState(48);
				match(COLOUR);
				}
			}

			setState(51);
			match(T__1);
			setState(52);
			match(T__7);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << STATUS) | (1L << NUMBER) | (1L << COLOUR) | (1L << PATTERN) | (1L << DEGREE))) != 0)) {
				{
				setState(53);
				thickness();
				}
			}

			setState(56);
			match(T__1);
			setState(57);
			match(T__8);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATTERN) {
				{
				setState(58);
				match(PATTERN);
				}
			}

			setState(61);
			match(T__9);
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

	public static class PosXContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PosXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterPosX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitPosX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitPosX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosXContext posX() throws RecognitionException {
		PosXContext _localctx = new PosXContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_posX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
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

	public static class PosYContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PosYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterPosY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitPosY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitPosY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosYContext posY() throws RecognitionException {
		PosYContext _localctx = new PosYContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_posY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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

	public static class ThicknessContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ThicknessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thickness; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterThickness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitThickness(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitThickness(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThicknessContext thickness() throws RecognitionException {
		ThicknessContext _localctx = new ThicknessContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_thickness);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
	public static class ExprAddSubContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPatternContext extends ExprContext {
		public TerminalNode PATTERN() { return getToken(pensParser.PATTERN, 0); }
		public ExprPatternContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterExprPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitExprPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitExprPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDegreeContext extends ExprContext {
		public TerminalNode DEGREE() { return getToken(pensParser.DEGREE, 0); }
		public ExprDegreeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterExprDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitExprDegree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitExprDegree(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinusContext extends ExprContext {
		public Token op;
		public ExprContext e2;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterExprMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitExprMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitExprMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParentContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterExprParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitExprParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitExprParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(pensParser.NUMBER, 0); }
		public ExprNumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterExprNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitExprNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitExprNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatusContext extends ExprContext {
		public TerminalNode STATUS() { return getToken(pensParser.STATUS, 0); }
		public ExprStatusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterExprStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitExprStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitExprStatus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprColourContext extends ExprContext {
		public TerminalNode COLOUR() { return getToken(pensParser.COLOUR, 0); }
		public ExprColourContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterExprColour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitExprColour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitExprColour(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultDivModContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).enterExprMultDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pensListener ) ((pensListener)listener).exitExprMultDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pensVisitor ) return ((pensVisitor<? extends T>)visitor).visitExprMultDivMod(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				_localctx = new ExprMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70);
				((ExprMinusContext)_localctx).op = match(T__10);
				setState(71);
				((ExprMinusContext)_localctx).e2 = expr(9);
				}
				break;
			case T__0:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(T__0);
				setState(73);
				expr(0);
				setState(74);
				match(T__9);
				}
				break;
			case NUMBER:
				{
				_localctx = new ExprNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(NUMBER);
				}
				break;
			case STATUS:
				{
				_localctx = new ExprStatusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(STATUS);
				}
				break;
			case COLOUR:
				{
				_localctx = new ExprColourContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(COLOUR);
				}
				break;
			case DEGREE:
				{
				_localctx = new ExprDegreeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(DEGREE);
				}
				break;
			case PATTERN:
				{
				_localctx = new ExprPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(PATTERN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivModContext(new ExprContext(_parentctx, _parentState));
						((ExprMultDivModContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(84);
						((ExprMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
							((ExprMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						((ExprMultDivModContext)_localctx).e2 = expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						((ExprAddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(87);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__13) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						((ExprAddSubContext)_localctx).e2 = expr(8);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\4\3\4\3\4\5\4%\n"+
		"\4\3\4\3\4\3\4\5\4*\n\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\5\4\64\n\4\3"+
		"\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bT\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2"+
		"\4\3\2\16\17\4\2\r\r\20\20\2i\2\23\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b"+
		"A\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16S\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2"+
		"\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2"+
		"\2\26\27\7\2\2\3\27\3\3\2\2\2\30\31\5\6\4\2\31\5\3\2\2\2\32\33\7\3\2\2"+
		"\33\34\7\26\2\2\34\35\7\4\2\2\35\37\7\5\2\2\36 \7\21\2\2\37\36\3\2\2\2"+
		"\37 \3\2\2\2 !\3\2\2\2!\"\7\4\2\2\"$\7\6\2\2#%\5\b\5\2$#\3\2\2\2$%\3\2"+
		"\2\2%&\3\2\2\2&\'\7\4\2\2\')\7\7\2\2(*\5\n\6\2)(\3\2\2\2)*\3\2\2\2*+\3"+
		"\2\2\2+,\7\4\2\2,.\7\b\2\2-/\7\30\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2"+
		"\60\61\7\4\2\2\61\63\7\t\2\2\62\64\7\24\2\2\63\62\3\2\2\2\63\64\3\2\2"+
		"\2\64\65\3\2\2\2\65\66\7\4\2\2\668\7\n\2\2\679\5\f\7\28\67\3\2\2\289\3"+
		"\2\2\29:\3\2\2\2:;\7\4\2\2;=\7\13\2\2<>\7\25\2\2=<\3\2\2\2=>\3\2\2\2>"+
		"?\3\2\2\2?@\7\f\2\2@\7\3\2\2\2AB\5\16\b\2B\t\3\2\2\2CD\5\16\b\2D\13\3"+
		"\2\2\2EF\5\16\b\2F\r\3\2\2\2GH\b\b\1\2HI\7\r\2\2IT\5\16\b\13JK\7\3\2\2"+
		"KL\5\16\b\2LM\7\f\2\2MT\3\2\2\2NT\7\22\2\2OT\7\21\2\2PT\7\24\2\2QT\7\30"+
		"\2\2RT\7\25\2\2SG\3\2\2\2SJ\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3"+
		"\2\2\2SR\3\2\2\2T]\3\2\2\2UV\f\n\2\2VW\t\2\2\2W\\\5\16\b\13XY\f\t\2\2"+
		"YZ\t\3\2\2Z\\\5\16\b\n[U\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2"+
		"\2\2^\17\3\2\2\2_]\3\2\2\2\r\23\37$).\638=S[]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}