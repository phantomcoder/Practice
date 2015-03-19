package BinaryTrees;

public class LowestCommonAncestorInTree {

	public static void main(String[] args) 
	{
		BinaryTree newTree = new BinaryTree();
		newTree.addTreeNode(20);
		newTree.addTreeNode(8);
		newTree.addTreeNode(22);
		newTree.addTreeNode(4);
		newTree.addTreeNode(12);
		newTree.addTreeNode(10);
		newTree.addTreeNode(14);

		System.out.println(findLowestCommonAncestor(newTree.root, 10, 14).data);
	}
	
	private static Node findLowestCommonAncestor(Node root, int value1, int value2)
	{
		if(root == null)
			return null;
		if((value1 < root.data) && (value2 < root.data))
		{
			return findLowestCommonAncestor(root.leftChild, value1, value2);
		}
		if((value1 > root.data) && (value2 > root.data))
			return findLowestCommonAncestor(root.rightChild, value1, value2);
		
		return root;
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
					if(value <  focusNode.data)
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
