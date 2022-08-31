# Generated from pens.g4 by ANTLR 4.9.3
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33")
        buf.write("a\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\3\2\7\2\22\n\2\f\2\16\2\25\13\2\3\2\3\2\3\3\3\3\3")
        buf.write("\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\4\3\4\3\4\5\4%\n\4\3\4\3")
        buf.write("\4\3\4\5\4*\n\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\5\4\64")
        buf.write("\n\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4")
        buf.write("\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3")
        buf.write("\b\3\b\3\b\3\b\3\b\5\bT\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7")
        buf.write("\b\\\n\b\f\b\16\b_\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2")
        buf.write("\4\3\2\16\17\4\2\r\r\20\20\2i\2\23\3\2\2\2\4\30\3\2\2")
        buf.write("\2\6\32\3\2\2\2\bA\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16S\3")
        buf.write("\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21")
        buf.write("\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26")
        buf.write("\27\7\2\2\3\27\3\3\2\2\2\30\31\5\6\4\2\31\5\3\2\2\2\32")
        buf.write("\33\7\3\2\2\33\34\7\26\2\2\34\35\7\4\2\2\35\37\7\5\2\2")
        buf.write("\36 \7\21\2\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7")
        buf.write("\4\2\2\"$\7\6\2\2#%\5\b\5\2$#\3\2\2\2$%\3\2\2\2%&\3\2")
        buf.write("\2\2&\'\7\4\2\2\')\7\7\2\2(*\5\n\6\2)(\3\2\2\2)*\3\2\2")
        buf.write("\2*+\3\2\2\2+,\7\4\2\2,.\7\b\2\2-/\7\30\2\2.-\3\2\2\2")
        buf.write("./\3\2\2\2/\60\3\2\2\2\60\61\7\4\2\2\61\63\7\t\2\2\62")
        buf.write("\64\7\24\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2")
        buf.write("\65\66\7\4\2\2\668\7\n\2\2\679\5\f\7\28\67\3\2\2\289\3")
        buf.write("\2\2\29:\3\2\2\2:;\7\4\2\2;=\7\13\2\2<>\7\25\2\2=<\3\2")
        buf.write("\2\2=>\3\2\2\2>?\3\2\2\2?@\7\f\2\2@\7\3\2\2\2AB\5\16\b")
        buf.write("\2B\t\3\2\2\2CD\5\16\b\2D\13\3\2\2\2EF\5\16\b\2F\r\3\2")
        buf.write("\2\2GH\b\b\1\2HI\7\r\2\2IT\5\16\b\13JK\7\3\2\2KL\5\16")
        buf.write("\b\2LM\7\f\2\2MT\3\2\2\2NT\7\22\2\2OT\7\21\2\2PT\7\24")
        buf.write("\2\2QT\7\30\2\2RT\7\25\2\2SG\3\2\2\2SJ\3\2\2\2SN\3\2\2")
        buf.write("\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T]\3\2\2\2U")
        buf.write("V\f\n\2\2VW\t\2\2\2W\\\5\16\b\13XY\f\t\2\2YZ\t\3\2\2Z")
        buf.write("\\\5\16\b\n[U\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]")
        buf.write("^\3\2\2\2^\17\3\2\2\2_]\3\2\2\2\r\23\37$).\638=S[]")
        return buf.getvalue()


class pensParser ( Parser ):

    grammarFileName = "pens.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "','", "'status='", "'posx='", 
                     "'posy='", "'heading='", "'colour='", "'thickness='", 
                     "'pattern='", "')'", "'-'", "'*'", "'/'", "'+'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "STATUS", "NUMBER", 
                      "HEX", "COLOUR", "PATTERN", "ID", "LITERALCOLOUR", 
                      "DEGREE", "WS", "COMMENT", "NEWLINE" ]

    RULE_program = 0
    RULE_stat = 1
    RULE_pen = 2
    RULE_posX = 3
    RULE_posY = 4
    RULE_thickness = 5
    RULE_expr = 6

    ruleNames =  [ "program", "stat", "pen", "posX", "posY", "thickness", 
                   "expr" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    STATUS=15
    NUMBER=16
    HEX=17
    COLOUR=18
    PATTERN=19
    ID=20
    LITERALCOLOUR=21
    DEGREE=22
    WS=23
    COMMENT=24
    NEWLINE=25

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(pensParser.EOF, 0)

        def stat(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pensParser.StatContext)
            else:
                return self.getTypedRuleContext(pensParser.StatContext,i)


        def getRuleIndex(self):
            return pensParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = pensParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 17
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==pensParser.T__0:
                self.state = 14
                self.stat()
                self.state = 19
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 20
            self.match(pensParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return pensParser.RULE_stat

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class DeclaContext(StatContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.StatContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def pen(self):
            return self.getTypedRuleContext(pensParser.PenContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDecla" ):
                listener.enterDecla(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDecla" ):
                listener.exitDecla(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDecla" ):
                return visitor.visitDecla(self)
            else:
                return visitor.visitChildren(self)



    def stat(self):

        localctx = pensParser.StatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_stat)
        try:
            localctx = pensParser.DeclaContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 22
            self.pen()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PenContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return pensParser.RULE_pen

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class PenDefinitionContext(PenContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.PenContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(pensParser.ID, 0)
        def STATUS(self):
            return self.getToken(pensParser.STATUS, 0)
        def posX(self):
            return self.getTypedRuleContext(pensParser.PosXContext,0)

        def posY(self):
            return self.getTypedRuleContext(pensParser.PosYContext,0)

        def DEGREE(self):
            return self.getToken(pensParser.DEGREE, 0)
        def COLOUR(self):
            return self.getToken(pensParser.COLOUR, 0)
        def thickness(self):
            return self.getTypedRuleContext(pensParser.ThicknessContext,0)

        def PATTERN(self):
            return self.getToken(pensParser.PATTERN, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPenDefinition" ):
                listener.enterPenDefinition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPenDefinition" ):
                listener.exitPenDefinition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPenDefinition" ):
                return visitor.visitPenDefinition(self)
            else:
                return visitor.visitChildren(self)



    def pen(self):

        localctx = pensParser.PenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_pen)
        self._la = 0 # Token type
        try:
            localctx = pensParser.PenDefinitionContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.match(pensParser.T__0)
            self.state = 25
            self.match(pensParser.ID)
            self.state = 26
            self.match(pensParser.T__1)
            self.state = 27
            self.match(pensParser.T__2)
            self.state = 29
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==pensParser.STATUS:
                self.state = 28
                self.match(pensParser.STATUS)


            self.state = 31
            self.match(pensParser.T__1)
            self.state = 32
            self.match(pensParser.T__3)
            self.state = 34
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << pensParser.T__0) | (1 << pensParser.T__10) | (1 << pensParser.STATUS) | (1 << pensParser.NUMBER) | (1 << pensParser.COLOUR) | (1 << pensParser.PATTERN) | (1 << pensParser.DEGREE))) != 0):
                self.state = 33
                self.posX()


            self.state = 36
            self.match(pensParser.T__1)
            self.state = 37
            self.match(pensParser.T__4)
            self.state = 39
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << pensParser.T__0) | (1 << pensParser.T__10) | (1 << pensParser.STATUS) | (1 << pensParser.NUMBER) | (1 << pensParser.COLOUR) | (1 << pensParser.PATTERN) | (1 << pensParser.DEGREE))) != 0):
                self.state = 38
                self.posY()


            self.state = 41
            self.match(pensParser.T__1)
            self.state = 42
            self.match(pensParser.T__5)
            self.state = 44
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==pensParser.DEGREE:
                self.state = 43
                self.match(pensParser.DEGREE)


            self.state = 46
            self.match(pensParser.T__1)
            self.state = 47
            self.match(pensParser.T__6)
            self.state = 49
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==pensParser.COLOUR:
                self.state = 48
                self.match(pensParser.COLOUR)


            self.state = 51
            self.match(pensParser.T__1)
            self.state = 52
            self.match(pensParser.T__7)
            self.state = 54
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << pensParser.T__0) | (1 << pensParser.T__10) | (1 << pensParser.STATUS) | (1 << pensParser.NUMBER) | (1 << pensParser.COLOUR) | (1 << pensParser.PATTERN) | (1 << pensParser.DEGREE))) != 0):
                self.state = 53
                self.thickness()


            self.state = 56
            self.match(pensParser.T__1)
            self.state = 57
            self.match(pensParser.T__8)
            self.state = 59
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==pensParser.PATTERN:
                self.state = 58
                self.match(pensParser.PATTERN)


            self.state = 61
            self.match(pensParser.T__9)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PosXContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(pensParser.ExprContext,0)


        def getRuleIndex(self):
            return pensParser.RULE_posX

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPosX" ):
                listener.enterPosX(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPosX" ):
                listener.exitPosX(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPosX" ):
                return visitor.visitPosX(self)
            else:
                return visitor.visitChildren(self)




    def posX(self):

        localctx = pensParser.PosXContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_posX)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PosYContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(pensParser.ExprContext,0)


        def getRuleIndex(self):
            return pensParser.RULE_posY

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPosY" ):
                listener.enterPosY(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPosY" ):
                listener.exitPosY(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPosY" ):
                return visitor.visitPosY(self)
            else:
                return visitor.visitChildren(self)




    def posY(self):

        localctx = pensParser.PosYContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_posY)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ThicknessContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(pensParser.ExprContext,0)


        def getRuleIndex(self):
            return pensParser.RULE_thickness

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterThickness" ):
                listener.enterThickness(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitThickness" ):
                listener.exitThickness(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitThickness" ):
                return visitor.visitThickness(self)
            else:
                return visitor.visitChildren(self)




    def thickness(self):

        localctx = pensParser.ThicknessContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_thickness)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return pensParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class ExprAddSubContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.ExprContext
            super().__init__(parser)
            self.e1 = None # ExprContext
            self.op = None # Token
            self.e2 = None # ExprContext
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pensParser.ExprContext)
            else:
                return self.getTypedRuleContext(pensParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprAddSub" ):
                listener.enterExprAddSub(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprAddSub" ):
                listener.exitExprAddSub(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprAddSub" ):
                return visitor.visitExprAddSub(self)
            else:
                return visitor.visitChildren(self)


    class ExprPatternContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def PATTERN(self):
            return self.getToken(pensParser.PATTERN, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprPattern" ):
                listener.enterExprPattern(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprPattern" ):
                listener.exitExprPattern(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprPattern" ):
                return visitor.visitExprPattern(self)
            else:
                return visitor.visitChildren(self)


    class ExprDegreeContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def DEGREE(self):
            return self.getToken(pensParser.DEGREE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprDegree" ):
                listener.enterExprDegree(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprDegree" ):
                listener.exitExprDegree(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprDegree" ):
                return visitor.visitExprDegree(self)
            else:
                return visitor.visitChildren(self)


    class ExprMinusContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.e2 = None # ExprContext
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(pensParser.ExprContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprMinus" ):
                listener.enterExprMinus(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprMinus" ):
                listener.exitExprMinus(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprMinus" ):
                return visitor.visitExprMinus(self)
            else:
                return visitor.visitChildren(self)


    class ExprParentContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(pensParser.ExprContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprParent" ):
                listener.enterExprParent(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprParent" ):
                listener.exitExprParent(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprParent" ):
                return visitor.visitExprParent(self)
            else:
                return visitor.visitChildren(self)


    class ExprNumberContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUMBER(self):
            return self.getToken(pensParser.NUMBER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprNumber" ):
                listener.enterExprNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprNumber" ):
                listener.exitExprNumber(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprNumber" ):
                return visitor.visitExprNumber(self)
            else:
                return visitor.visitChildren(self)


    class ExprStatusContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STATUS(self):
            return self.getToken(pensParser.STATUS, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprStatus" ):
                listener.enterExprStatus(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprStatus" ):
                listener.exitExprStatus(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprStatus" ):
                return visitor.visitExprStatus(self)
            else:
                return visitor.visitChildren(self)


    class ExprColourContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COLOUR(self):
            return self.getToken(pensParser.COLOUR, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprColour" ):
                listener.enterExprColour(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprColour" ):
                listener.exitExprColour(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprColour" ):
                return visitor.visitExprColour(self)
            else:
                return visitor.visitChildren(self)


    class ExprMultDivModContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a pensParser.ExprContext
            super().__init__(parser)
            self.e1 = None # ExprContext
            self.op = None # Token
            self.e2 = None # ExprContext
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pensParser.ExprContext)
            else:
                return self.getTypedRuleContext(pensParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprMultDivMod" ):
                listener.enterExprMultDivMod(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprMultDivMod" ):
                listener.exitExprMultDivMod(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprMultDivMod" ):
                return visitor.visitExprMultDivMod(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = pensParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 12
        self.enterRecursionRule(localctx, 12, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [pensParser.T__10]:
                localctx = pensParser.ExprMinusContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 70
                localctx.op = self.match(pensParser.T__10)
                self.state = 71
                localctx.e2 = self.expr(9)
                pass
            elif token in [pensParser.T__0]:
                localctx = pensParser.ExprParentContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 72
                self.match(pensParser.T__0)
                self.state = 73
                self.expr(0)
                self.state = 74
                self.match(pensParser.T__9)
                pass
            elif token in [pensParser.NUMBER]:
                localctx = pensParser.ExprNumberContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 76
                self.match(pensParser.NUMBER)
                pass
            elif token in [pensParser.STATUS]:
                localctx = pensParser.ExprStatusContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 77
                self.match(pensParser.STATUS)
                pass
            elif token in [pensParser.COLOUR]:
                localctx = pensParser.ExprColourContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 78
                self.match(pensParser.COLOUR)
                pass
            elif token in [pensParser.DEGREE]:
                localctx = pensParser.ExprDegreeContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 79
                self.match(pensParser.DEGREE)
                pass
            elif token in [pensParser.PATTERN]:
                localctx = pensParser.ExprPatternContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 80
                self.match(pensParser.PATTERN)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 91
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,10,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 89
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
                    if la_ == 1:
                        localctx = pensParser.ExprMultDivModContext(self, pensParser.ExprContext(self, _parentctx, _parentState))
                        localctx.e1 = _prevctx
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 83
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 84
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==pensParser.T__11 or _la==pensParser.T__12):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 85
                        localctx.e2 = self.expr(9)
                        pass

                    elif la_ == 2:
                        localctx = pensParser.ExprAddSubContext(self, pensParser.ExprContext(self, _parentctx, _parentState))
                        localctx.e1 = _prevctx
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 86
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 87
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==pensParser.T__10 or _la==pensParser.T__13):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 88
                        localctx.e2 = self.expr(8)
                        pass

             
                self.state = 93
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,10,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[6] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 7)
         




