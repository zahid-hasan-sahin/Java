package lightOj;

import java.util.Scanner;

public class EfficientPseudoCode {

    static long mod = 1000000007;

    static long pow(long a, long b) {
        
        long res = 1;
        while (b != 0) {
            if ((b & 1) == 1) {
                res = ((res % mod) * (a % mod)) % mod;
                --b;
            }
            a = ((a % mod) * (a % mod)) % mod;
            b /= 2;
        }
        return res % mod;
    }

    static long modInv(long a) {
       
        long b = mod;
        long x = 1;
        long y = 0;
        while (a > 1) {
            long k = a / b;
            long t = b;
            b = a % b;
            a = t;
            t = y;
            y = x - k * y;
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
        while (q-- > 0) {
            long n = scan.nextInt();
            long m = scan.nextInt();
            if(n==mod){
                System.out.print("Case " + t++ + ": ");
            System.out.println(1);
                continue;
            }
            long res = 1;
            for (long i = 2; i * i <= n; i++) {
                long k = 0;
                while (n % i == 0) {
                    ++k;
                    n /= i;
                }
                if (k > 0) {
                    k *= m;
                    long w = ((pow(i, k + 1) - 1) * modInv(i - 1)) % mod;
                    res = (res * w) % mod;
                }
            }
            if (n > 1) {
                long w = ((pow(n, m + 1) - 1) * modInv(n - 1)) % mod;
                res = (res * w) % mod;

            }
            System.out.print("Case " + t++ + ": ");
            System.out.println(res % mod);
        }

    }

}
