/**
 * 
 */
package minizinc.representation.expressions.sets;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.RangeContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.*;

/**
 * A type range. In principle two forms are possible
 * <ol>
 * <li> from..to
 * <li> ID , with id a set constant identifier
 * </ol>
 * However the second possibility requires a semantic checking of id as a set.
 * Otherwise it is ambiguous and the id can be also an extension type,
 * which can correspond to the {@link TypeID} class.
 * @author rafa
 *
 */
public class RangeSetVal extends SetVal {
	private ArithExpr from;
	private ArithExpr to;
	private ID setID;

	/**
	 * complete constructor from..to
	 */
	public RangeSetVal(ArithExpr from,ArithExpr to, ID setID) {
		this.setID= setID;
		this.from = from;
		this.to = to;
	}

	/**
	 * First constructor from..to
	 */
	public RangeSetVal(ArithExpr from,ArithExpr to) {
		this.setID=null;
		this.from = from;
		this.to = to;
	}

	/**
	 * Second constructor
	 */
	public RangeSetVal(ID setID) {
		this.setID= setID;
		this.from = null;
		this.to = null;
	}
	
	public boolean isFromToRange() {
		return setID==null;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s=null;
		s = isFromToRange() ?  from.print() + ".." + to.print() : setID.print();
		return s;
	}

	
	/**
	 * A range as set value. The range can be either from..to or an ID
	 * @param ctx The context
	 * @return Java representation
	 */
	public static RangeSetVal rangeSetVal(RangeContext ctx) {
		RangeSetVal r = null;
		if (Parsing.hasTerminal(ctx.ID())) {
			// range defined by the set id
			ID id = ID.IDTerm(ctx.ID());
			r = new RangeSetVal(id);
		} else if (Parsing.has(ctx.fromR()) && Parsing.has(ctx.toR())) {
			ArithExpr from = ArithExpr.arithExpr(ctx.fromR().arithExpr());
			ArithExpr to = ArithExpr.arithExpr(ctx.toR().arithExpr());
			r = new RangeSetVal(from,to);
			
		} else			
			Parsing.error("Error in rangeSetVal " + ctx.getText());

		return r;
	}

	@Override
	public RangeSetVal clone() {
		RangeSetVal r = null;
		
		ArithExpr fromp = from == null ? null : from.clone();
		ArithExpr top = to == null ? null : to.clone();
		ID setIDp = setID==null ? null : setID.clone();
		r = new RangeSetVal(fromp,top,setIDp);
		return r;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((setID == null) ? 0 : setID.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
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
		RangeSetVal other = (RangeSetVal) obj;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (setID == null) {
			if (other.setID != null)
				return false;
		} else if (!setID.equals(other.setID))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		ArithExpr from2 = this.applyTransformer(t, from);
		ArithExpr to2 = this.applyTransformer(t, to);
		ID setID2 = this.applyTransformer(t, setID);
		to=to2;
		from=from2;		
		setID=setID2;

		
	}


}
