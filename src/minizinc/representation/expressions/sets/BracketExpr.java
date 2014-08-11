package minizinc.representation.expressions.sets;

import java.util.List;
import java.util.stream.Collectors;

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

	@Override
	public List<Expr> subexpressions() {		
		return elems;
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


}
