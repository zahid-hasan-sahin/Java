package ProblemSolving5;

import java.util.Scanner;

public class Stairs {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long[] a = new long[40];
        a[1] = 1;
        long r = 2;
        long p = 1;
        for (int i = 2; i < 33; i++) {
            a[i] = (r * r) + (p + p);
            p = a[i];
            r = r * 2;

        }

        while (t-- > 0) {
            //       System.out.println(t);
            long n = scan.nextLong();
            int k = 0;
            long res = 0;
            while (n >= a[k]) {
                ++res;
                n -= a[k];
                ++k;
            }
            System.out.println(res-1);
        }
    }

}
