/**
 * 
 */
package transformation;

import java.util.List;

import minizinc.representation.DataDef.DataCons;
import minizinc.representation.expressions.IfS;
import minizinc.representation.expressions.IntC;
import minizinc.representation.expressions.StringC;
import minizinc.representation.expressions.lists.InfixListExpr;
import minizinc.representation.expressions.lists.ListExpr;
import minizinc.representation.expressions.lists.ListValue;
import minizinc.representation.expressions.lists.OneDimList;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.Output;
import minizinc.representation.types.Type;

/**
 * @author rafa
 *
 */
public class TransShowModel extends TransVarModel {



	/**
	 * @param sp
	 */
	public TransShowModel(SplitModel sp) {
		super(sp);
		transformShow();
	}
	
	private void transformShow() {
		for (int i=0; i<output.size(); i++) {
			
			Output o = output.get(i);
			ListExpr le = o.getListExprs();
			ListExpr lt = transformShowList(le);
			if (lt!=null) {
				Output ot = new Output(lt);
				output.add(i,ot);
				output.remove(i+1);
			}
		} // for
	}
	


}
