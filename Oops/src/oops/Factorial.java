package oops;
import java.util.Scanner;
public class Factorial {
	int fact(int n) {
		if(n>=1) {
			return n*fact(n-1);
			
		}
		else {
			return 1;
		}
		
	}
	public static void main(String args[]) {
		Factorial f1 = new Factorial();
		System.out.println("Enter an integer: ");
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int result= f1.fact(n);
		System.out.println("Factorial of number is "+ result);
	}

}
