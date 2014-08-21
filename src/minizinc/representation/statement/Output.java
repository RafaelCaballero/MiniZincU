package minizinc.representation.statement;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser;
import minizinc.antlr4.MiniZincGrammarParser.ListExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.lists.ListExpr;


/**
 * Representation of an output statement in MiniZinc. Grammar:<br>
 * output :'output' '(' listExpr ')' | 'output'  listExpr ;

 * @author rafa
 *
 */
public class Output extends Statement {
	protected ListExpr exprs = null;

	public Output(ListExpr exprs) {
		super(TStatement.OUTPUT);
		this.exprs = exprs;
	}

	public String print() {
		String sexpr = exprs.print();
		String s = "output("+sexpr+")";
		return s;
	}
	
	public ListExpr getListExprs(){
		return exprs;
	}

	
	/**
	 * Grammar piece: output :'output' '(' listExpr ')' | 'output' listExpr ;
	 */

	public static Output output(MiniZincGrammarParser.OutputContext ctx) {
		Output so = null;
		if (Parsing.has(ctx.listExpr())) {
			ListExprContext lec = ctx.listExpr();
			ListExpr t = ListExpr.listExpr(lec);
			so = new Output(t);
		} else
			Parsing.error("output:  " + ctx.toString());

		return so;
	}

	@Override
	public Output clone() {
		Output r = null;
		ListExpr exprsp = exprs==null ? null : exprs.clone();
		r = new Output(exprsp);	
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((exprs == null) ? 0 : exprs.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Output other = (Output) obj;
		if (exprs == null) {
			if (other.exprs != null)
				return false;
		} else if (!exprs.equals(other.exprs))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		ListExpr exprs2 = this.applyTransformer(t, exprs);
		exprs = exprs2;
		
	}


}
