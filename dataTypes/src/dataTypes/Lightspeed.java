package dataTypes;

public class Lightspeed {
public static void main(String[] args) {
	int lightspeed;
	long days;
	long seconds;
	long distance;
	lightspeed=186000;
	days=1000;
	seconds=days*24*60*60;
	distance=lightspeed*seconds;
	System.out.println("In " + days + " days light travels " + distance + " miles.");
	
}
}
