public class Circle {
    private final Point center; // center of circle
    private final double radius; // radius of circle

    public Circle(double x, double y, double r) {
        center = new Point(x, y);
        radius = r;
    }

    // area of this circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // is the point p contained inside this circle?
    public boolean contains(Point p) {
        return p.distanceTo(center) <= radius;
    }

    // string representation of this circle
    public String toString() {
        return center + ", " + radius;
    }

    public static void main(String[] args) {
        Point p = new Point(5.0, 5.0);
        Circle c1 = new Circle(2.0, 2.0, 2.0);
        Circle c2 = new Circle(6.0, 2.0, 1.0);
        System.out.println("p = " + p);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("area(c2) = " + c2.area());
        System.out.println("contains(c1, p) = " + c1.contains(p));
    }
}