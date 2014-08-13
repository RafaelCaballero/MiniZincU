package minizinc.representation.solve;

import java.util.Arrays;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.RestSContext;
import minizinc.representation.expressions.Expr;

/**
 * Corresponds to a simple selection annotation with grammar:
 * restS : '(' expr ',' varchoice ',' constrainchoice ',' 'complete' ')';
 * @author rafa
 *
 */
public  class Selection extends ModeAnnotation {
	protected String name;
	protected Expr expr;
	protected String vc;
	protected String cc;
	
	public Selection(String name, Expr expr, String vc, String cc) {
		this.name = name;
		this.expr = expr;
		this.vc = vc;
		this.cc = cc; 
	}
	
	@Override
	public String print() {
		return name+'(' + expr.print() + "," + vc + "," + cc +
				     "," + " complete" + ")"; 
	}
	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(expr);
	}

	public static Selection selection(String name, RestSContext ctx) {
		Selection s = null;      
		Expr e = Expr.expr(ctx.expr());
		String vc = ctx.varchoice().getText();
		String cc = ctx.constrainchoice().getText();
		s = new Selection(name,e,vc,cc);
		return s;
	}
	
	
	

}
