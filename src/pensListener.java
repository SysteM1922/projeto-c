// Generated from pens.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pensParser}.
 */
public interface pensListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pensParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pensParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pensParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pensParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decla}
	 * labeled alternative in {@link pensParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDecla(pensParser.DeclaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decla}
	 * labeled alternative in {@link pensParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDecla(pensParser.DeclaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PenDefinition}
	 * labeled alternative in {@link pensParser#pen}.
	 * @param ctx the parse tree
	 */
	void enterPenDefinition(pensParser.PenDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PenDefinition}
	 * labeled alternative in {@link pensParser#pen}.
	 * @param ctx the parse tree
	 */
	void exitPenDefinition(pensParser.PenDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pensParser#posX}.
	 * @param ctx the parse tree
	 */
	void enterPosX(pensParser.PosXContext ctx);
	/**
	 * Exit a parse tree produced by {@link pensParser#posX}.
	 * @param ctx the parse tree
	 */
	void exitPosX(pensParser.PosXContext ctx);
	/**
	 * Enter a parse tree produced by {@link pensParser#posY}.
	 * @param ctx the parse tree
	 */
	void enterPosY(pensParser.PosYContext ctx);
	/**
	 * Exit a parse tree produced by {@link pensParser#posY}.
	 * @param ctx the parse tree
	 */
	void exitPosY(pensParser.PosYContext ctx);
	/**
	 * Enter a parse tree produced by {@link pensParser#thickness}.
	 * @param ctx the parse tree
	 */
	void enterThickness(pensParser.ThicknessContext ctx);
	/**
	 * Exit a parse tree produced by {@link pensParser#thickness}.
	 * @param ctx the parse tree
	 */
	void exitThickness(pensParser.ThicknessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(pensParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(pensParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPattern}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPattern(pensParser.ExprPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPattern}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPattern(pensParser.ExprPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDegree}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDegree(pensParser.ExprDegreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDegree}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDegree(pensParser.ExprDegreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(pensParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(pensParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(pensParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(pensParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(pensParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(pensParser.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStatus}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStatus(pensParser.ExprStatusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStatus}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStatus(pensParser.ExprStatusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprColour}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprColour(pensParser.ExprColourContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprColour}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprColour(pensParser.ExprColourContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(pensParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link pensParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(pensParser.ExprMultDivModContext ctx);
}