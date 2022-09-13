package problemSolving2;

import java.util.Scanner;

public class DivisorSubtraction {

    public static long isPrime(long n) {
        for (long i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(((n - isPrime(n)) / 2) + 1);
        }

    }
}
