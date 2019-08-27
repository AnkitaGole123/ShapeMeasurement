package shapeMensurationTest;

import All3DShapes.Cube;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CubeTest {
    @Test
    public void itShouldGiveTheVolumeOfCylinder() {
        Cube cube = new Cube(3);
        double expected = 54;
        double delta = 1;
        assertEquals(expected,cube.getVolume(),delta);
    }
}
