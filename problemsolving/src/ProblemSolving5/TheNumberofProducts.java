package ProblemSolving5;

import java.util.Scanner;

public class TheNumberofProducts {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long neg = 0;
        long res = 0;
        long p = 0;
        long r = 0;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (in < 0) {
                ++neg;
            }
            if (neg % 2 == 0) {
                ++p;
                res += p;
            } else {
                res += r;
                ++r;
            }
        }
        System.out.println(((n * (n + 1)) / 2)-res + " " + res);
    }
}
