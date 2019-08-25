package Client;

import shapeMensuration.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Double> rectanglesArea = new ArrayList<>();
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(3, 3);
        Rectangle rectangle3 = new Rectangle(4, 3);
        Rectangle rectangle4 = new Rectangle(3, 5);
        rectanglesArea.add(rectangle1.getArea());
        rectanglesArea.add(rectangle2.getArea());
        rectanglesArea.add(rectangle3.getArea());
        rectanglesArea.add(rectangle4.getArea());
        for (int i = 0; i < rectanglesArea.size(); i++) {
            System.out.println(rectanglesArea.get(i));
        }

        }
    }
