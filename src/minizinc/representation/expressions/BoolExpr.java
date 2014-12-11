package minizinc.representation.expressions;

import minizinc.antlr4.MiniZincGrammarParser.ArithExprContext;
import minizinc.antlr4.MiniZincGrammarParser.BoolExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

public abstract class BoolExpr extends Expr {

	@Override
	public TypeName type() {

		return TypeName.BOOL;
	}

	/**
	 * <p>
	 * Grammar
	 * </p>
	 * boolExpr : boolExpr (boolOp|qualBoolOp) boolExpr<br>
	 * | arithExpr (arithOp|qualArithOp) arithExpr<br>
	 * | notExpr <br>
	 * | boolVal<br>
	 * ;
	 * 
	 * @param ctx
	 *            the grammar context
	 * @return Term representation
	 */
	public static BoolExpr boolExpr(BoolExprContext ctx) {
		BoolExpr t = null;
		if (ctx.boolExpr().size() == 2) {
			BoolExprContext b0 = ctx.boolExpr(0);
			BoolExprContext b1 = ctx.boolExpr(1);
			BoolExpr t0 = boolExpr(b0);
			BoolExpr t1 = boolExpr(b1);
			String op = "";
			if (Parsing.has(ctx.boolOp())) {
				op = ctx.boolOp().getText();
				t = InfixBoolExpr.infixBoolExpr(t0, t1, op);
			} else if (Parsing.has(ctx.qualBoolOp())) {
				op = ctx.qualBoolOp().getText();
				t = InfixBoolExpr.infixBoolExpr(t0, t1, op);
			} else
				Parsing.error("BoolExprContext - unexpected operator "
						+ ctx.toString());

		} else if (Parsing.has(ctx.arithExpr(0))) {
			ArithExprContext a0 = ctx.arithExpr(0);
			ArithExprContext a1 = ctx.arithExpr(1);
			ArithExpr t0 = ArithExpr.arithExpr(a0);
			ArithExpr t1 = ArithExpr.arithExpr(a1);
			String op = "";
			if (Parsing.has(ctx.arithOp())) {
				op = ctx.arithOp().getText();
				t = InfixArithBoolExpr.infixArithBoolExpr(t0, t1, op);
			} else if (Parsing.has(ctx.qualArithOp())) {
				op = ctx.qualArithOp().getText();
				t = InfixArithBoolExpr.infixArithBoolExpr(t0, t1, op);
			} else
				Parsing.error("boolExpr - unexpected operator "
						+ ctx.toString());

		} else if (Parsing.has(ctx.notExpr())) {
			t = NotBoolExpr.notBoolExpr(ctx.notExpr());

		} else if (Parsing.has(ctx.boolVal())) {
			t = BoolVal.boolVal(ctx.boolVal());
		} else
			Parsing.error("boolExpr " + ctx.toString());

		return t;
	}

	@Override
	public abstract BoolExpr clone();

}
