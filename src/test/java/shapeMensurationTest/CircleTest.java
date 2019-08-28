package shapeMensurationTest;

import org.junit.Test;
import all2DShapes.Circle;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void itShouldGiveTheAreaOfCircle() {
        Circle circle = new Circle(3);
        double expected = 28;
        double delta = 1;
        assertEquals(expected,circle.getArea(),delta);
    }

    @Test
    public void itShouldGiveThePerimeterOfCircle() {
        Circle circle = new Circle(3);
        double expected = 18;
        double delta = 1;
        assertEquals(expected,circle.getPerimeter(),delta);
    }
}
