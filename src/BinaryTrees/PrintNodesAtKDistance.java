package BinaryTrees;

import BinaryTrees.LevelOrderTraversalLineByLine.Node;

public class PrintNodesAtKDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		BinaryTree tree = new BinaryTree();
        tree.addTreeNode(7);
        tree.addTreeNode(10);
        tree.addTreeNode(4);
        tree.addTreeNode(8);
        tree.addTreeNode(12);
        tree.addTreeNode(3);
        tree.addTreeNode(5);
        
        printNodesAtDistance(tree.root, 2);

	}
	
	public static void printNodesAtDistance(Node root, int distance)
	{
		if(root == null)
			return;
		if(distance == 0)
		{
			System.out.println(root.data);
			return;
		}
		else
		{
			printNodesAtDistance(root.leftChild, distance-1);
			printNodesAtDistance(root.rightChild, distance-1);
		}
		
	}
	
	public static class  BinaryTree
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
				Node parentNode, focusNode;
				focusNode = root;
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
