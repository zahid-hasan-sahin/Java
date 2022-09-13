package ProblemSolving4;

import java.util.Scanner;

public class CounttheArrays {

    static long m = 998244353;

    static long modInv(long a, long b) {
        long m = b;
        long x = 1, y = 0;
        while (a > 1) {
            long q = a / b;
            long p = b;
            b = a % b;
            a = p;
            p = y;
            y = x - q * y;
            x = p;
        }
        if (x < 0) {
            x += m;
        }

        return x;
    }

    static long nCr(long n, long r) {
        long res = 1;
        if (r > n - r) {
            r = n - r;
        }
        for (int i = 0; i < r; i++) {
            res = ((res % m) * ((n - i) % m)) % m;
            res = ((res % m) * (modInv((i + 1), m)) % m) % m;
        }
        return res % m;
    }

    static long pow(long a, long b) {
        long r = 1;
        while (b >= 1) {
            if (b % 2 == 1) {
                r = ((r % m) * (a % m)) % m;
                --b;
            }
            a = ((a % m) * (a % m)) % m;
            b = b / 2;
        }
        return r % m;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        long ncr = nCr(k, n - 1);
        long res = ((ncr % m) * ((n - 2) % m) % m);
        res = ((res % m) * (pow(2, n - 3)) % m) % m;
        System.out.println(res);
    }

}
