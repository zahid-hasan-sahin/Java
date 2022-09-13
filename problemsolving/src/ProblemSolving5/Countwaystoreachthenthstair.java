package ProblemSolving5;

import java.util.Scanner;

public class Countwaystoreachthenthstair {

    static long[] dp = new long[100005];
    static int mod = 1000000007;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < 100005; i++) {
            dp[i] = ((dp[i - 1] % mod) + (dp[i - 2] % mod) + (dp[i - 3] % mod)) % mod;
        }
        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println(dp[n]);
        }
    }

}
