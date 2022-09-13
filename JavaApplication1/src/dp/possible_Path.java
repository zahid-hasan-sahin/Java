package dp;

import java.util.Scanner;

public class possible_Path {

    static long dp[][] = new long[110][110];
    static long mod = 1000000007;

    long numberOfPaths(int m, int n) {
        for (int i = 0; i < 1010; i++) {
            for (int j = 0; j < 1010; j++) {
                dp[i][j] = 0;
            }
        }
        return solve(m, n);
    }

    static long solve(int m, int n) {
        if (n == 1 || m == 1) {
            return 1;
        }
        if (dp[m][n] != 0) {
            return dp[m][n] % mod;
        }
        return dp[m][n] = ((solve(m - 1, n) % mod) + (solve(m, n - 1) % mod)) % mod;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(solve(n, m));
    }

}
