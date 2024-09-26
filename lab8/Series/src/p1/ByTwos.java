package p1;

public class ByTwos implements Series {
	int current;
	int start;
	public int getNext() {
	   current+=2;
	   return current;
}
    
    public void reset() {
    	current=start;
    }
    
    public void setStart(int start) {
    	this.start=start;
    	this.current=start;
 }
}
