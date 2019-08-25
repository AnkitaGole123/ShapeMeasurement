package shapeMensurationTest;

import org.junit.Test;
import shapeMensuration.Circle;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void itShouldGiveTheAreaOfSquare() {
        Circle circle = new Circle(3);
        double expected = 28;
        double delta = 1;
        assertEquals(expected,circle.getArea(),delta);
    }
}
