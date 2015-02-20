package LinkedList;

public class ReverseLinkedListInGroups {

	public static void main(String[] args) 
	{
		LinkedListClass<Integer> newLinkedList = new LinkedListClass<Integer>();
		newLinkedList.add(1);
		newLinkedList.add(2);
		newLinkedList.add(3);
		newLinkedList.add(4);
		newLinkedList.add(5);
		newLinkedList.add(6);
		
		System.out.println(newLinkedList.head.toString());
		System.out.println(reverseInGroups(newLinkedList,3).toString());

	}
	
    private static LinkedListClass.Node reverseInGroups(LinkedListClass newLinkedList,int n)
    {
    	LinkedListClass.Node current = newLinkedList.head;
    	LinkedListClass.Node previous = null;
    	LinkedListClass.Node next = current.nextNode;
    	int count = 0;
    	
    	while(next != null && count < n)
    	{
    		current.nextNode = previous;
    		previous = current;
    		current = next;
    		next = next.nextNode;
    		count++;
    	}
    	newLinkedList.head = current;
    	newLinkedList.head.nextNode = previous;
    	
    	return newLinkedList.head;
    }
	
    static class LinkedList<E>
	{
		Node<E> head;
		
		public LinkedList()
		{
			head = new Node<E>(null, null);
		}
		
		public void add(E data)
		{
			if(head.data == null)
			{
				head.data = data;
			}
			else
			{
				Node runner = head;
				
				while(runner.nextNode != null)
				{
					runner = runner.nextNode;
				}
				runner.nextNode = new Node<E>(data, null);
			}
		}
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
