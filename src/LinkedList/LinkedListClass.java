package LinkedList;

public class LinkedListClass<E>
{
	Node<E> head;
	int length;
	
	public LinkedListClass()
	{
		head = new Node<E>(null);
		length = 0;
	}
	
	public void add(E data)
	{
		Node<E> newNode = new Node<E>(data);
		
		if(head.data == null)
			head = newNode;
		else{
		
		Node<E> runner = head;
		while(runner.nextNode != null)
			runner = runner.nextNode;
		
		runner.nextNode = newNode;
		}
		length++;
	}
	
	public void addAt(E data, int index)
	{
		Node<E> newNode = new Node<E>(data);
		if(index < 1 || index > length)
			throw new IndexOutOfBoundsException("Index is longer than the length of the linked list");
		
		Node<E> runner = head;
		for(int i = 1; i < index && runner.nextNode != null ; i++)
		{
			runner = runner.nextNode;
		}
		
		newNode.nextNode = runner.nextNode;
		runner.nextNode = newNode;
		length++;
	}
	
	/*
	 * Im not decrementing the size. Iam aware of that.
	 */
	public void remove(E data)
	{
		Node<E> runner = head;
		
		if(runner.data == data)
			head = runner.nextNode;
		
		while(runner.nextNode != null)
		{
		  if(runner.nextNode.data == data)
		  {
			  runner.nextNode = runner.nextNode.nextNode;
		  }
		  else 
			  runner = runner.nextNode;
		}
		
		
	}
	
	public Node<E> getNthNode(int index)
	{
		
		if(index < 0 || index > length)
			throw new IndexOutOfBoundsException();
		
		Node<E> runner = head;
		
		for(int i = 1; i< index; i++)
		{
			runner = runner.nextNode;
		}
		
		return runner;
	}
	
	
	public Node<E> getNthFromLast(int index)
	{
		if(index < 0 || index > length)
			throw new IndexOutOfBoundsException();
		
		Node<E> tail = head, lead = head;
		
		for(int i = 0; i <index; i++)
		{
			lead = lead.nextNode;
		}
		
		while(lead.nextNode != null)
		{
			tail = tail.nextNode;
			lead = lead.nextNode;
		}
		
		return tail;
	}
	
	public int getCountOfOccurences(E e)
	{
		Node<E> runner = head;
		int count = 0;
		
		while(runner != null)
		{
			if(runner.data == e)
				count++;
			runner = runner.nextNode;
		}
		return count;
	}
	
	public Node<E> reverseLinkedList()
	{
		Node<E> current = head;
		Node<E> nextNode = current.nextNode, looNode= null;
		
		while(nextNode != null)
		{
			current.nextNode = looNode;
			looNode = current;
			current = nextNode;
			nextNode = nextNode.nextNode;
			
		}
		
		head = current;
		head.nextNode = looNode;
		return head;
	}
	
	public void deleteNodeGivenReferenceToThatNode(Node<E> n)
	{
		
		Node<E> tempNode = n.nextNode;
		n.data = tempNode.data;
		n.nextNode = tempNode.nextNode;
		
	}
	
	public E getMiddle()
	{
		Node<E> slowRunner = head, fastRunner = head;
		
		while(fastRunner != null && fastRunner.nextNode != null)
		{
			slowRunner = slowRunner.nextNode;
			fastRunner = fastRunner.nextNode.nextNode;
		}
		return slowRunner.data;
	}
	
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		Node<E> runner = head;
		while(runner != null)
		{
			s.append(runner.data+"->");
			runner = runner.nextNode;
		}
		return s.toString();
	}
	
	
  public int getLength() {
		return length;
	}


class Node<E>
  {
	  Node<E> nextNode;
	  E data;
	  Node<E> previousNode;
	  
	  public Node(Node nextNode, E data)
	  {
		  this.data = data;
		  this.nextNode = nextNode;
	  }
	  
	  public Node(E value)
	  {
		  this.data = value;
		  this.nextNode = null;
	  }
  }

}
