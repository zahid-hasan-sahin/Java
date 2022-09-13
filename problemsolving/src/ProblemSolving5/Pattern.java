package ProblemSolving5;

import java.util.Scanner;

public class Pattern {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }
        int p = s[0].length();
        int[] a = new int[p];
        for (int i = 0; i < p; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {

                if (s[j].charAt(i) == '?') {
                    ++k;
                }
            }

            if (k == n) {

                a[i] = 1;
            }
        }
        char[] c = new char[p];
        for (int i = 0; i < p; i++) {
            if (a[i] == 1) {
                c[i] = 'a';
            }
        }
        for (int i = 0; i < p; i++) {
            char e = s[0].charAt(i);
            boolean g = true;
            if (a[i] == 1) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (s[j].charAt(i) != '?' && s[j].charAt(i) != e && e != '?') {
                    c[i] = '?';
                    g = false;
                    break;
                }
                if (s[j].charAt(i) != '?') {
                    e = s[j].charAt(i);
                }
            }

            if (g) {
                c[i] = e;
            }
        }
        for (int i = 0; i < p; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }

}
