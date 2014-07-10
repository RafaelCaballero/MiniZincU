


import model.Model;
import model.TransformedProgram;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;






import antlr4.*;

public class MiniZincU {

	/**
	 * @param args : name of the MiniZinc+ file to be transformed
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
        Model pu = new Model();
		loadFile(args,pu);
		System.out.println(pu);
//	     TransformedProgram tp = new TransformedProgram(pu);
//	     System.out.println(tp);
		
       //ExampleStack p = new ExampleStack();
	//	ExampleTree p = new ExampleTree(); 
     //  TransformedProgram tp = new TransformedProgram(p);
      // tp.showVars();
       
       //System.out.println(tp);
       //System.out.println("Number of vars: "+tp.getVar().size());
     //  System.out.println(pu);
        
        
	}
	
	private static void loadFile(String [] args, Model pu) throws Exception{
		
	        String inputFile = null; 
	        if ( args.length>0 ) {
	        	inputFile = args[0];
	        	// check if the file exists
	        	File f = new File(inputFile);

	            if(!f.exists()){
	                System.out.println("File "+inputFile+" not found!");
	            }
	        }
	        else throw new Exception("Please specify MiniZinc input file");
	        InputStream is = System.in;
	        if ( inputFile!=null ) is = new FileInputStream(inputFile);
	        ANTLRInputStream input = new ANTLRInputStream(is);
	        // prepare the parser
	        MiniZincGrammarLexer lexer = new MiniZincGrammarLexer(input); 
	        CommonTokenStream tokens = new CommonTokenStream(lexer); 
	        MiniZincGrammarParser parser = new MiniZincGrammarParser(tokens);
	        ParseTree tree = parser.model(); // parse; start at prog <label id="code.tour.main.6"/>

	        // prepare the listener
	        ParseTreeWalker walker = new ParseTreeWalker();
	        MiniZinc2JavaModel extractor = new MiniZinc2JavaModel(parser,pu); //(parser,pu);
	        walker.walk(extractor, tree);
	   //     System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
	    
	}

}
