package minizinc.representation.statement;

import java.util.Arrays;
import java.util.List;

import minizinc.representation.expressions.Expr;


public class Constraint extends Statement  {
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
	public Constraint simplify() {
		Constraint result = null;
		Expr tp = t.simplify();
		boolean changed = !t.equals(tp);
		if (!changed)
			result = this;
		else
			result = new Constraint(tp).simplify();
		return result;
	}
*/
	public Expr getExpr() {
		return t;
	}

	public String toString() {
		return print();
	}

	@Override
	public String print() {
		return "constraint " + t.print();
	}

	@Override
	public List<Expr> subexpressions() {
		// TODO Auto-generated method stub
		return Arrays.asList(t);
	}

	

}