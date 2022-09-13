package NumberTheory;

import java.util.Scanner;

public class ModuloInverse {
    
    
        static int eEA(int a, int b, int x, int y) {
        if (a == 0) {
            x = 0;
            y = 1;
            return b;
        }
        int x1 = 1, y1 = 1;
        int n = eEA(b % a, a, x1, y1);
        x = y1 - (b / a) * x1;
        y = x1;
        return n;

    }

    static int modInv(int a, int b) {
        int m = b;
        int x = 1, y = 0;
        while (a > 1) {
            int k = a / b;
            int t = b;
            b = a % b;
            a = t;
            t = y;
            y = x - k * y;
            x = t;
        }
        if (x < 0) {
            x += m;
        }
        return x;
    }
    
    
    static long modInverse(long a, long n) {
        long res = 1;
        long k = n;
        n = n - 2;
        while (n != 0) {
            if (n % 2 == 1) {
                res = ((res % k) * (a % k)) % k;
                --n;
            }
            a = ((a % k) * (a % k)) % k;
            n = n / 2;
        }
        return res % k;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
        long n = scan.nextLong();
        long k = scan.nextLong();
        System.out.println(modInverse(n, k));
    }
    }

}
