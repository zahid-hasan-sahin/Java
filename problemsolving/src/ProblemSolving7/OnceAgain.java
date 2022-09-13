package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class OnceAgain {

    static void lis(int[] a, int t, int m, int n) {
        int[] d = new int[a.length];

        for (int i = 0; i < n; i++) {
            d[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] <= a[i]) {
                    d[i] = Math.max(d[i], d[j] + 1);
                }
            }
        }

        int ans = d[0];
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, d[i]);
        }
        int c = 1;
        int[] f = new int[310];
        for (int i = 0; i < t; i++) {
            ++f[a[i]];
            c = Math.max(c, f[a[i]]);
        }

        System.out.println(ans + Math.max(0, (m - t + 1) * c));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int p = n * Math.min(n - 1, m);

        int[] a = new int[110 * 110];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();

        }
        int q = n;
        for (int i = n; i < p; i++) {
            a[q++] = a[i % n];

        }
        lis(a, n, m, p);

    }
}
