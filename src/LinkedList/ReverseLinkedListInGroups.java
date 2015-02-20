package LinkedList;

public class ReverseLinkedListInGroups {

	public static void main(String[] args) 
	{
		Node<Integer> n1 = new Node<Integer>(5,null);
		Node<Integer> n2 = new Node<Integer>(4,n1);
		Node<Integer> n3 = new Node<Integer>(3,n2);
		Node<Integer> n4 = new Node<Integer>(2,n3);
		Node<Integer> n5 = new Node<Integer>(1, n4);
		Node<Integer> n6 = new Node<Integer>(0, n5);
		
		System.out.println(n6.toString());
		System.out.println("After reversal");
		System.out.println(reverseInGroups(n6, 3).toString());
	}
	
	private static Node<Integer> reverseInGroups(Node<Integer> headNode, int size)
	{
		Node givenHead = headNode;
		int count = 0;
		Node prev = null;
		Node current = givenHead; Node next = null;
		
		while(current != null && count < size)
		{
		   next = current.nextNode;
		   current.nextNode = prev;
		   prev = current;
		   current = next;
		   
		   count++;
			
		}
		
		if(next != null)
		{
			givenHead.nextNode = reverseInGroups(next, size);
		}
		return prev;
		
	}
	
	static class Node<E>
	{
		Node<E> nextNode;
		E data;
		
		public Node(E data, Node node)
		{
			this.data = data;
			this.nextNode = node;
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
