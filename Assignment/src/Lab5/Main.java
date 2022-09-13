package Lab5;

public class Main {

    public static void main(String[] args) {
        Fraction a = new Fraction(1, 4);
        Fraction b = new Fraction(3, 5);
        a.add(b);
        System.out.println("add: " + a.toString());
        a.sub(b);
        System.out.println("sub: " + a.toString());
        a.mul(b);
        System.out.println("mul: " + a.toString());
        a.div(b);
        System.out.println("div: " + a.toString());
    }
}
