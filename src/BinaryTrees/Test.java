package BinaryTrees;

public class Test {

	public static void main(String[] args)
	{
	
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		binaryTree.addTreeNode(5);
		binaryTree.addTreeNode(4);
		binaryTree.addTreeNode(6);
		binaryTree.addTreeNode(3);
		binaryTree.addTreeNode(1);
		
		
		binaryTree.inOrderTraversal(binaryTree.root);
		System.out.println("**********");
		binaryTree.preOrderTraversal(binaryTree.root);
		System.out.println("**********");
		binaryTree.postOrderTraversal(binaryTree.root);
	}

}
