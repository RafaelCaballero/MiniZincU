/**
 * 
 */
package minizinc.representation.expressions.sets;


import minizinc.antlr4.MiniZincGrammarParser.SetExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;

/**
 * Representation of MiniZinc Sets.
 * Grammar: 
 * setExpr : setVal | setExpr infixSetOp setExpr;
 * @author rafa
 *
 */
public abstract class SetExpr extends Expr {


	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return TypeName.SET;
	}
	
	


	/**
	 * Representing MiniZinc sets. Grammar: <br>
	 *  setExpr : setVal <br>
	 *           |setExpr infixSetOp setExpr;<br>
	 *
	 * @param ctx The context
	 * @return The Java representation as 
	 */
	public static SetExpr setExpr(SetExprContext ctx) {
		SetExpr r=null;
		if (Parsing.has(ctx.setVal())) {
			r = SetVal.setVal(ctx.setVal());
		} else if (Parsing.has(ctx.infixSetOp())) {
			String op = ctx.infixSetOp().getText();
			SetExpr s1 = setExpr(ctx.setExpr(0)); 
			SetExpr s2 = setExpr(ctx.setExpr(1)); 
			r = InfixSetOp.infixSetOp(op,s1,s2);
		}
		else
			Parsing.error("setExpr " + ctx.getText());
		
		return r;
	}


}
