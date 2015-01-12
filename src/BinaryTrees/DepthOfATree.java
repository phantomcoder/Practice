package BinaryTrees;


public class DepthOfATree {

	public static void main(String[] args) 
	{
	
		BinaryTree newTree = new BinaryTree();
		newTree.add(9);
		newTree.add(4);
		newTree.add(6);
		newTree.add(3);
		newTree.add(1);
		newTree.add(7);

		System.out.println(maxDepth(newTree.root));
		
	}
	
	public static int maxDepth(Node n)
	{
		
		if(n == null)
			return 0;

		return 1+Math.max(maxDepth(n.leftChild),maxDepth(n.rightChild));
	
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