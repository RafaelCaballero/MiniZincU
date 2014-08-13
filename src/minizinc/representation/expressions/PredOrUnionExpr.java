/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import minizinc.antlr4.MiniZincGrammarParser.PredOrUnionExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

/**
 * This class represents either a predicate call or a term of union type.
 * It is not possible to distinguish both at the syntactic level
 * Grammar:
 * predOrUnionExpr: ID (twosections | onesection) ;
 * onesection :  ('('expr (','expr)*')')?;
 * twosections : '(' guard ')' '(' expr ')';
 *
 * @author rafa
 *
 */
public class PredOrUnionExpr extends Expr{
	protected ID id;
	protected List<Expr> args;
	/**
	 * declaration of local variables; used in two sections arguments
	 */
	protected List<InDecl> lindecl; 
	/**
	 * This is a one section predorunion, that is: <br>
	 * id(arg1...argn)
	 * @param id : name of the predicate
	 * @param args : a list with only one element, the expr
	 */
	public PredOrUnionExpr(ID id,  List<Expr> args) {
		this.id = id;
		this.args = args;
		lindecl = null;
	}

	/**
	 * Two sections preodorunion:<br>
	 * id(var in setexpr....)(expr)
	 * @param id : name of the predicate
	 * @param lindecl : local declarations
	 * @param args : a list with only one element, the expr
	 */
	public PredOrUnionExpr(ID id, List<InDecl> lindecl, List<Expr> args) {
		this.id = id;
		this.args = args;
		this.lindecl = lindecl;
	}

	@Override
	public String print() {
		String s = id.print();
		if (lindecl!=null) 
			// two section
			s+="("+printList(lindecl)+")";
		s+="("+printList(args)+")";

		return s;
	}

	@Override
	public List<Expr> subexpressions() {
		List<Expr> r = new ArrayList<Expr>();
		args.forEach(x->r.add(x));
		if (lindecl!=null) 
			lindecl.forEach(x -> x.subexpressions().forEach(y -> r.add(y)));
		
		return r;
	}

	@Override
	public TypeName type() {		
		return TypeName.PRED_OR_UNION;
	}
	
	/**
	 * @param ctx 
	 * @return The Java representation
	 */
	public static PredOrUnionExpr predOrUnionExpr(
			PredOrUnionExprContext ctx) {
		PredOrUnionExpr t = null;
		if (Parsing.hasTerminal(ctx.ID())) {
			// pred or constructor name
			ID id = ID.IDTerm(ctx.ID());
			if (Parsing.has(ctx.onesection())) {
				List<Expr> lexpr = ctx.onesection().expr().stream().map(x->Expr.expr(x)).collect(Collectors.toList());
				t = new PredOrUnionExpr(id,lexpr);
			} else if (Parsing.has(ctx.twosections())) {
				List<InDecl> lindecl = ctx.twosections().guard().inDecl().stream().
						               map(x->InDecl.inDecl(x)).
						               collect(Collectors.toList());
				Expr expr = expr(ctx.twosections().expr());
				List<Expr> l = new ArrayList<Expr>();
				l.add(expr);
				t =  new PredOrUnionExpr(id,lindecl,l);				
			}
		} else
			Parsing.error("PredOrUnionExpr " + ctx.getText());
		return t;
	}


}
