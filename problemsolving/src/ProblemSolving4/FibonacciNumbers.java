package ProblemSolving4;

import java.util.Scanner;

public class FibonacciNumbers {

    static long mod = 99991;

    public static void mul(long[][] m, long[][] n) {
        int d = 2;
        long[][] res = new long[d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                res[i][j] = 0;
                for (int k = 0; k < d; k++) {
                    res[i][j] = ((res[i][j] % mod) + (((m[i][k] % mod) * (n[k][j] % mod)) % mod) % mod) % mod;
                }
            }
        }
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                m[i][j] = res[i][j];
            }
        }

    }

    public static void expon(long[][] m, long n) {
        int d = 2;
        long[][] res = new long[d][d];;
        for (int i = 0; i < d; i++) {
            res[i][i] = 1;
        }
        while (n != 0) {
            if (n % 2 == 1) {
                mul(res, m);
                --n;
            }
            mul(m, m);
            n = n / 2;

        }

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                m[i][j] = res[i][j];
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        long r = scan.nextLong();
        long[][] m = new long[2][2];
        m[0][0] = 0;
        m[0][1] = m[1][0] = m[1][1] = 1;
        expon(m, l + 1);
        long x = m[0][1];
        m[0][0] = 0;
        m[0][1] = m[1][0] = m[1][1] = 1;
        expon(m, r + 2);
        long y = m[0][1];
        System.out.println(y - x);

    }
}
