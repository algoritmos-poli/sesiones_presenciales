public class Ejemplo1 {

    public static void main(String[] args) {
        double[] a = { 0.5, 0.25, -1.0, 0.125, 0.5 };
        double[] b = new double[a.length];
        // double[] b = { 0.5, 0.25, -1.0, 0.125, 0.5 };
        a = b;

        System.out.println(a == b);
    }
}
