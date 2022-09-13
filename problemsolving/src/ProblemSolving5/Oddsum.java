package ProblemSolving5;

import java.util.Scanner;

public class Oddsum {

    static int usingDp(int a[], int n) {
        int[][] dp = new int[n + 1][2];
        if (Math.abs(a[0]) % 2 == 0) {
            dp[0][0] = Math.max(0, a[0]);
            dp[0][1] = -1000000000;
        } else {
            dp[0][0] = 0;
            dp[0][1] = a[0];
        }
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i]) % 2 == 0) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][0] + a[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][1] + a[i]);
            } else {
                dp[i][1] = Math.max(dp[i - 1][1], a[i]);
                dp[i][1] = Math.max(dp[i - 1][0] + a[i], dp[i][1]);
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + a[i]);
            }

        }
        return dp[n - 1][1];
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int z = 0;
        int b = 0;
        int p = 0;
        int m = 0;
        long s = 0;
        int t = 0;
        int u = Integer.MAX_VALUE;
        int k = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();

            if (Math.abs(a[i]) % 2 == 1) {

                if (a[i] > 0) {
                    ++p;
                    t += a[i];
                    u = Math.min(u, a[i]);
                } else {
                    k = Math.max(k, a[i]);
                }
                ++b;
            } else {
                if (a[i] >= 0) {
                    s += a[i];
                }
                ++z;
            }
        }

//        if (t % 2 == 1) {
//            System.out.println(s + t);
//        } else {
//            System.out.println(Math.max(s + t - u, s + t + k));
//        }
        System.out.println(usingDp(a, n));
    }

}
