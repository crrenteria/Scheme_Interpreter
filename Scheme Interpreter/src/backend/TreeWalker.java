package backend;
import intermediate.*;

public class TreeWalker {

	//does a preorder walk of the intermediate code tree 
	//prints the actual lists with proper parentheses
	
	//print contents of symbol table in alphabetical order
	
	public TreeWalker()
	{
		
		
	}
	
	public void walkTree(Node n)
	{
		//preorder walk.
		//sys.out.println stuff.
		
		System.out.print("(");
		
		walk(n);
		
	}
	
	public void walk(Node nd)
	{
		if ((nd == null) || isEmptyNode(nd)) //empty node created because the tree builder isn't exactly great
		{
			System.out.print(")");
			return;
		}
		else if (nd.getValue() != null)// or (!(nd.hasLeftChild()) && !(nd.hasRightChild())) ---> leaf node containing a value
		{
			System.out.print(nd.getValue() + " ");
			return;
		}
		else if (nd.getValue() == null && ( nd.hasLeftChild() ) && (nd.getLeftChild().hasLeftChild()))//(nd.getParent() == null) || (nd.getParent().getValue() == null))) //the current node is the beginning of a sublist
		{
			System.out.print("\n(");
			//if (nd.hasLeftChild()) //if there's a left child
			//{
				walk(nd.getLeftChild()); //traverse left subtree
			//}
			//if (nd.hasRightChild()) //if there's a right child
			//{
				walk(nd.getRightChild()); //traverse right subtree
		//	}
		}
		else //just a midpoint node
		{
			//if (nd.hasLeftChild()) //if there's a left child
			//{
				walk(nd.getLeftChild()); //traverse left subtree
			//}
			//if (nd.hasRightChild()) //if there's a right child
			//{
				walk(nd.getRightChild()); //traverse right subtree
				//System.out.print(")");
			//}/
		}
	}
	
	public void printTable(SymbolTable t)
	{
		t.printSorted();
	}
	
	private boolean isEmptyNode(Node n)
	{
		return ((n == null) || ( !(n.hasLeftChild()) && !(n.hasRightChild()) && (n.getValue() == null)));
	}
	
}
