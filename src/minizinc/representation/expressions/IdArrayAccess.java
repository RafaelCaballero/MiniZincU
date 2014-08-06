/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

import minizinc.representation.TypeName;

/**
 * ArrayAccess of the form id[e1...en]
 * @author rafa
 *
 */
public class IdArrayAccess extends ArrayAccess {
	private ID id;


	public IdArrayAccess(ID id, List<Expr> indexes) {
		super(indexes);
		this.id = id;
		
	}

	/* (non-Javadoc)
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s = id.print()+super.print();
		return s;
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return super.subexpressions();
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#type()
	 */
	@Override
	public TypeName type() {
		// TODO it should be the type of the elements of the array referenced by ID
		return null;
	}

}
