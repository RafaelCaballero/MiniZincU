/**
 * 
 */
package minizinc.representation.statement.decls;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.TStatement;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeArray;

/**
 * Represents a variable declaration, maybe including an initialization.
 * Grammar:<br>
 * vardecl : (var | vararray) ('=' expr)?;
 * @author rafa
 *
 */
public class VarDecl extends Decl {
	
	public VarDecl(Type vartype, ID id) {
		super(TStatement.VARDECL,vartype, id);
	}
	
	public VarDecl(Type vartype,ID id,Expr expr) {
		super(TStatement.VARDECL,vartype,id,expr);
	}


		/* (non-Javadoc)
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s = null;
		if (declType.type()==TypeName.ARRAY) {
			TypeArray at = (TypeArray) declType; 
			s = at.printDimensions() + " var " +  at.printBase() +  ':'  + id.print() ; 
		}
		else
			s = "var" + declType.print() +  ':'  + id.print() ;
		return s;
	}


}
