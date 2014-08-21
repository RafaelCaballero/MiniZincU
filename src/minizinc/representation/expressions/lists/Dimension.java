/**
 * 
 */
package minizinc.representation.expressions.lists;

import java.util.ArrayList;
import java.util.List;

import transformation.ExprTransformer;
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
public class Dimension implements MiniZincRepresentation, SubExpressions, Cloneable {
	protected List<Expr> exprs;
	/**
	 * 
	 */
	public Dimension(List<Expr> exprs) {
		this.exprs = exprs;
	}



	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return printList(exprs);
	}
	@Override
	public String toString() {
		return print();
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
	
	public Dimension clone() {
		Dimension r= null;
		List<Expr> exprsp=null;
		if (exprs!=null) {
			exprsp = new ArrayList<Expr>();
			for (Expr e:exprs) 
				exprsp.add(e.clone());
			
		}
		r = new Dimension(exprsp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exprs == null) ? 0 : exprs.hashCode());
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
		Dimension other = (Dimension) obj;
		if (exprs == null) {
			if (other.exprs != null)
				return false;
		} else if (!exprs.equals(other.exprs))
			return false;
		return true;
	}



	@Override
	public void subexpressions(ExprTransformer t) {
		 List<Expr> exprs2 = this.applyTransformerList(t, exprs);
		 exprs=exprs2;
		
	}



	/**
	 * @return the exprs
	 */
	public List<Expr> getExprs() {
		return exprs;
	}

}
