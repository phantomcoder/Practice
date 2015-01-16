package BinaryTrees;

public class BinaryTreeChildSum {

	public static void main(String[] args)
	{
		BinaryTree s = new BinaryTree();
		s.add(10);
		s.add(8);
		s.add(2);

		
		System.out.println(isBinaryTreeSum(s.root));
	}
	
	public static boolean isBinaryTreeSum(Node node)
	{
		int leftData=0, rightData =0;
	
		if(((node == null) || ((node.leftChild == null) && (node.rightChild == null))))
		return true;
		else
		{
			if(node.leftChild != null)
				leftData = node.leftChild.value;
			if(node.rightChild != null)
				rightData = node.rightChild.value;
			
			if((node.value==(leftData+rightData))&&isBinaryTreeSum(node.leftChild)&&isBinaryTreeSum(node.rightChild))
				return true;
			
			else return false;
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
