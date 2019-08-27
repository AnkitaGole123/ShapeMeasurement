package All3DShapes;

public class Sphere implements Shapes3D{
    public Sphere(double radius) {
        this.radius = radius;
    }

    double radius;

    @Override
    public double getVolume() {
        return (4*22*radius*radius*radius)/(3*7);
    }

    @Override
    public double getSurfaceArea() {
        return 4*22*radius*radius/7;
    }

}

