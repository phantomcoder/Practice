package BinaryTrees;

import java.util.Stack;

public class LevelOrderInSpiral {

	public static void main(String[] args)
	{
		BinaryTree s = new BinaryTree();
		s.add(10);
		s.add(8);
		s.add(14);
		s.add(7);
		s.add(9);
		s.add(13);
		s.add(15);
		s.add(12);
		
		inOrderTraversal(s.root);
		System.out.println("*****");
		printLevelOrderInSpiral(s.root);
		
	}
	
	public static void inOrderTraversal(Node n)
	{
		if(n != null)
		{
			inOrderTraversal(n.leftChild);
			System.out.println(n.data);
			inOrderTraversal(n.rightChild);
		}
	}
	
	public static void printLevelOrderInSpiral(Node n)
	{
		if(n == null) return;
		
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.push(n);
		
		while(!s1.isEmpty() || !s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				Node tempNode = s1.pop();
				System.out.println(tempNode.data);
				if(tempNode.rightChild != null)
					s2.push(tempNode.rightChild);
				if(tempNode.leftChild != null)
					s2.push(tempNode.leftChild);
			}
			
			while(!s2.isEmpty())
			{
				Node temNode = s2.pop();
				System.out.println(temNode.data);
				if(temNode.leftChild != null)
					s1.push(temNode.leftChild);
				if(temNode.rightChild != null)
					s1.push(temNode.rightChild);
			}
			
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
