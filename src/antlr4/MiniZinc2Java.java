package antlr4;

import java.util.ArrayList;
import java.util.List;

import model.*;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr4.MiniZincGrammarParser.ArithComplexExprContext;
import antlr4.MiniZincGrammarParser.ArithExprContext;
import antlr4.MiniZincGrammarParser.BoolComplexExprContext;
import antlr4.MiniZincGrammarParser.BoolExprContext;
import antlr4.MiniZincGrammarParser.MinusExprContext;
import antlr4.MiniZincGrammarParser.NotExprContext;
import antlr4.MiniZincGrammarParser.RbracketExprContext;
import antlr4.MiniZincGrammarParser.*;
import terms.*;

/**
 * @author rafa
 *
 */
public  class MiniZinc2Java {

	/**
	 * Grammar piece:
	 * output :'output' '(' listExpr ')' | 'output'  listExpr ;
     */

	public static SOutput output(MiniZincGrammarParser.OutputContext ctx) {
		SOutput so = null;
		if (has(ctx.listExpr())) {
			ListExprContext lec = ctx.listExpr();
			Term t = listExpr(lec);
            so = new SOutput(t);
		} 
		else error("output:  "+ctx.toString());
		
		return so;
	}
	/**
	 * Grammar piece:
	 * listExpr: listValue 
     * | listExpr '++' expr
     * | oneDimList 
     * | multiDimList ;
     */
	private static Term listExpr(ListExprContext lec) {
		Term t = null;
		// 4 possibilities according to the grammar
		if (has(lec.listValue())) {
			ListValueContext lvc = lec.listValue();
			t = listValue(lvc);
		}
		else if (has(lec.listExpr())){
			t = listExpr(lec.listExpr());
			
		}
		else if (has(lec.oneDimList())) {
			t = oneDimList(lec.oneDimList());
		}
		else if (has(lec.multiDimList())) {
			t = multiDimList(lec.multiDimList());
		}
		else error("list:  "+lec.toString());
		return t;
	}

    /**	
	 * listValue : stringExpr 
	 *            | ID 
	 *            | ifExpr 
	 *            | arrayaccess 
	 *            | showExpr 
	 *            | inDecl 
	 *            | functionExpr;
     */
	private static Term listValue(ListValueContext lvc) {
		Term t = null;
		
		if (has(lvc.stringExpr())) {
			t= stringExpr(lvc.stringExpr());
		}
		else if (hasTerminal(lvc.ID())){
			t= IDTerm(lvc.ID());
		}
		else if (has(lvc.ifExpr())) {
			t = ifExpr(lvc.ifExpr());
		}
		else if (has(lvc.arrayaccess())) {
			t = arrayaccess(lvc.arrayaccess());
		}
		else if (has(lvc.showExpr())) {
			t = showExpr(lvc.showExpr());
		}
		else if (has(lvc.inDecl())) {
			t = inDecl(lvc.inDecl());
		}
		else if (has(lvc.functionExpr())) {
			t = functionExpr(lvc.functionExpr());
		}
		else error("listValue:  "+lvc.toString());

		return t;
	}

	/**
	 * ifExpr : 'if' bodyIf ;
	 * @param ctx the expression context
	 * @return Term representing the if  expression
	 */
	private static Term ifExpr(IfExprContext ctx) {
		Term t = null;
		if (has(ctx.bodyIf())) {
		   t = bodyIf(ctx.bodyIf());
		}
		else error("ifExpr:  "+ctx.toString());
		return t;
	}

	/**
	 * bodyIf : expr 'then' expr (elseS | elseifS) ;
	 * @param ctx the expression context
	 * @return Term representing the if  expression
	 */
	private static Term bodyIf(BodyIfContext ctx) {
		Term t = null;
		ExprContext e0 = ctx.expr(0);
		ExprContext e1 = ctx.expr(1);
		Term t0 = expr(e0);
		Term t1 = expr(e1);
		
		if (has(ctx.elseS())) {
		   t = elseS(t0,t1,ctx.elseS());
		}
		else if (has(ctx.elseifS())) {
			   t = elseifS(t0,t1,ctx.elseifS());			
		}
		else error("bodyIf:  "+ctx.toString());
		return t;
	}

	/**
	 * elseS : 'else' expr 'endif';
	 * @param t0:  if condition
	 * @param t1: then expression 
	 * @param ctx: expression context
	 * @return Term representing the elseS  expression
	 */
	private static Term elseS(Term t0, Term t1, ElseSContext ctx) {
		Term t = null;
		if (has(ctx.expr())) {
			Term t2  = expr(ctx.expr());
			t = new IfS(t0,t1,t2);
		}
		else error("elseS "+ctx.toString());
		return t;
	}

	/**
	 * elseifS : 'elseif' bodyIf;
	 * @param t0  if condition
	 * @param t1 then expression 
	 * @param ctx expression context
	 * @return Term representing the elseifS  expression
	 */
	private static Term elseifS(Term t0, Term t1, ElseifSContext ctx) {
		Term t = null;
		if (has(ctx.bodyIf())) {
			Term t2  = bodyIf(ctx.bodyIf());
			t = new IfS(t0,t1,t2);
		}
		else error("elseifS "+ctx.toString());
		return t;
	}
	
	/******************************************************/
		
	/**
	 * Grammar for expresions:
	 * <p>expr:</p>  
     *  rbracketExpr<br>
     * | boolComplexExpr<br>
    * | arithComplexExpr<br>
    * | setExpr    <br>
    * | listExpr<br>
    * | expr infixOp expr<br>
    * | ifExpr <br>
    * | letExpr <br>
    * | guardExpr<br>
    * | predOrUnionExpr<br> 
    * | stringExpr<br>
    * | caseExpr        <br> 
    * | BOOL<br>
    * | real<br>
    * | integer<br>
    * | ID<br>
    * | '_'<br>
	 * @param ctx expression context
	 * @return Term representing the expression
	 */
	private static Term expr(ExprContext ctx) {
		Term t = null;
		if (has(ctx.rbracketExpr())) {
			t = rbracketExpr(ctx.rbracketExpr());
		} 
		else if (has(ctx.boolComplexExpr())) {
			t = boolComplexExpr(ctx.boolComplexExpr());
		}
		else if (has(ctx.arithComplexExpr())) {
			t = arithComplexExpr(ctx.arithComplexExpr());
		}
		else if (has(ctx.setExpr())) {
			t = setExpr(ctx.setExpr());
		}
		else if (has(ctx.listExpr())) {
			t = listExpr(ctx.listExpr());
		}
		else if (has(ctx.infixOp())) {
			ExprContext e0 = ctx.expr(0);
			ExprContext e1 = ctx.expr(1);
			Term t0 = expr(e0);
			Term t1 = expr(e1);
			t = infixExpr(t0,t1,ctx.infixOp());
		}
		else if (has(ctx.ifExpr())) {
			t = ifExpr(ctx.ifExpr());
		}
		else if (has(ctx.letExpr())) {
			t = letExpr(ctx.letExpr());
		}
		else if (has(ctx.guardExpr())) {
			t = guardExpr(ctx.guardExpr());
		}
		else if (has(ctx.predOrUnionExpr())) {
			t = predOrUnionExpr(ctx.predOrUnionExpr());
		}
		else if (has(ctx.stringExpr())) {
			t = stringExpr(ctx.stringExpr());
		}
		else if (has(ctx.caseExpr())) {
			t = caseExpr(ctx.caseExpr());
		}
		else if (hasTerminal(ctx.BOOL())) {
			t = BOOLTerm(ctx.BOOL());
		}
		else if (has(ctx.real())) {
			t = realTerm(ctx.real());
		}
		else if (has(ctx.integer())) {
			t = integerTerm(ctx.integer());			
		}
		else if (hasTerminal(ctx.ID())) {
			t = IDTerm(ctx.ID());
		}
		else if (ctx.toString().equals("_")) {
			t = IDTerm("_");
		}
		else error("expr:  "+ctx.toString());
		return t;
	}
	
  /**
   * Grammar:<br>
   * arithComplexExpr :
   *      minusExpr
   * |   arithExpr arithOp2 arithExpr   
   *
   * @param ctx grammar context
   * @return Term representation
  */
private static Term arithComplexExpr(
			ArithComplexExprContext ctx) {
		Term t = null;
		if (has(ctx.minusExpr())) {
			t = minusExpr(ctx.minusExpr());			
		}
		else if (has(ctx.arithOp2())) {
			ArithExprContext a0 = ctx.arithExpr(0);
			ArithExprContext a1 = ctx.arithExpr(1);
			if (a0==null || a1==null)
				error("arithComplexExpr (null operand):  "+ctx.toString());
			else {
				Term t0 = arithExpr(a0);
				Term t1 = arithExpr(a1);
				String op = ctx.arithOp2().getText();
				t = infixArithOp(t0,t1,op);
			}
		}
		else error("arithComplexExpr:  "+ctx.toString());
		return t;
	}
/**
   * <p>Grammar:</p>
   * boolComplexExpr:<br>     
   *  boolExpr (boolOp|qualBoolOp)  boolExpr<br>  
   * |   arithExpr (arithOp|qualArithOp) arithExpr<br>       
   * |   notExpr  <br>
   * ;<br>
*
 * @param ctx grammar context
 * @return Term representation
 */
private static Term boolComplexExpr(BoolComplexExprContext ctx) {
		Term t = null;
		if (has(ctx.notExpr())) {
			t = notExpr(ctx.notExpr());
		}
		else if (ctx.boolExpr().size() == 2) {
			BoolExprContext b0 = ctx.boolExpr(0);
			BoolExprContext b1 = ctx.boolExpr(1);
			Term t0 = boolExpr(b0);
			Term t1 = boolExpr(b1);
			String op = "";
			if (has(ctx.boolOp())) {
				op = ctx.boolOp().getText();
				t = infixBoolOp(t0,t1,op);
			}
			else if (has(ctx.qualBoolOp())) {
				op = ctx.qualBoolOp().getText();
				t = infixBoolOp(t0,t1,op);				
			}
			else error("boolComplexExpr - unexpected operator "+ctx.toString());
			
		}
		else if (ctx.arithExpr().size() == 2) {
			ArithExprContext a0 = ctx.arithExpr(0);
			ArithExprContext a1 = ctx.arithExpr(1);
			Term t0 = arithExpr(a0);
			Term t1 = arithExpr(a1);
			String op = "";
			if (has(ctx.arithOp())) {
				op = ctx.arithOp().getText();
				t = infixArithOp(t0,t1,op);
			}
			else if (has(ctx.qualArithOp())) {
				op = ctx.qualArithOp().getText();
				t = infixArithOp(t0,t1,op);				
			}
			else error("boolComplexExpr - unexpected operator "+ctx.toString());

			
		} 
		else error("boolComplexExpr "+ctx.toString());
		return t;
	}



/**
 * <p>Grammar</p>
 * boolExpr : boolExpr (boolOp|qualBoolOp) boolExpr<br>     
 *   |   arithExpr (arithOp|qualArithOp) expr<br>
 *   |   notExpr  <br>
 *   |   boolVal<br>
 *   ;
 * @param ctx the grammar context
 * @return Term representation
 */
private static Term boolExpr(BoolExprContext ctx) {
	Term t = null;
	if (ctx.boolExpr().size()==2) {
		BoolExprContext b0 = ctx.boolExpr(0);
		BoolExprContext b1 = ctx.boolExpr(1);
		Term t0 = boolExpr(b0);
		Term t1 = boolExpr(b1);
		String op = "";
		if (has(ctx.boolOp())) {
			op = ctx.boolOp().getText();
			t = infixBoolOp(t0,t1,op);
		}
		else if (has(ctx.qualBoolOp())) {
			op = ctx.qualBoolOp().getText();
			t = infixBoolOp(t0,t1,op);				
		}
		else error("BoolExprContext - unexpected operator "+ctx.toString());

	} else if (has(ctx.arithExpr())) {
		ArithExprContext a0 = ctx.arithExpr();
		ExprContext a1 = ctx.expr();
		Term t0 = arithExpr(a0);
		Term t1 = expr(a1);
		String op = "";
		if (has(ctx.arithOp())) {
			op = ctx.arithOp().getText();
			t = infixArithOp(t0,t1,op);
		}
		else if (has(ctx.qualArithOp())) {
			op = ctx.qualArithOp().getText();
			t = infixArithOp(t0,t1,op);				
		}
		else error("boolExpr - unexpected operator "+ctx.toString());

		
	} else if (has(ctx.notExpr())) {
		t = notExpr(ctx.notExpr());
		
	} else if (has(ctx.boolVal())) {
		t = boolVal(ctx.boolVal());
	}
	else error("boolExpr "+ctx.toString());
	
	return t;
}
/**
 * Grammar: <br>
 * notExpr  : 'not'  expr ;
 * @param ctx Grammar context
 * @return Term representation
 */
private static Term notExpr(NotExprContext ctx) {
	Term t = null;
	ExprContext e0 = ctx.expr();
	if (e0 != null) {
		t = expr(e0);
	}
	else error("notExpr "+ctx.toString());

	return t;
}
/**
 * Arithmetic infix expression
 * @param t0 First operand
 * @param t1 Second operand
 * @param op Operator
 * @return Term representation
 */

private static Term infixArithOp(Term t0, Term t1,
		String op) {	
	return   new BinExp(op,t0,t1);
}

/**
 * Obtain the representation of a MiniZinc arithmetic  expression.<br>
 * Grammar:<br>
 * arithExpr :  minusExpr<br>
 *   |   arithExpr arithOp2 arithExpr      
 *   |   operand<br>
 *  ;<br>
 *
 * @param ctx the grammar context
 * @return Term representation
 */
private static Term arithExpr(ArithExprContext ctx) {
    Term t = null;
    if (has(ctx.minusExpr())) {
    	t = minusExpr(ctx.minusExpr());
    } 
    else if (has(ctx.operand())) {
    	t = operand(ctx.operand());
    }
    else if (ctx.arithExpr().size()==2) {
    	ArithExprContext a0 = ctx.arithExpr(0);
    	ArithExprContext a1 = ctx.arithExpr(1);
    	Term t0 = arithExpr(a0);
    	Term t1 = arithExpr(a1);
    	if (has(ctx.arithOp2())) {
    	   String op = ctx.arithOp2().getText();
    	   t = infixArithOp(t0,t1,op);
    	} else error("arithExpr, arithOp2 "+ctx.toString());
    	
    } else error("arithExpr "+ctx.toString());
	return t;
}

/**
 * minusExpr      :  '-'  arithExpr ;
 * @param ctx Grammar context
 * @return Term representing the expression
 */
private static Term minusExpr(MinusExprContext ctx) {
	Term t = null;
	if (has(ctx.arithExpr())) {
		ArithExprContext a = ctx.arithExpr();
		Term t0 = arithExpr(a);
		t = new UnaryExp("-",t0);
	} else error("minusExpr "+ctx.toString());
	return t;
}

/**
 * Boolean infix expression
 * @param t0 First operand
 * @param t1 Second operand
 * @param op Operator
 * @return Term representation
 */
private static Term infixBoolOp(Term t0, Term t1, String op) {
     return  new BinExp(op,t0,t1);	
}
/**
   * Expression between round brackets
   * rbracketExpr    :  '(' expr ')';
 * @param ctx grammar context
 * @return Term representation of expr 
 */
private static Term rbracketExpr(RbracketExprContext ctx) {
	    Term t = null;
	    if (has(ctx.expr() )) {
		    ExprContext e = ctx.expr();
		    t = expr(e);
	    }  
	    else error("rbracketExpr "+ctx.getText())   
		return t;
	}
/******************************************************/
	
	private static Term stringExpr(StringExprContext ctx) {
		Term t = null;
		if (has(ctx.string())) {
			t = stringTerm(ctx);
		}
		else error("string:  "+ctx.toString());
		return t;
	}
	private static boolean has(ParserRuleContext ctx) {
		return ctx != null;
	}
	private static boolean hasTerminal(TerminalNode ctx) {
		return ctx != null;
	}

	 /********************** Terminals **************/
	private static ID IDTerm(TerminalNode id) {
		return new ID(id.getText());
	}
	private static ID IDTerm(String id) {
		return new ID(id);
	}
	/**
	 * @param ctx the grammar context
	 * @return a string constant containing the string. 
	 * The first and last character of the string is '"'
	 */
	
	private static StringC stringTerm(StringExprContext ctx) {
		return new StringC(ctx.getText());
	}
	/**
	 * @param ctx
	 * @return Term representation of a boolean constant in MiniZinc
	 */
	private static BoolC BOOLTerm(TerminalNode b) {
		return new BoolC(b.getText().toLowerCase().equals("true"));			
	}
	/**
	 * @param ctx The grammar context
	 * @return Term representation of a  real number constant in MiniZinc
	 */
	private static FloatC realTerm(RealContext b) {
		double d = Double.parseDouble(b.getText());
		return new FloatC(d);
	}

	/**
	 * @param ctx The grammar context
	 * @return Term representation of a MiniZinc integer constant
	 */
	private static IntC integerTerm(IntegerContext b) {
		int d = Integer.parseInt(b.getText());
		return new IntC(d);
	}

	/**
	 * At the moment the error is just displayed
	 * Notice that these errors should only occur 
	 * if the grammar is changed but this code is not changed accordingly 
	 * @param error
	 */
	private static void error(String error) {
		String e = "Parser errror. Unexpected "+error;
		System.out.println(e);
	}
}
