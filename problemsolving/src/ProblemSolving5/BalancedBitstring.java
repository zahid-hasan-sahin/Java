package ProblemSolving5;

import java.util.Scanner;

public class BalancedBitstring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        q:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            char[] a = s.toCharArray();
            for (int i = 0; i < n - k; i++) {
                if ((a[i] == '1' && a[i + k] == '?') || (a[i] == '?' && a[i + k] == '1')) {
                    a[i + k] = '1';
                } else if ((a[i] == '0' && a[i + k] == '?') || (a[i] == '?' && a[i + k] == '0')) {
                    a[i + k] = '0';
                } else if (a[i] != a[i + k]) {
                    ;
                    System.out.println("NO");
                    continue q;
                }
            }
            for (int i = n - 1; i >= k; i--) {
                if (a[i] == '1' && a[i - k] == '?') {
                    a[i - k] = '1';
                } else if (a[i] == '0' && a[i - k] == '?') {
                    a[i - k] = '0';
                } else if (a[i] != a[i - k]) {
                    System.out.println("NO");
                    continue q;
                }
            }
            int z = 0;
            int o = 0;
            int y = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == '1') {
                    ++o;
                } else if (a[i] == '0') {
                    ++z;
                } else {
                    ++y;
                }
                if ((i + 1) % k == 0) {
                    int p = Math.abs(o - z);
                    int w = y - p;
                    o = z = y = 0;
                    if (w < 0 || w % 2 == 1) {
                        System.out.println("NO");
                        continue q;
                    }
                }
            }
            System.out.println("YES");
        }
    }
}
