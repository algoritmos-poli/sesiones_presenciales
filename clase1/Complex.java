public class Complex {
    private final double re;
    private final double im;

    // creates a new complex object
    public Complex(double real, double imag) {
        re = real;
        im = imag;
    }

    // sum of two complex numbers
    public Complex plus(Complex b) {
        double real = re + b.re;
        double imag = im + b.im;
        return new Complex(real, imag);
    }

    // product of two complex numbers
    public Complex times(Complex b) {
        double real = re * b.re - im * b.im;
        double imag = re * b.im + im * b.re;
        return new Complex(real, imag);
    }

    // magnitude
    public double abs() {
        return Math.sqrt(re * re + im * im);
    }

    // string representation
    public String toString() {
        return re + " + " + im + "i";
    }

    // test client
    public static void main(String[] args) {
        Complex a = new Complex(3.0, 4.0);
        Complex b = new Complex(-2.0, 3.0);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + a.plus(b));
        System.out.println("a * b = " + a.times(b));
        System.out.println("|a| = " + a.abs());
    }
}