package examples;

import program.ProgramU;
import terms.Show;
import terms.Var;
import datatypes.*;

public class ExampleStack extends ProgramU {
	public  ExampleStack() throws Exception {
		
		//////////// Data
		Tunion item  = new Tunion("tItem");
		Tunion box   = new Tunion("tBox");
		Tunion stack = new Tunion("tStack");
		
		
		////////// Datadef
		DataDef itemdef = new DataDef("tItem");
		itemdef.setDataName(item);
		DataDef boxdef = new DataDef("tBox");
		boxdef.setDataName(box);
		DataDef stackdef = new DataDef("tStack");
		stackdef.setDataName(stack);
		
		getData().add(itemdef);
		getData().add(boxdef);
		getData().add(stackdef);
				
		// item
		itemdef.addCons("oranges");
		itemdef.addCons("eggs");
		itemdef.addCons("tomatoes");

		
		// box
		Trange pieces = new Trange(0,100);
		Trange size = new Trange(10,30);
		Tcons cbox = new Tcons("box");
		cbox.add(item);
		cbox.add(pieces);
		cbox.add(size);
		boxdef.addCons(cbox);

		
		// stack 
		stackdef.addCons("empty");
		Tcons cstack = new Tcons("stack");
		cstack.add(box);
		cstack.add(stack);
		stackdef.addCons(cstack);

		
		// var 
		Var v = new Var( "x", stack , 2);
		//Var y = new Var( "y", item, 0);
		getVar().add(v);
		getOutput().add(new Show(v));
		
//		System.out.println(Transform.transvar(v));
	
	}

}
