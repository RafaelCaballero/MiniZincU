import program.ProgramU;
import program.TransformedProgram;


import examples.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;


import antlr4.*;

public class MiniZincU {

	/**
	 * @param args : name of the MiniZinc+ file to be transformed
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
        ProgramU pu = new ProgramU();
		loadFile(args,pu);
//		System.out.println(pu);
	     TransformedProgram tp = new TransformedProgram(pu);
	     System.out.println(tp);
		
       //ExampleStack p = new ExampleStack();
	//	ExampleTree p = new ExampleTree(); 
     //  TransformedProgram tp = new TransformedProgram(p);
      // tp.showVars();
       
       //System.out.println(tp);
       //System.out.println("Number of vars: "+tp.getVar().size());
     //  System.out.println(pu);
        
        
	}
	
	private static void loadFile(String [] args, ProgramU pu) throws Exception{
		
	        String inputFile = null; 
	        if ( args.length>0 ) inputFile = args[0];
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
	        MiniZincGrammarBaseListener extractor = new MiniZincGrammarBaseListener(); //(parser,pu);
	        walker.walk(extractor, tree);
	   //     System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
	    
	}

}
