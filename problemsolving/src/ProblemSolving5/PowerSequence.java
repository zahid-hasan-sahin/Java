package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class PowerSequence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        int t = a[n - 1];
        int k = 1;
        while (Math.pow(k, n - 1) <= t) {
            ++k;
        }
        long res = Long.MAX_VALUE;

        for (int i = 1; i <= k; i++) {
            long p = 0;
            for (int j = 0; j < n; j++) {
                p += Math.abs(a[j] - Math.pow(i, j));
            }
            res = Math.min(res, p);
        }
        System.out.println(res);
    }

}
