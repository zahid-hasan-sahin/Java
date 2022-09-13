package ProblemSolving4;

import java.util.Scanner;

public class X {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            long s = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                a[i] = in;
                s += in;
            }
            if (s % x != 0) {
                System.out.println(n);
                continue;
            }
            int i = 0;
            int v = 0;
            int j = n - 1;
            for (i = 0; i < n; i++) {
                if ((s - a[i]) % x != 0) {
                    break;
                }

            }

            for (j = n - 1; j >= 0; j--) {
                if ((s - a[j]) % x != 0) {
                    break;
                }

            }
            System.out.println(Math.max(n - i - 1, j - 1) != 00 ? Math.max(n - i - 1, j) : -1);
        }

    }

}
