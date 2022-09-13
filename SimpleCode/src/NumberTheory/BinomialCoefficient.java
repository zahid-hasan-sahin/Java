package NumberTheory;

import java.util.Scanner;

public class BinomialCoefficient {

    static int[] fact = new int[1000010];
    static int p = 1000000009;

    public static long bn(long a, int b) {
        long res = 1;
        long k = a;
        while (b != 0) {
            if (b % 2 == 1) {
                res = (res * k) % p;
                --b;
            }
            k = (k * k) % p;
            b = b / 2;
        }
        return res;
    }

    public static long binomialCoefficient(int n, int k) {
        if (k > n) {
            return 0;
        }
        long res = fact[n];
        long u = ((long) (fact[k]) * (fact[n - k])) % p;
        long e = bn(u, p - 2);
        res = (res * e) % p;
        return res;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        fact[0] = 1;
        fact[0] = 1;
        for (int i = 1; i < 1000010; i++) {
            fact[i] = (int) (((long) fact[i - 1] * i) % p);
        }
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            long res = binomialCoefficient(n, k);
            System.out.println(res);
        }

    }

}
