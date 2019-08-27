package shapeMensurationTest;

import org.junit.Test;
import All2DShapes.Rectangle;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void itShouldGiveTheAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(3,4);
        double expected = 12;
        double delta = 1;
        assertEquals(expected,rectangle.getArea(),delta);

    }
    @Test
    public void itShouldGiveThePerimeterOfRectangle() {
        Rectangle rectangle = new Rectangle(3,4);
        double expected = 14;
        double delta = 1;
        assertEquals(expected,rectangle.getPerimeter(),delta);

    }

}
