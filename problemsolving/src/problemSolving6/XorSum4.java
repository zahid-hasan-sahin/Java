package problemSolving6;

import java.util.Scanner;

public class XorSum4 {

    static long mod = 1000000007;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextLong();
        }
        long[] b = new long[65];
        for (int i = 0; i < n; i++) {
            long k = a[i];
            int c = 0;
            while (k > 0) {
                if ((k & 1) != 0) {
                    ++b[c];
                }
                ++c;
                k = k >> 1;
            }
        }
        for (int i = 0; i < 64; i++) {
            b[i] = b[i] * (n - b[i]);
        }
        long res = 0;
        for (int i = 0; i < 64; i++) {
            long p = (((b[i]) % mod) * ((long) Math.pow(2, i) % mod)) % mod;
            res = ((res % mod) + (p % mod)) % mod;
        }
        System.out.println(res % mod);

    }

}
