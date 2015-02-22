package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {

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
          
          levelOrderLineByLine(tree.root);
      
	}
	
	
	private static void levelOrderLineByLine(Node rootNode)
	{
		Queue<Node> currentLevel =  new LinkedList<Node>();
		Queue<Node> nextLevel = new LinkedList<Node>();
		
		if(rootNode != null)
			currentLevel.add(rootNode);
		
		while(!currentLevel.isEmpty())
		{
			while(!currentLevel.isEmpty())
			{
			Node currentNode = currentLevel.poll();
			
			if(currentNode.leftChild != null)
				nextLevel.add(currentNode.leftChild);
			if(currentNode.rightChild != null)
				nextLevel.add(currentNode.rightChild);
			
			System.out.printf("%d",currentNode.data);
			}
			System.out.println();
			currentLevel = nextLevel;
            nextLevel = new LinkedList<Node>();
			
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
