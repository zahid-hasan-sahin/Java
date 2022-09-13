package Lab5;

public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public void add(Fraction other) {
        int currDen = this.denominator * other.denominator;
        int currNum = ((currDen / this.denominator) * this.numerator)
                + ((currDen / other.denominator) * other.numerator);
        this.numerator = currNum;
        this.denominator = currDen;
    }

    public void sub(Fraction other) {
        int currDen = this.denominator * other.denominator;
        int currNum = ((currDen / this.denominator) * this.numerator)
                - ((currDen / other.denominator) * other.numerator);
        this.numerator = currNum;
        this.denominator = currDen;
    }

    public void mul(Fraction other) {
        int currDen = this.denominator * other.denominator;
        int currNum = this.numerator * other.numerator;
        this.numerator = currNum;
        this.denominator = currDen;
    }

    public void div(Fraction other) {
        int currDen = this.denominator * other.numerator;
        int currNum = this.numerator * other.denominator;
        this.numerator = currNum;
        this.denominator = currDen;
    }
}
