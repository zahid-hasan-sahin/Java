package MultiDimensionalArrays;

import java.util.Scanner;

public class Five {

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
        int ind = 0;
        double max = 0;
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < m; j++) {
                sum += a[i][j];
            }

            if (max < sum) {
                ind = i;
                max = sum;
            }
        }
        System.out.println(ind + "th row has the largest  sum");
    }
}
