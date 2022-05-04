package assignments.assignment6;
//***************************************************************
//StackTest.java
//
//A simple driver to test a stack.
//
//***************************************************************
import java.util.Stack;
import java.util.Iterator;
public class StackTest2
{
	static void printStack(Stack s){
		int size = s.size();

		for(int i=size-1; i>=0; i--){
			System.out.print(s.get(i) + " ");
		}
		System.out.println();
	}

	static Stack reverseStack(Stack s){
		Stack s2 = new Stack();

		int size = s.size();
		for(int i=size-1; i>=0; i--){
			s2.push(s.get(i));
		}
		return s2;
	}

	static Stack removeElement(Stack s, int val){
		Stack s2 = new Stack();
		int size = s.size();
		for(int i=0; i<size; i++){
			if((int)s.get(i) == val)
				continue;
			else
				s2.push(i);
		}
		return s2;
	}
		public static void main(String[] args)
		{
			// Declare and instantiate a stack
			Stack stack = new Stack();
			//push some stuff on the stack
			for (int i=0; i<10; i++)
				stack.push(i);
			stack.push(5);
			// call printStack to print the stack
			System.out.println("original stack is");
			printStack(stack);
			System.out.println();
			// call reverseStack to reverse the stack
			Stack s1 = reverseStack(stack);
			System.out.println();
			// call printStack to print the stack again
			System.out.println("After reversing original stack is ");
			printStack(stack);
			System.out.println();
			System.out.println("Reversed stack is");
			printStack(s1);
			System.out.println();
			// call removeElement to remove all occurrences of the value 5 - save the
			System.out.println("removing element 5");
			Stack s2 = removeElement(stack,5);
			System.out.println();
		

			// call printStack to print the original stack and the new stack.
			System.out.println("After removal original stack is");
			printStack(stack);
			System.out.println();
			System.out.println("New Stack after removal is");
			printStack(s2);
		}
	}