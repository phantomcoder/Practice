/**
 * 
 */
package LinkedList;

/**
 * @author RTs
 *
 */
public class LinkedListTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Node<Integer> n1 = new Node<Integer>(null, 3);
		Node<Integer> n2 = new Node<Integer>(n1, 4);
		Node<Integer> n3 = new Node<Integer>(n2, 5);
		Node<Integer> n4 = new Node<Integer>(n3, 6);
		Node<Integer> n5 = new Node<Integer>(n4, 7);
		Node<Integer> n6 = new Node<Integer>(n5, 8);
		Node<Integer> n7 = new Node<Integer>(n6, 9);
		
		System.out.println("The Linked List is :" + n7.toString());

	}
	

	private static class Node<E>
	{
		Node<E> nextNode;
		E data;
		Node<E> previousNode;
		
		public Node(Node nextNode, E data)
		{
			this.nextNode = nextNode;
			this.data = data;
		}
		
		public String toString()
	     {

	         String result = data + "->";
	         if (nextNode != null){
	             result += nextNode.toString();
	         }
	         return  result;
	     }

		
	}

}
