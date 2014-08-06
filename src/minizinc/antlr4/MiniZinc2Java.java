package minizinc.antlr4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import minizinc.antlr4.MiniZincGrammarParser.LetDeclContext;
import minizinc.antlr4.MiniZincGrammarParser.*;
import minizinc.expressions.*;
import minizinc.model.*;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import terms.*;

/**
 * @author rafa
 *
 */
public class MiniZinc2Java {

	/**
	 * Grammar piece: output :'output' '(' listExpr ')' | 'output' listExpr ;
	 */

	public static SOutput output(MiniZincGrammarParser.OutputContext ctx) {
		SOutput so = null;
		if (has(ctx.listExpr())) {
			ListExprContext lec = ctx.listExpr();
			Term t = listExpr(lec);
			so = new SOutput(t);
		} else
			error("output:  " + ctx.toString());

		return so;
	}

	/**
	 * Grammar piece: listExpr: listValue | listExpr '++' expr | oneDimList |
	 * multiDimList ;
	 */
	private static Term listExpr(ListExprContext lec) {
		Term t = null;
		// 4 possibilities according to the grammar
		if (has(lec.listValue())) {
			ListValueContext lvc = lec.listValue();
			t = listValue(lvc);
		} else if (has(lec.listExpr())) {
			t = listExpr(lec.listExpr());

		} else if (has(lec.oneDimList())) {
			t = oneDimList(lec.oneDimList());
		} else if (has(lec.multiDimList())) {
			t = multiDimList(lec.multiDimList());
		} else
			error("list:  " + lec.toString());
		return t;
	}

	/**
	 * Grammar:<br>
	 * oneDimList : simpleList | guardedList ;
	 * 
	 * @param oneDimList
	 *            the context
	 * @return Term representation of a one dimension list
	 * 
	 */
	private static Term oneDimList(OneDimListContext oneDimList) {
		Term t = null; // output value
		if (has(oneDimList.simpleList())) {
			t = simpleList(oneDimList.simpleList());

		} else if (has(oneDimList.guardedList())) {
			t = guardedList(oneDimList.guardedList());
		}
		return t;
	}

	/**
	 * Grammar: simpleList : '[' (expr (','expr)*)? (',')? ']';
	 * 
	 * @param simpleList
	 *            the context
	 * @return A term representation of a simple list
	 */
	private static Term simpleList(SimpleListContext simpleList) {
		Term t = null;
		return t;
	}

	/**
	 * listValue : stringExpr | ID | ifExpr | arrayaccess | showExpr | inDecl |
	 * functionExpr;
	 */
	private static Term listValue(ListValueContext lvc) {
		Term t = null;

		if (has(lvc.stringExpr())) {
			t = stringExpr(lvc.stringExpr());
		} else if (hasTerminal(lvc.ID())) {
			t = IDTerm(lvc.ID());
		} else if (has(lvc.ifExpr())) {
			t = ifExpr(lvc.ifExpr());
		} else if (has(lvc.arrayaccess())) {
			t = arrayaccess(lvc.arrayaccess());
		} else if (has(lvc.showExpr())) {
			t = showExpr(lvc.showExpr());
		} else if (has(lvc.inDecl())) {
			t = inDecl(lvc.inDecl());
		} else if (has(lvc.functionExpr())) {
			t = functionExpr(lvc.functionExpr());
		} else
			error("listValue:  " + lvc.toString());

		return t;
	}

	/**
	 * ifExpr : 'if' bodyIf ;
	 * 
	 * @param ctx
	 *            the expression context
	 * @return Term representing the if expression
	 */
	private static IfS ifExpr(IfExprContext ctx) {
		IfS t = null;
		if (has(ctx.bodyIf())) {
			t = bodyIf(ctx.bodyIf());
		} else
			error("ifExpr:  " + ctx.toString());
		return t;
	}

	/**
	 * bodyIf : expr 'then' expr (elseS | elseifS) ;
	 * 
	 * @param ctx
	 *            the expression context
	 * @return Term representing the if expression
	 */
	private static IfS bodyIf(BodyIfContext ctx) {
		IfS t = null;
		ExprContext e0 = ctx.expr(0);
		ExprContext e1 = ctx.expr(1);
		Expr t0 = expr(e0);
		Expr t1 = expr(e1);

		if (has(ctx.elseS())) {
			t = elseS(t0, t1, ctx.elseS());
		} else if (has(ctx.elseifS())) {
			t = elseifS(t0, t1, ctx.elseifS());
		} else
			error("bodyIf:  " + ctx.toString());
		return t;
	}

	/**
	 * elseS : 'else' expr 'endif';
	 * 
	 * @param t0
	 *            : if condition
	 * @param t1
	 *            : then expression
	 * @param ctx
	 *            : expression context
	 * @return Term representing the elseS expression
	 */
	private static IfS elseS(Expr t0, Expr t1, ElseSContext ctx) {
		IfS t = null;
		if (has(ctx.expr())) {
			Expr t2 = expr(ctx.expr());
			t = new IfS(t0, t1, t2);
		} else
			error("elseS " + ctx.toString());
		return t;
	}

	/**
	 * elseifS : 'elseif' bodyIf;
	 * 
	 * @param t0
	 *            if condition
	 * @param t1
	 *            then expression
	 * @param ctx
	 *            expression context
	 * @return Term representing the elseifS expression
	 */
	private static IfS elseifS(Expr t0, Expr t1, ElseifSContext ctx) {
		IfS t = null;
		if (has(ctx.bodyIf())) {
			Expr t2 = bodyIf(ctx.bodyIf());
			t = new IfS(t0, t1, t2);
		} else
			error("elseifS " + ctx.toString());
		return t;
	}

	/******************************************************/

	/**
	 * Grammar for expressions:
	 * <p>
	 * expr:
	 * </p>
	 * rbracketExpr<br>
	 * | boolComplexExpr<br>
	 * | arithComplexExpr<br>
	 * | setExpr <br>
	 * | listExpr<br>
	 * | expr infixOp expr<br>
	 * | ifExpr <br>
	 * | letExpr <br>
	 * | guardExpr<br>
	 * | predOrUnionExpr<br>
	 * | stringExpr<br>
	 * | caseExpr <br>
	 * | BOOL<br>
	 * | real<br>
	 * | integer<br>
	 * | ID<br>
	 * | '_'<br>
	 * 
	 * @param ctx
	 *            expression context
	 * @return Term representing the expression
	 */
	private static Expr expr(ExprContext ctx) {
		Expr t = null;
		if (has(ctx.rbracketExpr())) {
			t = rbracketExpr(ctx.rbracketExpr());
		} else if (has(ctx.boolComplexExpr())) {
			t = boolComplexExpr(ctx.boolComplexExpr());
		} else if (has(ctx.arithComplexExpr())) {
			t = arithComplexExpr(ctx.arithComplexExpr());
		} else if (has(ctx.setExpr())) {
			t = setExpr(ctx.setExpr());
		} else if (has(ctx.listExpr())) {
			t = listExpr(ctx.listExpr());
		} else if (has(ctx.infixOp())) {
			ExprContext e0 = ctx.expr(0);
			ExprContext e1 = ctx.expr(1);
			Expr t0 = expr(e0);
			Expr t1 = expr(e1);
			t = infixExpr(t0, t1, ctx.infixOp());
		} else if (has(ctx.ifExpr())) {
			t = ifExpr(ctx.ifExpr());
		} else if (has(ctx.letExpr())) {
			t = letExpr(ctx.letExpr());
		} else if (has(ctx.guardExpr())) {
			t = guardExpr(ctx.guardExpr());
		} else if (has(ctx.predOrUnionExpr())) {
			t = predOrUnionExpr(ctx.predOrUnionExpr());
		} else if (has(ctx.stringExpr())) {
			t = stringExpr(ctx.stringExpr());
		} else if (has(ctx.caseExpr())) {
			t = caseExpr(ctx.caseExpr());
		} else if (hasTerminal(ctx.BOOL())) {
			t = BOOLTerm(ctx.BOOL());
		} else if (has(ctx.real())) {
			t = realTerm(ctx.real());
		} else if (has(ctx.integer())) {
			t = integerTerm(ctx.integer());
		} else if (hasTerminal(ctx.ID())) {
			t = IDTerm(ctx.ID());
		} else if (ctx.toString().equals("_")) {
			t = IDTerm("_");
		} else
			error("expr:  " + ctx.toString());
		return t;
	}

	/**
	 * Grammar:<br>
	 * arithComplexExpr : minusExpr | arithExpr arithOp2 arithExpr
	 *
	 * @param ctx
	 *            grammar context
	 * @return Term representation
	 */
	private static Term arithComplexExpr(ArithComplexExprContext ctx) {
		Term t = null;
		if (has(ctx.minusExpr())) {
			t = minusExpr(ctx.minusExpr());
		} else if (has(ctx.arithOp2())) {
			ArithExprContext a0 = ctx.arithExpr(0);
			ArithExprContext a1 = ctx.arithExpr(1);
			if (a0 == null || a1 == null)
				error("arithComplexExpr (null operand):  " + ctx.toString());
			else {
				Term t0 = arithExpr(a0);
				Term t1 = arithExpr(a1);
				String op = ctx.arithOp2().getText();
				t = infixArithOp(t0, t1, op);
			}
		} else
			error("arithComplexExpr:  " + ctx.toString());
		return t;
	}

	/**
	 * <p>
	 * Grammar:
	 * </p>
	 * boolComplexExpr:<br>
	 * boolExpr (boolOp|qualBoolOp) boolExpr<br>
	 * | arithExpr (arithOp|qualArithOp) arithExpr<br>
	 * | notExpr <br>
	 * ;<br>
	 *
	 * @param ctx
	 *            grammar context
	 * @return BoolComplexExpr representation
	 */
	private static BoolComplexExpr boolComplexExpr(BoolComplexExprContext ctx) {
		BoolComplexExpr t = null;
		if (has(ctx.notExpr())) {
			t = notComplexBoolExpr(ctx.notExpr());
		} else if (ctx.boolExpr().size() == 2) {
			BoolExprContext b0 = ctx.boolExpr(0);
			BoolExprContext b1 = ctx.boolExpr(1);
			BoolExpr t0 = boolExpr(b0);
			BoolExpr t1 = boolExpr(b1);
			String op = "";
			if (has(ctx.boolOp())) {
				op = ctx.boolOp().getText();
				t = infixComplexBoolExpr(t0, t1, op);
			} else if (has(ctx.qualBoolOp())) {
				op = ctx.qualBoolOp().getText();
				t = infixComplexBoolExpr(t0, t1, op);
			} else
				error("boolComplexExpr - unexpected operator " + ctx.toString());

		} else if (ctx.arithExpr().size() == 2) {
			ArithExprContext a0 = ctx.arithExpr(0);
			ArithExprContext a1 = ctx.arithExpr(1);
			Expr t0 = arithExpr(a0);
			Expr t1 = arithExpr(a1);
			String op = "";
			if (has(ctx.arithOp())) {
				op = ctx.arithOp().getText();
				t = infixArithComplexBoolExpr(t0, t1, op);
			} else if (has(ctx.qualArithOp())) {
				op = ctx.qualArithOp().getText();
				t = infixArithComplexBoolExpr(t0, t1, op);
			} else
				error("boolComplexExpr - unexpected operator " + ctx.toString());

		} else
			error("boolComplexExpr " + ctx.toString());
		return t;
	}

	/**
	 * <p>
	 * Grammar
	 * </p>
	 * boolExpr : boolExpr (boolOp|qualBoolOp) boolExpr<br>
	 * | arithExpr (arithOp|qualArithOp) expr<br>
	 * | notExpr <br>
	 * | boolVal<br>
	 * ;
	 * 
	 * @param ctx
	 *            the grammar context
	 * @return Term representation
	 */
	private static BoolExpr boolExpr(BoolExprContext ctx) {
		BoolExpr t = null;
		if (ctx.boolExpr().size() == 2) {
			BoolExprContext b0 = ctx.boolExpr(0);
			BoolExprContext b1 = ctx.boolExpr(1);
			BoolExpr t0 = boolExpr(b0);
			BoolExpr t1 = boolExpr(b1);
			String op = "";
			if (has(ctx.boolOp())) {
				op = ctx.boolOp().getText();
				t = infixBoolExpr(t0, t1, op);
			} else if (has(ctx.qualBoolOp())) {
				op = ctx.qualBoolOp().getText();
				t = infixBoolExpr(t0, t1, op);
			} else
				error("BoolExprContext - unexpected operator " + ctx.toString());

		} else if (has(ctx.arithExpr())) {
			ArithExprContext a0 = ctx.arithExpr();
			ExprContext a1 = ctx.expr();
			ArithExpr t0 = arithExpr(a0);
			Expr t1 = expr(a1);
			String op = "";
			if (has(ctx.arithOp())) {
				op = ctx.arithOp().getText();
				t = infixArithBoolExpr(t0, t1, op);
			} else if (has(ctx.qualArithOp())) {
				op = ctx.qualArithOp().getText();
				t = infixArithBoolExpr(t0, t1, op);
			} else
				error("boolExpr - unexpected operator " + ctx.toString());

		} else if (has(ctx.notExpr())) {
			t = notExpr(ctx.notExpr());

		} else if (has(ctx.boolVal())) {
			t = boolVal(ctx.boolVal());
		} else
			error("boolExpr " + ctx.toString());

		return t;
	}

	/**
	 * Grammar:<br>
	 * boolVal : | '(' boolExpr ')' | ID | BOOL | arrayaccess | ifExpr | letExpr
	 * | predOrUnionExpr | guardExpr ;
	 *
	 * @param ctx
	 *            Grammar context
	 * @return BoolVal representation
	 */
	private static BoolVal boolVal(BoolValContext ctx) {
		BoolVal t = null;
		if (has(ctx.boolExpr())) {
			RbracketExpr r = rbracketBoolExpr(ctx.boolExpr()); 
			t = new BoolVal(r);
		} else if (hasTerminal(ctx.ID())) {
			ID id = IDTerm(ctx.ID());
			t = new BoolVal(id);
		} else if (hasTerminal(ctx.BOOL())) {
			BoolC bc = BOOLTerm(ctx.BOOL());
			t = new BoolVal(bc);
		} else if (has(ctx.arrayaccess())) {
			t = new BoolVal(arrayaccess(ctx.arrayaccess()));
		} else if (has(ctx.ifExpr())) {
			IfS  i = ifExpr(ctx.ifExpr());
			t = new BoolVal(i);
		} else if (has(ctx.letExpr())) {
			t = new BoolVal(letExpr(ctx.letExpr()));
		} else if (has(ctx.predOrUnionExpr())) {
			t = predOrUnionExpr(ctx.predOrUnionExpr());
		} else if (has(ctx.guardExpr())) {
			t = guardExpr(ctx.guardExpr());
		} else
			error("boolVal " + ctx.getText());
		return t;
	}

	/**
	 * Constructing a let expression. Grammar:<br>
	 * letExpr : 'let' '{' letDecl   (',' letDecl)* '}' 'in' expr;
	 * @param ctx the context
	 * @return the representation as a LetExpr
	 */
	private static LetExpr letExpr(LetExprContext ctx) {
		LetExpr t = null;
		if (has(ctx.expr())) {
			Expr e = expr(ctx.expr());
			List<LetDecl> ldecl = ctx.letDecl().stream().map(x -> letDecl(x)).collect(Collectors.toList());
			t = new LetExpr(ldecl,e);
			
		} else {
			error("letExpr. No expression found " + ctx.getText());
		}
		return t;
	}

	private static LetDecl letDecl(LetDeclContext x) {
		LetDecl t = null;
		return t;
	}

	/**
	 * Array access. Grammar: <br>
	 * Arrayaccess : ID '[' expr(','expr)* ']' | '[' (expr(','expr)*)? ']' '[' expr(','expr)* ']';
	 * @param ctx the context
	 * @return Java representation of the array access
	 */
	private static ArrayAccess arrayaccess(ArrayaccessContext ctx) {
		ArrayAccess t=null;
		if (hasTerminal(ctx.ID()) && ctx.simpleNonEmptyList().size()==1) {
			ID id = IDTerm(ctx.ID());
			t = idarrayaccess(id,ctx.simpleNonEmptyList(0));
 
		} else if (ctx.simpleNonEmptyList().size()==2) {
			t = arrayarrayaccess(ctx.simpleNonEmptyList(0), ctx.simpleNonEmptyList(1));
		} error("arrayaccess " + ctx.getText());
		
		return t;
	}

	/**
	 * Array access of the form [a1...an][e1...em]
	 * @param ctx1 The array [a1...an]
	 * @param ctx2 The list of indexes [e1...em]
	 * @return The Java representation
	 */
	private static ArrayArrayAccess arrayarrayaccess(
			SimpleNonEmptyListContext ctx1,
			SimpleNonEmptyListContext ctx2) {
		ArrayArrayAccess t = null;
		int n = ctx2.expr().size();
		if (n!=0) {
			List<Expr> array = getSingleList(ctx1.expr());
			List<Expr> indexes = getSingleList(ctx2.expr());
			t = new ArrayArrayAccess(array, indexes);
		} else error("ArrayArrayAccess with 0 indexes " + ctx1.getText() + " | "+ctx2.getText()); 

		return t;
	}

	/**
	 * @param expr A list of Minizinc-antlr4 expression contexts
	 * @return A list of Java representations of the expressions
	 */
	private static List<Expr> getSingleList(List<ExprContext> expr) {
		List<Expr> t = new ArrayList<Expr>();
		t = expr.stream().map(x -> expr(x)).collect(Collectors.toList());
		return t;
	}

	/**
	 * Array access of the form id[e1...en]
	 * @param id The identifier, already in Java format
	 * @param ctx list of indexes
	 * @return The Java representation
	 */
	private static IdArrayAccess idarrayaccess(ID id,
			SimpleNonEmptyListContext ctx) {
		IdArrayAccess t = null;
		int n = ctx.expr().size();
		if (n!=0) {
			List<Expr> indexes = getSingleList(ctx.expr());
			t = new IdArrayAccess(id, indexes);
		} else error("IdArrayAccess (Id: "+id+") with 0 indexes " + ctx.getText()); 
		return t;
	}

	/**
	 * Grammar: <br>
	 * notExpr : 'not' expr ;
	 * 
	 * @param ctx
	 *            Grammar context
	 * @return NotBoolExpr representation
	 */
	private static NotBoolExpr notExpr(NotExprContext ctx) {
		NotBoolExpr t = null;
		ExprContext e0 = ctx.expr();
		if (e0 != null) {
			t = new NotBoolExpr(expr(e0));
		} else
			error("notExpr " + ctx.toString());

		return t;
	}

	/**
	 * Grammar: <br>
	 * notExpr : 'not' expr ;
	 * 
	 * @param ctx
	 *            Grammar context
	 * @return NotComplexBoolExpr representation
	 */
	private static NotComplexBoolExpr notComplexBoolExpr(NotExprContext ctx) {
		NotComplexBoolExpr t = null;
		ExprContext e0 = ctx.expr();
		if (e0 != null) {
			t = new NotComplexBoolExpr(expr(e0));
		} else
			error("NotComplexBoolExpr " + ctx.toString());

		return t;
	}

	/**
	 * Arithmetic infix expression as a complex bool expression
	 * 
	 * @param t0
	 *            First operand
	 * @param t1
	 *            Second operand
	 * @param op
	 *            Operator
	 * @return InfixArithComplexBoolExpr representation
	 */

	private static InfixArithComplexBoolExpr infixArithComplexBoolExpr(Expr t0, Expr t1, String op) {
		return new InfixArithComplexBoolExpr(op, t0, t1);
	}

	/**
	 * Arithmetic infix expression as a  bool expression
	 * 
	 * @param t0
	 *            First operand
	 * @param t1
	 *            Second operand
	 * @param op
	 *            Operator
	 * @return InfixArithComplexBoolExpr representation
	 */

	private static InfixArithBoolExpr infixArithBoolExpr(Expr t0, Expr t1, String op) {
		return new InfixArithBoolExpr(op, t0, t1);
	}

	/**
	 * Obtain the representation of a MiniZinc arithmetic expression.<br>
	 * Grammar:<br>
	 * arithExpr : minusExpr<br>
	 * | arithExpr arithOp2 arithExpr | operand<br>
	 * ;<br>
	 *
	 * @param ctx
	 *            the grammar context
	 * @return Term representation
	 */
	private static Term arithExpr(ArithExprContext ctx) {
		Term t = null;
		if (has(ctx.minusExpr())) {
			t = minusExpr(ctx.minusExpr());
		} else if (has(ctx.operand())) {
			t = operand(ctx.operand());
		} else if (ctx.arithExpr().size() == 2) {
			ArithExprContext a0 = ctx.arithExpr(0);
			ArithExprContext a1 = ctx.arithExpr(1);
			Term t0 = arithExpr(a0);
			Term t1 = arithExpr(a1);
			if (has(ctx.arithOp2())) {
				String op = ctx.arithOp2().getText();
				t = infixArithOp(t0, t1, op);
			} else
				error("arithExpr, arithOp2 " + ctx.toString());

		} else
			error("arithExpr " + ctx.toString());
		return t;
	}

	/**
	 * minusExpr : '-' arithExpr ;
	 * 
	 * @param ctx
	 *            Grammar context
	 * @return Term representing the expression
	 */
	private static Term minusExpr(MinusExprContext ctx) {
		Term t = null;
		if (has(ctx.arithExpr())) {
			ArithExprContext a = ctx.arithExpr();
			Term t0 = arithExpr(a);
			t = new UnaryExp("-", t0);
		} else
			error("minusExpr " + ctx.toString());
		return t;
	}

	/**
	 * Complex Boolean infix expression
	 * 
	 * @param t0
	 *            First operand
	 * @param t1
	 *            Second operand
	 * @param op
	 *            Operator
	 * @return InfixComplexBoolExpr representation
	 */
	private static InfixComplexBoolExpr infixComplexBoolExpr(BoolExpr  t0, BoolExpr t1, String op) {
		return new InfixComplexBoolExpr(op, t0, t1);
	}

	/**
	 * Boolean infix expression
	 * 
	 * @param t0
	 *            First operand
	 * @param t1
	 *            Second operand
	 * @param op
	 *            Operator
	 * @return Term representation
	 */
	private static InfixBoolExpr infixBoolExpr(BoolExpr  t0, BoolExpr t1, String op) {
		return new InfixBoolExpr(op, t0, t1);
	}

	/**
	 * Expression between round brackets rbracketBoolExpr : '(' boolExpr ')';
	 * 
	 * @param ctx
	 *            grammar context
	 * @return Representation of expr as a round bracket expression
	 */
	private static RbracketExpr rbracketBoolExpr(BoolExprContext ctx) {
		RbracketExpr t = null;
		t = new RbracketExpr(boolExpr(ctx));
		return t;
	}

	/**
	 * Expression between round brackets rbracketExpr : '(' expr ')';
	 * 
	 * @param ctx
	 *            grammar context
	 * @return Representation of expr as a round bracket expression
	 */
	private static RbracketExpr rbracketExpr(RbracketExprContext ctx) {
		RbracketExpr t = null;
		if (has(ctx.expr())) {
			ExprContext e = ctx.expr();
			t = new RbracketExpr(expr(e));
		} else
			error("rbracketExpr " + ctx.getText());
		return t;
	}

	/******************************************************/

	private static Term stringExpr(StringExprContext ctx) {
		Term t = null;
		if (has(ctx.string())) {
			t = stringTerm(ctx);
		} else
			error("string:  " + ctx.toString());
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
	 * @param ctx
	 *            the grammar context
	 * @return a string constant containing the string. The first and last
	 *         character of the string is '"'
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
	 * @param ctx
	 *            The grammar context
	 * @return Term representation of a real number constant in MiniZinc
	 */
	private static FloatC realTerm(RealContext b) {
		double d = Double.parseDouble(b.getText());
		return new FloatC(d);
	}

	/**
	 * @param ctx
	 *            The grammar context
	 * @return Term representation of a MiniZinc integer constant
	 */
	private static IntC integerTerm(IntegerContext b) {
		int d = Integer.parseInt(b.getText());
		return new IntC(d);
	}

	/**
	 * At the moment the error is just displayed Notice that these errors should
	 * only occur if the grammar is changed but this code is not changed
	 * accordingly
	 * 
	 * @param error
	 */
	private static void error(String error) {
		String e = "Parser errror. Unexpected " + error;
		System.out.println(e);
	}
}
