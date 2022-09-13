package lightOj;

import java.util.Scanner;

public class Combinations {

    static int mod = 1000003;

    static long modInv(long a) {
        long b = mod;
        long x = 1, y = 0;
        while (a > 1) {
            long k = a / b;
            long t = b;
            b = a % b;
            a = t;
            t = y;
            y = x - y * k;
            x = t;
        }
        if (x < 0) {
            x += mod;
        }
        return x;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = 1;
        int q = scan.nextInt();
        long[] f = new long[1000005];
        f[0] = 1;
        for (int i = 1; i < 1000005; i++) {
            f[i] = ((f[i - 1] % mod) * (i % mod)) % mod;
        }
        while (q-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            long a = f[n];
            long b = (f[n - k] % mod) * (f[k] % mod) % mod;
            System.out.println(a + " " + b);
            long res = ((a % mod) * (modInv(b) % mod)) % mod;
            System.out.print("Case " + t++ + ": ");
            System.out.println(res);
        }
    }

}
