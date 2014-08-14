/**
 * 
 */
package minizinc.representation.solve;

import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.AnnotationContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;
import minizinc.representation.expressions.Expr;

/**
 * annotation : '::' modeAnnotation;
 * modeAnnotation : intS | boolS | setS | seqS;
 *
 * Represents a MiniZinc annotation
 * @author rafa
 *
 */
public  class Annotation implements MiniZincRepresentation, SubExpressions {
	protected ModeAnnotation ma;

	/**
	 * 
	 * rConstructor
	 * @param ma ModeAnnotation contained in the Annotation
	 */
	public Annotation(ModeAnnotation ma) {
		this.ma = ma;
	}
	
	@Override
	public String print() {
		return "::"+ma.print();
	}

	@Override
	public List<Expr> subexpressions() {
		return ma.subexpressions();
	}
	
	public static Annotation annotation(AnnotationContext ctx) {
		Annotation r = null;
		
		// 
		if (Parsing.has(ctx.modeAnnotation()))  {
			ModeAnnotation ma = ModeAnnotation.modeannotation(ctx.modeAnnotation());
			r = new Annotation(ma);
		} else
			Parsing.error("Annotation: "+ctx.getText());
		return r;
		
	}

	@Override public String toString() {
		return print();
	}

}
