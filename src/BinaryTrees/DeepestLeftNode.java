package BinaryTrees;


public class DeepestLeftNode {
	
	static Node deepestNode;

	/**
	 * @param args
	 */
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
		
		System.out.println(deepLeftNode(s.root).data);;

	}
	
	private static Node deepestLeftNode(Node root, int level,int maxLevel, boolean isLeft)
	{
		if(root == null)
			return null;
		if(isLeft&& root.leftChild == null && root.rightChild ==null&& level>maxLevel)
		{
			 deepestNode = root;
			 maxLevel = level;
		}
		
		if(root.leftChild != null)
			deepestLeftNode(root.leftChild, level+1, maxLevel, true);
		if(root.rightChild != null)
			deepestLeftNode(root.rightChild, level+1, maxLevel, false);
		
		return deepestNode;
		
	}
	
	public static Node deepLeftNode(Node root)
	{
	    int level = 0;
	    int maxLevel = 0;
	    return deepestLeftNode(root, level, maxLevel, false);
	}
	
	public static void inOrderTraversal(Node root)
	{
		if(root != null)
		{
			inOrderTraversal(root.leftChild);
			System.out.println(root.data);
			inOrderTraversal(root.rightChild);
		}
	}
	
	
	public static class BinaryTree
	{
		public Node root;
		
		public BinaryTree()
		{
			this.root = null;
		}
		
		public void addTreeNode(int value)
		{
			if(this.root == null)
			{
				this.root = new Node(value);
			}
			else
			{
				Node parentNode;
				Node focusNode = this.root;
				Node newNode = new Node(value);
				
				while(true)
				{
					parentNode = focusNode;
					
					if(value < focusNode.data)
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
	
	public static class Node
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
