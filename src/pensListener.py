# Generated from pens.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .pensParser import pensParser
else:
    from pensParser import pensParser

# This class defines a complete listener for a parse tree produced by pensParser.
class pensListener(ParseTreeListener):

    # Enter a parse tree produced by pensParser#program.
    def enterProgram(self, ctx:pensParser.ProgramContext):
        pass

    # Exit a parse tree produced by pensParser#program.
    def exitProgram(self, ctx:pensParser.ProgramContext):
        pass


    # Enter a parse tree produced by pensParser#Decla.
    def enterDecla(self, ctx:pensParser.DeclaContext):
        pass

    # Exit a parse tree produced by pensParser#Decla.
    def exitDecla(self, ctx:pensParser.DeclaContext):
        pass


    # Enter a parse tree produced by pensParser#PenDefinition.
    def enterPenDefinition(self, ctx:pensParser.PenDefinitionContext):
        pass

    # Exit a parse tree produced by pensParser#PenDefinition.
    def exitPenDefinition(self, ctx:pensParser.PenDefinitionContext):
        pass


    # Enter a parse tree produced by pensParser#posX.
    def enterPosX(self, ctx:pensParser.PosXContext):
        pass

    # Exit a parse tree produced by pensParser#posX.
    def exitPosX(self, ctx:pensParser.PosXContext):
        pass


    # Enter a parse tree produced by pensParser#posY.
    def enterPosY(self, ctx:pensParser.PosYContext):
        pass

    # Exit a parse tree produced by pensParser#posY.
    def exitPosY(self, ctx:pensParser.PosYContext):
        pass


    # Enter a parse tree produced by pensParser#thickness.
    def enterThickness(self, ctx:pensParser.ThicknessContext):
        pass

    # Exit a parse tree produced by pensParser#thickness.
    def exitThickness(self, ctx:pensParser.ThicknessContext):
        pass


    # Enter a parse tree produced by pensParser#ExprAddSub.
    def enterExprAddSub(self, ctx:pensParser.ExprAddSubContext):
        pass

    # Exit a parse tree produced by pensParser#ExprAddSub.
    def exitExprAddSub(self, ctx:pensParser.ExprAddSubContext):
        pass


    # Enter a parse tree produced by pensParser#ExprPattern.
    def enterExprPattern(self, ctx:pensParser.ExprPatternContext):
        pass

    # Exit a parse tree produced by pensParser#ExprPattern.
    def exitExprPattern(self, ctx:pensParser.ExprPatternContext):
        pass


    # Enter a parse tree produced by pensParser#ExprDegree.
    def enterExprDegree(self, ctx:pensParser.ExprDegreeContext):
        pass

    # Exit a parse tree produced by pensParser#ExprDegree.
    def exitExprDegree(self, ctx:pensParser.ExprDegreeContext):
        pass


    # Enter a parse tree produced by pensParser#ExprMinus.
    def enterExprMinus(self, ctx:pensParser.ExprMinusContext):
        pass

    # Exit a parse tree produced by pensParser#ExprMinus.
    def exitExprMinus(self, ctx:pensParser.ExprMinusContext):
        pass


    # Enter a parse tree produced by pensParser#ExprParent.
    def enterExprParent(self, ctx:pensParser.ExprParentContext):
        pass

    # Exit a parse tree produced by pensParser#ExprParent.
    def exitExprParent(self, ctx:pensParser.ExprParentContext):
        pass


    # Enter a parse tree produced by pensParser#ExprNumber.
    def enterExprNumber(self, ctx:pensParser.ExprNumberContext):
        pass

    # Exit a parse tree produced by pensParser#ExprNumber.
    def exitExprNumber(self, ctx:pensParser.ExprNumberContext):
        pass


    # Enter a parse tree produced by pensParser#ExprStatus.
    def enterExprStatus(self, ctx:pensParser.ExprStatusContext):
        pass

    # Exit a parse tree produced by pensParser#ExprStatus.
    def exitExprStatus(self, ctx:pensParser.ExprStatusContext):
        pass


    # Enter a parse tree produced by pensParser#ExprColour.
    def enterExprColour(self, ctx:pensParser.ExprColourContext):
        pass

    # Exit a parse tree produced by pensParser#ExprColour.
    def exitExprColour(self, ctx:pensParser.ExprColourContext):
        pass


    # Enter a parse tree produced by pensParser#ExprMultDivMod.
    def enterExprMultDivMod(self, ctx:pensParser.ExprMultDivModContext):
        pass

    # Exit a parse tree produced by pensParser#ExprMultDivMod.
    def exitExprMultDivMod(self, ctx:pensParser.ExprMultDivModContext):
        pass



del pensParser