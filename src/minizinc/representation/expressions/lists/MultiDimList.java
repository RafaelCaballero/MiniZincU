package minizinc.representation.expressions.lists;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.MultiDimListContext;
import minizinc.representation.expressions.Expr;

/**
 * Representation of a MiniZinc multidimensional list.
 * Grammar:<br>
 * multiDimList : '[|' nonEmptyListElems ((',')?'|' nonEmptyListElems  )*  '|]' ;
 * @author Rafa Caballero 
 */
public class MultiDimList extends ListExpr {
	protected List<Dimension> dims;

	/**
	 * Constructs the empty multidimension list
	 */
	public MultiDimList() {
		dims  = new ArrayList<Dimension>();
	}
	
	/**
	 * Adds a new dimension.
	 * @param d The new dimension.
	 */
	public void addDim(Dimension d) {
		dims.add(d);
	}
	/**
	 * Adds a new dimension.
	 * @param d the list of elements in the new dimension.
	 */
	public void addDim(List<Expr> d) {
		dims.add(new Dimension(d));
	}
	

	@Override
	public String print() {
		String s = "[|";
		if (dims != null && dims.size()>0) {
			for(Dimension x:dims)
		         s+=x.print()+"|";
		    s +="]";
		    		
		} else
			s +="|]";
		return s;
	}

	@Override
	public List<Expr> subexpressions() {
		List<Expr> r = new ArrayList<Expr>();
		if (dims != null) {
			dims.forEach(x -> x.subexpressions().forEach(y->r.add(y)));
		}
		return r;
		
	}
	
	/**
	 * Obtains the representation of a MiniZinc multidimensional list.
	 * Grammar:<br>
	 * multiDimList : '[|' nonEmptyListElems ((',')?'|' nonEmptyListElems  )*  '|]' ;
	 * @param ctx The context
	 * @return The representation of a multidimensional list.
	 */
	public static MultiDimList multiDimList(MultiDimListContext ctx) {
		MultiDimList r = new MultiDimList();
		ctx.nonEmptyListElems().forEach(x->r.addDim(Dimension.dimension(x)));
		return r;
	}

	

}
