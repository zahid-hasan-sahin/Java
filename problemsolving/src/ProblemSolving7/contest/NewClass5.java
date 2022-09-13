package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class NewClass5 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            long us = 0;
            long rs = -a[1];
            long um = a[0];
            long rm = a[1];
            long[] res = new long[n];
            int x = 0;
            int y = 1;
            
            for (int i = 1; i < n; i++) {
                if (i % 2 == 1) {
                    rs += a[i];
                    rs += rm;
                    rm = Math.min(rm, a[i]);
                    rs -= rm;
                    ++x;
                }
                if (i % 2 == 0) {
                    us += a[i];
                    us += um;
                    um = Math.min(um, a[i]);
                    us -= um;
                    ++y;
                }
                
                res[i] = rs + us + ((n - x + 1) * rm) + ((n - y + 1) * um);
                
            }
            long r = res[1];
            for (int i = 1; i < n; i++) {
                r = Math.min(r, res[i]);
            }
            System.out.println(r);

        }
    }

}
