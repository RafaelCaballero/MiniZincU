/**
 * 
 */
package minizinc.representation.expressions;

import minizinc.antlr4.MiniZincGrammarParser.InfixOpContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;

/**
 * Represents an identifier used as an infix operator
 * infixOp : '`' 
 * ID  '`' | infixSetOp;
 * infixSetOp : 'in' | 'intersect' | 'union' ;
 *
 * @author rafa
 *
 */
public class InfixOp implements MiniZincRepresentation, Cloneable {
	/**
	 * 
	 */
	protected ID id;
	protected String sop;

	/**
	 * Complete constructor
	 */
	public InfixOp(ID id, String sop) {
		this.id = id;
		this.sop = sop;
	}
	
	/**
	 * 
	 */
	public InfixOp(ID id) {
		this.id = id;
		sop = null;
	}
	
	public InfixOp(String sop) {
		this.sop = sop;
		this.id = null;
	}
	
	public boolean isID() {
		return id!=null;
	}
	
	public ID getID() {
		return id;
	}
	
	public String getInfixSetOp() {
		return sop;
	}


	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		// don't forget the "'"
		String s = id==null ? sop : "`"+id.print()+"`";
		
		return s;
	}

	public static InfixOp infixop(InfixOpContext ctx) {
		InfixOp r = null;
		// we only need to extract the string
		// infixOp : '`' ID  '`' | infixSetOp;
		if (Parsing.hasTerminal(ctx.ID())) {
			ID id = ID.IDTerm(ctx.ID());
			r = new InfixOp(id);
		} else if (Parsing.has(ctx.infixSetOp())) {
			String s = ctx.infixSetOp().getText();
			r = new InfixOp(s); 
		} else
			Parsing.error("InfixOp "+ctx.getText());

		return r;
	}
	
	@Override
	public InfixOp clone() {
		InfixOp r=null;
		ID idp = id==null ? null : id.clone();
		String sopp = sop;
		r = new InfixOp(idp,sopp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sop == null) ? 0 : sop.hashCode());
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
		InfixOp other = (InfixOp) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sop == null) {
			if (other.sop != null)
				return false;
		} else if (!sop.equals(other.sop))
			return false;
		return true;
	}

}
