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

		Node<Integer> n1 = new Node<Integer>(null, 6);
		Node<Integer> n2 = new Node<Integer>(n1, 4);
		Node<Integer> n3 = new Node<Integer>(n2, 3);
		Node<Integer> n4 = new Node<Integer>(n3, 2);
		
		Node<Integer> n8 = new Node<Integer>(null, 7);
		Node<Integer> n6 = new Node<Integer>(n8, 5);
		Node<Integer> n5 = new Node<Integer>(n6, 1);

		//System.out.println("The First Linked List is :" + n5.toString());
		System.out.println(mergeTwoSortedLinkedLists(n5, n4).toString());
	
	}
	
	private static Node mergeTwoSortedLinkedLists(Node a, Node b)
	{
		Node result = null;
		if(a == null)
		{
			result = b;
		    return result;
		}
		else if (b == null)
		{
			result = a;
		    return result;
		}
		if(a.data <= b.data)
		{
			result = a;
			result.nextNode = mergeTwoSortedLinkedLists(a.nextNode, b);
		}
		else
		{
			result = b;
			result.nextNode =  mergeTwoSortedLinkedLists(a, b.nextNode);
		}
		return result;
	    
		
	}

	private static class Node<E>
	{
		Node<E> nextNode;
		int data;
		Node<E> previousNode;
		
		public Node(Node nextNode, int data)
		{
			this.nextNode = nextNode;
			this.data = data;
		}
		
		public Node(){};
		
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
