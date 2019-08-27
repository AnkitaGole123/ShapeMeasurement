package shapeMensuration;

public class Square implements Area{
    double side;

    public Square(double side) {
        this.side = side;
    }

     public double getPerimeter(){
        return 4 * side;
     }
    @Override
    public double getArea() {
        return side * side;
    }
}
