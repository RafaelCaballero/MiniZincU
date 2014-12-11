/**
 * 
 */
package minizinc.representation.expressions;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.IntegerContext;
import minizinc.representation.TypeName;

/**
 * Representation of a MiniZinc integer constant
 * 
 * @author rafa
 *
 */
public class IntC extends Expr {
	protected int value;

	/**
	 * Constructs the representation of a MiniZinc String constant.
	 */
	public IntC(int value) {
		this.value = value;
	}

	public int get() {
		return value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return value + "";
	}

	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return TypeName.INT;
	}

	/**
	 * @param ctx
	 *            The grammar context
	 * @return Term representation of a MiniZinc integer constant
	 */
	public static IntC integerTerm(IntegerContext b) {
		int d = Integer.parseInt(b.getText());
		return new IntC(d);
	}

	@Override
	public IntC clone() {

		return new IntC(value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
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
		IntC other = (IntC) obj;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		// TODO Auto-generated method stub

	}

}
