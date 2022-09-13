package ProblemSolving5;

import java.util.Scanner;

public class Smallestsubarraywithsumgreaterthanx {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int mn = n;
            int s = 0;
            int p = 0;
            int i = 0;
            while (i < n) {
                s += a[i];
                if (s > k) {

                    while (p < n && s - a[p] > k) {
                        s -= a[p];
                        ++p;
                    }
                    mn = Math.min(mn, (i - p) + 1);

                }
                ++i;

            }
            System.out.println(mn);

        }
    }
}
