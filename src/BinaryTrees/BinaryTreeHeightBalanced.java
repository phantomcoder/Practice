package BinaryTrees;


public class BinaryTreeHeightBalanced {

	public static void main(String[] args)
	{
		BinaryTree newTree = new BinaryTree();
		newTree.add(35);
		newTree.add(12);
		newTree.add(45);
		newTree.add(6);
		newTree.add(20);
		newTree.add(5);
	    newTree.add(25);
		
		//postOrderTraversal(newTree.root);
		System.out.println(getMaximumHeight(newTree.root));
		System.out.println(getMinimumHeight(newTree.root));
		if(getMaximumHeight(newTree.root)-getMinimumHeight(newTree.root)>1)
			System.out.println("Not Balanced");
		else
			System.out.println("Balanced");
	}
	
	public static int getMaximumHeight(Node n)
	{
		if(n == null)
			return 0;
		else
		{
			return 1+Math.max(getMaximumHeight(n.leftChild), getMaximumHeight(n.rightChild));
		}
	}
	
	public static int getMinimumHeight(Node n)
	{
		if(n == null)
			return 0;
		else
		{
			return 1+Math.min(getMinimumHeight(n.leftChild), getMinimumHeight(n.rightChild));
		}
	}
	
	public static void postOrderTraversal(Node n)
	{
		if(n!=null)
		{
			postOrderTraversal(n.leftChild);
			postOrderTraversal(n.rightChild);
			System.out.println(n.data);
		}
	}
	
	static class BinaryTree
	{
		Node root;
		
		public BinaryTree()
		{
			this.root = null;
		}
		
		public void add(int data)
		{
			Node newNode = new Node(data);
			if(root == null)
				{this.root = newNode;}
			else
			{
				Node focusNode = root;
				Node parentNode = null;
				
				while(true)
				{
					parentNode = focusNode;
					
					if(data < focusNode.data)
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
		int data;
		
		public Node(int data)
		{
			this.data = data;
		}
	}

}
