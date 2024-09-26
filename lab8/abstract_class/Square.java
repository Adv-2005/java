package abstract_class;

public class Square extends Figure{
	Square(int length){
		super(length,length);
	}
	
	double area() {
		return i*j;
	}
}
