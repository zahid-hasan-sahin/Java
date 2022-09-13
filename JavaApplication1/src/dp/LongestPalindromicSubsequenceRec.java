package dp;

import java.util.Scanner;

public class LongestPalindromicSubsequenceRec {

    static int[][] dp = new int[1001][1001];

    static int cal(String s, int l, int r) {

        if (l == r) {
            return 1;
        }
        if (l > r) {
            return 0;
        }
        if (dp[l][r] != -1) {
            return dp[l][r];
        }
        int a = 0, b = 0, c = 0;
        if (s.charAt(l) == s.charAt(r)) {
            a = 2 + cal(s, l + 1, r - 1);
        }
        b = cal(s, l + 1, r);
        c = cal(s, l, r - 1);

        return dp[l][r] = Math.max(a, Math.max(b, c));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int l = 0;
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                dp[i][j] = -1;
            }
        }
        int r = s.length() - 1;
        int res = cal(s, l, r);
        System.out.println(res);
    }
}
