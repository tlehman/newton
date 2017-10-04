package com.tobilehman.newton;

// com.tobilehman.newton.Point in 3D Euclidean space
public class Point {
    protected double x;
    protected double y;
    protected double z;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point plus(Point o) { return new Point(x + o.x, y + o.y, z + o.z); }
    public Vector minus(Point o) { return new Vector(x - o.x, y - o.y, z - o.z); }

    public boolean equals(Object o) {
        return this.x == x && this.y == y && this.z == z;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += x;
        hash += y;
        hash += z;
        return hash;
    }

    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x,y,z);
    }
}
