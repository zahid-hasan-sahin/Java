package ProblemSolving5;

import java.util.Scanner;

public class Blocks {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder s = new StringBuilder(scan.next());
        int k = 0;
        StringBuilder res = new StringBuilder();
        StringBuilder rs = new StringBuilder(s);

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'W') {
                ++k;
                if (i != n - 1) {
                    s.replace(i, i + 1, "B");
                    res.append(i + 1 + " ");
                    char e = s.charAt(i + 1);
                    if (e == 'W') {
                        s.replace(i + 1, i + 2, "B");
                    } else {
                        s.replace(i + 1, i + 2, "W");
                    }
                }
            }
        }
        int r = 0;
        char e = s.charAt(0);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == e) {
                ++r;
            }
        }

        if (r == n) {
            System.out.println(k);
            System.out.println(res);

            return;
        }
        StringBuilder p = new StringBuilder();
        s = rs;
        k = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'B') {
                ++k;
                if (i != n - 1) {
                    s.replace(i, i + 1, "W");
                    p.append(i + 1 + " ");
                    e = s.charAt(i + 1);
                    if (e == 'B') {
                        s.replace(i + 1, i + 2, "W");
                    } else {
                        s.replace(i + 1, i + 2, "B");
                    }
                }
            }
        }
        r = 0;
        e = s.charAt(0);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == e) {
                ++r;
            }
        }
        if (r == n) {
            System.out.println(k);
            System.out.println(p);
            return;
        }
        System.out.println("-1");

    }

}
