/**
 * 
 */
package minizinc.representation.expressions;

import minizinc.antlr4.MiniZincGrammarParser.ArithExprContext;
import minizinc.antlr4.MiniZincGrammarParser.BoolComplexExprContext;
import minizinc.antlr4.MiniZincGrammarParser.BoolExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;



/**
 * @author rafa
 *
 */
public  abstract class BoolComplexExpr extends Expr {

	public TypeName type() {
		return TypeName.BOOL;
	}
	
	
	/**
	 * <p>
	 * Grammar:
	 * </p>
	 * boolComplexExpr:<br>
	 * boolExpr (boolOp|qualBoolOp) boolExpr<br>
	 * | arithExpr (arithOp|qualArithOp) arithExpr<br>
	 * | notExpr <br>
	 * ;<br>
	 *
	 * @param ctx
	 *            grammar context
	 * @return BoolComplexExpr representation
	 */
	public static BoolExpr boolComplexExpr(BoolComplexExprContext ctx) {
		BoolExpr t = null;
		if (Parsing.has(ctx.notExpr())) {
			t = NotBoolExpr.notBoolExpr(ctx.notExpr());
		} else if (ctx.boolExpr().size() == 2) {
			BoolExprContext b0 = ctx.boolExpr(0);
			BoolExprContext b1 = ctx.boolExpr(1);
			BoolExpr t0 = BoolExpr.boolExpr(b0);
			BoolExpr t1 = BoolExpr.boolExpr(b1);
			String op = "";
			if (PArsing.has(ctx.boolOp())) {
				op = ctx.boolOp().getText();
				t = InfixBoolExpr.infixBoolExpr(t0, t1, op);
			} else if (Parsing.has(ctx.qualBoolOp())) {
				op = ctx.qualBoolOp().getText();
				t = InfixBoolExpr.infixBoolExpr(t0, t1, op);
			} else
				Parsing.error("boolComplexExpr - unexpected operator " + ctx.toString());

		} else if (ctx.arithExpr().size() == 2) {
			ArithExprContext a0 = ctx.arithExpr(0);
			ArithExprContext a1 = ctx.arithExpr(1);
			Expr t0 = ArithExpr.arithExpr(a0);
			Expr t1 = ArithExpr.arithExpr(a1);
			String op = "";
			if (Parsing.has(ctx.arithOp())) {
				op = ctx.arithOp().getText();
				t = InfixArithBoolExpr.infixArithBoolExpr(t0, t1, op);
			} else if (has(ctx.qualArithOp())) {
				op = ctx.qualArithOp().getText();
				t = InfixArithBoolExpr.infixArithBoolExpr(t0, t1, op);
			} else
				Parsing.error("boolComplexExpr - unexpected operator " + ctx.toString());

		} else
			Parsing.error("boolComplexExpr " + ctx.toString());
		return t;
	}

}
