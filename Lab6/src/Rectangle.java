
class Rectangle extends Figure {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    double area() {
        return dimension1 * dimension2;
    }
}
