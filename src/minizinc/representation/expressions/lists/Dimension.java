/**
 * 
 */
package minizinc.representation.expressions.lists;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.NonEmptyListElemsContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.SubExpressions;
import minizinc.representation.expressions.Expr;

/**
 * Auxiliary class for lists. Represents a non-empty list of expressions separated
 * by ",". 
 * @author rafa
 *
 */
public class Dimension implements MiniZincRepresentation, SubExpressions {
	protected List<Expr> exprs;
	/**
	 * 
	 */
	public Dimension(List<Expr> exprs) {
		this.exprs = exprs;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return exprs;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return printList(exprs);
	}
	
	/**
	 * Represents a non-empty sequence of comma separated expressions
	 * @param ctx
	 * @return The representation as a Dimension element.
	 */
	public static Dimension dimension(NonEmptyListElemsContext ctx) {
		List<Expr> l = new ArrayList<Expr>();
		ctx.expr().forEach(x -> l.add(Expr.expr(x)));		
		return new Dimension(l);
	}

}
