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
		newLinkedList.add(5);
		
		//newLinkedList.addAt(4, 2);

		
		//System.out.println(newLinkedList.toString());
		//System.out.println(newLinkedList.getMiddle());
		//System.out.println(newLinkedList.getNthFromLast(2).data);
		//System.out.println(newLinkedList.getCountOfOccurences(5));
		//newLinkedList.remove(1);
		
		System.out.println(newLinkedList.reverseLinkedList());
		
	}
	

}
