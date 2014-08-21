/**
 * 
 */
package minizinc.representation.statement;



import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.IncludeContext;
import minizinc.representation.Parsing;

import minizinc.representation.expressions.StringC;

/**
 * Represents a MiniZinc include statement with grammar:
 * include : 'include' stringExpr;
 * @author rafa
 *
 */
public class Include extends Statement {
	protected StringC s;
	/**
	 * @param type
	 */
	public Include(StringC s) {
		super(TStatement.INCLUDE);
		this.s = s;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "include "+s;
	}



	/**
	 * Parses an include statements.
	 * @param ctx The Antl4-grammar context
	 * @return An Include object r representing the MiniZinc include statement
	 */
	public static Include include(IncludeContext ctx) {
		Include r = null;
		if (Parsing.has(ctx.stringExpr())) {
			StringC s = StringC.stringExpr(ctx.stringExpr());
			r = new Include(s);
		} else 
			Parsing.error("Include :"+ctx.getText());
		return r;
	}

	@Override
	public Include clone() {
		Include r = null; 
		StringC sp = s==null? null : s.clone();
		r = new Include(sp);	
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Include other = (Include) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		StringC s2 = this.applyTransformer(t, s);
		s=s2;
		
	}

}
