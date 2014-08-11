/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.SimpleNonEmptyListContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.lists.Dimension;

/**
 * Array access of the form [a1...an][e1...em]
 * @author rafa
 *
 */
public class ArrayArrayAccess extends ArrayAccess {
	private List<Expr> array;


	/**
	 * Constructs an array access of the form [a1,...,am][e1...en]
	 * @param array [a1,...,am]
	 * @param indexes [e1...en]
	 */
	public ArrayArrayAccess(List<Expr> array, List<Expr> indexes) {
		super(indexes);
		this.array = array;
		
	}

	/* (non-Javadoc)
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return print(array)+super.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr> newList = new ArrayList<Expr>(array);
		newList.addAll(super.subexpressions());
		return newList;
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#type()
	 */
	@Override
	public TypeName type() {
		TypeName t = null;
		// it is the type of any element in the array (all should be of the same type!)
		if (array.size()>0)
			t = array.get(0).type();
		return t;
	}
	
	
	/**
	 * Array access of the form [a1...an][e1...em]
	 * @param ctx1 The array [a1...an]
	 * @param ctx2 The list of indexes [e1...em]
	 * @return The Java representation
	 */
	public static ArrayArrayAccess arrayarrayaccess(
			SimpleNonEmptyListContext ctx1,
			SimpleNonEmptyListContext ctx2) {
		ArrayArrayAccess t = null;
		int n = ctx2.nonEmptyListElems().expr().size();
		if (n!=0) {
			Dimension array = Dimension.dimension(ctx1.nonEmptyListElems());
			Dimension indexes = Dimension.dimension(ctx2.nonEmptyListElems());
			t = new ArrayArrayAccess(array.subexpressions(), indexes.subexpressions());
		} else Parsing.error("ArrayArrayAccess with 0 indexes " + ctx1.getText() + " | "+ctx2.getText()); 

		return t;
	}



}
