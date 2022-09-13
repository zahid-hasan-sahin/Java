package MultiDimensionalArrays;

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many rows: ");
        int n = scan.nextInt();
        System.out.print("How many columns: ");
        int m = scan.nextInt();
        double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextDouble();
            }
        }
        int row = 0;
        int col = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > a[row][col]) {
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(row + "th row " + col + "th column has the largest value with smallest index");
    }
}
