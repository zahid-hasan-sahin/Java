package ProblemSolving5;

import java.util.Scanner;

public class Equalize {

    static int usingDp(String a, String b, int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int t = 0;
            if (a.charAt(i - 1) != b.charAt(i - 1)) {
                ++t;
            }
            dp[i] += dp[i - 1] + t;
            if (i >= 2 && t!=0 ) {
                if (a.charAt(i - 1) == b.charAt(i - 2) && b.charAt(i - 2) == a.charAt(i - 1)) {
                    dp[i] = Math.min(dp[i], dp[i - 2] + 1);
                }
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String a = scan.next();
        String b = scan.next();
//        int c = 0;
//        for (int i = 0; i < n; i++) {
//            if (a.charAt(i) != b.charAt(i)) {
//                if (i + 1 < n && a.charAt(i + 1) != b.charAt(i + 1) && a.charAt(i) != a.charAt(i + 1)) {
//                    ++i;
//                }
//                ++c;
//            }
//        }
        System.out.println(usingDp(a, b, n));
    }
}
