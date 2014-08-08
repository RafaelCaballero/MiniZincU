package minizinc.representation.expressions.sets;

import java.util.List;
import java.util.stream.Collectors;

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
		List<String> selems = elems.stream().map(x->x.print()).collect(Collectors.toList());
		return "{" + String.join(",", selems) + "}"; 
	}

	@Override
	public List<Expr> subexpressions() {		
		return elems;
	}
	
	public boolean isEmpty(){
		return elems==null || elems.size()==0;
	}

}
