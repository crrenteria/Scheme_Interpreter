package frontend;
import java.util.ArrayList;

public class SchemeStuff {
	
	ArrayList<String> keywords = new ArrayList<String>();
	char[] symbols = new char[13];
	
		
	/**
	 * Returns an array of recognized Scheme keywords
	 * @return Arraylist of Scheme keywords
	 */
	public ArrayList<String> getKeywords()
	{
		setUpKeywords();
		return keywords;
	}

	/**
	 * Returns an array of recognized Scheme special symbols
	 * @return An array of Scheme special symbols
	 */
	public char[] getSymbols()
	{
		setUpSymbols();
		return symbols;
	}
	
	/**
	 * Populates the Scheme keyword list
	 */
	private void setUpKeywords()
	{
		keywords.add("and");
		keywords.add("begin");
		keywords.add("bregin0");
		keywords.add("break-var");
		keywords.add("case");
		keywords.add("cond");
		keywords.add("cycle");
		keywords.add("define");
		keywords.add("delay");
		keywords.add("delay-list-cons");
		keywords.add("do");
		keywords.add("else");
		keywords.add("extend-syntax");
		keywords.add("for");
		keywords.add("freeze");
		keywords.add("if");
		keywords.add("lambda");
		keywords.add("let");
		keywords.add("letrec");
		keywords.add("let*");
		keywords.add("macro");
		keywords.add("object-maker");
		keywords.add("or");
		keywords.add("quote");
		keywords.add("repeat");
		keywords.add("safe-letrec");
		keywords.add("set!");
		keywords.add("stream-cons");
		keywords.add("variable-case");
		keywords.add("while");
		keywords.add("wrap");
	}
	
	/**
	 * Populates the Scheme special symbols array
	 */
	private void setUpSymbols()
	{

		symbols[0] = '(';
		symbols[1] = ')';
		symbols[2] = '[';
		symbols[3] = ']';
		symbols[4] = '{';
		symbols[5] = '}';
		symbols[6] = ';';
		symbols[7] = ',';
		symbols[8] = '.';
		symbols[9] = '"';
		symbols[10] = '\'';
		symbols[11] = '#';
		symbols[12] = '\\';
	}
	
}
