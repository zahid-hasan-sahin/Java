package ProblemSolving7;

import java.util.Scanner;

public class FindTheArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            long odd = 0;
            long even = 0;
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                a[i] = in;
                if (i % 2 == 0) {
                    even += in;
                } else {
                    odd += in;
                }
            }
            if (even > odd) {
                for (int i = 1; i < n; i += 2) {
                    a[i] = 1;
                }
            } else {
                for (int i = 0; i < n; i += 2) {
                    a[i] = 1;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

    }
}
