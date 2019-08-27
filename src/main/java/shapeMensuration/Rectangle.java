package shapeMensuration;

public class Rectangle implements Area{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
