package assignments.assignment5;

public class IntList {
	private IntNode front;

	// Constructor. Initially list is empty.
	public IntList()
	{
		front = null;
	}

	// Adds given integer to front of list.
	public void addToFront(int val)
	{
		front = new IntNode(val, front);
	}
	// Adds given integer to end of list.
	public void addToEnd(int val)
	{
		IntNode newnode = new IntNode (val, null);
		//if list is empty, this will be the only node in it
		if (front == null)
			front = newnode;
		else
		{
			//make temp point to last thing in list

			IntNode temp = front;
			while (temp.next != null)
				temp = temp.next;
			//link new node into list
			temp.next = newnode;

		}
	}
	//—————————————–

	// Removes the first node from the list.

	// If the list is empty, does nothing.

	public void removeFirst()
	{
		if (front != null)
			front = front.next;

	}

	// Prints the list elements from first to last.
	public void print()
	{
		System.out.println("--------------------");
		System.out.print("List elements: ");
		IntNode temp = front;
		while (temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("\n-----------------------\n");	
	}

	public int length(){
		IntNode temp = front;
		if(temp == null)
			return 0;
		int count = 1;
		while(temp.next != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		IntNode temp = front;
		while (temp != null)
		{
			sb.append(temp.val).append("->");
			temp = temp.next;
		}
		return sb.toString();
	}
	public void removeLast(){
		IntNode temp = front;
		if(temp == null)
			return;
		if(temp.next == null){
			temp = null;
			return;
		}
		while(temp.next.next != null){
			System.out.println("In while Loop");
			temp = temp.next;
		}
		System.out.println("Outside while loop");
		temp.next = null;

	}

	public void replace(int oldVal, int newVal){
		IntNode temp = front;
		while(temp !=null){
			if(temp.val == oldVal){
				temp.val = newVal;
			}
			temp = temp.next;
		}
	}






	private class IntNode
	{
		public int val;         //value stored in node
		public IntNode next;    //link to next node in list
		//------------------------------------------------------------------ // Constructor; sets up the node given a value and IntNode reference //------------------------------------------------------------------
		public IntNode(int val, IntNode next)
		{
			this.val = val;
			this.next = next;
		}
	}
}
