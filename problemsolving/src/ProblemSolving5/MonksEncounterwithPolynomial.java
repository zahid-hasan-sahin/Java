package ProblemSolving5;

import java.util.Scanner;

public class MonksEncounterwithPolynomial {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            long d = scan.nextLong();
            long k = scan.nextLong();
            long l = 0;
            long h = 900000;
            long res = 0;
            while (l <= h) {
                long m = (l + h) / 2;
                long p = a * m * m * m + b * m * m + c * m + d;

                if (p == k) {
                    res = m;
                    break;
                }
                if (p < k) {
                    l = m + 1;
                    res = m;
                } else {
                    h = m - 1;
                }
            }
            System.out.println(res);
        }
    }

}
