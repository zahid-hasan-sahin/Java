package SingleDimensionalArrays;

import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Numbers: ");
        int n = scan.nextInt();
        double[] a = new double[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            int ind = (int) (Math.random() * n);
            double temp = a[ind];
            a[ind] = a[i];
            a[i] = temp;
        }
        System.out.println("Elements are after shifting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
