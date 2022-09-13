package ProblemSolving4;

import java.util.Arrays;
import java.util.Scanner;

public class NewClass9 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int k = scan.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = i;
            }

            for (int i = 0; i < n; i++) {
                int[] b = new int[n];
                int p = 0;
                for (int j = n - i - 1; j >= 0; j--) {
                    b[p++] = a[j];
                }
                p = 0;
                for (int j = i; j < n; j++) {
                    a[j] = b[p++];
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                //  System.out.println(a[i]);
            }
            System.out.println(a[k]);
        }

    }
}
