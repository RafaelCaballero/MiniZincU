/**
 * 
 */
package minizinc.representation.expressions.sets;

import java.util.ArrayList;
import java.util.List;
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

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr> r = new ArrayList<Expr>();
		r.add(expr);
		guard.stream().map(x->x.subexpressions().stream().map(y->r.add(y)));
		return r;
	}

}
