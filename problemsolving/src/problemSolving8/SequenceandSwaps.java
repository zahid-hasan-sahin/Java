package problemSolving8;

import java.util.Scanner;

public class SequenceandSwaps {

    static long rec(long[] a, int n, long x) {
        if (a.length <= n) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    return Integer.MAX_VALUE;
                }
            }
            return 0;
        }
        long r1 = rec(a, n + 1, x);
        long r2 = Integer.MAX_VALUE;
        if (a[n] > x) {
            r2 = 0;
            long p = a[n];
            a[n] = x;
            r2 = rec(a, n + 1, p) + 1;
        }
        System.out.println(n+" "+r1+" "+r2);

        return Math.min(r1, r2);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            long res = rec(a, 0, x);
            System.out.println(res);
        }
    }
}
