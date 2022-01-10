public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * method that calculates the length of a vector
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * dot product method
     */
    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /**
     * a method that computes the cross product with a different vector
     */
    public Vector crossProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    /**
     * a method that calculates the angle between vectors (or cosine of an angle)
     */
    public double cos(Vector vector) {
        return scalarProduct(vector) / (length() * vector.length());
    }

    /**
     * methods for sum
     */
    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }

    /**
     * subtraction method
     */
    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }

    /**
     * static method that takes an integer N and returns an array of random vectors of size N
     */
    public static Vector[] generate(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
