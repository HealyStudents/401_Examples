package linkedlists;

public class MyLinkedList 
{
	public Node head;
	
	public int add(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return 0;
		}
		
		Node currentNode = head;
		int i = 1;
		while(currentNode.next != null)
		{
			currentNode = currentNode.next;
			i++;
		}
		
		//This is what actually adds the node to the list!
		currentNode.next = newNode;
		
		return i;
	}
	
	public String toString() 
	{
		String rep = "[";
		Node currentNode = head;
		while(currentNode != null)
		{
			rep += currentNode.data + ", ";
			currentNode = currentNode.next;
		}
		rep += "]";
		return rep;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	}

}
