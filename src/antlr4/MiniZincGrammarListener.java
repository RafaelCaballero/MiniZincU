package antlr4;
// Generated from MiniZincGrammar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniZincGrammarParser}.
 */
public interface MiniZincGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(@NotNull MiniZincGrammarParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(@NotNull MiniZincGrammarParser.StringExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rfloat}.
	 * @param ctx the parse tree
	 */
	void enterRfloat(@NotNull MiniZincGrammarParser.RfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rfloat}.
	 * @param ctx the parse tree
	 */
	void exitRfloat(@NotNull MiniZincGrammarParser.RfloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull MiniZincGrammarParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull MiniZincGrammarParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull MiniZincGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull MiniZincGrammarParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(@NotNull MiniZincGrammarParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(@NotNull MiniZincGrammarParser.DataContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull MiniZincGrammarParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull MiniZincGrammarParser.ConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rbracketExpr}.
	 * @param ctx the parse tree
	 */
	void enterRbracketExpr(@NotNull MiniZincGrammarParser.RbracketExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rbracketExpr}.
	 * @param ctx the parse tree
	 */
	void exitRbracketExpr(@NotNull MiniZincGrammarParser.RbracketExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MiniZincGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MiniZincGrammarParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull MiniZincGrammarParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull MiniZincGrammarParser.BoolExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#predOrUnionExpr}.
	 * @param ctx the parse tree
	 */
	void enterPredOrUnionExpr(@NotNull MiniZincGrammarParser.PredOrUnionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#predOrUnionExpr}.
	 * @param ctx the parse tree
	 */
	void exitPredOrUnionExpr(@NotNull MiniZincGrammarParser.PredOrUnionExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rbool}.
	 * @param ctx the parse tree
	 */
	void enterRbool(@NotNull MiniZincGrammarParser.RboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rbool}.
	 * @param ctx the parse tree
	 */
	void exitRbool(@NotNull MiniZincGrammarParser.RboolContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#fromR}.
	 * @param ctx the parse tree
	 */
	void enterFromR(@NotNull MiniZincGrammarParser.FromRContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#fromR}.
	 * @param ctx the parse tree
	 */
	void exitFromR(@NotNull MiniZincGrammarParser.FromRContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull MiniZincGrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull MiniZincGrammarParser.ArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#solve}.
	 * @param ctx the parse tree
	 */
	void enterSolve(@NotNull MiniZincGrammarParser.SolveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#solve}.
	 * @param ctx the parse tree
	 */
	void exitSolve(@NotNull MiniZincGrammarParser.SolveContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull MiniZincGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull MiniZincGrammarParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#argrange}.
	 * @param ctx the parse tree
	 */
	void enterArgrange(@NotNull MiniZincGrammarParser.ArgrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#argrange}.
	 * @param ctx the parse tree
	 */
	void exitArgrange(@NotNull MiniZincGrammarParser.ArgrangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#typedata}.
	 * @param ctx the parse tree
	 */
	void enterTypedata(@NotNull MiniZincGrammarParser.TypedataContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#typedata}.
	 * @param ctx the parse tree
	 */
	void exitTypedata(@NotNull MiniZincGrammarParser.TypedataContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#argunion}.
	 * @param ctx the parse tree
	 */
	void enterArgunion(@NotNull MiniZincGrammarParser.ArgunionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#argunion}.
	 * @param ctx the parse tree
	 */
	void exitArgunion(@NotNull MiniZincGrammarParser.ArgunionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull MiniZincGrammarParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull MiniZincGrammarParser.NotExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#argint}.
	 * @param ctx the parse tree
	 */
	void enterArgint(@NotNull MiniZincGrammarParser.ArgintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#argint}.
	 * @param ctx the parse tree
	 */
	void exitArgint(@NotNull MiniZincGrammarParser.ArgintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#argbool}.
	 * @param ctx the parse tree
	 */
	void enterArgbool(@NotNull MiniZincGrammarParser.ArgboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#argbool}.
	 * @param ctx the parse tree
	 */
	void exitArgbool(@NotNull MiniZincGrammarParser.ArgboolContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull MiniZincGrammarParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull MiniZincGrammarParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#rint}.
	 * @param ctx the parse tree
	 */
	void enterRint(@NotNull MiniZincGrammarParser.RintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#rint}.
	 * @param ctx the parse tree
	 */
	void exitRint(@NotNull MiniZincGrammarParser.RintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#tcons}.
	 * @param ctx the parse tree
	 */
	void enterTcons(@NotNull MiniZincGrammarParser.TconsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#tcons}.
	 * @param ctx the parse tree
	 */
	void exitTcons(@NotNull MiniZincGrammarParser.TconsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull MiniZincGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull MiniZincGrammarParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#argfloat}.
	 * @param ctx the parse tree
	 */
	void enterArgfloat(@NotNull MiniZincGrammarParser.ArgfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#argfloat}.
	 * @param ctx the parse tree
	 */
	void exitArgfloat(@NotNull MiniZincGrammarParser.ArgfloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(@NotNull MiniZincGrammarParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(@NotNull MiniZincGrammarParser.MinusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#idexpr}.
	 * @param ctx the parse tree
	 */
	void enterIdexpr(@NotNull MiniZincGrammarParser.IdexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#idexpr}.
	 * @param ctx the parse tree
	 */
	void exitIdexpr(@NotNull MiniZincGrammarParser.IdexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#scons}.
	 * @param ctx the parse tree
	 */
	void enterScons(@NotNull MiniZincGrammarParser.SconsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#scons}.
	 * @param ctx the parse tree
	 */
	void exitScons(@NotNull MiniZincGrammarParser.SconsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull MiniZincGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull MiniZincGrammarParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(@NotNull MiniZincGrammarParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(@NotNull MiniZincGrammarParser.TypenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#constr}.
	 * @param ctx the parse tree
	 */
	void enterConstr(@NotNull MiniZincGrammarParser.ConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#constr}.
	 * @param ctx the parse tree
	 */
	void exitConstr(@NotNull MiniZincGrammarParser.ConstrContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#toR}.
	 * @param ctx the parse tree
	 */
	void enterToR(@NotNull MiniZincGrammarParser.ToRContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#toR}.
	 * @param ctx the parse tree
	 */
	void exitToR(@NotNull MiniZincGrammarParser.ToRContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull MiniZincGrammarParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull MiniZincGrammarParser.OutputContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniZincGrammarParser#showExpr}.
	 * @param ctx the parse tree
	 */
	void enterShowExpr(@NotNull MiniZincGrammarParser.ShowExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniZincGrammarParser#showExpr}.
	 * @param ctx the parse tree
	 */
	void exitShowExpr(@NotNull MiniZincGrammarParser.ShowExprContext ctx);
}