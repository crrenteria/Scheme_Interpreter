import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import backend.TreeWalker;
import frontend.*;
import intermediate.*;
import java.util.ArrayList;

public class InterpreterTest 
{ 
	public static void main(String[] args) throws IOException
	{
		Parser parser = new Parser();
		SchemeScanner scanner = new SchemeScanner();
		TreeWalker walker = new TreeWalker();
		 
		/*BufferedReader in = null;
		BufferedReader out = null;
		
		try {
			in = new BufferedReader(new FileReader("input.lisp"));
			out = new BufferedReader(new FileReader("output.txt"));
			String line = null;

			while ((line = in.readLine()) != null) {
				parser.buildTokenList(line);
			}
		} 
		finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}*/
		
		//scanner scans
		//parser parses
		//intermediate stuff is built
		//backend navigates tree and hopefully prints the scheme it got in
		
		ArrayList<String> sample = new ArrayList<String>(); //tokens for a simple scheme program
		String schemeInput = "((a b) c (d))";
		parser.buildTokenList(schemeInput);
		/*sample.add("(");
		sample.add("define");
		sample.add("proc");
		sample.add("(");
		sample.add("lambda");
		sample.add("(");
		sample.add("a");
		sample.add("b");
		sample.add(")");
		sample.add("(");
		sample.add("let");
		sample.add("(");
		sample.add("(");
		sample.add("sum");
		sample.add("(");
		sample.add("+");
		sample.add("a");
		sample.add("(");
		sample.add("func");
		sample.add("b");
		sample.add(")");
		sample.add(")");
		sample.add(")");
		sample.add(")");
		sample.add("sum");
		sample.add(")");
		sample.add(")");
		sample.add(")");
		
		for (String s : sample)
		{
			System.out.print(s + " ");
		}
		
		System.out.println("\n\n\n");
		//System.out.println("\n"+sample.get(0)); 
		
		CodeTree sampleTree = new CodeTree();
		sampleTree.printTree(sample);
		*/
	}
}
