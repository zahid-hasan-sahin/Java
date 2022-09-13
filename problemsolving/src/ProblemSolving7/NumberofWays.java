package ProblemSolving7;

import java.util.Scanner;

public class NumberofWays {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] ar = new long[n];
        long s = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
            s += ar[i];
        }
        if (s % 3 != 0) {
            System.out.println("0");
            return;
        }
        s /= 3;
        int j = n - 1;
        long k = 0;
        while (j >= 0) {
            k += ar[j];
            if (k == s) {
                break;
            }
            --j;
        }
        int i = 0;
        k = 0;
        while (i < n) {
            k += ar[i];
            if (k == s) {
                break;
            }
            ++i;
        }
        if (i >= j) {
            System.out.println("0");
            return;
        }
        for (int l = i + 1; l < j; l++) {

        }
    }

}
