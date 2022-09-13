package ProblemSolving5;

import java.util.ArrayList;
import java.util.Scanner;

public class PainttheDigits {

    public static String rev(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        k:
        while (q-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int mx = 0;
            for (int i = 0; i < n; i++) {
                mx = Math.max(mx, s.charAt(i) - '0');
            }

            String r = "";
            int e = n - 1;
            while (e >= 1 && s.charAt(e) - '0' == mx) {
                --e;
            }
            int mn = s.charAt(e) - '0';

            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) - '0' <= mn) {
                    System.out.println(mn);
                    r += 1;
                    mn = Math.min(s.charAt(i) - '0', mn);
                } else {
                    r += 2;
                    mx = Math.max(s.charAt(i) - '0', mx);
                }
            }
            r = rev(r);

            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (r.charAt(i) == '2') {
                    a.add(s.charAt(i) - '0');
                } else {
                    b.add(s.charAt(i) - '0');
                }
            }
            System.out.println(a+" "+b);
            int p = a.size();
            for (int i = 0; i < p - 1; i++) {
                if (a.get(i) > a.get(i + 1)) {
                    System.out.println("-");
                    continue k;
                }
            }
            p = b.size();
            for (int i = 0; i < p - 1; i++) {
                if (b.get(i) > b.get(i + 1)) {
                    System.out.println("-");
                    continue k;
                }
            }
            
            if (a.size() == 0 || b.size() == 0 || b.get(b.size() - 1) <= a.get(0)) {
                System.out.println(r);
            } else {
                System.out.println("-");
            }

        }
    }

}
