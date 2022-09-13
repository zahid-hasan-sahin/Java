package MultiDimensionalArrays;

import java.util.Scanner;

public class Four {

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
        for (int i = 0; i < m; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j][i];
            }
            System.out.println("Sum of " + i + "th column: " + sum);
        }
    }
}
