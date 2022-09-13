package problemSolving6;

import java.util.ArrayList;
import java.util.Scanner;

public class Password {

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
        if (n < c) {
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

        long[] fact = new long[100010];
        fact[0] = 1;

        for (int i = 1; i < 100010; i++) {
            fact[i] = ((fact[i - 1] % mod) * (i % mod)) % mod;
        }
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != '-') {
                    ar.add(s.charAt(i) - '0');
                }
            }

            for (int i = 0; i < ar.size() - 1; i++) {
                if (ar.get(i + 1) < ar.get(i)) {
                    System.out.println("0");
                    continue k;
                }
            }
            s = "1" + s;
            s += "9";
            int i = 0;
            long res = 1;
            while (i < n) {
                while (i < n && s.charAt(i) != '-') {
                    ++i;
                }
                int j = i;
                while (j <= n && s.charAt(j) == '-') {
                    ++j;
                }
                --j;

                int c = j - i + 1;
                int k = s.charAt(j + 1) - s.charAt(i - 1) + 1;

                res = ((res % mod) * (nCr(fact, c + k - 1, k - 1)) % mod) % mod;
                i = j + 1;
            }
            System.out.println(res);
        }

    }
}
