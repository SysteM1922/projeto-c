// Generated from pens.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pensParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pensVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pensParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(pensParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decla}
	 * labeled alternative in {@link pensParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecla(pensParser.DeclaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PenDefinition}
	 * labeled alternative in {@link pensParser#pen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenDefinition(pensParser.PenDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pensParser#posX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosX(pensParser.PosXContext ctx);
	/**
	 * Visit a parse tree produced by {@link pensParser#posY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosY(pensParser.PosYContext ctx);
	/**
	 * Visit a parse tree produced by {@link pensParser#thickness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThickness(pensParser.ThicknessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(pensParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPattern}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPattern(pensParser.ExprPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDegree}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDegree(pensParser.ExprDegreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(pensParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(pensParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(pensParser.ExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStatus}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatus(pensParser.ExprStatusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprColour}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprColour(pensParser.ExprColourContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(pensParser.ExprMultDivModContext ctx);
}