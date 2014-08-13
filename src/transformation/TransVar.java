package transformation;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.expressions.BoolC;
import minizinc.representation.statement.Constraint;
import minizinc.representation.statement.decls.VarDecl;


/*
 * Represents the the transformation of a variable
 */
public class TransVar {
	/**
	 * The variable is transformed into a list of variables
	 */
	protected List<VarDecl> var;
	/**
	 * The transformation yields new constraints
	 */
	protected Constraint ctr;

	public TransVar() {
		var = new ArrayList<VarDecl>();
		ctr = new Constraint(new BoolC(true));
	}

	public TransVar(List<VarDecl> var) {
		this.var = var;
		ctr = new Constraint(new BoolC(true));
	}

	public TransVar(List<VarDecl> var, Constraint ctr) {
		this.var = var;
		this.ctr = ctr;
	}

	public List<VarDecl> getVar() {
		return var;
	}

	public void setVar(List<VarDecl> var) {
		this.var = var;
	}

	public Constraint getCtr() {
		return ctr;
	}

	public void setCtr(Constraint ctr) {
		this.ctr = ctr;
	}

	@Override
	public String toString() {
		String s = var.toString();
		return s + "|" + ctr.toString();
	}

}
