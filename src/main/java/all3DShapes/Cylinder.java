package all3DShapes;

public class Cylinder implements Shapes3D{

   private double radius;
   private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (22*radius*radius*height)/7;
    }

    @Override
    public double getSurfaceArea() {
        return (2*22*radius)/7*(radius+height);
    }
}
