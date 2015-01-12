package BinaryTrees;

import javax.swing.RootPaneContainer;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class CheckIfTreeAreSame {

	// Checks to see if the given two trees are similar.
	public static void main(String[] args) 
	{
		BinaryTree newTree = new BinaryTree();
		newTree.add(9);
		newTree.add(4);
		newTree.add(6);
		newTree.add(10);
		newTree.add(1);
		newTree.add(7);

		BinaryTree newTree1 = new BinaryTree();
		newTree1.add(9);
		newTree1.add(4);
		newTree1.add(6);
		newTree1.add(10);
		newTree1.add(1);
		newTree1.add(7);

		System.out.println("Are the trees same?" + isSame(newTree.root, newTree1.root));
		
		

	}
	
	public static boolean isSame(Node t1, Node t2)
	{
		boolean result = false;
		if(t1 == null && t2 == null)
			return result = true;
		if(t1 !=null && t2 !=null)
		{
			return (t1.value == t2.value && isSame(t1.leftChild, t2.leftChild) && isSame(t2.rightChild, t2.rightChild));
		}
		return result = false;
	}

	 static class BinaryTree
	{
	    Node root;
	   
	   public BinaryTree()
	   {
		   root = null;
	   }
	   
	   public  void add(int value)
	   {
		   Node newNode = new Node(value);
		   if(root == null)
			   root = newNode;
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
			this.value = value;
		}
	}
}
