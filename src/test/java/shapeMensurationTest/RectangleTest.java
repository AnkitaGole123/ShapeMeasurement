package shapeMensurationTest;

import org.junit.Test;
import shapeMensuration.Rectangle;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void itShouldGiveTheAreaOfRectangle() {
        Rectangle rectangle = new Rectangle();
        double expected = 12;
        double length = 3;
        double width = 4;
        double delta = 1;
        assertEquals(expected,rectangle.getArea(length,width),delta);

    }

}
