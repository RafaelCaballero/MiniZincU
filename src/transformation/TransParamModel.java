/**
 * 
 */
package transformation;

import java.util.List;

import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.ArithExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.IntC;
import minizinc.representation.expressions.Operand;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.Comment;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.decls.ParDecl;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeUnion;

/**
 * Transformer that parameters
 * 
 * @author rafa
 *
 */
public class TransParamModel extends SplitModel {

	/**
	 * complete constructor
	 */

	public TransParamModel(SplitModel sp) {
		super(sp.getComment(), sp.getData(), sp.getConstraint(), sp.getDecl(),
				sp.getExtended(), sp.getFunction(), sp.getInclude(), sp
						.getInit(), sp.getOutput(), sp.getPredicate(), sp
						.getSolve());
		transformParam();
	}

	private void transformParam() {
		List<Decl> ld  = this.getDecl();
		Substitution s = new Substitution();
		
		for (int i = 0; i < ld.size(); i++) {
			Decl x = ld.get(i);
			if (x instanceof VarDecl
					&& ((VarDecl) x).getDeclType() instanceof TypeUnion) {
				VarDecl v = (VarDecl) x;
				TypeUnion t = (TypeUnion) v.getDeclType();
				ArithExpr elevel = t.getE();
				// check if elevel is a parameter. In this case appears as an operand
				// complexexpressions are not included here
				if (elevel != null && elevel instanceof Operand) {
					Operand olevel = (Operand) elevel;
					Expr explevel = olevel.getExpr();
					if (explevel instanceof ID) {
						ID idlevel = (ID) explevel;
						ParDecl pd = (ParDecl) this.getParDeclByName(idlevel);
						if (pd!=null){
							Type paramType = pd.getDeclType();
							if (paramType.type() == TypeName.INT) {
								IntC nIntC = (IntC) pd.getExpr();
								v.setLevel(nIntC.get());
								s.put(idlevel.print(), nIntC);
							} else
								Parsing.error("Unexpected level in var. decl.: "+v.print());
								
							
						} else {
							Parsing.error("Unexpected level in var. decl.: "+v.print());
						}
						
					} else if (! (explevel instanceof IntC)) {
						Parsing.error("Only integer constants are allowed as valid union level ->"+v.print());
						return;					
					}	
					
					
				} else {
					Parsing.error("Only integer constants are allowed as valid union level ->"+v.print());
					return;					
				}
				
			}
		}
	
		
		// apply the substitution
		this.applyTransformer(s, function);
		this.applyTransformer(s, predicate);
		this.applyTransformer(s, constraint);
		this.applyTransformer(s, output);
		
	}

}
