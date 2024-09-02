
class Square extends Figure {
    public Square(int side) {
        super(side, side);
    }

    @Override
    double area() {
        return dimension1 * dimension2;
    }
}