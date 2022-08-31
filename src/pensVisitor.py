# Generated from pens.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .pensParser import pensParser
else:
    from pensParser import pensParser

# This class defines a complete generic visitor for a parse tree produced by pensParser.

class pensVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by pensParser#program.
    def visitProgram(self, ctx:pensParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#Decla.
    def visitDecla(self, ctx:pensParser.DeclaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#PenDefinition.
    def visitPenDefinition(self, ctx:pensParser.PenDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#posX.
    def visitPosX(self, ctx:pensParser.PosXContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#posY.
    def visitPosY(self, ctx:pensParser.PosYContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#thickness.
    def visitThickness(self, ctx:pensParser.ThicknessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#ExprAddSub.
    def visitExprAddSub(self, ctx:pensParser.ExprAddSubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#ExprPattern.
    def visitExprPattern(self, ctx:pensParser.ExprPatternContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#ExprDegree.
    def visitExprDegree(self, ctx:pensParser.ExprDegreeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#ExprMinus.
    def visitExprMinus(self, ctx:pensParser.ExprMinusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#ExprParent.
    def visitExprParent(self, ctx:pensParser.ExprParentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#ExprNumber.
    def visitExprNumber(self, ctx:pensParser.ExprNumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#ExprStatus.
    def visitExprStatus(self, ctx:pensParser.ExprStatusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#ExprColour.
    def visitExprColour(self, ctx:pensParser.ExprColourContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pensParser#ExprMultDivMod.
    def visitExprMultDivMod(self, ctx:pensParser.ExprMultDivModContext):
        return self.visitChildren(ctx)



del pensParser