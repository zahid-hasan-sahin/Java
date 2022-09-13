package problemSolving8;

import java.util.Scanner;

public class RemovetheSubstring {

    static int lcs(String S1, String S2, int m, int n) {
        int[][] LCS_table = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    LCS_table[i][j] = 0;
                } else if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                    LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
                } else {
                    LCS_table[i][j] = Math.max(LCS_table[i - 1][j], LCS_table[i][j - 1]);
                }
            }
        }
        return LCS_table[m][n];
    }

    static boolean isPos(String s, String t, int mid) {
        int n = s.length();
        for (int i = 0; i <= n - mid; i++) {
            String make = s.substring(0, i) + s.substring(i + mid, n);
            if (lcs(make, t, make.length(), t.length()) == t.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String t = scan.next();

        int n = s.length();

        int l = 0;
        int r = n;
        int res = 0;
       
        while (l <= r) {
            int mid = (l + r) / 2;
        
            if (isPos(s, t, mid)) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(res);
    }
}
