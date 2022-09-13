package ProblemSolving7;

import java.util.Scanner;

public class Fingerprints {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] b = new int[10];
        for (int i = 0; i < k; i++) {
            ++b[scan.nextInt()];
        }
        for (int i = 0; i < n; i++) {
            if (b[a[i]] != 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

}
