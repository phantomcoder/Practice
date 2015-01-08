package BinaryTrees;

public class DeleteBinaryTree {

	public static void main(String[] args) 
	{
		Node<Integer> root = new Node<Integer>(5);
		root.left = new Node<Integer>(3);
		root.right = new Node<Integer>(6);
		
		inOrderTraversal(root);
		delete(root);
		
		inOrderTraversal(root);
		

	}
	
		public static void delete(Node t)
		{
		  if(t == null)
			  return;
		  delete(t.left);
		  delete(t.right);
		  t.value = null;
		}
		
		public static void inOrderTraversal(Node t)
		{
		  if(t == null)
			 return;
		
		  inOrderTraversal(t.left);
		  System.out.println(t.value+ "  ");
		  inOrderTraversal(t.right);
		}
	
	public static class Node<E>
	{
		private Node<E> left;
		private Node<E> right;
		private E value;
		
		public Node(E value)
		{
			this.value = value;
		}
	}

}
