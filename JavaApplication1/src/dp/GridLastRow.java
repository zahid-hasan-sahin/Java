package dp;

import java.util.Scanner;

public class GridLastRow {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[][] a = new int[n + 1][n + 2];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    a[i][j] = scan.nextInt();
                }
            }
            int[][] res = new int[n + 1][n + 2];
            for (int i = 0; i <= n; i++) {
                res[i][n + 1] = -1;
            }
            for (int i = 0; i <= n; i++) {
                res[i][0] = -1;
            }

            for (int i = 1; i <= n; i++) {
                res[n][i] = a[n][i];
            }
            for (int i = n - 1; i > 0; i--) {
                for (int j = 1; j <= n; j++) {
                    int p = Math.max(res[i + 1][j - 1], Math.max(res[i + 1][j + 1], res[i + 1][j]));
                    res[i][j] = a[i][j] + p;
                }
            }
            int mx = 0;
           
            for (int i = 1; i <= n; i++) {
                mx = Math.max(mx, res[1][i]);
            }
            System.out.println(mx);

        }

    }

}
