package minizinc.representation.expressions;

import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.ArrayaccessContext;
import minizinc.representation.Parsing;

public abstract class ArrayAccess extends Expr {
	/**
	 * At least a list with one or more expressions acting as indexes
	 */
	protected List<Expr> indexes;
	
	public ArrayAccess(List<Expr> indexes) {
		this.indexes = indexes;
	}
	
	public List<Expr> getIndexes() {
		return indexes;
	}
	
	@Override
	public String print() {
		return print(indexes);
	}

	
	protected String print(List<Expr> indexes) {
		String s1 = printList(indexes);
		return "["+s1+"]";
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return indexes;
	}
	
	/**
	 * Array access. Grammar: <br>
	 * Arrayaccess : ID '[' expr(','expr)* ']' | '[' (expr(','expr)*)? ']' '[' expr(','expr)* ']';
	 * @param ctx the context
	 * @return Java representation of the array access
	 */
	public static ArrayAccess arrayaccess(ArrayaccessContext ctx) {
		ArrayAccess t=null;
		if (Parsing.hasTerminal(ctx.ID()) && ctx.simpleNonEmptyList().size()==1) {
			ID id = ID.IDTerm(ctx.ID());
			t = IdArrayAccess.idarrayaccess(id,ctx.simpleNonEmptyList(0));
 
		} else if (ctx.simpleNonEmptyList().size()==2) {
			t = ArrayArrayAccess.arrayarrayaccess(ctx.simpleNonEmptyList(0), ctx.simpleNonEmptyList(1));
		} Parsing.error("arrayaccess " + ctx.getText());
		
		return t;
	}




}
