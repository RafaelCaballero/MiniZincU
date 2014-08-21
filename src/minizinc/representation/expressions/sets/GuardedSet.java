/**
 * 
 */
package minizinc.representation.expressions.sets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.GuardedSetContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.InDecl;

/**
 * A GuardedSet. <br>
 * Grammar:<br>
 * guardedSet : '{'  expr '|' guard  '}' ;<br>
 * guard :  inDecl (',' inDecl)*;<br>
 *
 * @author rafa
 *
 */
public class GuardedSet extends SetVal {
	protected Expr expr;
	protected List<InDecl> guard;
	/**
	 * Constructor-
	 *  
	 */
	public GuardedSet(Expr expr, List<InDecl> guard) {
		this.expr = expr;
		this.guard = guard;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "{" + expr.print() + " | " + printList(guard) + "}"; 
	}


	
	/**
	 * Represents a guarded set. <br> Grammar: <br>
	 * guardedSet : '{'  expr '|' guard  '}' ;<br>
	 * guard :  inDecl (',' inDecl)*;<br>
	 * @param ctx The context
	 * @return Java representation as a GuardedSet
	 */
	public static GuardedSet guardedSet(GuardedSetContext ctx) {
		GuardedSet r=null;
		if (Parsing.has(ctx.expr()) && Parsing.has(ctx.guard())) {
				Expr expr = Expr.expr(ctx.expr());
				List<InDecl> lindecl = ctx.guard().inDecl().stream().
						               map(x->InDecl.inDecl(x)).collect(Collectors.toList());
				r = new GuardedSet(expr,lindecl);
				
				
		} else 
			Parsing.error("guardedSet " + ctx.getText());
		return r;
	}

	@Override
	public GuardedSet clone() {
		GuardedSet r = null;
		Expr exprp = expr==null ? null : expr.clone();
		List<InDecl> guardp=null;
		if (guard!=null){
			guardp = new ArrayList<InDecl>();
			for (InDecl indec:guard) 
				guardp.add(indec.clone());						
		}
					
		r = new GuardedSet(exprp,guardp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expr == null) ? 0 : expr.hashCode());
		result = prime * result + ((guard == null) ? 0 : guard.hashCode());
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
		GuardedSet other = (GuardedSet) obj;
		if (expr == null) {
			if (other.expr != null)
				return false;
		} else if (!expr.equals(other.expr))
			return false;
		if (guard == null) {
			if (other.guard != null)
				return false;
		} else if (!guard.equals(other.guard))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		Expr expr2 = this.applyTransformer(t, expr);
		List<InDecl> guard2 = this.applyTransformerList2(t, guard);
		
		expr = expr2;
		guard = guard2;
		
	}



}
