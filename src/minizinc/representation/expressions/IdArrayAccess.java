/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.SimpleNonEmptyListContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.lists.Dimension;

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
	
	/**
	 * Array access of the form id[e1...en]
	 * @param id The identifier, already in Java format
	 * @param ctx list of indexes
	 * @return The Java representation
	 */
	public static IdArrayAccess idarrayaccess(ID id,
			SimpleNonEmptyListContext ctx) {
		IdArrayAccess t = null;
		int n = ctx.nonEmptyListElems().expr().size();
		if (n!=0) {
			Dimension indexes = Dimension.dimension(ctx.nonEmptyListElems());
			t = new IdArrayAccess(id, indexes.subexpressions());
		} else Parsing.error("IdArrayAccess (Id: "+id+") with 0 indexes " + ctx.getText()); 
		return t;
	}



}
