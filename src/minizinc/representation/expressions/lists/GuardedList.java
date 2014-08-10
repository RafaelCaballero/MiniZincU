/**
 * 
 */
package minizinc.representation.expressions.lists;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.InDecl;

/**
 * A one dim, guarded list.<br>
 * Grammar:<br>
 * guardedList : '[' (expr (','expr)*) '|'  guard ']' ;
 * @author Rafa Caballero
 *
 */
public class GuardedList extends OneDimList {
	protected List<Expr> exprs;
	protected List<InDecl> indecls;

	public GuardedList(List<Expr> exprs, List<InDecl> indecls) {
		this.exprs= exprs;
		this.indecls = indecls;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s1 = printList(exprs);
		String s2 = printList(indecls);
		String s = "[" +s1 + " | " + s2 + "]";
		return s;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr> l  = new ArrayList<Expr>();
		exprs.forEach(x -> l.add(x));
		indecls.forEach(x -> x.subexpressions().forEach(y -> l.add(y)));
		return l;
	}

}
