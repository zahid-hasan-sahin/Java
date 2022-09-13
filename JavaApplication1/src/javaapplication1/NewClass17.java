package javaapplication1;

public class NewClass17 {

    public long f(int n) {
        if (n == 1) {
            return 1;
        }
        return n * f(n - 1);
    }

    public static void main(String args[]) {
        NewClass17 ob = new NewClass17();
        System.out.println(ob.f(25));
    }
}
