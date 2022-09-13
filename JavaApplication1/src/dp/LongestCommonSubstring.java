package dp;

import java.util.Scanner;

public class LongestCommonSubstring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            String a = scan.next();
            String b = scan.next();
            int[][] r = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        r[i][j] = r[i - 1][j - 1] + 1;

                    }
                }
            }
            int res = 0;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    res = Math.max(res, r[i][j]);
                }

            }

            System.out.println(res);
        }
    }

}
