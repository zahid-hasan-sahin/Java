package problemSolving8;

import java.util.Scanner;

public class PuttingPlates {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                        boolean b = false;
                        if (i - 1 >= 0 && a[i - 1][j] == 1) {
                            b = true;
                        }

                        if (j - 1 >= 0 && a[i][j - 1] == 1) {
                            b = true;
                        }
                        if (i + 1 < n && a[i + 1][j] == 1) {
                            b = true;
                        }
                        if (j + 1 < m && a[i][j + 1] == 1) {
                            b = true;
                        }
                        if (i - 1 >= 0 && j - 1 >= 0 && a[i - 1][j - 1] == 1) {
                            b = true;
                        }
                        if (i - 1 >= 0 && j + 1 < m && a[i - 1][j + 1] == 1) {
                            b = true;
                        }
                        if (i + 1 < n && j - 1 >= 0 && a[i + 1][j - 1] == 1) {
                            b = true;
                        }
                        if (i + 1 < n && j + 1 < m && a[i + 1][j + 1] == 1) {
                            b = true;
                        }
                        if (!b) {
                            a[i][j] = 1;
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
