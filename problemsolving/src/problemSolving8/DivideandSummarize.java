package problemSolving8;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class DivideandSummarize {

    static int bn(long[] a, int l, int r, long tar) {
        if (a[l] > tar) {

            return l;
        }
        if (tar > a[r]) {
            return r;
        }

        int res = l;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] <= tar) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }

    static void rec(long[] a, int l, int r, long[] sum, HashMap<Long, Integer> h) {
        if (l == r) {
            h.put(a[l], 1);
            return;
        }

        long s = sum[r] - sum[l - 1];
        h.put(s, 1);
        int ind = bn(a, l, r, (a[l] + a[r]) / 2);
        if (ind == r) {
            return;
        }
        rec(a, l, ind, sum, h);
        rec(a, ind + 1, r, sum, h);

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int n = scan.nextInt();
            int q = scan.nextInt();
            long[] a = new long[n + 1];
            long[] sum = new long[n + 10];
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
            }
            HashMap<Long, Integer> h = new HashMap<Long, Integer>();
            sort(a);
            for (int i = 1; i <= n; i++) {
                sum[i] = sum[i - 1] + a[i];
            }
            rec(a, 1, n, sum, h);

            while (q-- > 0) {
                long in = scan.nextInt();
                if (h.getOrDefault(in, 0) == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    static void sort(long[] a) {
        ArrayList<Long> l = new ArrayList<>();
        for (long i : a) {
            l.add(i);
        }
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) {
            a[i] = l.get(i);
        }
    }

}
