package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class PairofTopics {

    static long bn(Integer[] a, long l, long s) {

        long r = a.length - 1;
        while (l <= r) {
            long m = (l + r) / 2;
            if (s + a[(int) m] > 0) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        Integer[] c = new Integer[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }

        Arrays.sort(c);

        long res = 0;
        for (int i = 0; i < n; i++) {
            long k = bn(c, i, c[i]);
            if (k < n) {
                long e = n - k;
                if (c[i] > 0) {
                    --e;
                }
                res += e;
            }
        }
        System.out.println(res);

    }

}
