package ProblemSolving5;

import java.util.Scanner;

public class minimumwindowsubstring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            String k = scan.next();
            int m = k.length();
            int n = s.length();
            int l = 0;
            int r = 0;
            int x = -1;
            int y = -1;
            int[] b = new int[26];
            for (int i = 0; i < m; i++) {
                ++b[k.charAt(i) - 'a'];
            }
            int mx = n;
            while (r < n) {
                int[] a = new int[26];
                for (int i = l; i <= r; i++) {
                    ++a[s.charAt(i) - 'a'];
                }
                boolean c = false;
                for (int i = 0; i < 26; i++) {
                    if (a[i] < b[i]) {
                        c = true;
                    }
                }
                if (!c) {
                    int e = (r - l) + 1;
                    if (mx > e) {
                        x = l;
                        y = r;
                        mx = e;
                    }
                    ++l;
                } else {
                    ++r;
                }
            }
            if (x == -1 || y == -1) {
                System.out.print(-1);
            } else {
               
                for (int i = x; i <= y; i++) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
