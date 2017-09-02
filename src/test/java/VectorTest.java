import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VectorTest {
    private final double delta = 0.001;

    @Test
    public void testNorm() {
        Vector v = new Vector(3.0, 4.0, 0.0);
        assertEquals(5.0, v.norm(), delta);
    }
}
