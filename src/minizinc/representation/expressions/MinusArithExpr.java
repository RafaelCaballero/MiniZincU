/**
 * 
 */
package minizinc.representation.expressions;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.ArithExprContext;
import minizinc.antlr4.MiniZincGrammarParser.MinusExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

/**
 * Grammar: minusExpr : '-' arithExpr ;
 *
 * @author rafa
 *
 */
public class MinusArithExpr extends ArithExpr {
	private Expr expr;

	/**
	 * Constructor
	 */
	public MinusArithExpr(Expr expr) {
		this.expr = expr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "-" + expr.print();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return expr.type();
	}

	/**
	 * minusExpr : '-' arithExpr ;
	 * 
	 * @param ctx
	 *            Grammar context
	 * @return Term representing the expression
	 */
	public static MinusArithExpr minusExpr(MinusExprContext ctx) {
		MinusArithExpr t = null;
		if (Parsing.has(ctx.arithExpr())) {
			ArithExprContext a = ctx.arithExpr();
			ArithExpr t0 = ArithExpr.arithExpr(a);
			t = new MinusArithExpr(t0);
		} else
			Parsing.error("minusExpr " + ctx.toString());
		return t;
	}

	@Override
	public MinusArithExpr clone() {
		MinusArithExpr r = null;
		Expr exprp = expr == null ? null : expr.clone();
		r = new MinusArithExpr(exprp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expr == null) ? 0 : expr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MinusArithExpr other = (MinusArithExpr) obj;
		if (expr == null) {
			if (other.expr != null)
				return false;
		} else if (!expr.equals(other.expr))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		Expr expr2 = this.applyTransformer(t, expr);

		expr = expr2;

	}

}
