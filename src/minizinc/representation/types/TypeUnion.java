package minizinc.representation.types;
import minizinc.antlr4.MiniZincGrammarParser.TypedataContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.ArithExpr;
import minizinc.representation.expressions.ID;

/**
 * 
 * @author rafa
 */
public class TypeUnion extends Type {

	private ID id;
	private ArithExpr e;
	
	/**
	 * Constructor: name of the data type and level (an integer expr).
	 */
	public TypeUnion(ID id, ArithExpr e) {
		this.id = id; this.e = e;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return id.print()+"("+e.print()+")";
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.UNION;		
	}
	public ID getId() {
		return id;
	}

	public ArithExpr getE() {
		return e;
	}

	/**
	 * A type union of the form  id(expr) with expr an arithmetic expression 
	 * representing the depth
	 * @param ctx the context
	 * @return Java representation
	 */
	public static TypeUnion typedata(TypedataContext ctx) {
		TypeUnion t = null;
		if (Parsing.has(ctx.arithExpr()) && Parsing.hasTerminal(ctx.ID())) {
			ID id = ID.IDTerm(ctx.ID());
			ArithExpr e = ArithExpr.arithExpr(ctx.arithExpr());
			t = new TypeUnion(id,e);			
		}
		else			
			Parsing.error("Error in typedata " + ctx.getText());
				

		return t;
	}

}
