package dp;

import java.util.Scanner;
import java.util.Stack;

public class knapSack {

    static int[][] dp = new int[1010][1010];
    static int[][] st = new int[1010][1010];

    static int solve(int W, int wt[], int val[], int n) {
        if (n == 1) {
            if (W >= wt[n - 1]) {

                return val[0];
            }

            return 0;
        }
        if (dp[W][n] != -1) {
            return dp[W][n];
        }
        int ans2 = -1;
        int ans1 = 0;
        ans1 = solve(W, wt, val, n - 1);

        if (W >= wt[n - 1]) {

            ans2 = solve(W - wt[n - 1], wt, val, n - 1) + val[n - 1];

        }
        if (ans2 >= ans1) {
            st[W][n] = 1;
        }
        return dp[W][n] = Math.max(ans1, ans2);
    }

    static Stack<Integer> s = new Stack<Integer>();

    static void print(int W, int wt[], int val[], int n) {
        if (n == 1) {
            if (W >= wt[n - 1]) {
                s.add(val[0]);
            }
            return;
        }

        if (st[W][n] == 0) {
            print(W, wt, val, n - 1);
        } else {
            s.add(val[n - 1]);
            print(W - wt[n - 1], wt, val, n - 1);

        }
    }

    static int knapSack(int W, int wt[], int val[], int n) {
        for (int i = 0; i <= W; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(W, wt, val, n);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        int res = knapSack(w, b, a, n);
        System.out.println(res);
        System.out.println("\n\n");
        print(w, b, a, n);
        System.out.println(s);
    }
}
