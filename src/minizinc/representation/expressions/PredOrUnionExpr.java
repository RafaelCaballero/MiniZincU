/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import minizinc.representation.TypeName;

/**
 * This class represents either a predicate call or a term of union type.
 * It is not possible to distinguish both at the syntactic level
 * Grammar:
 * predOrUnionExpr: ID ('('expr (','expr)*')')?;

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
		List<String> sargs = args.stream().map(x->x.print()).collect(Collectors.toList());
		return id.print()+"("+String.join(",", sargs)+")";
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

}
