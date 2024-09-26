package exceptions;

public class Stack {
	private int size;
	private int arr[];
	private int top;
	
	public Stack(int size) {
		this.size=size;
		this.arr = new int[size];
		this.top=-1;
		
	}
	
	public void push(int item) throws PushException{
		if(isFull()) {
			System.out.println("Full Stack");
		}
		else {
		arr[++top]=item;
		System.out.println(item + "Pushed into stack");
		}
		
	}
	
	public int pop() throws PopException{
		if(isEmpty()) {
			System.out.println("Empty Stack");
			return -1;
		}
		else {
			int val= arr[top--];
			
			System.out.println(val + "popped out of stack");
			return val;
		}
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	
	
	
}