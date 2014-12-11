/**
 * 
 */
package minizinc.representation.types;

import minizinc.antlr4.MiniZincGrammarParser.RangeContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.*;

/**
 * A type range. In principle two forms are possible
 * <ol>
 * <li>from..to
 * <li>ID , with id a set constant identifier
 * </ol>
 * However the second possibility requires a semantic checking of id as a set.
 * Otherwise it is ambiguous and the id can be also an extension type, which can
 * correspond to the {@link TypeID} class.
 * 
 * @author rafa
 *
 */
public class TypeRange extends Type {
	private ArithExpr from;
	private ArithExpr to;
	private ID setID;

	/**
	 * complete constructor
	 */
	public TypeRange(ArithExpr from, ArithExpr to, ID setID) {
		this.from = from;
		this.to = to;
		this.setID = setID;
	}

	/**
	 * First constructor from..to
	 */
	public TypeRange(ArithExpr from, ArithExpr to) {
		this.setID = null;
		this.from = from;
		this.to = to;
	}

	/**
	 * from..to given as two integers
	 */
	public TypeRange(int from, int to) {
		this.setID = null;
		this.from = new Operand(new IntC(from));
		this.to = new Operand(new IntC(to));
	}

	/**
	 * Second constructor
	 */
	public TypeRange(ID setID) {
		this.setID = setID;
		this.from = null;
		this.to = null;
	}

	public boolean isFromToRange() {
		return setID == null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s = null;
		s = isFromToRange() ? from.print() + ".." + to.print() : setID.print();
		return s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.RANGE;
	}

	/**
	 * Obtains the representation of a MiniZinc range
	 * 
	 * @param ctx
	 *            the context
	 * @return
	 */
	public static TypeRange range(RangeContext ctx) {
		TypeRange t = null;
		if (Parsing.hasTerminal(ctx.ID())) {
			// range defined by the set id
			ID id = ID.IDTerm(ctx.ID());
			t = new TypeRange(id);
		} else if (Parsing.has(ctx.fromR()) && Parsing.has(ctx.toR())) {
			ArithExpr from = ArithExpr.arithExpr(ctx.fromR().arithExpr());
			ArithExpr to = ArithExpr.arithExpr(ctx.toR().arithExpr());
			t = new TypeRange(from, to);

		} else
			Parsing.error("Error in range " + ctx.getText());

		return t;
	}

	@Override
	public TypeRange clone() {
		TypeRange r = null;

		ArithExpr fromp = from == null ? null : from.clone();
		ArithExpr top = to == null ? null : to.clone();
		ID setIDp = setID == null ? null : setID.clone();

		r = new TypeRange(fromp, top, setIDp);
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
		TypeRange other = (TypeRange) obj;
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
	public Expr zero() {
		return from;
	}

}
