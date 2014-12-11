package minizinc.representation.expressions;

import org.antlr.v4.runtime.tree.TerminalNode;

import transformation.ExprTransformer;
import minizinc.representation.TypeName;

public class BoolC extends Expr {
	private boolean value;

	public BoolC(boolean i) {
		value = i;
	}

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (value ? 1231 : 1237);
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
		BoolC other = (BoolC) obj;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String print() {
		return "" + value;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		return;
	}

	@Override
	public TypeName type() {
		return TypeName.BOOL;
	}

	/**
	 * @param ctx
	 * @return Term representation of a boolean constant in MiniZinc
	 */
	public static BoolC BOOLTerm(TerminalNode b) {
		return new BoolC(b.getText().toLowerCase().equals("true"));
	}

	@Override
	public BoolC clone() {
		// TODO Auto-generated method stub
		return new BoolC(value);
	}

}
