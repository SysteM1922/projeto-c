// Generated from pdraw.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pdrawParser}.
 */
public interface pdrawListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pdrawParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pdrawParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pdrawParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comment}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterComment(pdrawParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comment}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitComment(pdrawParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Import}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterImport(pdrawParser.ImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitImport(pdrawParser.ImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decla}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDecla(pdrawParser.DeclaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decla}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDecla(pdrawParser.DeclaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attr}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAttr(pdrawParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attr}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAttr(pdrawParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PenCommand}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPenCommand(pdrawParser.PenCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PenCommand}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPenCommand(pdrawParser.PenCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoAction}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDoAction(pdrawParser.DoActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoAction}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDoAction(pdrawParser.DoActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElifElseStat}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfElifElseStat(pdrawParser.IfElifElseStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElifElseStat}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfElifElseStat(pdrawParser.IfElifElseStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(pdrawParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(pdrawParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(pdrawParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(pdrawParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunction(pdrawParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunction(pdrawParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(pdrawParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(pdrawParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAdd}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterArrayAdd(pdrawParser.ArrayAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAdd}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitArrayAdd(pdrawParser.ArrayAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayRemove}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterArrayRemove(pdrawParser.ArrayRemoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayRemove}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitArrayRemove(pdrawParser.ArrayRemoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDID}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIDID(pdrawParser.IDIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDID}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIDID(pdrawParser.IDIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goExpr}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterGoExpr(pdrawParser.GoExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goExpr}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitGoExpr(pdrawParser.GoExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(pdrawParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(pdrawParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PenMoveTo}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 */
	void enterPenMoveTo(pdrawParser.PenMoveToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PenMoveTo}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 */
	void exitPenMoveTo(pdrawParser.PenMoveToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PenMoveBy}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 */
	void enterPenMoveBy(pdrawParser.PenMoveByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PenMoveBy}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 */
	void exitPenMoveBy(pdrawParser.PenMoveByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PenRotateBY}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 */
	void enterPenRotateBY(pdrawParser.PenRotateBYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PenRotateBY}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 */
	void exitPenRotateBY(pdrawParser.PenRotateBYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PenChangeTo}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 */
	void enterPenChangeTo(pdrawParser.PenChangeToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PenChangeTo}
	 * labeled alternative in {@link pdrawParser#action}.
	 * @param ctx the parse tree
	 */
	void exitPenChangeTo(pdrawParser.PenChangeToContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(pdrawParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(pdrawParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#els}.
	 * @param ctx the parse tree
	 */
	void enterEls(pdrawParser.ElsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#els}.
	 * @param ctx the parse tree
	 */
	void exitEls(pdrawParser.ElsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(pdrawParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(pdrawParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#chg}.
	 * @param ctx the parse tree
	 */
	void enterChg(pdrawParser.ChgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#chg}.
	 * @param ctx the parse tree
	 */
	void exitChg(pdrawParser.ChgContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(pdrawParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(pdrawParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPattern}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPattern(pdrawParser.ExprPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPattern}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPattern(pdrawParser.ExprPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEquals}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEquals(pdrawParser.ExprEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEquals}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEquals(pdrawParser.ExprEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(pdrawParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(pdrawParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLength}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLength(pdrawParser.ExprLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLength}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLength(pdrawParser.ExprLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(pdrawParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(pdrawParser.ExprBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(pdrawParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(pdrawParser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(pdrawParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(pdrawParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInput(pdrawParser.ExprInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInput(pdrawParser.ExprInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprColour}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprColour(pdrawParser.ExprColourContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprColour}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprColour(pdrawParser.ExprColourContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAndOR}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAndOR(pdrawParser.ExprAndORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAndOR}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAndOR(pdrawParser.ExprAndORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArray(pdrawParser.ExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArray(pdrawParser.ExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(pdrawParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(pdrawParser.ExprMultDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprGet}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprGet(pdrawParser.ExprGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprGet}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprGet(pdrawParser.ExprGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDegree}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDegree(pdrawParser.ExprDegreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDegree}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDegree(pdrawParser.ExprDegreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(pdrawParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(pdrawParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPen}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPen(pdrawParser.ExprPenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPen}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPen(pdrawParser.ExprPenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAction}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAction(pdrawParser.ExprActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAction}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAction(pdrawParser.ExprActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunction(pdrawParser.ExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunction(pdrawParser.ExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(pdrawParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(pdrawParser.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStatus}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStatus(pdrawParser.ExprStatusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStatus}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStatus(pdrawParser.ExprStatusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(pdrawParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(pdrawParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPlusMinus}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPlusMinus(pdrawParser.ExprPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPlusMinus}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPlusMinus(pdrawParser.ExprPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprExponent}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprExponent(pdrawParser.ExprExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprExponent}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprExponent(pdrawParser.ExprExponentContext ctx);
}