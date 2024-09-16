package lab8;

class PushException extends Exception {
    public PushException(String message) {
        super(message);
    }
}

// Custom Exception for Pop Operation
class PopException extends Exception {
    public PopException(String message) {
        super(message);
    }
}

// Stack Class
class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) throws PushException {
        if (isFull()) {
            throw new PushException("Stack is full. Cannot push " + value);
        }
        stackArray[++top] = value;
    }

    public int pop() throws PopException {
        if (isEmpty()) {
            throw new PopException("Stack is empty. Cannot pop");
        }
        return stackArray[top--];
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}



