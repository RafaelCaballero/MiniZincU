/**
 * 
 */
package minizinc.representation.statement.decls;

import minizinc.representation.expressions.ID;

/**
 * Represents a variable declaration, maybe including an initialization.
 * Grammar:<br>
 * vardecl : (var | vararray) ('=' expr)?;
 * @author rafa
 *
 */
public class VarDecl extends Decl {
	protected Typename vartype;
	protected ID id;
	/**
	 * 
	 */
	public VarDecl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s = "var" + vartype.print() +  ':'  + id.print() ;
		return s;
	}

}
