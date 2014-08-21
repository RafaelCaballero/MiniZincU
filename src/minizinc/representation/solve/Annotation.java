/**
 * 
 */
package minizinc.representation.solve;


import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.AnnotationContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;

/**
 * annotation : '::' modeAnnotation;
 * modeAnnotation : intS | boolS | setS | seqS;
 *
 * Represents a MiniZinc annotation
 * @author rafa
 *
 */
public  class Annotation implements MiniZincRepresentation, SubExpressions, Cloneable {
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
	@Override 
	public Annotation clone(){
		Annotation r = null;
		ModeAnnotation map = ma==null ? null : ma.clone();
		r = new Annotation(map);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ma == null) ? 0 : ma.hashCode());
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
		Annotation other = (Annotation) obj;
		if (ma == null) {
			if (other.ma != null)
				return false;
		} else if (!ma.equals(other.ma))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		ModeAnnotation ma2 = this.applyTransformer2(t, ma);
		ma = ma2;
		
	}
}
