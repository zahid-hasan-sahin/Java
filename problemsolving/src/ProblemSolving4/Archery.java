package ProblemSolving4;

import java.util.Scanner;

public class Archery {

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long gc = 1;
            long lc = scan.nextInt();
            for (int i = 1; i < n; i++) {
                long k = scan.nextLong();
                gc = gcd(lc, k);
                lc = (lc*k)/gc;
            }
            System.out.println(lc);
        }

    }

}
