package LinkedList;


public class MergeSortLinkedList
{	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Node<Integer> n1 = new Node<Integer>(null, 6);
		Node<Integer> n2 = new Node<Integer>(n1, 4);
		Node<Integer> n3 = new Node<Integer>(n2, 3);
		Node<Integer> n4 = new Node<Integer>(n3, 2);
		
		Node<Integer> n8 = new Node<Integer>(n4, 7);
		Node<Integer> n6 = new Node<Integer>(n8, 5);
		Node<Integer> n5 = new Node<Integer>(n6, 1);
		
		System.out.println(mergeSort(n5).toString());

	}
	
	public static Node mergeSort(Node head)
	{
		if (head == null || head.nextNode == null)
			return head;
 
		// count total number of elements
		int count = 0;
		Node p = head;
		while (p != null) {
			count++;
			p = p.nextNode;
		}
 
		// break up to two list
		int middle = count / 2;
 
		Node l = head, r = null;
		Node p2 = head;
		int countHalf = 0;
		while (p2 != null) {
			countHalf++;
			Node next = p2.nextNode;
 
			if (countHalf == middle) {
				p2.nextNode = null;
				r = next;
			}
			p2 = next;
		}
 
		// now we have two parts l and r, recursively sort them
		Node h1 = mergeSort(l);
		Node h2 = mergeSort(r);
		
		Node newHead = merge(h1, h2);
		
		return newHead;
	}
	
	private static Node merge(Node a,Node b)
	{
		Node result = null;
		
		if( a == null && b == null)
			return result;
		else if (a == null && b!=null)
			return result = b;
		else if (a != null && b == null)
			return result = a;
		else
		{
			if(a.data < b.data)
			{
				result = a;
				result.nextNode = merge(a.nextNode, b);
			}
			else
			{
				result = b;
				result.nextNode = merge(a,b.nextNode);
				
			}
		}
		return result;
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
