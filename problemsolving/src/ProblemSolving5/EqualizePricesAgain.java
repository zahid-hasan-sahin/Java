package ProblemSolving5;

import java.util.Scanner;

public class EqualizePricesAgain {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int s = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                s += a[i];
            }
            System.out.println((int) Math.ceil(s /(double) n));
        }
    }

}
