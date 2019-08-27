package shapeMensurationTest;

import org.junit.Test;
import shapeMensuration.Triangle;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void itShouldGiveTheAreaOfTriangle() {
        Triangle triangle = new Triangle(3,6);
        double expected = 9;
        double delta = 1;
        assertEquals(expected,triangle.getArea(),delta);

    }
}
