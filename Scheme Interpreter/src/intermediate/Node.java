package intermediate;

public class Node 
{

	String value;
	Node leftChild;
	Node rightChild;
	Node parent;
	
	public Node(String s)
	{
		value = s;
		leftChild = null;
		rightChild = null;
		parent = null;
	}
	
	public boolean hasLeftChild()
	{
		return (leftChild != null);
	}
	
	public boolean hasRightChild()
	{
		return (rightChild != null);
	}
	
	public String getValue()
	{
		return value; 
	}
	
	public Node getParent()
	{
		return parent;
	}
	
	public Node getLeftChild()
	{
		return leftChild;
	}
	
	public Node getRightChild()
	{
		return rightChild;
	}
}
