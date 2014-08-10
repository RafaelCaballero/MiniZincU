package minizinc.representation.expressions.sets;

import java.util.List;

import minizinc.representation.expressions.Expr;

public class BracketExpr extends SetVal {
	protected List<Expr> elems;

	/**
	 * Constructor for empty set.
	 */
	public BracketExpr(){
		elems = null;
	}
	
	/**
	 * Constructor.
	 * @param elems The set elements.
	 */
	public BracketExpr(List<Expr> elems) {
		this.elems = elems;
	}

	@Override
	public String print() {
		return "{" + printList(elems) + "}"; 
	}

	@Override
	public List<Expr> subexpressions() {		
		return elems;
	}
	
	public boolean isEmpty(){
		return elems==null || elems.size()==0;
	}

}
