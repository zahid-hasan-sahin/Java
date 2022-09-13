package dp;

import java.util.Scanner;

public class EasyTiling {

    static int mod = 1000000007;

    static void mul(long[][] a, long b[][]) {
        long[][] m = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    m[i][j] = ((m[i][j] % mod) + ((a[i][k] % mod) * (b[k][j] % mod)) % mod) % mod;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = m[i][j] % mod;
            }
        }

    }

    static void cal(long a[][], long n) {
        long[][] res = new long[2][2];
        for (int i = 0; i < 2; i++) {
            res[i][i] = 1;
        }
        while (n != 0) {
            if (n % 2 == 1) {
                mul(res, a);
                --n;
            }
            mul(a, a);
            n /= 2;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = res[i][j] % mod;
            }
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            long[][] mt = new long[2][2];
            mt[0][0] = 0;
            mt[0][1] = 1;
            mt[1][1] = 1;
            mt[1][0] = 1;
            cal(mt, n);
            System.out.println(mt[1][1]);
        }
    }

}
