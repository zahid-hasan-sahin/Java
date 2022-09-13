package SingleDimensionalArrays;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Numbers: ");
        int n = scan.nextInt();
        double[] a = new double[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("Sum is " + sum);

    }

}
