package minizinc.representation.expressions.sets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.BracketExprContext;
import minizinc.representation.Parsing;
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


	public boolean isEmpty(){
		return elems==null || elems.size()==0;
	}
	
	public static BracketExpr bracketExpr(BracketExprContext ctx) {
		BracketExpr t = null;
		if (Parsing.has(ctx.commaList())) {
			List<Expr> lexpr = ctx.commaList().expr().stream().
								map(x->Expr.expr(x)).collect(Collectors.toList());
			t = new BracketExpr(lexpr);
		} else 
			t = new BracketExpr();

		return t;
	}

	@Override
	public BracketExpr clone() {
		BracketExpr r = null;
		List<Expr> elemsp=null;
		if (elems!=null){
			elemsp = new ArrayList<Expr>();
			for (Expr e:elems)
				elemsp.add(e.clone());
		}
		
		r = new BracketExpr(elemsp);
		return r;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elems == null) ? 0 : elems.hashCode());
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
		BracketExpr other = (BracketExpr) obj;
		if (elems == null) {
			if (other.elems != null)
				return false;
		} else if (!elems.equals(other.elems))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		List<Expr> elems2 = this.applyTransformerList(t, elems);
		elems = elems2;
		
		
	}


}
