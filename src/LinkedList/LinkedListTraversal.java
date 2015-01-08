/**
 * 
 */
package LinkedList;

import java.io.ObjectInputStream.GetField;

import org.omg.CORBA.OMGVMCID;

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
		Node<Integer> n5 = new Node<Integer>(n4, 1);
		
		System.out.println("The First Linked List is :" + n5.toString());
		
		Node<Integer> n6 = new Node<Integer>(null, 8);
		Node<Integer> n7 = new Node<Integer>(n6, 6);
		Node<Integer> n8 = new Node<Integer>(n7, 4);
		Node<Integer> n9 = new Node<Integer>(n8, 2);
		
		System.out.println("The second Linked List is :" +n9.toString());
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
