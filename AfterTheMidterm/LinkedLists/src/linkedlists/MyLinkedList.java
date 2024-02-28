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
	
	public int add(int data, int index)
	{
		if(index == 0)
		{
			this.addFirst(data);
			return index;
		}
		//Create a Node object containing data
		Node newNode = new Node(data);
		
		try 
		{
		//Place that node in the list at index
		Node currentNode = head;
		int i = 0;
		while(i < index - 1)
		{
			i++;
			currentNode = currentNode.next;
		}
		
//		Node temp = currentNode.next;
//		currentNode.next = newNode;
//		newNode.next = temp;
		
		newNode.next = currentNode.next;
		currentNode.next = newNode;
		
		//If successful, return the index
		return index;
		}
		catch(NullPointerException e)
		{
			//If not successful, throw some exception
			throw new IndexOutOfBoundsException("index " + index + " is beyond the length of the LinkedList");
		}
	}
	
	public void clear()
	{
		//Delete all contents from the LinkedList
		head = null;
	}
	
	public void addFirst(int data)
	{
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
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
		MyLinkedList ll = new MyLinkedList();
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		System.out.println(ll);
		
		ll.add(3, 1);
		System.out.println(ll);
		ll.add(0, 4);
		System.out.println(ll);
		ll.add(-1, 0);
		System.out.println(ll);
		ll.add(10, 7);
		System.out.println(ll);
		ll.add(15, 15);
		System.out.println(ll);
	}

}
