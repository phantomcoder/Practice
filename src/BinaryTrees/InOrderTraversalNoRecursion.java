package BinaryTrees;

import java.util.Stack;


public class InOrderTraversalNoRecursion
{

	public static void main(String[] args) 
	{
	
		BinaryTree newTree = new BinaryTree();
		newTree.add(9);
		newTree.add(4);
		newTree.add(6);
		newTree.add(10);
		newTree.add(1);
		newTree.add(7);
		
		inOrderTraversal(newTree.root);
	}
	
	public static void inOrderTraversal(Node n)
	{
		if(n!=null)
		{
			inOrderTraversal(n.leftChild);
			System.out.println(n.value);
			inOrderTraversal(n.rightChild);
		}
	}
	
	public static void inOrderTraversalNoRecursion(Node n)
	{
		Stack<Node> s = new Stack<Node>();
		Node temp = n;
		while(true)
		{
					
		}
	}

	static class BinaryTree
	{
		Node root;
		
		public BinaryTree()
		{
			this.root = null;
		}
		
		public void add(int value)
		{
			Node n = new Node(value);
			
			if(root == null)
				root = n;
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
							parentNode.leftChild = n;
							return;
						}
					}
					else
					{
						focusNode = focusNode.rightChild;
						if(focusNode == null)
						{
							parentNode.rightChild = n;
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
			this.value = value;
		}
	}
}
