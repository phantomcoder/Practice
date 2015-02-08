package LinkedList;

public class CheckIfLinkedListsIdentical 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> newList = new LinkedList<Integer>();
		newList.add(1);

		
		System.out.println(newList.head.toString());
		
		LinkedList<Integer> newList1 = new LinkedList<Integer>();
		newList1.add(1);

		
		System.out.println(newList1.head.toString());
		
		System.out.println(checkIfLinkedListsIdentical(newList, newList1));
		
	}
	
	private static boolean checkIfLinkedListsIdentical(LinkedList l1, LinkedList l2)
	{
		boolean isIdentical = false;
		Node head1 = l1.head;
		Node head2 = l2.head;
		
		if(head1 == null && head2 == null)
			isIdentical = true;
		else if ((head1 != null && head2 == null) || (head1 == null && head2 != null))
		{
			isIdentical = false;
		}
		
		else
		{
		   while(head1!= null && head2!= null)
		   {
			   if(head1.data == head2.data)
			   {
				   isIdentical = true;
				   
				   head1 = head1.nextNode;
				   head2 = head2.nextNode;
			   }
			   else
			   {
				   isIdentical = false;
				   return isIdentical;
			   }
		   }
		}
		
		return isIdentical;
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
