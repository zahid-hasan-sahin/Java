package ProblemSolving5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Division {

    static long max(long a, long b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long t = scan.nextInt();
        k:
        while (t-- > 0) {
            long x = scan.nextLong();
            long y = scan.nextInt();
            if (x % y != 0) {
                System.out.println(x);
                continue k;
            }
            HashMap<Long, Long> h = new HashMap<Long, Long>();
            for (long i = 2; i <= Math.sqrt(y); i++) {
                long p = 0;
                if (y % i == 0) {
                    while (y % i == 0) {
                        y /= i;
                        ++p;
                    }
                    h.put(i, p);
                }
            }
            if (y >= 2) {
                h.put(y, (long) 1);
            }
            long res = 0;
            for (long k : h.keySet()) {
                long p = h.get(k);
                long c = x;
              
                while (c % k == 0) {
                    c /= k;
                }
                for (long i = 0; i < p - 1; i++) {
                    c *= k;
                }
                res = max(c, res);
            }
            System.out.println(res);
        }

    }

}
