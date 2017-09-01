import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {
    @Test
    public void TestAdditionAndEquals() {
        Point a = new Point(0.0, 0.1, 0.0);
        Point b = new Point(0.1, 0.0, 0.0);
        Point c = new Point(0.1, 0.1, 0.0);

        assertEquals(a.plus(b), c);
    }
}
