package dp;

import java.util.Scanner;

public class numberofwaystogettotalN {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[][] m = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            m[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < a[i - 1]; j++) {
                m[i][j] = m[i - 1][j];
            }
            for (int j = a[i - 1]; j < k + 1; j++) {
                m[i][j] = m[i - 1][j] + m[i][j - a[i - 1]];
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }

}
