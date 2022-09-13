package ProblemSolving7;

import java.util.Scanner;

public class ChessCheater {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String p = scan.next();
            p = "L" + p;
            ++n;
            char[] s = new char[n];
            for (int i = 0; i < n; i++) {
                s[i] = p.charAt(i);
            }

            int[] a = new int[n];
            int q = -1;
            for (int i = 0; i < n; i++) {
                a[i] = q;
                if (s[i] == 'W') {
                    q = i;
                }
            }
            int i = n - 1;
            while (i >= 0 && s[i] != 'W') {
                --i;
            }

            while (k > 0 && i >= 0) {

                int r = a[i];
                if (r == -1) {
                    break;
                }
                if (s[i] != 'W') {
                    --i;
                    continue;
                }
                int w = i - r - 1;

                if (w <= k) {
                    for (int j = r + 1; j < i; j++) {
                        s[j] = 'W';
                        --k;
                    }
                    i = r;
                } else {
                    --i;
                }
            }
            for (int j = 1; j < n; j++) {
                if (s[j] == 'L' && k > 0) {
                    s[j] = 'W';
                    --k;
                }
            }
            for (int j = 1; j < n; j++) {
                System.out.print(s[j]);
            }
            System.out.println();
            long res = 0;
            for (int j = 1; j < n; j++) {
                if (s[j] == 'W') {
                    if (s[j - 1] == 'W') {
                        res += 2;
                    } else {
                        ++res;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
