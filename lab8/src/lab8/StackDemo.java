package lab8;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            // This push will throw PushException
            stack.push(40);
        } catch (PushException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            // This pop will throw PopException
            System.out.println("Popped: " + stack.pop());
        } catch (PopException e) {
            System.out.println(e.getMessage());
        }
    }
}
