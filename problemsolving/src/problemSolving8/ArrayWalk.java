package problemSolving8;

import java.util.Scanner;

public class ArrayWalk {

    static long rec(long[] a, int pos, int k, int z, long[][] dp) {
        if (a.length <= pos || k == 0) {
            return 0;
        }
        if (dp[k][z] != -1) {
            return dp[k][z];
        }
        long r1 = rec(a, pos + 1, k - 1, z, dp) + a[pos];
        long r2 = 0;
        if (pos >= 1 && z >= 1) {
            r2 = rec(a, pos - 1, k - 1, z - 1, dp) + a[pos];
        }
        return dp[k][z] = Math.max(r1, r2);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int z = scan.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            long[][] dp = new long[k + 10][z + 10];
            for (int i = 0; i < k + 10; i++) {
                for (int j = 0; j < z + 10; j++) {
                    dp[i][j] = -1;
                }
            }
            long res = a[0] + rec(a, 1, k, z, dp);
            System.out.println(res);
        }
    }
}
