/**
 * 
 */
package minizinc.representation.expressions.lists;

import java.util.List;
import java.util.stream.Collectors;

import minizinc.representation.expressions.Expr;

/**
 * Represents a simple, one-dimension list.<br>
 * Grammar: simpleList : '[' ']' | simpleNonEmptyList;
 * 
 * @author rafa
 *
 */
public class SimpleList extends OneDimList {
	protected List<Expr> elems;

	/**
	 * Constructor with expressions.
	 * 
	 */
	public SimpleList(List<Expr> elems) {
		this.elems=elems;
	}
	
	/**
	 * Empty list
	 */
	public SimpleList(){
		elems = null;
	}
	
	public boolean isEmptyList(){
		return elems == null;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String selems="";
		if (!isEmptyList()) {
			selems = printList(elems);
		}
		return "["+selems+"]";
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return elems;
	}

}
