package ProblemSolving7;

import java.util.Scanner;

public class ConstanzesMachine {

    static boolean b[] = new boolean[100010];
    static long[] dp = new long[100010];
    static int mod = 1000000007;

    static long rec(String s, int i) {
        if (s.length() == i) {
            return 1;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        long ans = 0;
        if (s.charAt(i - 1) == 'u' && s.charAt(i) == 'u') {
            if (i - 2 == -1) {
                return 2;
            } else {
                ans += rec(s, i - 1) + rec(s, i - 2);
            }
        } else if (s.charAt(i - 1) == 'n' && s.charAt(i) == 'n') {
            if (i - 2 == -1) {
                return 2;
            } else {
                ans += rec(s, i - 1) + rec(s, i - 2);
            }
        }
        ans += rec(s, i + 1);
        return dp[i] = ans % mod;

    }

    public static void main(String args[]) {
        for (int i = 0; i < 100010; i++) {
            dp[i] = -1;
        }
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'm') {
                b = true;
            }
            if (s.charAt(i) == 'w') {
                b = true;
            }
        }
        if (b) {
            System.out.println("0");
            return;
        }
        long res = rec(s, 1);
        System.out.println(Math.max(res, 1));
    }

}
