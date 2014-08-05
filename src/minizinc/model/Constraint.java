package minizinc.model;

import terms.Term;

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
	private Term t;

	public Constraint(Term t) {
		super(TStatement.CONSTRAINT);
		this.t = t;
	}

	public Constraint simplify() {
		Constraint result = null;
		Term tp = t.simplify();
		boolean changed = !t.equals(tp);
		if (!changed)
			result = this;
		else
			result = new Constraint(tp).simplify();
		return result;
	}

	public Term getTerm() {
		return t;
	}

	public void setTerm(Term t) {
		this.t = t;
	}

	public String toString() {
		return "constraint " + t.toString();
	}

}
