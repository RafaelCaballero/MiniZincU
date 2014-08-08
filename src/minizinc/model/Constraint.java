package minizinc.model;

import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.expressions.Expr;


public class Constraint extends Statement  implements MiniZincRepresentation {
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

}
