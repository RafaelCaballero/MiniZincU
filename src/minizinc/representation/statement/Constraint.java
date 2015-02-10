package minizinc.representation.statement;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.ConstraintContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;

public class Constraint extends Statement {
	/*
	 * private TConstraint type;
	 * 
	 * 
	 * public Constraint(TConstraint type) { this.type = type; }
	 * 
	 * public TConstraint getType() { return type; }
	 * 
	 * public void setType(TConstraint type) { this.type = type; }
	 */
	private Expr t;

	public Constraint(Expr t) {
		super(TStatement.CONSTRAINT);
		this.t = t;
	}

	/*
	 * public Constraint simplify() { Constraint result = null; Expr tp =
	 * t.simplify(); boolean changed = !t.equals(tp); if (!changed) result =
	 * this; else result = new Constraint(tp).simplify(); return result; }
	 */
	public Expr getExpr() {
		return t;
	}

	public String toString() {
		return print();
	}

	@Override
	public String print() {
		// Expr e = t.simplify();
		return "constraint " + t.print();
	}

	public Boolean simplify() {
		Boolean r = false;
		Expr t2= t.simplify();
		r = !t2.equals(t);
		// modify the expression if it has been simplified
		if (r)
			t=t2;
		
		return r;
		
		
	}

	/**
	 * Returns a new Constraint representing the object parsed in ctx.
	 * 
	 * @param ctx
	 *            Parsing context
	 * @return A new Constraint
	 */
	public static Constraint constraint(ConstraintContext ctx) {
		Constraint r = null;
		if (Parsing.has(ctx.expr())) {
			r = new Constraint(Expr.expr(ctx.expr()));
		}
		return r;
	}

	@Override
	public Constraint clone() {
		Constraint r = null;
		Expr tp = t.clone();
		r = new Constraint(tp);
		return r;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((t == null) ? 0 : t.hashCode());
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
		Constraint other = (Constraint) obj;
		if (t == null) {
			if (other.t != null)
				return false;
		} else if (!t.equals(other.t))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer tr) {
		Expr t2 = this.applyTransformer(tr, t);
		t = t2;
	}

}
