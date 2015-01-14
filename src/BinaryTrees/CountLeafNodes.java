package BinaryTrees;

public class CountLeafNodes {

	public static void main(String[] args) 
	{
		BinaryTree s = new BinaryTree();
		s.addTreeNode(10);
		s.addTreeNode(8);
		s.addTreeNode(14);
		s.addTreeNode(7);
		s.addTreeNode(9);
		s.addTreeNode(13);
		s.addTreeNode(15);
		s.addTreeNode(12);
	
		System.out.println(countLeafNodes(s.root));
	}
	
	public static int countLeafNodes(Node n)
	{
		if(n == null)
			return 0;
		
		if((n.leftChild == null) && (n.rightChild == null))
		    return 1;
		else

		{	return countLeafNodes(n.leftChild)+countLeafNodes(n.rightChild);}

	}

static class BinaryTree
	
	{
	   Node root;
	   
	   public BinaryTree()
	   {
		   this.root = null;
	   }
	   
	   public void addTreeNode(int value)
		{
			Node newNode = new Node(value);
			
			if(root == null)
			{
				this.root = newNode;
			}
			else
			{
				Node focusNode = root;
				Node parentNode;
				while(true)
				{
					parentNode = focusNode;
				if(value < focusNode.value)
				{
					focusNode = focusNode.leftChild;
					if(focusNode == null)
					{
						parentNode.leftChild = newNode;
					    return;
					}
				}
				else
				{
					focusNode = focusNode.rightChild;
					if(focusNode == null)
					{
						parentNode.rightChild = newNode;
					return;
					}
				}
				}
			}
		}
	}
	
	static class Node
	{
		Node leftChild;
		Node rightChild;
		int value;
		
		public Node(int value)
		{
			this.value =  value;
		}
	}

}
