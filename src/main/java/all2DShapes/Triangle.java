package all2DShapes;

public class Triangle implements Shapes2D {

    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;

    }
    @Override
    public double getArea() {
        return (height*width)/2;
    }

    @Override
    public double getPerimeter() {
        return 2 *(height+width);
    }
}
