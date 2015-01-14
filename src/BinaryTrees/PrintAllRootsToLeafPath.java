package BinaryTrees;

public class PrintAllRootsToLeafPath 
{
	public static void main(String[] args) 
	{
		BinaryTree newTree = new BinaryTree();
		newTree.addTreeNode(9);
		newTree.addTreeNode(4);
		newTree.addTreeNode(6);
		newTree.addTreeNode(3);
		newTree.addTreeNode(1);
		newTree.addTreeNode(7);
		newTree.addTreeNode(10);
		
		printAllPaths(newTree.root);
		
	}
	

	public static void printAllPaths(Node n)
	{
		int[] path = new int[1000];
		printPaths(n, path, 0);
	}
	
	
	
	public static void printPaths(Node n, int[] paths, int len)
	{
		if(n == null) return;
		
		paths[len] = n.value;
		len++;
		
		if((n.leftChild ==null) && n.rightChild ==null)
		{
			printArray(paths, len);
		}
		else
		{
			printPaths(n.leftChild, paths, len);
			printPaths(n.rightChild, paths, len);
		}
		
	}
	
	private static void printArray(int[] ints, int len) { 
		  int i; 
		  for (i=0; i<len; i++) { 
		   System.out.print(ints[i] + " "); 
		  } 
		  System.out.println(); 
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
