package test;

public class Multiplication {

    long mul(int a, int b, int c) {
        return a * b * c;
    }

    double mul(int a, int b, double c) {
        return a * b * c;
    }

    double mul(int a, double b, double c) {
        return a * b * c;
    }

    double mul(double a, int b, double c) {
        return a * b * c;
    }

    double mul(double a, double b, double c) {
        return a * b * c;
    }

    double mul(double a, double b, int c) {
        return a * b * c;
    }

    public static void main(String args[]) {
        Multiplication ob = new Multiplication();
        ob.mul(6, 7, 8);
        ob.mul(6, 7, 8.6);
        ob.mul(6, 7.4, 8.5);
        ob.mul(6.3, 7, 8.4);
        ob.mul(6.2, 7.2, 8.1);
        ob.mul(6.2, 7.4, 8);
        

    }

}
