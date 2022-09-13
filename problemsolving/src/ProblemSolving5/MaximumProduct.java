package ProblemSolving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumProduct {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        q:
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            ArrayList<Integer> c = new ArrayList<Integer>();
            long y = 0;
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                if (in > 0) {
                    a.add(in);
                } else {
                    b.add(in);
                }
                if (in == 0) {
                    ++y;
                }
                c.add(Math.abs(in));
            }
            long res = Long.MIN_VALUE;
            Collections.sort(a, Collections.reverseOrder());
            Collections.sort(b);
            if (a.size() >= 5) {
                long u = 1;
                for (int i = 0; i < 5; i++) {
                    u *= a.get(i);
                }
                res = Math.max(u, res);

            }

            if (a.size() >= 1 && b.size() >= 4) {
                long u = 1;
                for (int i = 0; i < 4; i++) {
                    u *= Math.abs(b.get(i));
                }
                u *= a.get(0);
                res = Math.max(u, res);
            }
            if (a.size() >= 3 && b.size() >= 2) {
                long u = 1;
                for (int i = 0; i < 2; i++) {
                    u *= b.get(i);
                }
                for (int i = 0; i < 3; i++) {
                    u *= a.get(i);
                }
                res = Math.max(u, res);
            }
            long u = 1;
            if (y >= 1) {
                res = Math.max(0, res);
            }
            Collections.sort(c);
            for (int i = 0; i < 5; i++) {
                u *= c.get(i);

            }
            res = Math.max(-u, res);
            System.out.println(res);
        }

    }

}
