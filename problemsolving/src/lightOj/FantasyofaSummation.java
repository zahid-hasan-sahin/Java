package lightOj;

import java.util.Scanner;

public class FantasyofaSummation {

    static long pow(long a, long b, long m) {
        long res = 1;
        while (b != 0) {
            if ((b & 1) == 1) {
                --b;
                res = ((res % m) * (a % m)) % m;
            }
            a = ((a % m) * (a % m)) % m;
            b = b / 2;
        }
        return res % m;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            long n = scan.nextInt();
            long k = scan.nextInt();
            long mod = scan.nextInt();

            long r = 0;
            for (int i = 0; i < n; i++) {
                r += scan.nextInt();
            }
            long res = pow(n, k - 1, mod) * k % mod;
            res = (res%mod) * (r % mod);
            System.out.print("Case "+t+++": ");
            System.out.println(res%mod);
        }
    }

}
