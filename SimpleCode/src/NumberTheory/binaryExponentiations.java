package NumberTheory;

public class binaryExponentiations {

    public static long power(int n, int r, int p) {
        int res = 1;
        while (r != 0) {
            if (r % 2 == 1) {
                res = (res * n);
                --r;
            }
            n = (n * n);
            r /= 2;

        }
        return res;
    }

    public static long pow(int n, int r, int p, int res) {
        if (r == 0) {
            return res;
        }
        if (r % 2 == 1) {
            res = (res * n) % p;
        }
        return pow((n * n) % p, r / 2, p, res);
    }

    public static void main(String args[]) {
        System.out.println(pow(2, 5, 3, 1));
    }

}
