package ProblemSolving5;

import java.util.Scanner;

public class ZeroRemainderSum {

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
        int[][][][] dp = new int[n][m][m / 2 + 1][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < m / 2 - 1; l++) {
                    for (int o = 0; o < k; o++) {
                        dp[i][j][l][o] = dp[i][j][l][a[i][j]%k];
                    }
                }
            }
        }

    }
}
