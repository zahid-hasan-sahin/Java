package problemSolving6;

import java.util.Scanner;

public class MaximizeFunction {

    static long cal(long[] a, long m) {
        int n = a.length;
        long cal = 0;
        for (int i = 1; i < n; i++) {
            cal += Math.max(a[i] - m * i, 0);
        }
        return cal;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long k = scan.nextLong();
            long[] a = new long[n + 1];
            long s = 0;

            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
                s += a[i];
            }

            long l = 1;
            long r = s;
            long res = 0;
            long e = 0;
            while (l <= r) {
                long mid = (l + r) / 2;
                long p = cal(a, mid);

             
                if (p == k) {
                    res = mid;
                    e = p;
                    break;
                }

                if (p > k) {
                    l = mid + 1;
                    res = mid;
                    e = p;
                } else {
                    r = mid - 1;
                }
            }
            System.out.println(res + " " + e);
        }
    }
}
