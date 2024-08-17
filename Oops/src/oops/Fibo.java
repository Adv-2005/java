package oops;
import java.util.Scanner;
public class Fibo {
	int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
		
	}
	public static void main(String args[]) {
		Fibo f1 = new Fibo();
		int n;
		System.out.println("Enter number: ");
	Scanner scanner = new Scanner(System.in);
	n=scanner.nextInt();
	for(int i=0; i<n; i++) {
		System.out.print(f1.fib(i)+ " ");
	}
	}
	
}
