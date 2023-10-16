package linked_lists;

public class OurLinkedList 
{
	public Node head;

	public OurLinkedList()
	{
		head = null;
	}
	
	public int get(int index)
	{
		Node currentNode = head;
		while(index != 0)
		{
			currentNode = currentNode.next;
			index--;
		}
		return currentNode.data;
	}

	public void add(int value)
	{
		//Make a new node with this value
		Node newNode = new Node();
		newNode.data = value;

		//If the head is null, make the current node the head
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		//Search for the end of the list
		Node currentNode = head;
		while(currentNode.next != null)
		{
			currentNode = currentNode.next;
		}
		//add our new node to the end of the list
		currentNode.next = newNode;
	}
	
	public void removeLastNode()
	{
		Node currentNode = head;
		
		//If this is the first node in the list
		if(currentNode.next == null)
		{
			//remove that first node
			head = null;
			return;
		}
		
        while(currentNode.next.next!=null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next=null;
	}
	
	public void clear()
	{
		head = null;
	}
	
	public void removeFirstNode()
	{
		head = head.next;
	}
	

	public void print()
	{
		Node currentNode = head;
		while(currentNode != null)
		{
			//do something with currentNode
			System.out.print(currentNode);
			//iterate currentNode
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		OurLinkedList list = new OurLinkedList();

		//for(int i = 0; i < 100; i++) list.add(i);
		
		list.add(0);
		list.add(3);
		list.add(-2);

		list.print();
		
		System.out.println(list.get(1));
	}

	private class Node 
	{
		public int data;
		public Node next;

		public String toString()
		{
			return "" + data + " -> ";
		}
	}
}
