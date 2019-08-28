package Client;

import all2DShapes.*;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Shapes2D> rectangles = Arrays.asList(new Square(3),new Rectangle(3,4),new Circle(3));
        for (Shapes2D rectangle : rectangles) {
            System.out.println("2D shapes Area = " + rectangle.getArea());

            System.out.println("2D shapes Perimeter = " + rectangle.getPerimeter());
        }
    }
}
