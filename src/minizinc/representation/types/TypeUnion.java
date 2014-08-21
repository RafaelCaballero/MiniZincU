package minizinc.representation.types;
import minizinc.antlr4.MiniZincGrammarParser.TypedataContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.ArithExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.IntC;
import minizinc.representation.expressions.Operand;

/**
 * A declaration of a type data/union. 
 * It is of the form  id(expr) with expr an arithmetic expression.
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

	/**
	 * Constructor: name of the data type and level as an integer constant
	 */
	public TypeUnion(ID id, int  e) {
		this.id = id; 
		IntC ic = new IntC(e);
		this.e = new Operand(ic);
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

	@Override
	public TypeUnion clone() {
		 TypeUnion r = null;

		  ID idp = id == null ? null : id.clone() ;
		  ArithExpr ep = e == null ? null : e.clone();
		  
		  r = new TypeUnion(idp,ep);
		  return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e == null) ? 0 : e.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		TypeUnion other = (TypeUnion) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public Expr zero() {
		// What is the zero of an union?
		return null;
	}

}
