
import minizinc.antlr4.MiniZinc2JavaModel;
import minizinc.antlr4.MiniZincGrammarLexer;
import minizinc.antlr4.MiniZincGrammarParser;
import minizinc.representation.model.SplitModel;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import transformation.TransDataExprModel;
import transformation.TransDataModel;
import transformation.TransShowModel;
import transformation.TransVarModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


public class MiniZincU {

	/**
	 * @param args
	 *            : name of the MiniZinc+ file to be transformed
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SplitModel pu = loadFile(args);
		//System.out.println(pu);

		// eliminate expressions including data 
		TransDataExprModel tdexp = new TransDataExprModel(pu); 

		
		TransShowModel ts = new TransShowModel(tdexp); 
		//System.out.println(ts.print());
		
		// Transform union variables
		TransVarModel tv = new TransVarModel(ts);


		// eliminate the data section
		TransDataModel td = new TransDataModel(tv);
		
		System.out.println(td.print());
		
		

		/**
		Model o1 = null;
		if (pu.containsExtensions()) {
			ExtTrans et  = new ExtTrans(pu);
			et.transform();
			o1 = et.getOutput();
		}
		else o1 = pu;
		**/
		

		/*
		while (pu.containsExtensions()) {
			ExtTrans et  = new ExtTrans(pu);
			et.transform();
		}
		*/
		// TransformedProgram tp = new TransformedProgram(pu);
		// System.out.println(tp);

		// ExampleStack p = new ExampleStack();
		// ExampleTree p = new ExampleTree();
		// TransformedProgram tp = new TransformedProgram(p);
		// tp.showVars();

		// System.out.println(tp);
		// System.out.println("Number of vars: "+tp.getVar().size());
		// System.out.println(pu);

	}

	private static SplitModel loadFile(String[] args) throws Exception {

		String inputFile = null;
		if (args.length > 0) {
			inputFile = args[0];
			// check if the file exists
			File f = new File(inputFile);

			if (!f.exists()) {
				System.out.println("File " + inputFile + " not found!");
			}
		} else
			throw new Exception("Please specify MiniZinc input file");
		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		// prepare the parser
		MiniZincGrammarLexer lexer = new MiniZincGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MiniZincGrammarParser parser = new MiniZincGrammarParser(tokens);
		ParseTree tree = parser.model(); // parse; start at model

		// prepare the listener
		ParseTreeWalker walker = new ParseTreeWalker();
		MiniZinc2JavaModel extractor = new MiniZinc2JavaModel(parser); // (parser,pu);
		walker.walk(extractor, tree);
		// System.out.println(tree.toStringTree(parser)); // print tree as text
		// <label id="code.tour.main.7"/>
		return extractor.getModel();

	}

}
