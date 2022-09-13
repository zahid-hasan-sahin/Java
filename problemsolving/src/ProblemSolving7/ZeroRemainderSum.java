package ProblemSolving7;

import java.util.Scanner;

public class ZeroRemainderSum {

    static int[][][][] dp = new int[71][71][36][71];
    static boolean[][][][] vis = new boolean[71][71][36][71];

    static int rec(int[][] a, int n, int m, int i, int j, int p, int r, int k, int t) {
        if (i == n) {
            if (r == 0) {
                return 0;
            }
            return -10000000;
        }
        int x = -10000000;
        int y = -10000000;
        if (vis[i][j][p][r]) {
            return dp[i][j][p][r];
        }
        if (j == m - 1) {
            if (p < t) {
                x = a[i][j] + rec(a, n, m, i + 1, 0, 0, (a[i][j] + r) % k, k, t);
            }
            y = rec(a, n, m, i + 1, 0, 0, r, k, t);
        } else {
            if (p < t) {
                x = a[i][j] + rec(a, n, m, i, j + 1, p + 1, (a[i][j] + r) % k, k, t);
            }
            y = rec(a, n, m, i, j + 1, p, r, k, t);
        }
        vis[i][j][p][r] = true;
        return dp[i][j][p][r] = Math.max(x, y);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int res = rec(a, n, m, 0, 0, 0, 0, k, m / 2);
        System.out.println(res);

    }

}
