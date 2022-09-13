package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class Sweetcoupleinteger {

    static long lcm(long a, long b) {
        long R;
        long t = a;
        long r = b;
        while ((a % b) > 0) {
            R = a % b;
            a = b;
            b = R;
        }
        return (t * r) / b;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long[] pr = new long[1000010];
        ArrayList<Long> ar = new ArrayList<Long>();
        for (long i = 2; i < 1000010; i++) {
            if (pr[(int) i] == 0) {
                ar.add(i);
                for (long j = i * i; j < 1000010; j += i) {
                    pr[(int) j] = 1;
                }
            }
        }
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                long p = scan.nextLong();
                b[i] = p;
                long c = 1;
                long r = 0;
                for (int j = 0; ar.get(j) * ar.get(j) <= p; j++) {
                    if (p % ar.get(j) == 0) {
                        int k = 0;
                        while (p % ar.get(j) == 0) {
                            p /= ar.get(j);
                            ++k;
                        }
                        c *= (k + 1);
                        ++r;
                    }
                }
                if (p >= 2) {
                    ++r;
                    c *= 2;
                }
                a[i] = c - r;
            }
            long l = 0;
            long r = 0;
            long lcm = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        long k = lcm(a[i], a[j]);
                 
                        if (k == lcm) {
                            if (Math.max(b[i], b[j]) > Math.max(l, r)) {
                                l = b[i];
                                r = b[j];
                            } else if (Math.min(b[i], b[j]) > Math.min(l, r)) {
                                l = b[i];
                                r = b[j];
                            }
                        }
                        if (k > lcm) {
                            l = b[i];
                            r = b[j];
                            lcm = k;
                        }
                    }
                }
            }
            System.out.println(Math.max(l, r) + " " + Math.min(l, r));

        }
    }

}
