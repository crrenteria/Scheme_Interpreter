import backend.TreeWalker;
import frontend.*;
import intermediate.*;
import java.util.ArrayList;

public class InterpreterTest 
{ 
	public static void main(String[] args)
	{

		//Parser parser = new Parser();
		//SchemeScanner scanner = new SchemeScanner();
		//TreeWalker walker = new TreeWalker();
		 
		//scanner scans
		//parser parses
		//intermediate stuff is built
		//backend navigates tree and hopefully prints the scheme it got in
		
		ArrayList<String> sample = new ArrayList<String>(); //tokens for a simple scheme program
		sample.add("(");
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
	}
}
