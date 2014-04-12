package frontend;
import java.util.Scanner;
import java.util.ArrayList;
import intermediate.CodeTree;
import intermediate.SymbolTable;


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
	
	public Parser()
	{
		in = new Scanner(System.in);
		scanner = new SchemeScanner();
		openParens = 0;
		reference = new SchemeStuff();
		iCode = new CodeTree();
		table = new SymbolTable(); 
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
			else if (Character.isLetter(s.toCharArray()[0]) && !reference.schemeKeywords().contains(s)) //token is a word but not a keyword
			{
				table.add(s, null); //adds token to symbol table. attributes are null.s
			}
		}
	}
	
}
