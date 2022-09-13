package ProblemSolving5;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[][] a = new long[n + 1][n + 1];
        long[] res = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        res[1] = (long) Math.sqrt((a[1][2] * a[1][3]) / a[2][3]);
        res[2] = (long) Math.sqrt((a[2][1] * a[2][3]) / a[1][3]);

        for (int i = 3; i <= n; i++) {
            res[i] = (long) Math.sqrt((a[i][i - 2] * a[i][i - 1]) / (a[i - 2][i - 1]));
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();

    }

}
