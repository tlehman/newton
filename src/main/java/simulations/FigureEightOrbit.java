package simulations;

import com.tobilehman.newton.*;

public class FigureEightOrbit {
    public static void main(String args[]) {
        double m = 1.0;
        double dt = 0.001;

        Vector b1_pos = new Vector(0.97000436, -0.24308753, 0);
        Vector b2_pos = b1_pos.scale(-1.0);
        Vector b3_pos = new Vector(0, 0, 0);

        Vector b3_vel = new Vector(-0.93240737, -0.86473146, 0); // # x3' = -2x1' and x1' = x2'
        Vector b2_vel = b3_vel.scale(-0.5);
        Vector b1_vel = b3_vel.scale(-0.5);

        Body b1 = new Body(m, b1_pos, b1_vel);
        Body b2 = new Body(m, b2_pos, b2_vel);
        Body b3 = new Body(m, b3_pos, b3_vel);

        Universe universe = new Universe(new Body[]{b1, b2, b3});

    }
}
