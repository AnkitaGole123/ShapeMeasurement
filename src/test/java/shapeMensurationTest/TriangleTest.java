package shapeMensurationTest;

import org.junit.Test;
import all2DShapes.Triangle;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void itShouldGiveTheAreaOfTriangle() {
        Triangle triangle = new Triangle(3,4,5);
        double expected = 6;
        double delta = 1;
        assertEquals(expected,triangle.getArea(),delta);
    }
    @Test
    public void itShouldGiveThePerimeterOfTriangle() {
        Triangle triangle = new Triangle(3,4,5);
        double expected = 12;
        double delta = 1;
        assertEquals(expected,triangle.getPerimeter(),delta);
    }
}
