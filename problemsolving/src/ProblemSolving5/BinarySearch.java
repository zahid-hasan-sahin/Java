package ProblemSolving5;

import java.util.Scanner;

public class BinarySearch {

    static int mod = 1000000007;
    static int big = 0;
    static int small = 0;
    static int[] f = new int[1010];
    static int[] inv = new int[1010];

    static int modInv(int a) {
        long k = a;
        long b = mod - 2;
        long res = 1;
        while (b != 1) {
            if (b % 2 == 1) {
                --b;
                res = ((res % mod) * (k % mod)) % mod;
            }
            k = ((k % mod) * (k % mod)) % mod;
            b = b / 2;
        }
        return (int) res;
    }

    static int nCr(int n, int r) {
        long res = 1;
        if (r > n - r) {
            r = n - r;
        }
        for (int i = 0; i < r; i++) {
            res = ((res % mod) * ((n - 1) % mod)) % mod;
            res = ((res % mod) * (inv[i + 1] % mod)) % mod;
        }
        return (int) res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int pos = scan.nextInt();

        f[0] = inv[0] = 1;
        for (int i = 1; i < 1010; i++) {
            f[i] = ((f[i - 1] % mod) * (i % mod)) % mod;
            inv[i] = ((inv[i - 1] % mod) * (modInv(i) % mod)) % mod;
        }

    }

}
