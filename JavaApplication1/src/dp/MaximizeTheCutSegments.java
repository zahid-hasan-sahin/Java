package dp;

import java.util.Scanner;

public class MaximizeTheCutSegments {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = scan.nextInt();
            }
            int[][] r = new int[4][n + 1];
            for (int i = 0; i <= n; i++) {
                r[0][i] = 0;
            }
            for (int i = 1; i < 4; i++) {
                for (int j = 0; j <= n; j++) {
                    if (a[i - 1] > j) {
                        r[i][j] = r[i - 1][j];
                    } else if (a[i - 1] == j) {
                        r[i][j] = Math.max(r[i - 1][j], 1);
                    } else {
                        r[i][j] = Math.max(r[i - 1][j], r[i][j - a[i - 1]] == 0 ? 0 : r[i][j - a[i - 1]] + 1);
                    }
                }
            }
            System.out.println(r[3][n]);

        }
    }

}
