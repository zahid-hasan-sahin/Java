package ProblemSolving5;

import java.util.Scanner;

public class WaysToTileAFloor {

    static long[] dp = new long[75];

    static long make(int n) {
        if (n <= 2) {
            dp[n] = n;
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        } else {
            dp[n] = make(n - 1) + make(n - 2);
            return dp[n];
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 3; i < 75; i++) {
            dp[i] = make(i);
        }
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println(dp[n]);
        }
    }

}
