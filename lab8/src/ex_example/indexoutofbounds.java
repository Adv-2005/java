package ex_example;

public class indexoutofbounds {
	public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50;  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
    }
}
