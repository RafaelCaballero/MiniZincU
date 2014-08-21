/**
 * 
 */
package minizinc.representation.solve;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.ModeAnnotationContext;
import minizinc.antlr4.MiniZincGrammarParser.SeqSContext;
import minizinc.representation.expressions.Expr;

/**
 * Grammar:
 * seqS  : 'seq_search' '('? '[' modeAnnotation (','modeAnnotation)* ']'')'?;
 *
 * @author rafa
 *
 */
public class SetqS extends ModeAnnotation {
	protected List<ModeAnnotation> ma;
	/**
	 * Constructs the SetqS with 0 modeannotations
	 */
	public SetqS() {
		ma = new ArrayList<ModeAnnotation>();
	}
	
	/**
	 * Constructs a SetqS object with the given list of annotations
	 * @param l List of ModeAnnotations in this object
	 */
	public SetqS(List<ModeAnnotation> l) {
		this.ma = l;
	}

	/**
	 * A new modeannotation to incorporate to the sequence.
	 * @param n the new mode annotation
	 */
	public void add(ModeAnnotation n) {
		ma.add(n);
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr> r = new  ArrayList<Expr>();
		if (ma!=null) {
			ma.stream().map(x->x.subexpressions().stream().map(y->r.add(y)));
		}
		return r;
	}
	
	@Override
	public String print() { 
	return "seq_search([" + printList(ma)+"])";
	}

	/**
	 * Representation of an annotation "seq_search".
	 * @param ctx The parsing context
	 * @return It representation as a SetqS object 
	 */
	public static SetqS setS(SeqSContext ctx) {
		SetqS r = null;
		List<ModeAnnotation> l = new ArrayList<ModeAnnotation>(); 
		for ( ModeAnnotationContext x: ctx.modeAnnotation()) {
			ModeAnnotation ma = ModeAnnotation.modeannotation(x);
			l.add(ma);
		}
		//ctx.modeAnnotation().stream().map(x -> l.add(ModeAnnotation.modeannotation(x)));
		r = new SetqS(l);
		return r;
	}

	@Override
	public SetqS clone() {
		SetqS r = null;
		List<ModeAnnotation> map=null;
		if (ma!=null) {
			map = new ArrayList<ModeAnnotation>();
			for (ModeAnnotation m:ma){
				map.add(m.clone());
			}
		}
		r = new SetqS(map);
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
		SetqS other = (SetqS) obj;
		if (ma == null) {
			if (other.ma != null)
				return false;
		} else if (!ma.equals(other.ma))
			return false;
		return true;
	}

}
