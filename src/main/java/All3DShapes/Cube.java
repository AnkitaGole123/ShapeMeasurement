package All3DShapes;

public class Cube implements Shapes3D{
    public Cube(double length) {
        this.length = length;
    }

    double length;

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getSurfaceArea() {
        return 0;
    }
}