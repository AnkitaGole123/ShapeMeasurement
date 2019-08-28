package all2DShapes;

public class Triangle implements Shapes2D {

    private double a;
    private double b;
    private double c;
    private double side;

    public Triangle(double a, double b, double c, double side) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*(side-a)*(side-b)*(side-c);
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
