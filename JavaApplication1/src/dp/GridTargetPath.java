package dp;

import java.util.Scanner;

public class GridTargetPath {

    static void method1(int[][] a, int n, int m) {
        int[][] b = new int[n][m];
        for (int i = 0; i < m; i++) {
            b[0][i] = a[0][i];

        }
        for (int i = 1; i < n; i++) {
            b[i][0] = a[i][0] + b[i - 1][0];
        }
        for (int i = 1; i < m; i++) {
            b[0][i] = a[0][i] + b[0][i - 1];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                int p = Math.min(b[i - 1][j], b[i][j - 1]);

                b[i][j] = a[i][j] + p;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void method2(int[][] a, int n, int m) {
        int[][] b = new int[n + 1][m + 1];
        for (int i = 0; i < m + 1; i++) {
            b[n][i] = Integer.MAX_VALUE;

        }
        for (int i = 0; i < n + 1; i++) {
            b[i][m] = Integer.MAX_VALUE;
        }
        b[n][m - 1] = 0;
        b[n - 1][m] = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int k = Math.min(b[i + 1][j], b[i][j + 1]);
                b[i][j] = a[i][j] + k;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        method2(a, n, m);

    }

}
