public class Point {
    // Atributos
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        double d = Math.sqrt(dx*dx + dy*dy);
        return d;
    }

    public double distanceTo(Point P) {
        return Math.sqrt((this.x - P.x)*(this.x - P.x) +
                (this.y - P.y)*(this.y - P.y));
    }

    public double distanceToOrigin(){
        return distanceTo(0,0);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}