/**
 * 
 */
package minizinc.representation.statement;

import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.IncludeContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
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

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		// an include has no subexpressions
		return null;
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

}
