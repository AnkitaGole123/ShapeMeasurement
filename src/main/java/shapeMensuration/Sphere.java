package shapeMensuration;

public class Sphere {
    public Sphere(double radius) {
        this.radius = radius;
    }

    double radius;

    public double getVolume() {
        return (4*22*radius*radius*radius)/(3*7);
    }
}

