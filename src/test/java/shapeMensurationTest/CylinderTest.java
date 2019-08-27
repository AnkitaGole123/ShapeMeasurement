package shapeMensurationTest;

import All3DShapes.Cylinder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CylinderTest {
    @Test
    public void itShouldGiveTheVolumeOfCylinder() {
        Cylinder cylinder = new Cylinder(3,8);
        double expected = 226;
        double delta = 1;
        assertEquals(expected,cylinder.getVolume(),delta);
    }
}
