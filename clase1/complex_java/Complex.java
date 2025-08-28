package complex_java;

//-----------------------------------------------------------------------
// Complex.java
//-----------------------------------------------------------------------

public class Complex {
    private double re;
    private double im;

    // Construct Complex with real part re and imaginary part im.
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // Default constructor (0.0 + 0.0i)
    public Complex() {
        this(0.0, 0.0);
    }

    // Return the real part.
    public double re() {
        return re;
    }

    // Return the imaginary part.
    public double im() {
        return im;
    }

    // Return the conjugate.
    public Complex conjugate() {
        return new Complex(re, -im);
    }

    // Return the sum of this and other.
    public Complex add(Complex other) {
        return new Complex(this.re + other.re, this.im + other.im);
    }

    // Return the product of this and other.
    public Complex multiply(Complex other) {
        double real = this.re * other.re - this.im * other.im;
        double imag = this.re * other.im + this.im * other.re;
        return new Complex(real, imag);
    }

    // Return true if this and other are equal.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Complex)) return false;
        Complex other = (Complex) obj;
        return Double.compare(re, other.re) == 0 &&
               Double.compare(im, other.im) == 0;
    }

    // Return the absolute value.
    public double abs() {
        return Math.sqrt(re * re + im * im);
        // Alternative: return Math.hypot(re, im);
    }

    // Return a string representation.
    @Override
    public String toString() {
        return re + " + " + im + "i";
    }
}


