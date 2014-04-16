package intermediate;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * SymbolTable can not contain the following:
 * Special Symbols, Numbers, Keywords, Characters, or Booleans
 *
 */
public class SymbolTable {

	//wtf too many TreeMaps. It's a TreeMap with TreeMaps inside. 
	//It maps a string (key) to a TreeMap (a map of attributes)
	TreeMap<String, TreeMap<String, String>> table;
	
	/**
	 * Creates a new SymbolTable with no values
	 */
	public SymbolTable()
	{
		table = new TreeMap<String, TreeMap<String, String>>();
	}
	
	/**
	 * Adds a symbol and its attributes to the symbol table
	 * @param name The name of the symbol being added
	 * @param attributes The attributes of the symbol being added
	 */
	public void add(String name, TreeMap<String, String> attributes)
	{
		table.put(name, attributes);
	}
	
	/**
	 * Empties out the table. This should be called between top-level lists
	 */
	public void clearTable()
	{
		table.clear();
	}
	
	/**
	 * Prints a the symbol table in alphabetical order of symbols
	 */
	public void printSorted()
	{
		//sort table -- keys in alphabetical order
		//system.out.println the list
		
		TreeSet<String> sortedKeys = new TreeSet<String>(table.keySet());
		for (String key : sortedKeys)
		{
			System.out.println(key);
		}
	}
	
}
