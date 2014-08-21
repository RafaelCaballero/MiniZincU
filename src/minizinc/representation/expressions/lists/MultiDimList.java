package minizinc.representation.expressions.lists;

import java.util.ArrayList;
import java.util.List;

import transformation.ExprTransformer;
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
	 * complete constructor
	 */
	public MultiDimList(List<Dimension> dims) {
		this.dims  = dims;
	}
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


	/**
	 * Obtains the representation of a MiniZinc multidimensional list.
	 * Grammar:<br>
	 * multiDimList : '[|' nonEmptyListElems ((',')?'|' nonEmptyListElems  )*  '|]' ;
	 * @param ctx The context
	 * @return The representation of a multidimensional list.
	 */
	public static MultiDimList multiDimList(MultiDimListContext ctx) {
		MultiDimList r = new MultiDimList();
		//ctx.nonEmptyListElems().forEach(x->System.out.println(x.getText()));
		ctx.nonEmptyListElems().forEach(x->r.addDim(Dimension.dimension(x)));
		return r;
	}

	@Override
	public MultiDimList clone() {
		MultiDimList r = null;
		List<Dimension> dimsp=null;
		if (dims!=null) {
			dimsp = new ArrayList<Dimension>();
			for (Dimension d: dims)
				dimsp.add(d.clone());
		}
		r = new	MultiDimList(dimsp);
		return r;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dims == null) ? 0 : dims.hashCode());
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
		MultiDimList other = (MultiDimList) obj;
		if (dims == null) {
			if (other.dims != null)
				return false;
		} else if (!dims.equals(other.dims))
			return false;
		return true;
	}
	@Override
	public void subexpressions(ExprTransformer t) {
		List<Dimension> dims2 = this.applyTransformerList2(t, dims);
		dims = dims2;
		
	}

	

}
