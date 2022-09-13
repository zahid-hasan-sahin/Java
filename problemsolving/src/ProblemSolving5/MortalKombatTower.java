package ProblemSolving5;

import java.util.Scanner;

public class MortalKombatTower {

    static int dp[] = new int[200010];

    static int rec(int[] a, int l, int n) {
        if (l == n) {
            return a[l];
        }
        if (l > n) {
            return 0;
        }
        if (dp[l + 2] == -1) {
            dp[l + 2] = rec(a, l + 2, n);
        }
        if (dp[l + 1] == -1) {
            dp[l + 1] = rec(a, l + 1, n);
        }
        if (dp[l + 3] == -1) {
            dp[l + 3] = rec(a, l + 3, n);
        }
        return a[l] + Math.min(dp[l + 1], Math.min(dp[l + 2], dp[l + 3]));

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {

            int n = scan.nextInt();
            for (int i = 0; i <= n; i++) {
                dp[i] = -1;
            }
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            if (n == 1) {
                System.out.println(a[0]);
                continue;
            }
            System.out.println(rec(a, 0, n - 1));

        }
    }

}
