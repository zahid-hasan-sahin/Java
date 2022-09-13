package ProblemSolving5;

import java.util.Scanner;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int[] a = new int[n];
            int c = 0;
            if (s.charAt(1) == 'L') {
                ++c;
            }
            if (s.charAt(n - 1) == 'R') {
                ++c;
            }
            a[0] = c;
            for (int i = 1; i < n - 1; i++) {
                int t = 0;
                if (s.charAt(i - 1) == 'R') {
                    ++t;
                }
                if (s.charAt(i + 1) == 'L') {
                    ++t;
                }
                a[i] = t;
            }
            c = 0;
            if (s.charAt(0) == 'L') {
                ++c;
            }
            if (s.charAt(n - 2) == 'R') {
                ++c;
            }
            a[n - 1] = c;
            c = 0;
            for (int i = 1; i < n - 1; i++) {
                if (a[i] == 1) {
                    if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i - 1)) {
                        ++c;
                    }
                }
            }
           
            System.out.println(c);

        }

    }

}
