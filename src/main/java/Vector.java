// Vector in 3D Euclidean space. A vector is the difference between
// two points, so
//
//    Point a, b;
//    Vector v = a - b;
public class Vector extends Point {

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double norm() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public Vector plus(Vector v) {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }

    public double dot(Vector v) {
        return x*v.x + y*v.y + z*v.z;
    }

    public Vector scale(double c) {
        return new Vector(c*x, c*y,c*z);
    }
}
