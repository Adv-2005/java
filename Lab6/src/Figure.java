

	abstract class Figure {
	    int dimension1;
	    int dimension2;

	  
	    public Figure(int dimension1, int dimension2) {
	        this.dimension1 = dimension1;
	        this.dimension2 = dimension2;
	    }

	
	    abstract double area();
	    
	    public static void main(String[] args) {
	        // Creating references of Figure class
	        Figure fig;

	        // Creating a Rectangle object
	        fig = new Rectangle(10, 20);
	        System.out.println("Area of Rectangle: " + fig.area());

	        // Creating a Triangle object
	        fig = new Triangle(10, 20);
	        System.out.println("Area of Triangle: " + fig.area());

	        // Creating a Square object
	        fig = new Square(10);
	        System.out.println("Area of Square: " + fig.area());
	    }
	}

