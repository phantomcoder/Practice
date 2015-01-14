package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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
		
		levelOrderTraversal(s.root);
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
	
	public static void levelOrderTraversal(Node n)
	{
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(n);
		
		while(!queue.isEmpty())
		{
			Node popNode = queue.poll();
			System.out.println(popNode.data);
			if(popNode.leftChild != null)
				queue.add(popNode.leftChild);
			if(popNode.rightChild != null)
				queue.add(popNode.rightChild);
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
