package minizinc.representation.types;
import minizinc.antlr4.MiniZincGrammarParser.TypesetContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

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



}
