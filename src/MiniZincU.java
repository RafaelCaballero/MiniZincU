import minizinc.antlr4.MiniZinc2JavaModel;
import minizinc.antlr4.MiniZincGrammarLexer;
import minizinc.antlr4.MiniZincGrammarParser;
import minizinc.representation.model.SplitModel;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import transformation.SimplifyModel;
import transformation.TransDataExprModel;
import transformation.TransDataModel;
import transformation.TransParamModel;
import transformation.TransRecursiveModel;
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
		if (pu != null)
			// System.out.println(pu);
			System.out.println(transformUnion(pu));

	}

	private static SplitModel transformUnion(SplitModel p) {
		
		// eliminate parameters in union variables
		TransParamModel tparam = new TransParamModel(p); 
		
		
		// eliminate expressions including data
		TransDataExprModel tdexp = new TransDataExprModel(tparam);

		// recursive calls and predicates including case statements deserve an
		// special initial treatment
		TransRecursiveModel trec = new TransRecursiveModel(tdexp);

		// eliminate again expressions including data
//		TransDataExprModel tdexp2 = new TransDataExprModel(trec);

		TransShowModel ts = new TransShowModel(trec);
		// System.out.println(ts.print());

		// Transform union variables
		TransVarModel tv = new TransVarModel(ts);

		// eliminate the data section
		TransDataModel td = new TransDataModel(tv);

		// simplify constraints
		SimplifyModel sm = new SimplifyModel(td);

		return sm;

	}

	private static SplitModel loadFile(String[] args) throws Exception {

		String inputFile = null;
		if (args.length > 0) {
			inputFile = args[0];
			// check if the file exists
			File f = new File(inputFile);

			if (!f.exists()) {
				System.out.println("File " + inputFile + " not found!");
				return null;
			}
		} else {
			System.out.println("Please specify a MiniZinc input file (.mzn)");
			return null;
		}
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
