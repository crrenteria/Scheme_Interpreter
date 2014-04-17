import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import backend.TreeWalker;
import frontend.*;
import intermediate.*;

public class InterpreterTest 
{ 
	public static void main(String[] args) throws IOException
	{

		Parser parser = new Parser();
		SchemeScanner scanner = new SchemeScanner();
		TreeWalker walker = new TreeWalker();
		 
		BufferedReader in = null;
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
		}
		
		//scanner scans
		//parser parses
		//intermediate stuff is built
		//backend navigates tree and hopefully prints the scheme it got in
	}
}
