
class Triangle extends Figure {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dimension1 * dimension2;
    }
}
