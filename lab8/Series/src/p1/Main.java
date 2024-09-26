package p1;

public class Main {
	public static void main(String args[]) {
		ByTwos s = new ByTwos();
		s.setStart(0);
		System.out.println("Series starting from zero");
		for(int i=0;i<5;i++)
			System.out.println(s.getNext());
		s.reset();
		System.out.println(s.getNext());
		s.setStart(0);
		System.out.println("Series starting from five");
		for(int i=0;i<5;i++)
			System.out.println(s.getNext());
	}
}
