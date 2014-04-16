package intermediate;

public class Node 
{

	String value;
	Node leftChild;
	Node rightChild;
	
	public Node(String s)
	{
		value = s;
		leftChild = null;
		rightChild = null;
	}
	
	public boolean hasLeftChild()
	{
		return (leftChild != null);
	}
	
	public boolean hasRightChild()
	{
		return (rightChild != null);
	}
}
