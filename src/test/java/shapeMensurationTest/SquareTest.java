package shapeMensurationTest;

import org.junit.Test;
import shapeMensuration.Square;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void itShouldGiveTheAreaOfSquare() {
        Square square = new Square(3);
        double expected = 9;
        double delta = 1;
        assertEquals(expected,square.getArea(),delta);
    }

    @Test
    public void itShouldGiveThePerimeterOfSquare() {
        Square square = new Square(3);
        double expected = 12;
        double delta = 1;
        assertEquals(expected,square.getPerimeter(),delta);
    }
}
