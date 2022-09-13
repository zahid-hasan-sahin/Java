package problemSolving8;

import java.util.Scanner;

public class SayNotoPalindromes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        char[] a = scan.next().toCharArray();
        int[][] f = new int[6][n];
        String[] s = {"abc", "acb", "bac", "bca", "cab", "cba"};
        for (int i = 0; i < 6; i++) {
            String in = s[i];
            for (int j = 0; j < n; j++) {
                if (j >= 1) {
                    f[i][j] = f[i][j - 1];
                }
                if (in.charAt(j % 3) != a[j]) {
                    ++f[i][j];
                }
            }
        }

        while (m-- > 0) {
            int l = scan.nextInt() - 1;
            int r = scan.nextInt() - 1;
            int res = 1000000000;
            for (int i = 0; i < 6; i++) {
                int mn = 0;
                if (l >= 1) {
                    mn = f[i][l - 1];
                }
                res = Math.min(f[i][r] - mn, res);
            }
            System.out.println(res);
        }
    }
}
