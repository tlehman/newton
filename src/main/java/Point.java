// Point in 3D Euclidean space
public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point plus(Point o) {
        return new Point(x + o.x, y + o.y, z + o.z);
    }

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
