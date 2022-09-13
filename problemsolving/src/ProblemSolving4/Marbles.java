package ProblemSolving4;

import java.util.Scanner;

public class Marbles {

    public static long c(long n, long k) {
        long r = 1;
        long t = 0;
        if (k > n - k) {
            t = n - k;
        } else {
            t = k;
        }

        for (int i = 0; i < t; i++) {
            r = (r * (n - i)) / (i + 1);
        }
        return r;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            long k = scan.nextLong();
            System.out.println(c(n - 1, k - 1));

        }
    }

}
