package ProblemSolving5;

import java.util.Scanner;

public class Threedisplays {

    static int usingdp(int[] a, int[] b, int n) {
        int[][] dp = new int[n + 1][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = 2000000010;
            }
        }
        for (int i = 0; i < n; i++) {
            dp[i][1] = b[i];
        }
        for (int i = 2; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    if (a[j] > a[k]) {
                        dp[k][i] = Math.min(dp[k][i], dp[j][i - 1] + b[k]);
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, dp[i][3]);

        }
        if (ans == 2000000010) {
            return -1;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }

        long r = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            long u = Integer.MAX_VALUE;
            long k = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    u = Math.min(u, b[j]);
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    k = Math.min(k, b[j]);
                }
            }
            r = Math.min(r, k + u + b[i]);
        }

        if (r == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(r);
        }
        System.out.println(usingdp(a, b, n));
    }

}
