package problemSolving8;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += a[i][i];
        }
        int k = n - 1;
        for (int i = 0; i < n; i++) {
            sum2 += a[i][k];
            --k;
        }
        int diff = sum1 - sum2;
        System.out.println(Math.abs(diff));
    }
}
