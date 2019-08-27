package Client;

import shapeMensuration.Rectangle;
import shapeMensuration.Shapes2D;
import shapeMensuration.Square;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Shapes2D> rectangles = Arrays.asList(new Square(3),new Rectangle(3,4));
        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i).getArea());
        }
    }
}
