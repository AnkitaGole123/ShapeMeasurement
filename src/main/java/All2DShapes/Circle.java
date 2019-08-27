package All2DShapes;

public class Circle implements Shapes2D{
    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double getArea(){
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}
