package ex_example;

public class illegalarguement {
	public static void main(String[] args) {
        try {
            Thread thread = new Thread();
            thread.setPriority(11); 
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }
}
