/**
 * 
 */
package minizinc.representation.statement;

import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.SolveContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.solve.Annotation;
import minizinc.representation.solve.Optimize;
import minizinc.representation.solve.Satisfy;

/**
 * Grammar:<br>
 * solve : 'solve' (annotation)? (satisfy | optimize);
 * @author rafa
 *
 */
public abstract class Solve extends Statement {
	protected Annotation annotation; 
	

	/**
	 * A solve statement with annotation 
	 *
	 */
	public Solve(Annotation annotation) {
		super(TStatement.SOLVE);
		this.annotation = annotation;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s =  "solve ";
		// add the annotation if there is any
		if (annotation != null)
			s+=annotation.print();
		return s;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		 List<Expr> r = null;
		if (annotation!=null)
		   r = annotation.subexpressions();
		return r;
	}

	public static Solve solve(SolveContext ctx) {
		Solve r = null;
		Annotation a = null;
		if (Parsing.has(ctx.annotation())) {
			a = Annotation.annotation(ctx.annotation());
		}
		if (Parsing.has(ctx.satisfy())) {
			r = Satisfy.satisfy(a,ctx.satisfy());
		} else if (Parsing.has(ctx.optimize())) {
			r = Optimize.optimize(a,ctx.optimize()); 
		}
		
		return r;
	}

}
