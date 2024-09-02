package lab4;

public class Stack {
    private int[] arr;
    private int tos; 

    public Stack(int size) {
        arr = new int[size];
        tos = -1; 
    }

    public void push(int data) {
        if (tos == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            tos++;
            arr[tos] = data;
        }
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("Stack Underflow");
            return -1; 
        } else {
            int data = arr[tos];
            tos--;
            return data;
        }
    }

    public void display() {
        if (tos == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = tos; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
   
        public static void main(String[] args) {
            Stack stack = new Stack(5); // Create a stack of size 5

            // Push some elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);

            // Display the stack
            stack.display();

            // Pop and display elements
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());

            // Display the stack again
            stack.display();
        }
    }


