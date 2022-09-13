package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestCommonSubsequence {

    static int lcs(String a, String b, int n, int m) {
        int[][] ch = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (b.charAt(i - 1) == a.charAt(j - 1)) {
                    ch[i][j] = ch[i - 1][j - 1] + 1;
                } else {

                    ch[i][j] = Math.max(ch[i - 1][j], ch[i][j - 1]);
                }

            }
        }
        return ch[m][n];

    }

    static void printlcs(int[] a, int[] b, int n, int m) {
        int[][] ch = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (a[i - 1] == b[j - 1]) {
                    ch[i][j] = ch[i - 1][j - 1] + 1;
                } else {
                    ch[i][j] = Math.max(ch[i - 1][j], ch[i][j - 1]);
                }
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        int j = m;
        int i = n;
        while (i != 0 && j != 0) {
            if (ch[i][j] == ch[i - 1][j]) {
                --i;
            } else if (ch[i][j] == ch[i][j - 1]) {
                --j;
            } else {
                res.add(b[j - 1]);
                --i;
                --j;
            }
        }
        for (i = res.size() - 1; i >= 0; i--) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println();

    }
    static int dp[][] = new int[110][110];

    static int rec(int[] a, int[] b, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (a[n - 1] == b[m - 1]) {
            if (dp[n - 1][m - 1] == 0) {
                dp[n - 1][m - 1] = rec(a, b, n - 1, m - 1);
            }
            return 1 + dp[n - 1][m - 1];
        } else {
            if (dp[n - 1][m] == 0) {
                dp[n - 1][m] = rec(a, b, n - 1, m);
            }
            if (dp[n][m - 1] == 0) {
                dp[n][m - 1] = rec(a, b, n, m - 1);
            }
            return Math.max(dp[n - 1][m], dp[n][m - 1]);
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            for (int i = 0; i < 110; i++) {
                for (int j = 0; j < 110; j++) {
                    dp[i][j] = 0;
                }
            }
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            String s = scan.next();
            String k = scan.next();
            for (int i = 0; i < n; i++) {
                a[i] = s.charAt(i);
            }
            for (int i = 0; i < m; i++) {
                b[i] = k.charAt(i);
            }
            System.out.println(rec(a, b, n, m));
        }
        

    }
}
