package Client;

import shapeMensuration.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rectangles.add(new Rectangle(1,1));
            System.out.println(rectangles.get(i).getPerimeter());
        }
    }
}
