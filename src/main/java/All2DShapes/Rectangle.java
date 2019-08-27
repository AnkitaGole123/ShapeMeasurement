package All2DShapes;

import All2DShapes.Shapes2D;

public class Rectangle implements Shapes2D {
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

}
