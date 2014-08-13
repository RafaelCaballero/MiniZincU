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
public class InfixOp implements MiniZincRepresentation {
	/**
	 * 
	 */
	protected ID id;
	protected String infixSetOp;

	/**
	 * 
	 */
	public InfixOp(ID id) {
		this.id = id;
		this.infixSetOp = null;
	}
	
	public InfixOp(String infixSetOp) {
		this.infixSetOp = infixSetOp;
		this.id = null;
	}
	
	public boolean isID() {
		return id!=null;
	}
	
	public ID getID() {
		return id;
	}
	
	public String getInfixSetOp() {
		return infixSetOp;
	}


	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		// don't forget the "'"
		String s = id==null ? infixSetOp : id.print();
		
		return "'"+s+"'";
	}

	public static InfixOp infixop(InfixOpContext ctx) {
		InfixOp r = null;
		// we only need to extract the string
		// infixOp : '`' ID  '`' | infixSetOp;
		if (Parsing.hasTerminal(ctx.ID())) {
			ID id = ID.IDTerm(ctx.ID());
			r = new InfixOp(id);
		} if (Parsing.has(ctx.infixSetOp())) {
			String s = ctx.infixSetOp().getText();
			r = new InfixOp(s); 
		} else
			Parsing.error("InfixOp "+ctx.getText());

		return r;
	}

}