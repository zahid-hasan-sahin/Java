package ProblemSolving5;

import java.util.ArrayList;
import java.util.Scanner;

public class NewClass11 {

    static int mod = 1000000007;

    static long modInv(long a) {
        int k = mod - 2;
        long res = 1;
        while (k != 0) {
            if (k % 2 == 1) {
                res = ((res % mod) * (a % mod)) % mod;
                --k;

            }
            a = ((a % mod) * (a % mod)) % mod;
            k /= 2;
        }
        return res % mod;
    }

    static long nCr(int n, int k) {
        long res = 1;
        if (k > n - k) {
            k = n - k;
        }

        for (int i = 0; i < k; ++i) {
            res = ((res % mod) * ((n - i) % mod)) % mod;
            res = ((res % mod) * (modInv(i + 1) % mod)) % mod;

        }
        return res;
    }


    static int bn(int[] a, int x) {
        int l = 0;
        int r = a.length;
        while (l < r) {
            int m = (l + r) / 2;
       
            if (a[m] <= x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (l > 0 && a[l - 1] == x) {
            return l;
        } else {
            return -1;
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int pos = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int s = 0;
        int b = 0;
        int k = 0;
        bn(a, n + 1);
       

    }
}
