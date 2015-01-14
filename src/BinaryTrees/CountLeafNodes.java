package BinaryTrees;

import BinaryTrees.PrintAllRootsToLeafPath.Node;

public class CountLeafNodes {

	public static void main(String[] args) 
	{
	
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
