/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.InfixOpContext;
import minizinc.representation.TypeName;

/**
 * An infix expression with Grammar:
 *    expr infixOp expr
 *
 * @author rafa
 *
 */
public class InfixExpr extends Expr {
	/**
	 * List of expressions combined by the operand. 
	 * We allow more than two operands.
	 */
	protected List<Expr> e;
	protected InfixOp op;
	/**
	 * constructor 
	 */
	public InfixExpr(InfixOp op, Expr e1, Expr e2) {
		e = new ArrayList<Expr>();
		e.add(e1.simplify());
		e.add(e2.simplify());
		this.op = op;
	}

	public InfixExpr(String op, Expr e1, Expr e2) {
		e = new ArrayList<Expr>();
		e.add(e1.simplify());
		e.add(e2.simplify());
		this.op = new InfixOp(op);
	}

	/**
	 * constructor for more than two operands 
	 */
	public InfixExpr(InfixOp op, List<Expr> le) {
		this.e = new ArrayList<Expr>();
		for (Expr expr:le) 
			this.e.add(expr.simplify());
		this.op = op;
	}
	/**
	 * constructor for more than two operands 
	 */
	public InfixExpr(String string, List<Expr> le) {
		this.e = new ArrayList<Expr>();
		for (Expr expr:le) 
			this.e.add(expr.simplify());
		this.op = new InfixOp(string);
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		List<Expr> le = new ArrayList<Expr>();
		for (Expr expr:e) {
			Expr ep = expr.simplify();
			le.add(ep);
		}
		e = le;
		return printList(" "+op.print()+" ",e);
	}


	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		// TODO at the moment I assume the type is the type of the first operand...
		// which many times is wrong
		return e.get(0).type();
	}

	public static InfixExpr infixExpr(Expr t0, Expr t1, InfixOpContext ctx) {
		InfixExpr r = null;
		InfixOp infixop = InfixOp.infixop(ctx);
		r = new InfixExpr(infixop,t0,t1);
		
		return r;
	}

	@Override
	public InfixExpr clone() {
		InfixExpr r = null;
		List<Expr> ep=null;
		if (e!=null) {
			ep = new ArrayList<Expr>();
			for (Expr exp:e) 
				ep.add(exp.clone());
			
		}
		InfixOp opp=op==null ? null : op.clone();
		r = new InfixExpr(opp,e);	
		return r;		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e == null) ? 0 : e.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
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
		InfixExpr other = (InfixExpr) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		if (op == null) {
			if (other.op != null)
				return false;
		} else if (!op.equals(other.op))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		List<Expr> e2 = this.applyTransformerList(t, e);
		e = e2;
	}

}
