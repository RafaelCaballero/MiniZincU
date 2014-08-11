/**
 * 
 */
package minizinc.representation.expressions.sets;

import java.util.ArrayList;
import java.util.List;

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


	@Override
	public List<Expr> subexpressions() {
		List<Expr> sub = new ArrayList<Expr>();
		sub.add(from);
		sub.add(to);
		return sub;
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


}
