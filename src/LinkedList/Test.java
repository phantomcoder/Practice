package LinkedList;

import LinkedList.LinkedListClass.Node;



public class Test {

	public static void main(String[] args) 
	{
	
		LinkedListClass<Integer> newLinkedList = new LinkedListClass<Integer>();
		newLinkedList.add(1);
		newLinkedList.add(2);
		newLinkedList.add(3);
		newLinkedList.add(4);
		newLinkedList.add(5);
		newLinkedList.add(6);
		
	
		//newLinkedList.addAt(4, 2);

		
		//System.out.println(newLinkedList.toString());
		//System.out.println(newLinkedList.getMiddle());
		//System.out.println(newLinkedList.getNthFromLast(2).data);
		//System.out.println(newLinkedList.getCountOfOccurences(5));
		newLinkedList.remove(1);
		//newLinkedList.pairwiseSwap();
		//newLinkedList.moveLastElementToFront();

		System.out.println(newLinkedList.toString());
		
		//newLinkedList.deleteAlternateNodes();
		//newLinkedList.splitListIntoTwoWithAlternate();
		//System.out.println(newLinkedList.toString());
		
		//getIntersection(newLinkedList, newLinkedList2);
	}
	
	/*
	public static LinkedListClass getIntersection(LinkedListClass l1, LinkedListClass l2)
	{
		LinkedListClass result = new LinkedListClass();
		Node head1 = l1.head;
		Node head2 = l1.head;
		
		while(head1.nextNode != null && head2.nextNode != null)
		{
			if(head1.data == head2.data)
			{
				result.add(head1.data);
				head1 = head1.nextNode;
				head2 = head2.nextNode;
			}
			else if( head1.data < head2.data)
			{
				head1 = head1.nextNode;
			}
			else 
				head2 = head2.nextNode;
		}
		
		return result;
	}
	*/

}
