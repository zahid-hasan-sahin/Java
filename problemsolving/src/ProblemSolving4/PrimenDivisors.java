package ProblemSolving4;

import java.util.Scanner;

public class PrimenDivisors {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            long c = 1;
            int p = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    int k = 0;
                    while (n % i == 0) {
                        n = n / i;
                        k++;
                    }
                    c *= (k + 1);
                    ++p;
                }
            }
            if (n > 1) {
                c = c * 2;
                ++p;
            }
            System.out.println(c - p);
        }

    }
}
