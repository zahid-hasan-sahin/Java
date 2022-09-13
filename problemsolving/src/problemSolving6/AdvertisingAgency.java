package problemSolving6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class AdvertisingAgency {

    static long mod = 1000000007;

    static long modInv(long a, long b) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res = ((res % mod) * (a % mod)) % mod;
                --b;
            }
            a = ((a % mod) * (a % mod)) % mod;
            b /= 2;
        }
        return res % mod;
    }

    static long nCr(long[] f, int n, int c) {
        if (n <= c) {
            return 0;
        }

        long res = f[n];
        res = ((res % mod) * (modInv(f[c], mod - 2)) % mod) % mod;
        res = ((res % mod) * (modInv(f[n - c], mod - 2)) % mod) % mod;
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        long[] fact = new long[1010];
        fact[0] = 1;

        for (int i = 1; i < 1010; i++) {
            fact[i] = ((fact[i - 1] % mod) * (i % mod)) % mod;

        }
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            int[] f = new int[1010];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                ++f[a[i]];
            }
            Arrays.sort(a);
            int[] tf = new int[1010];
            HashSet<Integer> ar = new HashSet<Integer>();
            for (int i = n - k; i < n; i++) {
                ++tf[a[i]];
                ar.add(a[i]);
            }
            long res = 0;
            for (int r : ar) {
                //   System.out.println(f[r] + " " + tf[r] + " " + r);
                res += nCr(fact, f[r], tf[r]);
            }
            if (res == 0) {
                ++res;
            }
            System.out.println(res);

        }

    }
}
