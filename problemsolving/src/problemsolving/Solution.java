package problemsolving;

import java.util.Scanner;

class Solution {

    static int m = 10000007;

    public static long primeFact(long n) {
        if (n % 2 != 0) {
            return 0;
        }

        long res = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            long count = 0, curr_sum = 1;
            long curr_term = 1;

            while (n % i == 0) {
                count++;

                n = n / i;

                if (i == 2 && count == 1) {
                    curr_sum = 0;
                }

                curr_term *= i;
                curr_sum += curr_term;
            }

            res *= curr_sum;
        }

        if (n >= 2) {
            res *= (1 + n);
        }

        return res % m;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                s += "0";
            }
            long k = Long.valueOf(s);
            System.out.println(primeFact(k));

        }

    }
}
