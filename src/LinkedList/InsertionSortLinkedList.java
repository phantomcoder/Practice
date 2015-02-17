package LinkedList;

public class InsertionSortLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<Integer>(null, 6);
		Node<Integer> n2 = new Node<Integer>(n1, 4);
		Node<Integer> n3 = new Node<Integer>(n2, 3);
		Node<Integer> n4 = new Node<Integer>(n3, 2);
		
		Node<Integer> n8 = new Node<Integer>(n4, 7);
		Node<Integer> n6 = new Node<Integer>(n8, 5);
		Node<Integer> n5 = new Node<Integer>(n6, 1);
		
		System.out.println(n5.toString());
		System.out.println(insertionSort(n5).toString());

	}
	
	public static Node insertionSort(Node head)
	{
		Node sorted = head;
		Node next = head.nextNode;
		sorted.nextNode = null;
		
		while(next != null)
		{
			Node current = next;
			next = next.nextNode;
			
			if(current.data < sorted.data)
			{
				current.nextNode = sorted;
				sorted = current;
			}
			else
			{
				Node search = sorted;
				while((search.nextNode != null) && (current.data > search.nextNode.data))
					search = search.nextNode;
				
				current.nextNode = search.nextNode;
				search.nextNode = current;
			}
		}
		
		
		
		return sorted;
	}
	
	static class Node<E>
	{
		Node<E> nextNode;
		int data;
		
		public Node(Node<E> node,int data2)
		{
			this.data = data2;
			this.nextNode = node;
		}
		
		public String toString()
		{
			String result = data+"->";
			if(nextNode != null)
			{
				result = result+nextNode.toString();
			}
			return result;
		}

	}
}
