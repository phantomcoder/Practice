package BinaryTrees;

/*
 * 
 * 
 */
public class KthLargestNode {

	public static void main(String[] args)
	{
		
		BinaryTree tree = new BinaryTree();
		tree.addTreeNode(20);
		tree.addTreeNode(8);
		tree.addTreeNode(22);
		tree.addTreeNode(4);
		tree.addTreeNode(12);
		tree.addTreeNode(10);
		tree.addTreeNode(14);
		
		findkthLargest(tree.root, 3);

	}
	
	
	private static void findkthLargest(Node rootNode, int k)
	{
		findKthLargestUtil(rootNode, 0, k);
	}
	
	private static void findKthLargestUtil(Node rootN, int c, int k)
	{
	
		if(rootN == null || c>= k)
			return;
		
		findKthLargestUtil(rootN.rightChild,c, k);
		
		c++;
				
		if(c == k)
		{
			System.out.println(rootN.data);
			return;
		}
		
		findKthLargestUtil(rootN.leftChild, c, k);
			
		
		
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
			{	root = newNode;}
			else
			{
				Node focusNode = root;
				Node parentNode;
				
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
