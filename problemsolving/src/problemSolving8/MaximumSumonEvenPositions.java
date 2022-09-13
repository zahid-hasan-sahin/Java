package problemSolving8;

import java.util.Scanner;

public class MaximumSumonEvenPositions {

    static long rec(long[][][] dp, long[] a, int sz, int n, int cr, int rev) {
        if (sz <= n) {
            return 0;
        }
        if (dp[n][cr][rev] != -1) {
            return dp[n][cr][rev];
        }
        long w = 0;
        long x = 0;
        long y = 0;
        long z = 0;
        if (cr == 0) {
            w = rec(dp, a, sz, n + 1, cr, rev);
            if (n % 2 == 0) {
                w += a[n];
            }
            if (rev == 0) {
                x = rec(dp, a, sz, n + 2, 1, rev);
                if (n + 1 < sz) {
                    if (n % 2 == 0) {
                        x = x + a[n + 1];
                    } else {
                        x = x + a[n];
                    }
                }
            }
        }
        if (cr == 1) {
            y = rec(dp, a, sz, n + 1, 0, 1);
            if (n % 2 == 0) {
                y = y + a[n];
            }

            z = rec(dp, a, sz, n + 2, cr, rev);
            if (n + 1 < sz) {
                if (n % 2 == 0) {
                    z = z + a[n + 1];
                } else {
                    z = z + a[n];
                }
            }

        }
        return dp[n][cr][rev] = Math.max(w, Math.max(x, Math.max(y, z)));

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {

            int n = scan.nextInt();
            long[][][] dp = new long[n + 5][2][2];
            long[] a = new long[n + 10];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n + 5; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        dp[i][j][k] = -1;
                    }
                }
            }
            long res = rec(dp, a, n, 0, 0, 0);
            System.out.println(res);
        }

    }

}
