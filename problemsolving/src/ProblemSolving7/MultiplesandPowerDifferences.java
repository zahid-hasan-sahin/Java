package ProblemSolving7;

import java.util.Scanner;

public class MultiplesandPowerDifferences {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        long[][] a = new long[n][m];
        long lcm = 720720;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) % 2 == 1) {
                    System.out.print(lcm + " ");
                } else {
                    System.out.print((lcm + (a[i][j] * a[i][j] * a[i][j] * a[i][j])) + " ");
                }
            }
            System.out.println();

        }

    }

}
