package minizinc.model;

import datatypes.Type;
import terms.Var;

public class SVar extends Statement {
	private Var v;

	public SVar() {
		super(TStatement.VARDECL);
	}

	public SVar(String name, Type t, int level) {
		super(TStatement.VARDECL);
		v = new Var(name, t, level);
	}

	public Var getV() {
		return v;
	}

	public void setV(Var v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return v.toString();
	}
}
