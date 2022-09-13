package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class NewClass2 {

    public static String rev(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    static boolean check(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '5' || s.charAt(i) == '8') {
                ++c;
            }
        }
        return c == s.length();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            int[] a = new int[26];
            int v = 0;
            for (int i = 0; i < n; i++) {
                ++a[s.charAt(i) - 'a'];
            }
            for (int i = 0; i < 26; i++) {
                if (a[i] % k != 0) {
                    v = 1;
                }
            }
            if (v == 0) {
                sb.append(s + "\n");
                continue k;
            }

            for (int i = n - 1; i >= 0; i--) {
                --a[s.charAt(i) - 'a'];
                int c = 0;
                for (int j = 0; j < 26; j++) {
                    if (a[j] % k != 0) {
                        c += (k - a[j] % k);
                    }
                }
                int p = c;
                for (int j = s.charAt(i) - 'a' + 1; j < 26; j++) {
                    if (a[j] % k != 0) {
                        c -= 1;
                    } else {
                        c += (k - 1);

                    }
                    if (n - i - 1 >= c && ((n - i - 1) - c) % k == 0) {

                        for (int l = 0; l < i; l++) {
                            sb.append(s.charAt(l));
                        }
                        ++a[j];
                        a[j] = a[j] % k;
                        sb.append((char) (j + 'a'));
                        for (int l = 0; l < (n - i - 1) - c; l++) {
                            sb.append('a');
                        }
                        for (int l = 0; l < 26; l++) {
                            int w = (k - a[l] % k) % k;

                            for (int m = 0; m < w; m++) {
                                sb.append((char) ('a' + l));
                            }
                        }
                        sb.append("\n");
                        continue k;

                    }
                    c = p;
                }

            }
            sb.append("-1\n");

        }
        System.out.println(sb);

    }
}
