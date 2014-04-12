package frontend;

	import java.util.ArrayList;

	public class SchemeScanner 
	{
		
		public SchemeScanner()
		{
			//initialize some stuff
			
		}

		/**
		 * Splits a given string into a series of Scheme tokens.
		 * @param s
		 * @return
		 */
		public ArrayList<String> findtokens(String s)
		{
			ArrayList<String> tokens = new ArrayList<String>(); 
			
			int i = 0; //tracks beginning of substring
			
			while ( i < s.length() ) //until we run out of string
			{
				String temp = s.substring(i, s.length() ); //temp = substring beginning immediately after last token
				
				if (temp.charAt(0) == '(' ) //opening a new list
				{
					tokens.add("("); //add "(" to list of tokens
					System.out.println("Token: ( \t Type: Special Symbol");
					i++;
				}
				else if (temp.charAt(0) == ')' ) //closing a list
				{
					tokens.add(")"); //add ")" to list of tokens
					System.out.println("Token: ( \t Type: Special Symbol");
					i++;
				}
				else if (Character.isDigit(temp.charAt(0)) ) //next token is a number
				{
					//find end of number. add number to token list 
					//System.out.println("Token: THE NUMBER GOES HERE \t Type: Number");
				}
				else if (Character.isLetter(temp.charAt(0))) //next token is a word
				{
					//find end of word. add word to token list
					//if it's a keyword
						// System.out.println("Token: KEYWORD GOES HERE \t Type: Keyword");
					//if it's not
					// System.out.println("Token: WORD GOES HERE \t Type: Symbol");
				}
				else if (temp.charAt(0) == '\n') //new line
				{
					//print out line. move on to the next one (i++)
				}
				else if (temp.charAt(0) == ';' ) //comment
				{
					//skip the rest of this line. move i to point to first character after comment
				}
				else if (temp.charAt(0) == ' ' ) //whitespace
				{
					i++; //move scanner forward by one space. don't do much else.
				}
			}
			
			
			
			return tokens;
		}
		

}
