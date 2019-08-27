package shapeMensuration;

public class Triangle implements Shape{

    public Triangle(double hieght, double width) {
        this.height = hieght;
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
