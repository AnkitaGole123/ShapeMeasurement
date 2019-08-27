package shapeMensuration;

public class Triangle implements Shape{

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double height;
    double width;

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
