package BinaryTrees;


public class RootToLeafPathSumToGivenNumber {

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
		
		System.out.println(rootToLeafPathExists(newTree.root, 19));
		
	
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
	
	public static boolean rootToLeafPathExists(Node rootNode, int givenNumber)
	{
		if(rootNode == null)
			return (givenNumber == 0);
		
		else
		{
			boolean answer = false;
			int difference = givenNumber - rootNode.value;
			
			if(givenNumber ==0 && rootNode.leftChild == null && rootNode.rightChild == null)
				return true;
			
			if(rootNode.leftChild != null)
				answer = answer || rootToLeafPathExists(rootNode.leftChild, difference);
			if(rootNode.rightChild != null)
				answer = answer || rootToLeafPathExists(rootNode.rightChild, difference);
			
			return answer;
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
		
		public Node(Node leftChild, Node rightChild, int value)
		{
			this.leftChild = leftChild;
			this.rightChild = rightChild;
			this.value = value;
		}
		
		public Node(int value)
		{
			this.value = value;
		}
		
	}

}
