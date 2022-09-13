package problemSolving8;

import java.util.Scanner;

public class PolycarpandDiv3 {

    static long[][] dp = new long[200005][3];

    static long rec(String s, int n, int sum) {
        if (n == s.length()) {
            return 0;
        }
        if (dp[n][sum] != -1) {
            return dp[n][sum];
        }
        long res = 0;
        if ((sum + s.charAt(n) - '0') % 3 == 0) {

            res = Math.max(rec(s, n + 1, 0) + 1, res);
        }
        res = Math.max(rec(s, n + 1, (sum + s.charAt(n) - '0') % 3), res);
        res = Math.max(rec(s, n + 1, 0), res);

        return dp[n][sum] = res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(rec(s, 0, 0));
    }
}
