package lightOj;

import java.util.Scanner;

public class ProblemMakesProblem {

    static int mod = 1000000007;

    static long modInv(long a) {
        long r = a;
        long res = 1;
        int b = mod - 2;
        while (b != 0) {
            if (b % 2 == 1) {
                --b;
                res = ((res % mod) * (r % mod)) % mod;
            }
            r = ((r % mod) * (r % mod)) % mod;
            b /= 2;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = 1;
        int[] f = new int[2000010];
        f[0] = 1;
        for (int i = 1; i < 2000010; i++) {
            long k = ((long) (f[i - 1] % mod) * ((long) i % mod)) % mod;
            f[i] = (int) k;

        }
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int p = n + k - 1;          
            long res = ((f[p] % mod) * (modInv((long)f[p - k + 1] * f[k - 1]) % mod)) % mod;
            System.out.print("Case "+q+++": ");
            System.out.println(res % mod);
        }
    }
}
