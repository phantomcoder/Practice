/**
 * 
 */
package BinaryTrees;

/**
 * @author rthummal
 *
 */
public class SizeOfATree {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		BinaryTree newTree = new BinaryTree();
		newTree.add(9);
		newTree.add(4);
		newTree.add(6);
		newTree.add(3);
		newTree.add(1);
		newTree.add(7);
		newTree.add(-1);

		System.out.println(newTree.size(newTree.root));
	}

	
	private static class BinaryTree
	{
		public Node root;
		
		public BinaryTree()
		{
			root = null;
		}
		
		public void add(int value)
		{
			Node newNode = new Node(value);
			
			if(root == null)
				root = newNode;
			else 
			{
				Node focusNode = root;
				Node parent = null;
			
				while(true)
				{
					parent = focusNode;
					
					if(value < focusNode.data)
					{
						focusNode = focusNode.leftChild;
						if(focusNode == null)
						{
							parent.leftChild = newNode;
							return;
						}
					}
					else 
					{
						focusNode = focusNode.rightChild;
						if(focusNode == null)
						{
							parent.rightChild = newNode;
							return;
						}
					}
				}
			  	
			}			
		}
		
		public static int size(Node n)
		{
			int count = 0;
			
			/*
			while(n != null)
			{
				count = size(n.leftChild) + 1 + size(n.rightChild);
				return count;
			}
			*/
			if(n == null)
				return 0;
			else 
				return(size(n.leftChild)+1+size(n.rightChild));
		}
	}
	
	private static class Node
	{
		Node leftChild;
		int data;
		Node rightChild;
		
		public Node(int data)
		{
			this.data = data;
		}
	}
}
