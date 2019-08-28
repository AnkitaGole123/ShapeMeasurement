package all2DShapes;

public class Triangle implements Shapes2D {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        int side = (int) ((a+b+c)/2);
        return Math.sqrt(side*(side-a)*(side-b)*(side-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
