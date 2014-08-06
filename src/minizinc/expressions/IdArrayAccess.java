/**
 * 
 */
package minizinc.expressions;

import java.util.List;

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
	public List<? extends Expr> subexpressions() {
		return super.subexpressions();
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#type()
	 */
	@Override
	public Type type() {
		// TODO it should be the type of the elements of the array referenced by ID
		return null;
	}

}
