/**
 * 
 */
package examples;

import datatypes.*;
import program.ProgramU;
import terms.Show;
import terms.Var;

/**
 * @author sameson
 *
 */
public class ExampleTree extends ProgramU {
	public  ExampleTree() throws Exception {
		//////////// Data
		Tunion op  = new Tunion("Op");
		Tunion tree   = new Tunion("Tree");
		
		////////// Datadef
		DataDef opdef = new DataDef("Op");
		opdef.setDataName(op);
		DataDef treedef = new DataDef("Tree");
		treedef.setDataName(tree);
		
		getData().add(opdef);
		getData().add(treedef);
		
		// op
		opdef.addCons("sum");
		opdef.addCons("minus");
		opdef.addCons("prod");
		opdef.addCons("div");

		

		
		// tree
		
		// Leaf
		Tint leaf = new Tint();
		//Trange leaf = new Trange(2,3);
		Tcons cLeaf = new Tcons("leaf");
		cLeaf.add(leaf);
		treedef.addCons(cLeaf);
		
		Tcons cTree = new Tcons("node");
		cTree.add(op);
		cTree.add(tree);
		cTree.add(tree);
		treedef.addCons(cTree);
		
		// var 
		Var t = new Var( "t", tree , 2);
		getVar().add(t);
		getOutput().add(new Show(t));



	}


}
