/**
 * 
 */
package minizinc.representation.solve;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.OptimizeContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.statement.Solve;

/**
 * A satisfationp problem
 * @author rafa
 *
 */
public class Optimize extends Solve {
	protected Expr expr;
	protected String maxmin;
	
	public Optimize(Annotation a, String maxmin, Expr expr) {
		super(a);
		this.maxmin = maxmin;
		this.expr = expr;
		
	}
	@Override
	public String print() {
		return super.print()+" "+maxmin + " " +expr.print();
	}

	@Override
	public List<Expr> subexpressions() {
		List<Expr> r = super.subexpressions();
		if (r == null) 
			r = new ArrayList<Expr>();
		r.add(expr);			
		return r;
	}

	public static Optimize optimize(Annotation a, OptimizeContext ctx) {
		Optimize r = null;
		Expr e;
		if (Parsing.has(ctx.maximize())) {
			if (Parsing.has(ctx.maximize().expr())) {
				e = Expr.expr(ctx.maximize().expr());
				r = new Optimize(a,"maximize",e);
			}
			else 
				Parsing.error("optimize: missing expr to maximize "+ctx.getText());
			
		} else if (Parsing.has(ctx.minimize())) {
			if (Parsing.has(ctx.minimize().expr())) {
				e = Expr.expr(ctx.minimize().expr());
				r = new Optimize(a,"minimize",e);
				
			} else 
				Parsing.error("optimize: missing expr to minimize "+ctx.getText());
		} 	else 
			Parsing.error("optimize: neither maximize nor minimize "+ctx.getText());

		return r;
	}
}
