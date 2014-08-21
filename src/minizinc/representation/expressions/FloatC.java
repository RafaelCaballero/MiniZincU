/**
 * 
 */
package minizinc.representation.expressions;


import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.RealContext;
import minizinc.representation.TypeName;

/**
 * Representation of a MiniZinc float constant
 * @author rafa
 *
 */
public class FloatC extends Expr {
	protected double value;
	/**
	 * Constructs the representation of a MiniZinc String constant.
	 */
	public FloatC(double value) {
		this.value = value;
	}
	public double get() {
		return value;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return value+"";
	}


	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return TypeName.FLOAT;
	}
	/**
	 * @param ctx
	 *            The grammar context
	 * @return Term representation of a real number constant in MiniZinc
	 */
	public static FloatC realTerm(RealContext b) {
		double d = Double.parseDouble(b.getText());
		return new FloatC(d);
	}
	@Override
	public FloatC clone() {
		
		return new FloatC(value);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		FloatC other = (FloatC) obj;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}
	@Override
	public void subexpressions(ExprTransformer t) {
		// no subexpressions
		
	}


	
}
