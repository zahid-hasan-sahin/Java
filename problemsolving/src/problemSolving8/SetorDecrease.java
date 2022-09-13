package problemSolving8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SetorDecrease {

    static void sort(long[] a) {
        int n = a.length;
        ArrayList<Long> ar = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            ar.add(a[i]);
        }
        Collections.sort(ar);
        for (int i = 0; i < n; i++) {
            a[i] = ar.get(i);
        }
    }

    static long accurateFloor(long a, long b) {
        long val = a / b;
        while (val * b > a) {
            val--;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long k = scan.nextLong();
            long[] pre = new long[n + 1];
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            sort(a);
            pre[1] = a[0];
            for (int i = 1; i < n; i++) {
                pre[i + 1] = pre[i] + a[i];
            }
            if (pre[n] <= k) {
                System.out.println("0");
                continue;
            }
            long res = pre[n] - k;
            for (int i = 1; i <= n; i++) {
                long mid = pre[i] - pre[1];
                long p = k - mid;
                int baki = n - i + 1;
                long m = accurateFloor(p, baki);
                if (pre[1] <= m) {
                    res = Math.min(res, baki - 1);
                } else {
                    res = Math.min(res, pre[1] - m + baki - 1);
                }
            }
            System.out.println(res);
        }
    }

}
