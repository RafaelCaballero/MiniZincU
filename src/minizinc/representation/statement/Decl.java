/**
 * 
 */
package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.DeclContext;
import minizinc.antlr4.MiniZincGrammarParser.DimensionsContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.statement.decls.ParDecl;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Rint;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeRange;

/**
 * Variable and parameter declarations, including possible initializations.<br>
 * Grammar<br>
 * decl : vardecl | pardecl;<br>
 * In both cases the structure is similar: a type, an id and a possible initialization.
 *
 * This abstract class contains the initialization expression, which can be null.
 * It is important to notice that equals only uses the identifier; we assume that 
 * all the declarations use different names.
 * @author rafa
 *
 */
public abstract class Decl extends Statement {
	/**
	 *  type of the declared var or par.
	 */
	protected Type declType;
	/**
	 * Identifier of the declared var or par
	 */
	protected ID id;
	/**
	 * Possible initialization
	 */
	protected Expr expr;
	
	/**
	 * Constructor for variable declarations including initializations 
	 */
	public Decl(TStatement tstatement, Type decltype,ID id,Expr expr) {
		super(tstatement);
		this.declType = decltype;
		this.id = id;
		this.expr = expr;		
	}

	/**
	 * Constructor for variable declarations without initializations 
	 */
	public Decl(TStatement tstatement,Type decltype,ID id) {
		super(tstatement);
		this.declType = decltype;
		this.id = id;
		this.expr = null;		
	}

	/**
	 * get the identifier
	 */
	public ID getID(){
		return id;
	}
	
	public Expr getExpr() {
		return expr;
	}
	/* (non-Javadoc)
	 * @see minizinc.expressions.SubExpressions#subexpressions()
	 */
	public List<Expr> subexpressions() {
		List<Expr> t = new ArrayList<Expr>();
		if (expr!=null) 
			t.add(expr);
		return t;
	}
	
	/**
	 * Indicates if the declaration includes an initialization.
	 * @return true if the declaration is initialized, false otherwise.
	 */
	public boolean initialized() {
		return expr!=null;
	}
	

	public TypeName declType() {
		return declType.type();
	}
	
	public Type getDeclType() {
		return declType;
	}

	/**
	 * parses dimensions of a array type declaration. Used by subclasses.
	 * @param dctx the context
	 * @return The Java Representation
	 */
	protected static List<Type> getDimensions(DimensionsContext dctx) {
		List<Type> t = null;
		// if there are no ranges we assume a unique dimension of type int
		// if more than one int can be written as dimension the grammar should change!!!
		if (dctx.range().size()==0) {
			t = new ArrayList<Type>();
			t.add(new Rint());
		} else {
			t = dctx.range().stream().map(x -> TypeRange.range(x)).collect(Collectors.toList());
		}
		
		return t;
	}

	public static Decl decl(DeclContext ctx) {
		Decl r=null;
		if (Parsing.has(ctx.vardecl())) {
			r = VarDecl.vardecl(ctx.vardecl());
		} else if (Parsing.has(ctx.pardecl())) {
			r = ParDecl.pardecl(ctx.pardecl());
		} else 
			Parsing.error("decl "+ctx.getText());

		return r;
	}

	@Override 
	public String print() {
		String s = "";
		if (initialized())
			s+=" = "+expr.print();
		return s;		
	}
	
	@Override
	public abstract Decl clone();

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Decl other = (Decl) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	@Override
	public void subexpressions(ExprTransformer t) {
		ID id2 = this.applyTransformer2(t, id);
		Expr expr2 = this.applyTransformer(t, expr);
		
		id = id2;
		expr = expr2;
	}

		

}
