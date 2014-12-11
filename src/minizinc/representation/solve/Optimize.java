/**
 * 
 */
package minizinc.representation.solve;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.OptimizeContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.statement.Solve;

/**
 * A satisfationp problem
 * 
 * @author rafa
 *
 */
public class Optimize extends Solve {
	protected Expr expr;
	protected String maxmin;

	public Optimize(Annotation a, String maxmin, Expr expr) {
		super(a);
		this.maxmin = maxmin;
		this.expr = expr;

	}

	@Override
	public String print() {
		return super.print() + " " + maxmin + " " + expr.print();
	}

	public static Optimize optimize(Annotation a, OptimizeContext ctx) {
		Optimize r = null;
		Expr e;
		if (Parsing.has(ctx.maximize())) {
			if (Parsing.has(ctx.maximize().expr())) {
				e = Expr.expr(ctx.maximize().expr());
				r = new Optimize(a, "maximize", e);
			} else
				Parsing.error("optimize: missing expr to maximize "
						+ ctx.getText());

		} else if (Parsing.has(ctx.minimize())) {
			if (Parsing.has(ctx.minimize().expr())) {
				e = Expr.expr(ctx.minimize().expr());
				r = new Optimize(a, "minimize", e);

			} else
				Parsing.error("optimize: missing expr to minimize "
						+ ctx.getText());
		} else
			Parsing.error("optimize: neither maximize nor minimize "
					+ ctx.getText());

		return r;
	}

	@Override
	public Optimize clone() {
		Optimize r = null;
		Annotation ap = this.annotation == null ? null : this.annotation
				.clone();
		Expr exprp = expr == null ? null : expr.clone();
		String maxminp = maxmin;
		r = new Optimize(ap, maxminp, exprp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((expr == null) ? 0 : expr.hashCode());
		result = prime * result + ((maxmin == null) ? 0 : maxmin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Optimize other = (Optimize) obj;
		if (expr == null) {
			if (other.expr != null)
				return false;
		} else if (!expr.equals(other.expr))
			return false;
		if (maxmin == null) {
			if (other.maxmin != null)
				return false;
		} else if (!maxmin.equals(other.maxmin))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		super.subexpressions(t);
		Expr expr2 = this.applyTransformer(t, expr);
		expr = expr2;
	}

}
