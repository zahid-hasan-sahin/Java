package ProblemSolving5;

import java.util.Scanner;

public class MaxSumSubarrayofsizeK {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int mx = 0;
            int s = 0;
            for (int i = 0; i < k; i++) {

                s += a[i];
            }
            mx = s;
            for (int i = k; i < n; i++) {
                s -= a[i - k];
                s += a[i];
                mx = Math.max(mx, s);
            }
            System.out.println(mx);
        }

    }

}
