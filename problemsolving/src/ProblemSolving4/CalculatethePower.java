package ProblemSolving4;

import java.util.Scanner;

public class CalculatethePower {

    static int mod = 1000000007;

    static long pow(long a, long b) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res = ((res % mod) * (a % mod)) % mod;
                b--;
            }
            a = ((a % mod) * (a % mod)) % mod;
            b = b / 2;
        }
        return res % mod;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        System.out.println(pow(a, b));

    }

}
