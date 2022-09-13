package ProblemSolving5;

import java.util.Scanner;

public class Bishwock {

    static int[] dp = new int[110];

    static boolean isThree(char a, char b, char c, char d, char e, char f) {
        int u = 0;
        if (a == '0') {
            ++u;
        }
        if (b == '0') {
            ++u;
        }
        if (c == '0') {
            ++u;
        }
        if (d == '0') {
            ++u;
        }
        if (e == '0') {
            ++u;
        }
        if (f == '0') {
            ++u;
        }
        if (u >= 6) {
            return true;
        }

        return false;
    }

    static boolean isTwo(char a, char b, char c, char d) {
        int u = 0;
        if (a == '0') {
            ++u;
        }
        if (b == '0') {
            ++u;
        }
        if (c == '0') {
            ++u;
        }
        if (d == '0') {
            ++u;
        }
        if (u >= 3) {
            return true;
        }
        return false;
    }

    static int usingDp(String a, String b, int n) {
        for (int i = 1; i < n; i++) {
            if (isTwo(a.charAt(i), b.charAt(i), a.charAt(i - 1), b.charAt(i - 1))) {
                dp[i] = Math.max(dp[i], i != 1 ? dp[i - 2] + 1 : 1);
            }
            if (i > 1 && isThree(a.charAt(i), b.charAt(i), a.charAt(i - 1), b.charAt(i - 1), a.charAt(i - 2), b.charAt(i - 2))) {
                dp[i] = Math.max(dp[i], i > 2 ? dp[i - 3] + 2 : 2);
            }
            dp[i] = Math.max(dp[i], dp[i - 1]);
        }
        return dp[n - 1];
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int n = a.length();
        int r = 0;
        int u = 0;
        for (int i = 0; i < n; i++) {
            boolean k = false;
            boolean w = false;
            u = 0;
            if (a.charAt(i) == '0') {
                ++u;
            }
            if (b.charAt(i) == '0') {
                ++u;
            }
            if (i + 1 < n && a.charAt(i + 1) == '0') {
                ++u;
            }

            if (i + 1 < n && b.charAt(i + 1) == '0') {
                ++u;
            }
            if (u >= 3) {
                k = true;
            }
            if (u == 4) {
                w = true;
            }
            if (i + 2 < n && b.charAt(i + 2) == '0') {
                ++u;
            }
            if (i + 2 < n && a.charAt(i + 2) == '0') {
                ++u;
            }
            if (u >= 6) {
                r += 2;
                i += 2;
            } else if (w) {
                r += 1;
                ++i;
            } else if (k) {
                ++i;
                ++r;
            }
        }
        System.out.println(usingDp(a, b, n));
    }
}
