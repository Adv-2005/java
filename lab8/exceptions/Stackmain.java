package exceptions;

public class Stackmain {
	public static void main(String args[]) {
	Stack c = new Stack(5);
	try {
		c.push(1);
		c.push(2);
		c.push(3);
		c.push(4);
		c.push(5);
		c.push(6);
	}
	catch(PushException e){
		System.out.println(e.getMessage());
	}
	
	try {
        // Pop elements from the stack
        c.pop();
        c.pop();
        c.pop();
        
        c.pop();
    } catch (PopException e) {
        System.out.println(e.getMessage());
    }
	}
	
}
