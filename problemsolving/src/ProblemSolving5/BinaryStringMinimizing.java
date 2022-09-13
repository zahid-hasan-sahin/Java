package ProblemSolving5;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryStringMinimizing {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long k = scan.nextLong();
            StringBuilder s = new StringBuilder(scan.next());

            int e = 0;
            for (long i = 0; i < n && k > 0; i++) {
                if (s.charAt((int) i) == '0') {
                    char w = s.charAt((int) i);
                    long u = Math.max(e, i - k);
                    s.setCharAt((int) i, s.charAt((int) u));
                    s.setCharAt((int) u, w);
                    k -= (i - e);
                    ++e;
                }

            }
            System.out.println(s);
        }
    }

}
