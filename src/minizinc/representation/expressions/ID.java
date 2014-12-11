package minizinc.representation.expressions;

import org.antlr.v4.runtime.tree.TerminalNode;

import transformation.ExprTransformer;
import minizinc.representation.TypeName;

public class ID extends Expr {
	protected String id;

	/**
	 * An ID is represented by its name
	 * 
	 * @param id
	 *            The ID name
	 */
	public ID(String id) {
		this.id = id;
	}

	public ID clone() {
		return new ID(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ID other = (ID) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public String print() {
		return id;
	}

	/**
	 * We cannot determine the type
	 */
	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return null;
	}

	public static ID IDTerm(TerminalNode id) {
		return new ID(id.getText());
	}

	public static ID IDTerm(String id) {
		return new ID(id);
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		// no subexpressions
	}

}
