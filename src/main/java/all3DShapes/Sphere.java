package all3DShapes;

public class Sphere implements Shapes3D{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4*22*radius*radius*radius)/(3*7);
    }

    @Override
    public double getSurfaceArea() {
        return 4*22*radius*radius/7;
    }

}

