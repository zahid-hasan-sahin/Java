package dp;

import java.util.Scanner;

public class LongestCommonSubsequencerec {

    static int[][] dp = new int[110][110];

    static int lcs(int n, int m, String a, String b) {
        for (int i = 0; i < 110; i++) {
            for (int j = 0; j < 110; j++) {
                dp[i][j] = 0;
            }
        }
        return solve(n - 1, m - 1, a, b);
    }

    static int solve(int n, int m, String a, String b) {
        if (n == -1 || m == -1) {
            return 0;
        }
        if (dp[n][m] != 0) {
            return dp[n][m];
        }
        if (a.charAt(n) == b.charAt(m)) {
            return 1 + solve(n - 1, m - 1, a, b);
        }
        return dp[n][m] = Math.max(solve(n - 1, m, a, b), solve(n, m - 1, a, b));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        String a = scan.next();
        String b = scan.next();
        int res = lcs(n, m, a, b);
        System.out.println(res);
    }
}
