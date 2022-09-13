package dp;

import java.util.Scanner;

public class Maximumprofitbybuyingandsellingashareatmostktimes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[][] mt = new int[k + 1][n + 1];
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i <= k; i++) {
                mt[i][0] = 0;
            }
            for (int i = 0; i < n; i++) {
                mt[0][i] = 0;
            }
            for (int i = 1; i <= k; i++) {
                int mx = -a[0];
                for (int j = 1; j < n; j++) {
                    mt[i][j] = Math.max(mt[i][j - 1], a[j] + mx);
                    mx = Math.max(mx, mt[i - 1][j] - a[j]);
                }
            }

            System.out.println(mt[k][n - 1]);
        }
    }
}
