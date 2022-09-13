package dp;

import java.util.Scanner;

public class MaximumsumRectangle {

    static int kadan(int[] a, int n) {
        int m = Integer.MIN_VALUE;
        int k = 0;
        for (int i = 0; i < n; i++) {
            k += a[i];
            m = Math.max(m, k);
            k = Math.max(k, 0);
        }
        return m;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scan.nextInt();
                }
            }

            long res = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                int[] b = new int[n];
                for (int j = i; j < m; j++) {

                    for (int k = 0; k < n; k++) {
                        b[k] += a[k][j];
                    }
                    res = Math.max(res, kadan(b, n));
                }

            }
            System.out.println(res);

        }
    }

}
