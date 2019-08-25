package shapeMensuration;

public class Circle {
    public Circle(double radius) {
        this.radius = radius;
    }

    double radius;

    public double getArea(){
        return Math.PI * (radius * radius);
    }
}
