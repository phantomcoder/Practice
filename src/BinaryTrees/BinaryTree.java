package BinaryTrees;

public class BinaryTree<E> 
{

	public Node<E> root;
	
	public BinaryTree()
	{
		this.root = null;
	}
	
	public void addTreeNode(int value)
	{
		Node newNode = new Node(value);
		
		if(root == null)
		{
			this.root = newNode;
		}
		else
		{
			Node focusNode = root;
			Node parentNode;
			while(true)
			{
				parentNode = focusNode;
			if(value < root.data)
			{
				focusNode = focusNode.leftChild;
				if(focusNode == null)
				{
					parentNode.leftChild = newNode;
				    return;
				}
			}
			else
			{
				focusNode = focusNode.rightChild;
				if(focusNode == null)
				{
					parentNode.rightChild = newNode;
				return;
				}
			}
			}
		}
	}
	
	public void inOrderTraversal(Node n)
	{
		if(n != null)
		{
			inOrderTraversal(n.leftChild);
			System.out.println(n.data);
			inOrderTraversal(n.rightChild);
		}
	}
	
	public void preOrderTraversal(Node n)
	{
		if(n != null)
		{
			System.out.println(n.data);
			preOrderTraversal(n.leftChild);
			preOrderTraversal(n.rightChild);
		}
	}
	
	public void postOrderTraversal(Node n)
	{
		if(n != null)
		{
			postOrderTraversal(n.leftChild);
			postOrderTraversal(n.rightChild);
			System.out.println(n.data);
		}
	}
	
	
}

class Node<E>
{
	Node<E> leftChild;
	int data;
	Node<E> rightChild;
	
	public Node(int value)
	{
		this.data = value;
	}
}
