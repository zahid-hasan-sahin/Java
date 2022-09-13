package ProblemSolving7;

import java.util.Scanner;

public class ArrangingTheSheep {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int total = 0;
            int[] next = new int[n];
            int c = -1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '*') {

                    ++total;
                }
            }
            int r = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == '*') {
                    next[i] = c;
                    c = i;
                    r = i;
                }
            }
            int curr = 0;
            long res = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '*' && curr + 1 < total - curr) {
                    int k = next[i] - i - 1;
                    ++curr;
                    res += (curr * k);
                    r = next[i];
                    
                } else if (s.charAt(i) == '*') {
                    res += (i - r);
                  
                    ++r;

                }
            }
            System.out.println(res);
        }
    }
}
