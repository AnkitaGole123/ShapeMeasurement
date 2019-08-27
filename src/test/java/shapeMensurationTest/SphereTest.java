package shapeMensurationTest;

import org.junit.Test;
import All3DShapes.Sphere;

import static org.junit.Assert.assertEquals;

public class SphereTest {
    @Test
    public void itShouldGiveTheVolumeOfSphere() {
        Sphere sphere = new Sphere(3);
        double expected = 113;
        double delta = 1;
        assertEquals(expected,sphere.getVolume(),delta);
    }
    @Test
    public void itShouldGiveTheSurfaceAreaOfSphere() {
        Sphere sphere = new Sphere(7);
        double expected = 616;
        double delta = 1;
        assertEquals(expected,sphere.getSurfaceArea(),delta);
    }
}
