package ProblemSolving5;

import java.util.Scanner;

public class TwoRoundDances {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[21];
        a[0] = 1;
        for (int i = 1; i <= 20; i++) {
            a[i] = a[i - 1] * i;
        }
        int h = n / 2;
        long p = a[n] / (a[h] * a[n - h]);
        p = p / 2;
        System.out.println(p * a[h - 1] * a[h - 1]);

    }

}
