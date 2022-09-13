package ProblemSolving7;

import java.util.Scanner;

public class Maximumwidth {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String s = scan.next();
        String t = scan.next();
        int i = 0;
        int j = 0;
        int[] l = new int[m];
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                l[j] = i;
                ++j;
            }
            ++i;

        }

        i = n - 1;
        j = m - 1;
        int[] r = new int[m];
        while (i >= 0 && j>=0) {
            if (s.charAt(i) == t.charAt(j)) {
                r[j] = i;
                --j;
            }
            --i;
        }
        int res = 0;
        for (int k = 1; k < m; k++) {
            res = Math.max(res, r[k] - l[k - 1]);
        }
        System.out.println(res);
    }

}
