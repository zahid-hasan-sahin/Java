package dp;

import java.util.Scanner;

public class LongestPalindromicSubsequence {

    static int usingRec(String a, int i, int j) {
        if (i == -1 || j == a.length() || i > j) {
            return 0;
        }
        if (a.charAt(i) == a.charAt(j)) {
            if (i == j) {
                return usingRec(a, i + 1, j - 1) + 1;
            } else {
                return usingRec(a, i + 1, j - 1) + 2;
            }
        } else {
            return Math.max(usingRec(a, i, j - 1), usingRec(a, i + 1, j));
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                a[i][i] = 1;
            }
            for (int i = 0; i < n; i++) {
                int u = i + 1;
                for (int j = 0; u < n; j++, u++) {
                    if (s.charAt(u) == s.charAt(j)) {
                        a[j][u] = a[j + 1][u - 1] + 2;
                    } else {
                        a[j][u] = Math.max(a[j + 1][u], a[j][u - 1]);
                    }
                }
            }

            System.out.println(usingRec(s, 0, n - 1));

        }
    }
}
