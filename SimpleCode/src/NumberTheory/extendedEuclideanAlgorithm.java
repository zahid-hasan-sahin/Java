package NumberTheory;

public class extendedEuclideanAlgorithm {

    static int eEA(int a, int b, int x, int y) {
        if (a == 0) {
            x = 0;
            y = 1;
            return b;
        }
        int x1 = 1, y1 = 1;
        int n = eEA(b % a, a, x1, y1);
        x = y1 - (b / a) * x1;
        y = x1;
        return n;

    }

    static int modInv(int a, int b) {
        int m = b;
        int x = 1, y = 0;
        while (a > 1) {
            int k = a / b;
            int t = b;
            b = a % b;
            a = t;
            t = y;
            y = x - k * y;
            x = t;
        }
        if (x < 0) {
            x += m;
        }
        return x;
    }

    public static void main(String args[]) {
        int a = 3;
        int b = 11;
        System.out.println(modInv(a, b));
    }

}
