package dp;

import java.util.Scanner;

public class optimnalBinaryTree {

    static int[][] dp = new int[110][110];

    static int rec(int[] a, int i, int j) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return a[i];
        }
        int s = 0;
        for (int k = i; k <= j; k++) {
            s += a[k];
        }
        int m = Integer.MAX_VALUE;
        for (int k = i; k <= j; k++) {
            int u = 0;
            if (k - 1 != -1) {
                if (dp[i][k - 1] == 0) {
                    u = dp[i][k - 1] = rec(a, i, k - 1);
                } else {
                    u = dp[i][k - 1];
                }

            }
            int y = 0;
            if (dp[k + 1][j] == 0) {
                y = dp[k + 1][j] = rec(a, k + 1, j);
            } else {
                y = dp[k + 1][j];
            }

            int p = u + y;
            if (m > p) {
                m = p;
            }
        }
        return m + s;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            for (int i = 0; i < 110; i++) {
                for (int j = 0; j < 110; j++) {
                    dp[i][j] = 0;
                }
            }
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            System.out.println(rec(a, 0, n - 1));
        }
    }

}
