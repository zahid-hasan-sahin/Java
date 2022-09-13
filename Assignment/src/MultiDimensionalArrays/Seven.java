package MultiDimensionalArrays;

import java.util.Scanner;

public class Seven {

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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int row = (int) (Math.random() * n);
                int col = (int) (Math.random() * m);

                double temp = a[row][col];
                a[row][col] = a[i][j];
                a[i][j] = temp;
            }
        }
        System.out.println("Elements after shuffling:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
