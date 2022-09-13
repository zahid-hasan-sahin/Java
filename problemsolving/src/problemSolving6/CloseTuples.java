package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class CloseTuples {

    static long mod = 1000000007;
    static long[] fact = new long[200010];

    static long bn(Integer[] a, long x) {
        long l = 0;
        long r = a.length - 1;
        while (l <= r) {
            long md = (l + r) / 2;
            if (a[(int) md] <= x) {
                l = md + 1;
            } else {
                r = md - 1;
            }
        }
        return l;
    }

    static long nCr(long a, long b) {
        if (a < b) {
            return 0;
        }
        long res = fact[(int) a] % mod;
        res = ((res % mod) * (modInv(fact[(int) (a - b)]) % mod)) % mod;
        res = ((res % mod) * (modInv(fact[(int) b])) % mod) % mod;

        return res;
    }

    static long modInv(long a) {
        long p = mod - 2;
        long res = 1;
        while (p != 0) {
            if (p % 2 == 1) {
                res = ((res % mod) * (a % mod)) % mod;
                --p;
            }
            a = ((a % mod) * (a % mod)) % mod;
            p /= 2;
        }
        return res % mod;
    }

    public static void main(String args[]) {
        Reader scan = new Reader();
        PrintWriter out = new PrintWriter(System.out);
        int t = scan.nextInt();

        fact[0] = 1;
        for (int i = 1; i < 200010; i++) {
            fact[i] = ((fact[i - 1] % mod) * (i % mod)) % mod;
        }
        while (t-- > 0) {
            int n = scan.nextInt();
            long m = scan.nextInt() - 1;
            long k = scan.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            long res = 0;
            for (int i = 0; i < n; i++) {
                long len = bn(a, a[i] + k) - (i + 1);

                res = ((res % mod) + (nCr(len, m) % mod)) % mod;

            }

            out.println(res);

        }
        out.close();

    }

    public static class Reader {

        BufferedReader br;
        StringTokenizer st;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}
