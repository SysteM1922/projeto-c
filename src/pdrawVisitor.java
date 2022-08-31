// Generated from pdraw.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pdrawParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pdrawVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pdrawParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(pdrawParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comment}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(pdrawParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport(pdrawParser.ImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decla}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecla(pdrawParser.DeclaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attr}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(pdrawParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PenCommand}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenCommand(pdrawParser.PenCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoAction}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoAction(pdrawParser.DoActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElifElseStat}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElifElseStat(pdrawParser.IfElifElseStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(pdrawParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(pdrawParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(pdrawParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(pdrawParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAdd}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAdd(pdrawParser.ArrayAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayRemove}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRemove(pdrawParser.ArrayRemoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDID}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDID(pdrawParser.IDIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goExpr}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoExpr(pdrawParser.GoExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(pdrawParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PenMoveTo}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenMoveTo(pdrawParser.PenMoveToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PenMoveBy}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenMoveBy(pdrawParser.PenMoveByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PenRotateBY}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenRotateBY(pdrawParser.PenRotateBYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PenChangeTo}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenChangeTo(pdrawParser.PenChangeToContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(pdrawParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#els}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEls(pdrawParser.ElsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(pdrawParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#chg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChg(pdrawParser.ChgContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdrawParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribution(pdrawParser.AttributionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPattern}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPattern(pdrawParser.ExprPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEquals}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEquals(pdrawParser.ExprEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(pdrawParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLength}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLength(pdrawParser.ExprLengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolean(pdrawParser.ExprBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(pdrawParser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(pdrawParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInput(pdrawParser.ExprInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprColour}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprColour(pdrawParser.ExprColourContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAndOR}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAndOR(pdrawParser.ExprAndORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArray(pdrawParser.ExprArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(pdrawParser.ExprMultDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprGet}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGet(pdrawParser.ExprGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDegree}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDegree(pdrawParser.ExprDegreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(pdrawParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPen}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPen(pdrawParser.ExprPenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAction}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAction(pdrawParser.ExprActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunction(pdrawParser.ExprFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(pdrawParser.ExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStatus}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatus(pdrawParser.ExprStatusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(pdrawParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPlusMinus}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlusMinus(pdrawParser.ExprPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprExponent}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExponent(pdrawParser.ExprExponentContext ctx);
}