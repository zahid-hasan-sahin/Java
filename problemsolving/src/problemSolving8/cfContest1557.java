package problemSolving8;

import java.util.Scanner;

public class cfContest1557 {

    static long[] fact = new long[1000010];
    static long p = 1000000007;

    public static long bn(long a, long b) {
        long res = 1;
        long k = a;
        while (b != 0) {
            if (b % 2 == 1) {
                res = (res * k) % p;
                --b;
            }
            k = (k * k) % p;
            b = b / 2;
        }
        return res;
    }

    public static long b(int n, int k) {
        if (k > n) {
            return 0;
        }
        long res = fact[n];
        long u = ((long) (fact[k]) * (fact[n - k])) % p;
        long e = bn(u, p - 2);
        res = (res * e) % p;
        return res;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        fact[0] = 1;
        for (int i = 1; i < 1000010; i++) {
            fact[i] = (int) (((long) fact[i - 1] * i) % p);
        }
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            long res = 0;
            for (int i = 0; i <= n; i += 2) {
                res = ((res) % p) + (b(n, i) % p) % p;
                System.out.println(res);
            }
            if (n % 2 == 1) {
                ++res;
            }
            System.out.println(res);
            long r = 1;
            for (int i = 0; i < k; i++) {
                r = ((r % p) * (res % p)) % p;
            }
            System.out.println(res);
            System.out.println((r % p));

        }
    }
}
