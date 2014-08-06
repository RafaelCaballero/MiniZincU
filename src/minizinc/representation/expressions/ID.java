package minizinc.representation.expressions;

import java.util.List;

import minizinc.representation.TypeName;
import terms.Term;

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
	 * No subexpression
	 */
	@Override
	public List<Expr> subexpressions() {
		return null;
	}


	/**
	 * We cannot determine the type
	 */
	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return null;
	}

}
