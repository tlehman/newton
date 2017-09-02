import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class UniverseTest {
    @Test
    public void testBig() {
        Body[] bodies = new Body[10];
        Universe universe = new Universe(bodies);
        assertTrue(universe.isBig());
    }
}
