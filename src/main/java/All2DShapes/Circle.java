package All2DShapes;

public class Circle {
    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }
}
