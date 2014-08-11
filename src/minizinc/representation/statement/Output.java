package minizinc.representation.statement;

import java.util.Arrays;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser;
import minizinc.antlr4.MiniZincGrammarParser.ListExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.lists.ListExpr;


/**
 * Representation of an output statement in MiniZinc. Grammar:<br>
 * output :'output' '(' listExpr ')' | 'output'  listExpr ;

 * @author rafa
 *
 */
public class Output extends Statement {
	ListExpr exprs = null;

	public Output(ListExpr exprs) {
		super(TStatement.OUTPUT);
		this.exprs = exprs;
	}

	public String print() {
		String sexpr = exprs.print();
		String s = "output("+sexpr+")";
		return s;
	}

	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(exprs);
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


}
