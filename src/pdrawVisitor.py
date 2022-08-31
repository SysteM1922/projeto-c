# Generated from pdraw.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .pdrawParser import pdrawParser
else:
    from pdrawParser import pdrawParser

# This class defines a complete generic visitor for a parse tree produced by pdrawParser.

class pdrawVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by pdrawParser#program.
    def visitProgram(self, ctx:pdrawParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#Comment.
    def visitComment(self, ctx:pdrawParser.CommentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#Import.
    def visitImport(self, ctx:pdrawParser.ImportContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#Decla.
    def visitDecla(self, ctx:pdrawParser.DeclaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#Attr.
    def visitAttr(self, ctx:pdrawParser.AttrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#PenCommand.
    def visitPenCommand(self, ctx:pdrawParser.PenCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#DoAction.
    def visitDoAction(self, ctx:pdrawParser.DoActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#IfElifElseStat.
    def visitIfElifElseStat(self, ctx:pdrawParser.IfElifElseStatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ForLoop.
    def visitForLoop(self, ctx:pdrawParser.ForLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#WhileLoop.
    def visitWhileLoop(self, ctx:pdrawParser.WhileLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#Function.
    def visitFunction(self, ctx:pdrawParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#print.
    def visitPrint(self, ctx:pdrawParser.PrintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#arrayAdd.
    def visitArrayAdd(self, ctx:pdrawParser.ArrayAddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#arrayRemove.
    def visitArrayRemove(self, ctx:pdrawParser.ArrayRemoveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#IDID.
    def visitIDID(self, ctx:pdrawParser.IDIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#goExpr.
    def visitGoExpr(self, ctx:pdrawParser.GoExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#arg.
    def visitArg(self, ctx:pdrawParser.ArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#PenMoveTo.
    def visitPenMoveTo(self, ctx:pdrawParser.PenMoveToContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#PenMoveBy.
    def visitPenMoveBy(self, ctx:pdrawParser.PenMoveByContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#PenRotateBY.
    def visitPenRotateBY(self, ctx:pdrawParser.PenRotateBYContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#PenChangeTo.
    def visitPenChangeTo(self, ctx:pdrawParser.PenChangeToContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#elif.
    def visitElif(self, ctx:pdrawParser.ElifContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#els.
    def visitEls(self, ctx:pdrawParser.ElsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#declaration.
    def visitDeclaration(self, ctx:pdrawParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#chg.
    def visitChg(self, ctx:pdrawParser.ChgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#attribution.
    def visitAttribution(self, ctx:pdrawParser.AttributionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprPattern.
    def visitExprPattern(self, ctx:pdrawParser.ExprPatternContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprEquals.
    def visitExprEquals(self, ctx:pdrawParser.ExprEqualsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprString.
    def visitExprString(self, ctx:pdrawParser.ExprStringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprLength.
    def visitExprLength(self, ctx:pdrawParser.ExprLengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprBoolean.
    def visitExprBoolean(self, ctx:pdrawParser.ExprBooleanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprParenthesis.
    def visitExprParenthesis(self, ctx:pdrawParser.ExprParenthesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprNot.
    def visitExprNot(self, ctx:pdrawParser.ExprNotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprColour.
    def visitExprColour(self, ctx:pdrawParser.ExprColourContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprAndOR.
    def visitExprAndOR(self, ctx:pdrawParser.ExprAndORContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprArray.
    def visitExprArray(self, ctx:pdrawParser.ExprArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprMultDivMod.
    def visitExprMultDivMod(self, ctx:pdrawParser.ExprMultDivModContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprGet.
    def visitExprGet(self, ctx:pdrawParser.ExprGetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprDegree.
    def visitExprDegree(self, ctx:pdrawParser.ExprDegreeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprMinus.
    def visitExprMinus(self, ctx:pdrawParser.ExprMinusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprPen.
    def visitExprPen(self, ctx:pdrawParser.ExprPenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprAction.
    def visitExprAction(self, ctx:pdrawParser.ExprActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprFunction.
    def visitExprFunction(self, ctx:pdrawParser.ExprFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprNumber.
    def visitExprNumber(self, ctx:pdrawParser.ExprNumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprStatus.
    def visitExprStatus(self, ctx:pdrawParser.ExprStatusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprID.
    def visitExprID(self, ctx:pdrawParser.ExprIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprPlusMinus.
    def visitExprPlusMinus(self, ctx:pdrawParser.ExprPlusMinusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pdrawParser#ExprExponent.
    def visitExprExponent(self, ctx:pdrawParser.ExprExponentContext):
        return self.visitChildren(ctx)



del pdrawParser