package ProblemSolving4;

import java.util.Scanner;

public class OddSelection {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int odd = 0;
            int even = 0;
            for (int i = 0; i < n; i++) {
                if (scan.nextInt() % 2 == 0) {
                    ++even;
                } else {
                    ++odd;
                }
            }
            boolean b = false;
            for (int i = 1; i <= Math.min(odd, m); i += 2) {
                if ((m - i) <= even) {
                    b = true;
                }
            }
            System.out.println(b ? "Yes" : "No");

        }

    }

}
