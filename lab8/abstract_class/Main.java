package abstract_class;

public class Main {
public static void main(String args[]) {
	Figure figure;
	
	figure= new Rectangle(10,20);
	System.out.println("Area"+ figure.area());
	
	figure= new Triangle(10,20);
	System.out.println("Area: " + figure.area());
	
	
}
}
