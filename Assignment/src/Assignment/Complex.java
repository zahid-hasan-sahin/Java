package Assignment;

class Complex {

    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex(int real) {
        this.real = real;
    }

    Complex add(Complex c) {
        int newReal = this.real + c.real;
        int newImaginary = this.imaginary + c.imaginary;
        return new Complex(newReal, newImaginary);
    }

}
