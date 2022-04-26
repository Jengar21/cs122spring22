package classSamples.collections;

import java.util.LinkedList;


public class Queue {
	
	public LinkedList<String> theQueue;
	
	public Queue() {
		this.theQueue = new LinkedList<String>();
	}

	//---------------------------------------------
	//Puts item on end of queue.
	//---------------------------------------------
	public void enqueue(String s) 
	{
		theQueue.addLast(s);
	}
	//---------------------------------------------
	//Removes and returns object from front of queue.
	//---------------------------------------------
	public Object dequeue(){
		return theQueue.removeFirst();
	}
	//---------------------------------------------
	//Returns true if queue is empty.
	//---------------------------------------------
	public boolean isEmpty() {
		if(theQueue.size()==0) {
			return true;
		}
		return false;
	}
	//---------------------------------------------
	//Returns the number of elements in the queue.
	//---------------------------------------------
	public String toString() {
		return theQueue.toString();
	}
}
