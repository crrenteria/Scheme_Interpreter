package intermediate;
import java.util.ArrayList;
import backend.TreeWalker;

public class CodeTree 
{ 
	private Node head;
	private Node current;
	TreeWalker backend;
	
	public CodeTree()
	{
		backend = new TreeWalker();
	}
	
	public Node makeTree(ArrayList<String> tokens)
	{
		//do stuff;
		if (tokens.get(0).equals("(")) //input had better start with an open paren because, you know, scheme.
		{
			head = new Node(null);
			current = head;
			int i = 1;
			
			while (i < tokens.size())
			{
				String token = tokens.get(i); //for debugging
				if (tokens.get(i).equals("(")) //new sublist
				{
					current.leftChild = new Node(null); 
					current.leftChild.parent = current;
					current = current.leftChild; //move into sublist
					i++;
				}
				else if (tokens.get(i).equals(")")) //closing sublist
				{
					if (i != tokens.size()-1) //last element in the list
					{
						current = current.parent;
						while (!(current.rightChild == null)) //until you get to an unfinished part of the tree
						{
							current = current.parent; //move up the tree
						}
					
						current.rightChild = new Node(null); //create new node on right to continue parsing.
						current.rightChild.parent = current;
						current = current.rightChild;
					}
					i++;
				}
				else //next is a word / leaf
				{
					current.leftChild = new Node(tokens.get(i)); //left child of current node gets token value
					current.leftChild.parent = current; //link child to parent node
					if (!(tokens.get(i+1)).equals(")")) //if you're not at the last element in a list
							{ 
								current.rightChild = new Node(null); //create right child (cdr of list)
								current.rightChild.parent = current; //link child to parent
								current = current.rightChild; //start paying attention to cdr
							}
					i++; //go to next token
				}
			}
		return head;
		}
		
		else return null;
	}
	
	public void printTree(ArrayList<String> t)
	{
		Node n = makeTree(t);
		backend.walkTree(n);
	}
	


}
