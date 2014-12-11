/**
 * 
 */
package minizinc.representation.statement;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.SolveContext;
import minizinc.representation.Parsing;
import minizinc.representation.solve.Annotation;
import minizinc.representation.solve.Optimize;
import minizinc.representation.solve.Satisfy;

/**
 * Grammar:<br>
 * solve : 'solve' (annotation)? (satisfy | optimize);
 * 
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s = "solve ";
		// add the annotation if there is any
		if (annotation != null)
			s += annotation.print();
		return s;
	}

	public static Solve solve(SolveContext ctx) {
		Solve r = null;
		Annotation a = null;
		if (Parsing.has(ctx.annotation())) {
			a = Annotation.annotation(ctx.annotation());
		}
		if (Parsing.has(ctx.satisfy())) {
			r = Satisfy.satisfy(a, ctx.satisfy());
		} else if (Parsing.has(ctx.optimize())) {
			r = Optimize.optimize(a, ctx.optimize());
		}

		return r;
	}

	@Override
	public abstract Solve clone();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((annotation == null) ? 0 : annotation.hashCode());
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
		Solve other = (Solve) obj;
		if (annotation == null) {
			if (other.annotation != null)
				return false;
		} else if (!annotation.equals(other.annotation))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		Annotation annotation2 = this.applyTransformer2(t, annotation);
		annotation = annotation2;

	}

}
