import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BodyTest {
    private double delta = 10E-12;
    private double m1 = 2.0;
    private double m2 = 83.6;
    private Point pos1 = new Point(0.0, 0.0, 0.0);
    private Point pos2 = new Point(3.0, 4.0, 0.0);

    // they start out motionless
    private Vector vel1 = new Vector(0.0, 0.0, 0.0);
    private Vector vel2 = new Vector(0.0, 0.0, 0.0);

    @Test
    public void testGravitationalForceFromOtherBody() {
        Body body1 = new Body(m1, pos1, vel1);
        Body body2 = new Body(m2, pos2, vel2);
        Vector r12 = body2.position.minus(body1.position);

        // unit vector pointing from body2 to body1
        Vector rhat = r12.scale(1/r12.norm());

        // expected force on body1 from body2
        // Newton's law is F12 = (G m1m2 / r^2)rhat
        double c = (Universe.G * m1 * m2) / (r12.norm() * r12.norm());
        Vector force12 = rhat.scale(c);

        assertEquals(force12, body1.forceFrom(body2));
        assertEquals(6.688, force12.norm(), delta);
    }
}
