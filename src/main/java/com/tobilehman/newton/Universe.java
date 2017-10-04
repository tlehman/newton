package com.tobilehman.newton;

public class Universe {
    public boolean isBig() { return true; }

    // Since I'm god of this universe, I set Newton's constant to 1
    public static final double G = 1.0;
    public final int N;

    private Body[] bodies;

    public Universe(Body[] bodies) {
        this.bodies = bodies;
        this.N = bodies.length;
    }

    // the step method evolves the universe in time by amount dt seconds
    public void step(double dt) {
        Vector[] forces = new Vector[N];

        // iterate over all pairs of bodies, compute total force on body
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                // bodies cannot gravitate on themselves
                if(i != j) {
                    Body bodyI = bodies[i];
                    Body bodyJ = bodies[j];
                    forces[i] = forces[i].plus(bodyI.forceFrom(bodyJ));
                }
            }
        }

        // update all the positions and velocities using the total force
        for(int i = 0; i < N; i++) {
            Vector a = forces[i].scale(1.0 / bodies[i].mass);
            Vector v = bodies[i].velocity;
            bodies[i].velocity = bodies[i].velocity.plus(a.scale(dt));
            bodies[i].position = bodies[i].position.plus(v.scale(dt));
        }
    }
}
