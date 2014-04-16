package frontend;

	import java.util.ArrayList;

	public class SchemeScanner 
	{
		SchemeStuff attributes;
		
		public SchemeScanner()
		{
			attributes = new SchemeStuff();
			
		}

		/**
		 * Splits a given string into a series of Scheme tokens.
		 * @param s
		 * @return
		 */
		public ArrayList<String> findtokens(String s)
		{
			ArrayList<String> tokens = new ArrayList<String>(); 
			String token = ""; //Use this to construct the digit/word i.e. '123', 'proc'
			int i = 0; //tracks beginning of substring
			
			while ( i < s.length() ) //until we run out of string
			{
				String temp = s.substring(i, s.length() ); //temp = substring beginning immediately after last token
				
				if (temp.charAt(i) == '(' ) //opening a new list
				{
					tokens.add("("); //add "(" to list of tokens
					System.out.println("Token: ( \t Type: Special Symbol");
					i++;
				}
				else if (temp.charAt(i) == ')' ) //closing a list
				{
					tokens.add(")"); //add ")" to list of tokens
					System.out.println("Token: ( \t Type: Special Symbol");
					i++;
				}
				else if (Character.isDigit(temp.charAt(i)) ) //next token is a number
				{
					//find end of number. add number to token list 
					while(Character.isDigit(temp.charAt(i))) {
						if (temp.charAt(i) == '.')
							token += temp.charAt(i);
						token += temp.charAt(i);
						i++;
					}
					tokens.add(token);
					System.out.printf("Token: %s \t Type: Number\n", token);
					//reset the word for reuse
					token = ""; 
				}
				else if (Character.isLetter(temp.charAt(i))) //next token is a word
				{
					//find end of word. add word to token list
					//word must start with letter, and can contain digits, - or ?
					while (Character.isLetter(temp.charAt(i)) || temp.charAt(i) == '-'
							|| temp.charAt(i) == '?' || Character.isDigit(temp.charAt(i))) { //Loop through the word
						token += temp.charAt(i);
						i++;
					}
					if (attributes.getKeywords().contains(token)) { //check if word is a keyword
						tokens.add(token);
						System.out.printf("Token: %s \t Type: Keyword\n", token);
					}
					else { //Not a keyword
						tokens.add(token);
						System.out.printf("Token: %s \t Type: Symbol\n", token);
					}
					token = ""; //reset
				}
				//treat each comment and end-of-line character as blank
				else if (temp.charAt(i) == '\n') //new line
				{
					i++;
				}
				else if (temp.charAt(i) == ';') //comment
				{
					//skip the rest of this line. move i to point to first character after comment
					//we have to assume the comment is on its own line right?
					while (temp.charAt(i) != '\n') {
						i++;
					}
				}
				else if (temp.charAt(i) == ' ') //whitespace
				{
					i++; //move scanner forward by one space. don't do much else.
				}
			}
			return tokens;
		}
		

}
