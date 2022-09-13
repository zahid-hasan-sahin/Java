package SingleDimensionalArrays;

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Numbers: ");
        int n = scan.nextInt();
        double[] a = new double[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextDouble();
        }
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > a[ind]) {
                ind = i;
            }
        }
        System.out.println("Smallest index of largest element is: " + ind);
    }
}
