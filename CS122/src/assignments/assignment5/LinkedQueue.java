package assignments.assignment5;

//***********************************************************
//LinkedQueue.java
//A linked-list implementation of the classic FIFO queue interface.
//***********************************************************
public class LinkedQueue implements QueueADT
{
	private Node front, back;
	private int numElements;
	//---------------------------------------------
	// Constructor; initializes the front and back pointers
	// and the number of elements.
	//---------------------------------------------
	public LinkedQueue()
	{
		front = null;
		back = null;
		numElements = 0;
	}
	//---------------------------------------------
	// Puts item on end of queue.
	//---------------------------------------------
	public void enqueue(Object item)
	{
		Node node = new Node(item);
		numElements++;
		if(back==null)
		{
			front = back = node;
			return ;
		}

		back.setNext(node);
		back = node;
	}
	//---------------------------------------------
	// Removes and returns object from front of queue.
	//---------------------------------------------
	public Object dequeue()
	{
		if(front==null)
			return null;

		Node temp = front;
		front = front.getNext();

		Object item = temp.getElement();
		numElements--;

		return item;
	}
	//---------------------------------------------
	// Returns true if queue is empty.
	//---------------------------------------------
	public boolean isEmpty()
	{
		return numElements==0;
	}
	//---------------------------------------------
	// Returns true if queue is full, but it never is.
	//---------------------------------------------
	public boolean isFull()
	{
		return numElements==15;
	}
	//---------------------------------------------
	// Returns the number of elements in the queue.
	//---------------------------------------------
	public int size()
	{
		return numElements;
	}
	//---------------------------------------------
	// Returns a string containing the elements of the queue
	// from first to last
	//---------------------------------------------
	public String toString()
	{
		String result = "\n";
		Node temp = front;
		while (temp != null)
		{
			result += temp.getElement() + "\n";
			temp = temp.getNext();
		}
		return result;
	}
}
