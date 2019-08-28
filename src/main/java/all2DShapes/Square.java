package all2DShapes;

public class Square implements Shapes2D {
    public double getSide() {
        return side;
    }

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();

    }
}
