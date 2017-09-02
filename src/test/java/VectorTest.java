import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VectorTest {
    private final double delta = 0.001;

    @Test
    public void testNorm() {
        Vector v = new Vector(3.0, 4.0, 0.0);
        assertEquals(5.0, v.norm(), delta);
    }

    @Test
    public void testDotOrthogonal() {
        Vector u = new Vector(1.0, 0.0, 0.0);
        Vector v = new Vector(0.0, 1.0, 0.0);

        assertEquals(0.0, u.dot(v), delta);
    }

    @Test
    public void testDotNonOrthogonal() {
        Vector u = new Vector(0.5, 0.0, 0.1);
        Vector v = new Vector(-2.0, 0.1, 2.0);
        // -1 + 0 + 0.2 == -0.8

        assertEquals(-0.8, u.dot(v), delta);
    }

    @Test
    public void testScale() {
        Vector u = new Vector(-2.0, 0.1, 2.0);
        Vector n1 = new Vector(2.0,-0.1, -2.0);
        assertEquals(n1, u.scale(-1.0));
    }
}
