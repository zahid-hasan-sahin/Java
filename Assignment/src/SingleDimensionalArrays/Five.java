package SingleDimensionalArrays;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Numbers: ");
        int n = scan.nextInt();
        double[] a = new double[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextDouble();
        }
        double max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, a[i]);
        }
        System.out.println("Max is: " + max);
    }
}
