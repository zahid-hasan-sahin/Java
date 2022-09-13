package ProblemSolving5;

import java.util.Scanner;

public class NewClass12 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            long p = 0;
            long res = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    int k = i;
                    while (i < n && s.charAt(i) == '1') {
                        ++i;
                    }
                    res += i - 1 - k;
                    --i;
                } else if (s.charAt(i) == '0') {
                    int k = i;
                    while (i < n && s.charAt(i) == '0') {
                        ++i;
                    }
                    p += i - 1 - k;
                    --i;
                }

            }

            System.out.println(Math.max(res, p));
        }

    }
}
