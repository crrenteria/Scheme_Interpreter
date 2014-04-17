package frontend;
import java.util.Scanner;
import java.util.ArrayList;
import intermediate.CodeTree;
import intermediate.SymbolTable;
import backend.TreeWalker;

public class Parser 
{
	Scanner in; //scans input text
	String input; //the Scheme given as input
	SchemeScanner scanner; //the scanner part of the interpreter
	ArrayList<String> tokens; //the tokenized input
	int openParens; //counts how many lists are open
	SchemeStuff reference; //lists of Scheme keywords and special symbols
	CodeTree iCode; //binary tree for intermediate code
	SymbolTable table; //symbol table to hold symbols
	TreeWalker tw; 
	
	public Parser()
	{
		in = new Scanner(System.in);
		scanner = new SchemeScanner();
		openParens = 0;
		reference = new SchemeStuff();
		iCode = new CodeTree();
		table = new SymbolTable(); 
		tw = new TreeWalker(); 
	}
	
	public void buildTokenList()
	{
		//set 'input' to the string of input text 
		tokens = scanner.findtokens(input);
	}
	
	public void parse()
	{
		for(String s : tokens) //for each token in the list of tokens
		{
			if (s.toCharArray()[0] == '(') //if token is '(', a new list is opened. increase number of open lists
			{
				openParens++;
			}
			else if (s.toCharArray()[0] == ')') //if token is ')', a list was closed. decrement number of open lists.
			{
				openParens--;
			}
			else if (Character.isLetter(s.toCharArray()[0]) && 
					!reference.getKeywords().contains(s)) //token is a word but not a keyword
			{
				table.add(s, null); //adds token to symbol table. attributes are null.s
			}
			//if s is not a whitespace or a letter or a number then it must be a symbol
			else if (!Character.isWhitespace(s.toCharArray()[0]) &&
					!Character.isDigit(s.toCharArray()[0])) {
				//loop through the char[] of special symbols
				for (char c : reference.getSymbols()) {
					//if s is not a special symbol then add it to symbol table
					if (!s.equals(c)) {
						table.add(s,  null);
					}
				}
			}
		}
		
		if (openParens != 0) //uneven parens
		{
			//throw exception? I guess?
			return;
		}
		else //every opened paren was closed
		{
			tw.printTable(table);
			iCode.makeTree(tokens); //make parse tree. backend will automatically print
		}
	}
	
}
