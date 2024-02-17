package Model;

public class ComplexNumber {
    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        if (imaginaryPart >= 0) { return "(" + realPart + " + " + imaginaryPart + "i)"; }
        else { return "(" + realPart + " - " + -1 * imaginaryPart + "i)";}
    }
}
