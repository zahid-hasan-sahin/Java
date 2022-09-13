package MultiDimensionalArrays;

import java.util.Scanner;

public class Three {

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
        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += a[i][j];
            }
            
        }
        System.out.println("Sum is: " + sum);

    }
}
