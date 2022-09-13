package ProblemSolving5;

import java.util.Scanner;

public class Poke {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int q = scan.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            long[] c = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            b[0] = a[0];
            for (int i = 1; i < n; i++) {
                c[i] = Math.max(c[i - 1], b[i - 1] - a[i]);
                b[i] = Math.max(b[i - 1], c[i] + a[i]);
            }
            long r = 0;
            for (int i = 0; i < n; i++) {
                r = Math.max(r, b[i]);
            }
            for (int i = 0; i < n; i++) {
                r = Math.max(r, c[i]);
            }
            System.out.println(r);
        }
    }
}
