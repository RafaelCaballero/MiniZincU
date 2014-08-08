/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.lists.ListExpr;

/**
 * Representation of a MiniZinc String constant
 * @author rafa
 *
 */
public class StringC extends Expr {
	protected String value;
	/**
	 * Constructs the representation of a MiniZinc String constant.
	 */
	public StringC(String value) {
		this.value = value;
	}
	public String get() {
		return value;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return value;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return null;
	}
	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return TypeName.STRING;
	}

	
}
