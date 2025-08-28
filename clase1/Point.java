public class Point {
    private final double x;   // Cartesian
    private final double y;   // coordinates

    // creates and initializes a point with given (x, y)
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // return the Euclidean distance between the two points
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // return string representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // test client
    public static void main(String[] args) {
        Point p = new Point(4.0, 4.0);
        Point q = new Point(8.0, 1.0);
        System.out.println("p  = " + p);        
        System.out.println("q  = " + q);
        System.out.println("dist(p, q) = " + p.distanceTo(q));
    }
}