/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.OperandContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

/**
 * operand : ID 
 *   | integer 
 *   | real
 *   |  arrayaccess 
 *   | ifExpr 
 *   | letExpr 
 *   |  '('arithExpr ')'
 *   | predOrUnionExpr 
 *   ;
 *
 * @author rafa
 *
 */
public class Operand extends ArithExpr {
	protected Expr e;
	
	/**
	 *  An ID is an operand
	 */
	public Operand(ID e) {
		this.e = e;
	}

	/**
	 *  An arithmetic expression between brackets is an operand
	 */
	public Operand(ArithExpr e) {
		// TODO Auto-generated constructor stub
	}

	public Operand(IntC e) {
		this.e = e;
	}

	public Operand(FloatC e) {
		this.e = e;
	}

	public Operand(ArrayAccess e) {
		this.e = e;
	}

	public Operand(IfS e) {
		this.e = e;
	}

	public Operand(RbracketExpr e) {
		this.e = e;
	}

	public Operand(LetExpr e) {
		this.e = e;
	}
	
	public Operand(PredOrUnionExpr e) {
		this.e = e;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return e.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Parses an arithmetic expression operand.
	 * @param ctx
	 * @return
	 */
	public static Operand operand(OperandContext ctx) {
		Operand op = null;
		if (Parsing.hasTerminal(ctx.ID())){
			op = new Operand(ID.IDTerm(ctx.ID()));
		} 
		else if (Parsing.has(ctx.integer()))
			op = new Operand(IntC.integerTerm(ctx.integer()));
		else if (Parsing.has(ctx.real()))
			op = new Operand(FloatC.realTerm(ctx.real()));
		else if (Parsing.has(ctx.arrayaccess())) 
			op = new Operand(ArrayAccess.arrayaccess(ctx.arrayaccess()));
		else if (Parsing.has(ctx.ifExpr()))
			op = new Operand(IfS.ifExpr(ctx.ifExpr()));
		else if (Parsing.has(ctx.letExpr()))
			op = new Operand(LetExpr.letExpr(ctx.letExpr()));
		else if (Parsing.has(ctx.arithExpr())){
			RbracketExpr re = RbracketExpr.rbracketArithExpr(ctx.arithExpr()); 
			op = new Operand(re);
		}
		else if (Parsing.has(ctx.predOrUnionExpr()))
			op = new Operand(PredOrUnionExpr.predOrUnionExpr(ctx.predOrUnionExpr()));
		return op;
	}


}

	