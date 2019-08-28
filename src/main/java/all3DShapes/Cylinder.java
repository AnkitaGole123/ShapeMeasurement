package all3DShapes;

public class Cylinder implements Shapes3D{
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double radius;
    double height;

    @Override
    public double getVolume() {
        return (22*radius*radius*height)/7;
    }

    @Override
    public double getSurfaceArea() {
        return (2*22*radius)/7*(radius+height);
    }
}
