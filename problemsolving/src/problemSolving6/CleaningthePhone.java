package problemSolving6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CleaningthePhone {

    static int lower(long[] ages, long target) {
        if (ages == null || ages.length == 0) {
            return -1;
        }
        int l = 0;
        int r = ages.length - 1;

        if (target > ages[r]) {
            return -1;
        }
        while (l < r) {
            int m = l + (r - l) / 2;
            if (ages[m] >= target) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return r;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        k:
        while (q-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            long s = 0;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                s += a[i];
            }
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            if (s < m) {
                System.out.println("-1");
                continue k;
            }
            ArrayList<Long> one = new ArrayList<Long>();
            ArrayList< Long> two = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                if (b[i] == 1) {
                    one.add(a[i]);
                } else {
                    two.add(a[i]);
                }
            }

            Collections.sort(one, Collections.reverseOrder());
            Collections.sort(two, Collections.reverseOrder());
            long[] o = new long[one.size()];
            long[] t = new long[two.size()];
            if (one.size() > 0) {
                o[0] = one.get(0);
            }
            for (int i = 1; i < one.size(); i++) {
                o[i] += o[i - 1] + one.get(i);
            }
            if (two.size() > 0) {
                t[0] = two.get(0);
            }
            for (int i = 1; i < two.size(); i++) {
                t[i] += t[i - 1] + two.get(i);
            }
            String r = "1000000000000000";
            long res = Long.valueOf(r);
            for (int i = 0; i < one.size(); i++) {
                if (o[i] >= m) {
                    res = Math.min(res, i + 1);
                } else {
                    long ser = m - o[i];
                    long bn = lower(t, ser);
                    if (bn != -1) {
                        res = Math.min(res, i + 1 + (bn + 1) * 2);
                    }
                }
            }
            for (int i = 0; i < two.size(); i++) {
                if (t[i] >= m) {
                    res = Math.min(res, (i + 1) * 2);
                } else {
                    long ser = m - t[i];
                    long bn = lower(o, ser);
                    if (bn != -1) {
                        res = Math.min(res, (i + 1) * 2 + bn + 1);
                    }
                }
            }

            System.out.println(res);

        }
    }

}
