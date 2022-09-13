package dp;

import java.util.Scanner;

public class MatrixChainMultiplication {

    static int[][] dp = new int[110][110];

    static int countMin(int[][] a, int i, int n) {
        if (i >= n) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int j = i; j < n; j++) {
            if (dp[i][j] == 0) {
                dp[i][j] = countMin(a, i, j);
            }
            if (dp[j + 1][n] == 0) {
                dp[j + 1][n] = countMin(a, j + 1, n);
            }
            count = dp[i][j] + dp[j + 1][n] + a[0][i] * a[1][j] * a[1][n];
            if (count < min) {
                min = count;
            }
        }
        return min;
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
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[][] m = new int[2][n - 1];
            for (int i = 0; i < n - 1; i++) {
                m[0][i] = a[i];
                m[1][i] = a[i + 1];
            }

            System.out.println(countMin(m, 0, n - 2));
        }
    }

}
