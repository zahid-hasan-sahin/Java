package dp;

import java.util.Scanner;

public class WildcardPatternMatching {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String p = scan.next();
        String s = scan.next();
        int n = s.length();
        int m = p.length();
        boolean[][] a = new boolean[n + 1][m + 1];
        a[0][0] = true;
        for (int i = 1; i <= m; i++) {
            if (p.charAt(i - 1) == '*') {
                a[0][i] = a[0][i - 1];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    a[i][j] = a[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    a[i][j] = a[i - 1][j - 1] || a[i - 1][j] || a[i][j - 1];
                }

            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        if (a[n][m]) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

}
