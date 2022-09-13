package ProblemSolving4;

import java.util.Scanner;

public class Rocks {

    static double nCr(double n, double r) {
        double res = 1;
        if (n - r < r) {
            r = n - r;
        }
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int p = 1;
        while (t-- > 0) {
            double n = scan.nextDouble();
            double k = scan.nextDouble();
            double ncr = nCr(n, k);
            if (k > n) {
                System.out.println("Case " + p + ": 0");
                ++p;
                continue;
            }
            double res = Math.pow(ncr, 2);
            double q = 1;
            for (int i = 2; i <= k; i++) {
                q *= i;
            }

            System.out.printf("Case %d: %.0f\n", p, res * q);
            ++p;

        }

    }
}
