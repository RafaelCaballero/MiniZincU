package minizinc.representation.solve;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.RestSContext;
import minizinc.representation.expressions.Expr;

/**
 * Corresponds to a simple selection annotation with grammar: restS : '(' expr
 * ',' varchoice ',' constrainchoice ',' 'complete' ')';
 * 
 * @author rafa
 *
 */
public class Selection extends ModeAnnotation {
	protected String name;
	protected Expr expr;
	protected String vc;
	protected String cc;

	public Selection(String name, Expr expr, String vc, String cc) {
		this.name = name;
		this.expr = expr;
		this.vc = vc;
		this.cc = cc;
	}

	@Override
	public String print() {
		return name + '(' + expr.print() + "," + vc + "," + cc + ","
				+ " complete" + ")";
	}

	public static Selection selection(String name, RestSContext ctx) {
		Selection s = null;
		Expr e = Expr.expr(ctx.expr());
		String vc = ctx.varchoice().getText();
		String cc = ctx.constrainchoice().getText();
		s = new Selection(name, e, vc, cc);
		return s;
	}

	@Override
	public Selection clone() {
		Selection r = null;
		String namep = name;
		;
		Expr exprp = expr == null ? null : expr.clone();
		String vcp = vc;
		String ccp = cc;
		r = new Selection(namep, exprp, vcp, ccp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cc == null) ? 0 : cc.hashCode());
		result = prime * result + ((expr == null) ? 0 : expr.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vc == null) ? 0 : vc.hashCode());
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
		Selection other = (Selection) obj;
		if (cc == null) {
			if (other.cc != null)
				return false;
		} else if (!cc.equals(other.cc))
			return false;
		if (expr == null) {
			if (other.expr != null)
				return false;
		} else if (!expr.equals(other.expr))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vc == null) {
			if (other.vc != null)
				return false;
		} else if (!vc.equals(other.vc))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		Expr expr2 = this.applyTransformer(t, expr);
		expr = expr2;
	}

}
