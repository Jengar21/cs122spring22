package assignments.assignment6;
//***************************************************************
//LinkedStack.java //
//AlinkedimplementationofanObjectstackclasswithoperationspush,
//pop,andisEmptyandisFull. //
//***************************************************************
public class LinkedStack implements StackADT
{
	private Node top; // reference to top of stack
	//---------------------------------------------------
	// Constructor -- initializes top
	//---------------------------------------------------
	public LinkedStack()
	{
		this.top = null;
	}

	//---------------------------------------------------
	// Adds element to top of stack if it's not full, else
	// does nothing.
	//---------------------------------------------------
	public void push(Object val)
	{
		Node newNode = new Node(val);
		newNode.setNext(top);
		top = newNode;
	}

	//---------------------------------------------------
	// Removes and returns value at top of stack. If stack
	// is empty return null.
	//---------------------------------------------------
	public Object pop()
	{
		Node temp = top;
		top = top.getNext();
		return temp.getElement();

	}

	//---------------------------------------------------
	// Returns true if stack is empty, false otherwise.
	//---------------------------------------------------
	public boolean isEmpty()
	{
		return top==null;
	}
	//---------------------------------------------------
	// Returns true if stack is full, false otherwise.
	//---------------------------------------------------
	public boolean isFull()
	{
		return false;
	}
}