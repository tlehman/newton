public class Body {
    public final double mass;

    // Since this class will be used in the context of a simulated
    // Universe with many bodies, the state will be updated from
    // the outside. I'm okay with this, I trust the Universe class.
    public Point position;
    public Vector velocity;

    public Body(double mass, Point initPos, Vector initVel) {
        this.mass = mass;
        this.position = initPos;
        this.velocity = initVel;
    }

    public Vector forceFrom(Body b) {
        Vector r12 = position.minus(b.position);
        Vector rhat = r12.scale(1/r12.norm());
        double c = (Universe.G * mass * b.mass) /
                (r12.norm() * r12.norm());
        return rhat.scale(c);
    }
}
