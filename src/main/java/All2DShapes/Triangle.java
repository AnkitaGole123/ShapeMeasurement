package All2DShapes;

import All2DShapes.Shapes2D;

public class Triangle implements Shapes2D {

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;

    }

    private double height;
    private double width;

    @Override
    public double getArea() {
        return (height*width)/2;
    }

    @Override
    public double getPerimeter() {
        return 2 *(height+width);
    }
}
