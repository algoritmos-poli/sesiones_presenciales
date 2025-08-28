package complex_java;

public class TestComplex {
    // For testing.
    public static void main(String[] args) {
        Complex z0 = new Complex(1.0, 1.0);
        Complex z = z0;
        z = z.multiply(z).add(z0);
        z = z.multiply(z).add(z0);
        System.out.println(z);
    }
}
