package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            long res = 0;
            for (int i = 0; i < k; i++) {
                res += Math.max(a[i], b[n - i - 1]);
            }
            for (int i = k; i < n; i++) {
                res += a[i];
            }
            System.out.println(res);
        }
    }

}
