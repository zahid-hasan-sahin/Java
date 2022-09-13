package problemSolving8;

import java.util.HashSet;
import java.util.Scanner;

public class BornThisWay {

    static int bn(long[] a, long key) {
        int l = 0;
        int r = a.length - 1;
        int res = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] <= key) {
                l = mid + 1;
                if (a[mid] == key) {
                    --mid;
                }
                res = Math.max(res, mid);
            } else {
                r = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        long t1 = scan.nextInt();
        long t2 = scan.nextInt();
        int k = scan.nextInt();
        long[] a = new long[n + 1];
        long[] b = new long[m + 1];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt() + t1;
        }
        b[0] = 0;
        for (int i = 1; i <= m; i++) {
            b[i] = scan.nextInt();
        }
        if (n <= k || m <= k) {
            System.out.println("-1");
            return;
        }
        int res = 0;
        for (int i = 0; i <= Math.min(n, k); i++) {
            int ind = bn(b, a[i]);
            int p = k - (i + 1);
            
            res = Math.max(res, ind + p);
        }

        try {
            System.out.println(b[res + 2] + t2);
        } catch (Exception e) {
            System.out.println("-1");
        }
    }
}
