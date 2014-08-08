/**
 * 
 */
package minizinc.representation.statement.decls;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeArray;

/**
 * Represents a variable declaration, maybe including an initialization.
 * Grammar:<br>
 * vardecl : (var | vararray) ('=' expr)?;
 * @author rafa
 *
 */
public class ParDecl extends Decl {
	
	public ParDecl(Type partype, ID id) {
		super(partype, id);
	}
	
	public ParDecl(Type partype,ID id,Expr expr) {
		super(partype,id,expr);
	}

	/* (non-Javadoc)
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s = null;
		if (declType.type()==TypeName.ARRAY) {
			TypeArray at = (TypeArray) declType; 
			s = at.printDimensions() + " " +  at.printBase() +  ':'  + id.print() ; 
		}
		else
			s =  declType.print() +  ':'  + id.print() ;
		return s;
	}


}
