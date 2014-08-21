/**
 * 
 */
package minizinc.representation.solve;

import minizinc.antlr4.MiniZincGrammarParser.SatisfyContext;
import minizinc.representation.statement.Solve;

/**
 * A satisfationp problem
 * @author rafa
 *
 */
public class Satisfy extends Solve {

	public Satisfy(Annotation a) {
		super(a);
	}

	@Override
	public String print() {
		return super.print()+" satisfy";
	}

	public static Solve satisfy(Annotation a, SatisfyContext ctx) {		
		return new Satisfy(a);
	}

	@Override
	public Satisfy clone() {
		Annotation ap = this.annotation == null ? null : this.annotation.clone();
		return new Satisfy(ap);
	}
	
	
}
