package minizinc.representation.expressions;


import minizinc.antlr4.MiniZincGrammarParser.ArithComplexExprContext;
import minizinc.antlr4.MiniZincGrammarParser.ArithExprContext;
import minizinc.representation.Parsing;

public abstract class ArithExpr extends Expr {

	/**
	 * Obtain the representation of a MiniZinc arithmetic expression.<br>
	 * Grammar:<br>
	 * arithExpr : minusExpr<br>
	 * | arithExpr arithOp2 arithExpr | operand<br>
	 * ;<br>
	 *
	 * @param ctx
	 *            the grammar context
	 * @return Term representation
	 */
	public static ArithExpr arithExpr(ArithExprContext ctx) {
		ArithExpr t = null;
		if (Parsing.has(ctx.minusExpr())) {
			t = MinusArithExpr.minusExpr(ctx.minusExpr());
		} else if (Parsing.has(ctx.operand())) {
			t = Operand.operand(ctx.operand());
		} else if (ctx.arithExpr().size() == 2) {
			ArithExprContext a0 = ctx.arithExpr(0);
			ArithExprContext a1 = ctx.arithExpr(1);
			ArithExpr t0 = arithExpr(a0);
			ArithExpr t1 = arithExpr(a1);
			if (Parsing.has(ctx.arithOp2())) {
				String op = ctx.arithOp2().getText();
				t = InfixArithExpr.infixArithExpr(t0, t1, op);
			} else
				Parsing.error("arithExpr, arithOp2 " + ctx.toString());

		} else
			Parsing.error("arithExpr " + ctx.toString());
		return t;
	}

	/**
	 * Grammar:<br>
	 * arithComplexExpr : minusExpr | arithExpr arithOp2 arithExpr
	 *
	 * @param ctx
	 *            grammar context
	 * @return Term representation
	 */
	public static ArithExpr arithComplexExpr(ArithComplexExprContext ctx) {
		ArithExpr t = null;
		if (Parsing.has(ctx.minusExpr())) {
			t = MinusArithExpr.minusExpr(ctx.minusExpr());
		} else if (Parsing.has(ctx.arithOp2())) {
			ArithExprContext a0 = ctx.arithExpr(0);
			ArithExprContext a1 = ctx.arithExpr(1);
			if (a0 == null || a1 == null)
				Parsing.error("arithComplexExpr (null operand):  " + ctx.toString());
			else {
				ArithExpr t0 = ArithExpr.arithExpr(a0);
				ArithExpr t1 = ArithExpr.arithExpr(a1);
				String op = ctx.arithOp2().getText();
				t = InfixArithExpr.infixArithExpr(t0, t1,op);
			}
		} else
			Parsing.error("arithComplexExpr:  " + ctx.toString());
		return t;
	}

	@Override 
	public abstract ArithExpr clone();

}
