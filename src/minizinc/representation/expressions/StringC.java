/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

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

	
}
