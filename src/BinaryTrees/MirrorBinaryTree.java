package BinaryTrees;

public class MirrorBinaryTree {

	public static void main(String[] args) 
	{
		BinaryTree newTree = new BinaryTree();
		newTree.addTreeNode(9);
		newTree.addTreeNode(4);
		newTree.addTreeNode(6);
		newTree.addTreeNode(3);
		newTree.addTreeNode(1);
		newTree.addTreeNode(7);
		
		inOrderTraversal(newTree.root);
		
		mirror(newTree.root);
		
		inOrderTraversal(newTree.root);
		
	}
	
	public static void mirror(Node n)
	{
		if(n == null)
			return;
		
		else
		{
			mirror(n.leftChild);
			mirror(n.rightChild);
			
			Node  temp = n.leftChild;
			n.leftChild = n.rightChild;
			n.rightChild = temp;
		}
		
	}
	
	public static void inOrderTraversal(Node n)
	{
		if(n != null)
		{
			inOrderTraversal(n.leftChild);
			System.out.println(n.value);
			inOrderTraversal(n.rightChild);
		}
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
				if(value < root.value)
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
