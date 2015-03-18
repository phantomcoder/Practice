package BinaryTrees;


public class BoundaryTraversalOfTree {

	public static void main(String[] args) 
	{
		BinaryTree newTree = new BinaryTree();
		newTree.addTreeNode(20);
		newTree.addTreeNode(22);
		newTree.addTreeNode(8);
		newTree.addTreeNode(4);
		newTree.addTreeNode(12);
		newTree.addTreeNode(10);
		newTree.addTreeNode(14);
		newTree.addTreeNode(25);
	
		boundaryTraversal(newTree.root);

	}
	
	private static void boundaryTraversal(Node root)
	{
		if(root != null)
		{
			System.out.println(root.data);
			printBoundaryLeft(root.leftChild);
			printLeafNodes(root.leftChild);
			printLeafNodes(root.rightChild);
			printBoundaryRight(root.rightChild);
		}
		
	}
	
	private static void printBoundaryLeft(Node n)
	{
		if(n != null)
		{
			if(n.leftChild != null)
			{
				System.out.println(n.data);
				printBoundaryLeft(n.leftChild);
			}
			else if (n.rightChild != null)
			{
				System.out.println(n.data);
				printBoundaryLeft(n.rightChild);
			}
		}
	}
	
	private static void printBoundaryRight(Node n)
	{
		if(n != null)
		{
			if(n.rightChild != null)
			{
				printBoundaryRight(n.rightChild);
				System.out.println(n.data);
			}
			else if (n.leftChild != null)
			{
				printBoundaryRight(n.leftChild);
				System.out.println(n.data);
			}
		}
		
	}
	
	private static void printLeafNodes(Node n)
	{
		if(n!= null)
		{
			printLeafNodes(n.leftChild);
			if(n.leftChild == null && n.rightChild == null)
				System.out.println(n.data);
			printLeafNodes(n.rightChild);
		}
		
	}
	
	static	class BinaryTree
	{
		Node root;
		
		public BinaryTree()
		{
			this.root = null;
		}
		
		public void addTreeNode(int val)
		{
			if(this.root == null)
				root = new Node(val);
			else
			{
				Node focusNode = root;
				Node parentNode = null;
				
				while(true)
				{
					parentNode = focusNode;
					if(val < focusNode.data)
					{
						focusNode = focusNode.leftChild;
						if(focusNode == null)
						{
							parentNode.leftChild = new Node(val);
							return;
						}
					}
					else
					{
						focusNode = focusNode.rightChild;
						if(focusNode == null)
						{
							parentNode.rightChild = new Node(val);
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
		int data;
		
		public Node(int data)
		{
			this.data = data;
		}
	}

}
