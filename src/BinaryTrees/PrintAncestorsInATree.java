package BinaryTrees;

public class PrintAncestorsInATree {

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
		
		printAncestorsOfNode(newTree.root, 25);

	}
	
	private static boolean printAncestorsOfNode(Node rootNode, int target)
	{
		if(rootNode == null)
			return false;
		if(rootNode.value ==  target)
			return true;
		if(printAncestorsOfNode(rootNode.leftChild,target) || printAncestorsOfNode(rootNode.rightChild, target))
		{
			System.out.println(rootNode.value);
			return true;
		}
		return false;
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
