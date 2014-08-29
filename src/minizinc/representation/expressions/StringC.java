/**
 * 
 */
package minizinc.representation.expressions;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.StringExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

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


	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return TypeName.STRING;
	}

	/**
	 * @param ctx
	 *            the grammar context
	 * @return a string constant containing the string. The first and last
	 *         character of the string is '"'
	 */

	public static StringC stringTerm(StringExprContext ctx) {
		return new StringC(ctx.getText());
	}

	public static StringC stringExpr(StringExprContext ctx) {
		StringC t = null;
		if (Parsing.has(ctx.string())) {
			t = stringTerm(ctx);
		} else
			Parsing.error("string:  " + ctx.toString());
		return t;
	}
	@Override
	public StringC clone() {
		return new StringC(value);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		StringC other = (StringC) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	@Override
	public void subexpressions(ExprTransformer t) {
		// nothing to do
		
	}

	
}
