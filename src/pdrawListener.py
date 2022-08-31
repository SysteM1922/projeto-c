# Generated from pdraw.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .pdrawParser import pdrawParser
else:
    from pdrawParser import pdrawParser

# This class defines a complete listener for a parse tree produced by pdrawParser.
class pdrawListener(ParseTreeListener):

    # Enter a parse tree produced by pdrawParser#program.
    def enterProgram(self, ctx:pdrawParser.ProgramContext):
        pass

    # Exit a parse tree produced by pdrawParser#program.
    def exitProgram(self, ctx:pdrawParser.ProgramContext):
        pass


    # Enter a parse tree produced by pdrawParser#Comment.
    def enterComment(self, ctx:pdrawParser.CommentContext):
        pass

    # Exit a parse tree produced by pdrawParser#Comment.
    def exitComment(self, ctx:pdrawParser.CommentContext):
        pass


    # Enter a parse tree produced by pdrawParser#Import.
    def enterImport(self, ctx:pdrawParser.ImportContext):
        pass

    # Exit a parse tree produced by pdrawParser#Import.
    def exitImport(self, ctx:pdrawParser.ImportContext):
        pass


    # Enter a parse tree produced by pdrawParser#Decla.
    def enterDecla(self, ctx:pdrawParser.DeclaContext):
        pass

    # Exit a parse tree produced by pdrawParser#Decla.
    def exitDecla(self, ctx:pdrawParser.DeclaContext):
        pass


    # Enter a parse tree produced by pdrawParser#Attr.
    def enterAttr(self, ctx:pdrawParser.AttrContext):
        pass

    # Exit a parse tree produced by pdrawParser#Attr.
    def exitAttr(self, ctx:pdrawParser.AttrContext):
        pass


    # Enter a parse tree produced by pdrawParser#PenCommand.
    def enterPenCommand(self, ctx:pdrawParser.PenCommandContext):
        pass

    # Exit a parse tree produced by pdrawParser#PenCommand.
    def exitPenCommand(self, ctx:pdrawParser.PenCommandContext):
        pass


    # Enter a parse tree produced by pdrawParser#DoAction.
    def enterDoAction(self, ctx:pdrawParser.DoActionContext):
        pass

    # Exit a parse tree produced by pdrawParser#DoAction.
    def exitDoAction(self, ctx:pdrawParser.DoActionContext):
        pass


    # Enter a parse tree produced by pdrawParser#IfElifElseStat.
    def enterIfElifElseStat(self, ctx:pdrawParser.IfElifElseStatContext):
        pass

    # Exit a parse tree produced by pdrawParser#IfElifElseStat.
    def exitIfElifElseStat(self, ctx:pdrawParser.IfElifElseStatContext):
        pass


    # Enter a parse tree produced by pdrawParser#ForLoop.
    def enterForLoop(self, ctx:pdrawParser.ForLoopContext):
        pass

    # Exit a parse tree produced by pdrawParser#ForLoop.
    def exitForLoop(self, ctx:pdrawParser.ForLoopContext):
        pass


    # Enter a parse tree produced by pdrawParser#WhileLoop.
    def enterWhileLoop(self, ctx:pdrawParser.WhileLoopContext):
        pass

    # Exit a parse tree produced by pdrawParser#WhileLoop.
    def exitWhileLoop(self, ctx:pdrawParser.WhileLoopContext):
        pass


    # Enter a parse tree produced by pdrawParser#Function.
    def enterFunction(self, ctx:pdrawParser.FunctionContext):
        pass

    # Exit a parse tree produced by pdrawParser#Function.
    def exitFunction(self, ctx:pdrawParser.FunctionContext):
        pass


    # Enter a parse tree produced by pdrawParser#print.
    def enterPrint(self, ctx:pdrawParser.PrintContext):
        pass

    # Exit a parse tree produced by pdrawParser#print.
    def exitPrint(self, ctx:pdrawParser.PrintContext):
        pass


    # Enter a parse tree produced by pdrawParser#arrayAdd.
    def enterArrayAdd(self, ctx:pdrawParser.ArrayAddContext):
        pass

    # Exit a parse tree produced by pdrawParser#arrayAdd.
    def exitArrayAdd(self, ctx:pdrawParser.ArrayAddContext):
        pass


    # Enter a parse tree produced by pdrawParser#arrayRemove.
    def enterArrayRemove(self, ctx:pdrawParser.ArrayRemoveContext):
        pass

    # Exit a parse tree produced by pdrawParser#arrayRemove.
    def exitArrayRemove(self, ctx:pdrawParser.ArrayRemoveContext):
        pass


    # Enter a parse tree produced by pdrawParser#IDID.
    def enterIDID(self, ctx:pdrawParser.IDIDContext):
        pass

    # Exit a parse tree produced by pdrawParser#IDID.
    def exitIDID(self, ctx:pdrawParser.IDIDContext):
        pass


    # Enter a parse tree produced by pdrawParser#goExpr.
    def enterGoExpr(self, ctx:pdrawParser.GoExprContext):
        pass

    # Exit a parse tree produced by pdrawParser#goExpr.
    def exitGoExpr(self, ctx:pdrawParser.GoExprContext):
        pass


    # Enter a parse tree produced by pdrawParser#arg.
    def enterArg(self, ctx:pdrawParser.ArgContext):
        pass

    # Exit a parse tree produced by pdrawParser#arg.
    def exitArg(self, ctx:pdrawParser.ArgContext):
        pass


    # Enter a parse tree produced by pdrawParser#PenMoveTo.
    def enterPenMoveTo(self, ctx:pdrawParser.PenMoveToContext):
        pass

    # Exit a parse tree produced by pdrawParser#PenMoveTo.
    def exitPenMoveTo(self, ctx:pdrawParser.PenMoveToContext):
        pass


    # Enter a parse tree produced by pdrawParser#PenMoveBy.
    def enterPenMoveBy(self, ctx:pdrawParser.PenMoveByContext):
        pass

    # Exit a parse tree produced by pdrawParser#PenMoveBy.
    def exitPenMoveBy(self, ctx:pdrawParser.PenMoveByContext):
        pass


    # Enter a parse tree produced by pdrawParser#PenRotateBY.
    def enterPenRotateBY(self, ctx:pdrawParser.PenRotateBYContext):
        pass

    # Exit a parse tree produced by pdrawParser#PenRotateBY.
    def exitPenRotateBY(self, ctx:pdrawParser.PenRotateBYContext):
        pass


    # Enter a parse tree produced by pdrawParser#PenChangeTo.
    def enterPenChangeTo(self, ctx:pdrawParser.PenChangeToContext):
        pass

    # Exit a parse tree produced by pdrawParser#PenChangeTo.
    def exitPenChangeTo(self, ctx:pdrawParser.PenChangeToContext):
        pass


    # Enter a parse tree produced by pdrawParser#elif.
    def enterElif(self, ctx:pdrawParser.ElifContext):
        pass

    # Exit a parse tree produced by pdrawParser#elif.
    def exitElif(self, ctx:pdrawParser.ElifContext):
        pass


    # Enter a parse tree produced by pdrawParser#els.
    def enterEls(self, ctx:pdrawParser.ElsContext):
        pass

    # Exit a parse tree produced by pdrawParser#els.
    def exitEls(self, ctx:pdrawParser.ElsContext):
        pass


    # Enter a parse tree produced by pdrawParser#declaration.
    def enterDeclaration(self, ctx:pdrawParser.DeclarationContext):
        pass

    # Exit a parse tree produced by pdrawParser#declaration.
    def exitDeclaration(self, ctx:pdrawParser.DeclarationContext):
        pass


    # Enter a parse tree produced by pdrawParser#chg.
    def enterChg(self, ctx:pdrawParser.ChgContext):
        pass

    # Exit a parse tree produced by pdrawParser#chg.
    def exitChg(self, ctx:pdrawParser.ChgContext):
        pass


    # Enter a parse tree produced by pdrawParser#attribution.
    def enterAttribution(self, ctx:pdrawParser.AttributionContext):
        pass

    # Exit a parse tree produced by pdrawParser#attribution.
    def exitAttribution(self, ctx:pdrawParser.AttributionContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprPattern.
    def enterExprPattern(self, ctx:pdrawParser.ExprPatternContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprPattern.
    def exitExprPattern(self, ctx:pdrawParser.ExprPatternContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprEquals.
    def enterExprEquals(self, ctx:pdrawParser.ExprEqualsContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprEquals.
    def exitExprEquals(self, ctx:pdrawParser.ExprEqualsContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprString.
    def enterExprString(self, ctx:pdrawParser.ExprStringContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprString.
    def exitExprString(self, ctx:pdrawParser.ExprStringContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprLength.
    def enterExprLength(self, ctx:pdrawParser.ExprLengthContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprLength.
    def exitExprLength(self, ctx:pdrawParser.ExprLengthContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprBoolean.
    def enterExprBoolean(self, ctx:pdrawParser.ExprBooleanContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprBoolean.
    def exitExprBoolean(self, ctx:pdrawParser.ExprBooleanContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprParenthesis.
    def enterExprParenthesis(self, ctx:pdrawParser.ExprParenthesisContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprParenthesis.
    def exitExprParenthesis(self, ctx:pdrawParser.ExprParenthesisContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprNot.
    def enterExprNot(self, ctx:pdrawParser.ExprNotContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprNot.
    def exitExprNot(self, ctx:pdrawParser.ExprNotContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprColour.
    def enterExprColour(self, ctx:pdrawParser.ExprColourContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprColour.
    def exitExprColour(self, ctx:pdrawParser.ExprColourContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprAndOR.
    def enterExprAndOR(self, ctx:pdrawParser.ExprAndORContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprAndOR.
    def exitExprAndOR(self, ctx:pdrawParser.ExprAndORContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprArray.
    def enterExprArray(self, ctx:pdrawParser.ExprArrayContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprArray.
    def exitExprArray(self, ctx:pdrawParser.ExprArrayContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprMultDivMod.
    def enterExprMultDivMod(self, ctx:pdrawParser.ExprMultDivModContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprMultDivMod.
    def exitExprMultDivMod(self, ctx:pdrawParser.ExprMultDivModContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprGet.
    def enterExprGet(self, ctx:pdrawParser.ExprGetContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprGet.
    def exitExprGet(self, ctx:pdrawParser.ExprGetContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprDegree.
    def enterExprDegree(self, ctx:pdrawParser.ExprDegreeContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprDegree.
    def exitExprDegree(self, ctx:pdrawParser.ExprDegreeContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprMinus.
    def enterExprMinus(self, ctx:pdrawParser.ExprMinusContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprMinus.
    def exitExprMinus(self, ctx:pdrawParser.ExprMinusContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprPen.
    def enterExprPen(self, ctx:pdrawParser.ExprPenContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprPen.
    def exitExprPen(self, ctx:pdrawParser.ExprPenContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprAction.
    def enterExprAction(self, ctx:pdrawParser.ExprActionContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprAction.
    def exitExprAction(self, ctx:pdrawParser.ExprActionContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprFunction.
    def enterExprFunction(self, ctx:pdrawParser.ExprFunctionContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprFunction.
    def exitExprFunction(self, ctx:pdrawParser.ExprFunctionContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprNumber.
    def enterExprNumber(self, ctx:pdrawParser.ExprNumberContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprNumber.
    def exitExprNumber(self, ctx:pdrawParser.ExprNumberContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprStatus.
    def enterExprStatus(self, ctx:pdrawParser.ExprStatusContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprStatus.
    def exitExprStatus(self, ctx:pdrawParser.ExprStatusContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprID.
    def enterExprID(self, ctx:pdrawParser.ExprIDContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprID.
    def exitExprID(self, ctx:pdrawParser.ExprIDContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprPlusMinus.
    def enterExprPlusMinus(self, ctx:pdrawParser.ExprPlusMinusContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprPlusMinus.
    def exitExprPlusMinus(self, ctx:pdrawParser.ExprPlusMinusContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprExponent.
    def enterExprExponent(self, ctx:pdrawParser.ExprExponentContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprExponent.
    def exitExprExponent(self, ctx:pdrawParser.ExprExponentContext):
        pass



del pdrawParser