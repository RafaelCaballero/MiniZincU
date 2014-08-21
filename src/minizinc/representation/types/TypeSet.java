package minizinc.representation.types;
import minizinc.antlr4.MiniZincGrammarParser.TypesetContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.sets.BracketExpr;

/**
 * Represents type int
 * 
 * @author rafa
 */
public class TypeSet extends Type {
	/**
	 * elems type
	 */
	private Type elem;

	public TypeSet(Type elem) {
		this.elem = elem;
	}
	
	public Type getElem() {
		return elem;
	}
	
	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "set of "+elem.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.INT;
		
	}
	
	public static TypeSet typeset(TypesetContext ctx) {
		TypeSet t = null;
		if (Parsing.has(ctx.typename())) {
			Type elem = Type.typename(ctx.typename());
			t = new TypeSet(elem);
		} 
		else			
			Parsing.error("Error in typeset " + ctx.getText());
		return t;
	}

	@Override
	public Type clone() {
		TypeSet r = null;
		Type elemp = elem.clone();
		r = new TypeSet(elemp);
		return r;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elem == null) ? 0 : elem.hashCode());
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
		TypeSet other = (TypeSet) obj;
		if (elem == null) {
			if (other.elem != null)
				return false;
		} else if (!elem.equals(other.elem))
			return false;
		return true;
	}

	@Override
	public Expr zero() {
		// the empty set
		return new BracketExpr();
	}



}
