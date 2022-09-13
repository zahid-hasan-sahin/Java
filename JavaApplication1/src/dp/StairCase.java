package dp;

import java.util.Scanner;

public class StairCase {

    static long[] dp = new long[100005];
    static int m = 1000000007;

    static long makeCases(int n) {

        if (n == 1 || n == 2) {
            dp[n] = n % m;
            return n % m;
        }
        if (dp[n] != 0) {
            return dp[n]%m;
        } else {
            dp[n] = ((makeCases(n - 1) % m) + (makeCases(n - 2) % m) + (makeCases(n - 3) % m)) % m;
            return dp[n]%m;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        dp[0] = 1;
        int t = scan.nextInt();
        for (int i = 4; i < 100005; i++) {
            dp[i] = makeCases(i);
        }

        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println(dp[n]);
        }
    }

}
