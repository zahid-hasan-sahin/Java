package problemSolving6;

import java.util.Scanner;

public class LongJumps {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n + 1];
            long[] dp = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
            }
            long res = 0;
            for (int i = n; i >= 1; i--) {
                if (a[i] + i > n) {
                    dp[i] = a[i];
                } else {
                    dp[i] = dp[i + a[i]] + a[i];
                }
                res = Math.max(res, dp[i]);
            }
            System.out.println(res);

        }
    }
}
