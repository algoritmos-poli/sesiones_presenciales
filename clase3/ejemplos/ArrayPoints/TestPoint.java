public class TestPoint {

    public static void main(String[] args) {
        Point P;
        P = new Point();
        Point Q = new Point(2,8);
        Point R = new Point(-2,4);
        System.out.println("P" + P);
        System.out.println("Q" + Q);
        System.out.println("R" + R);
        double d_PQ = P.distanceTo(Q);
        double d_QR = Q.distanceTo(R.getX(), R.getY());
        double d_PR = R.distanceToOrigin();
        System.out.println("Distancia PQ: " + d_PQ);
        System.out.println("Distancia QR: " + d_QR);
        System.out.println("Distancia de R al origen: " + d_PR);
    }
}
