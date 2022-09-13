package NumberTheory;

import java.util.Random;
import java.util.Scanner;

public class miillerPrimarilityTest {

 
    static long pow(long a, long b, long n) {
        double res = 1;
        double t = a;
        while (b != 0) {
            if ((b & 1) == 1) {

                res = ((res % n) * (t % n)) % n;
                --b;
            }
            t = ((t % n) * (t % n)) % n;

            b = b / 2;
        }
        return (long) res;
    }

    static boolean milerRabin(long n, long d) {

        Random rand = new Random();
        long r = 2 + Math.abs((rand.nextLong()) % (n - 4));
        long x = pow(r, d, n);
        if (x == 1 || x == n - 1) {
            return true;
        }
        while (d != n - 1) {
            d *= 2;
            x = ((x % n) * (x % n)) % n;
            if (x == n - 1) {
                return true;
            }
            if (x == 1) {
                return false;
            }
        }
        return false;
    }

    static boolean isPrime(long n) {
        if (n < 4) {
            return n == 2 || n == 3;
        }
        if (n % 2 == 0) {
            return false;
        }
        long d = n - 1;
        while (d % 2 == 0) {
            d /= 2;
        }
        for (int i = 0; i < 5; i++) {
            if (!milerRabin(n, d)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);     
        
        for (int i = 0; i < 100; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

}
