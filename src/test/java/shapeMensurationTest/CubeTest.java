package shapeMensurationTest;

import all3DShapes.Cube;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CubeTest {
    @Test
    public void itShouldGiveTheVolumeOfCube() {
        Cube cube = new Cube(3);
        double expected = 54;
        double delta = 1;
        assertEquals(expected,cube.getVolume(),delta);
    }

    @Test
    public void itShouldGiveTheSurfaceAreaOfCube() {
        Cube cube = new Cube(3);
        double expected = 27;
        double delta = 1;
        assertEquals(expected,cube.getSurfaceArea(),delta);
    }
}
