package ProblemSolving5;

import java.util.Scanner;

public class MakeaSquareusingBitmask {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int r = 11111111;
        int n = s.length();
        for (int i = 1; i < Math.pow(2, n); i++) {
            String k = "";
            for (int j = 0; j < n; j++) {
                int p = 1 << j;
                if ((p & i) != 0) {
                    k += s.charAt(j);
                }
            }
            int w = Integer.valueOf(k);
            if (k.charAt(0) != '0' && (int) Math.sqrt(w) * (int) Math.sqrt(w) == w) {
                r = Math.min(r, n - k.length());
            }
        }
        if (r == 11111111) {
            System.out.println(-1);
        } else {
            System.out.println(r);
        }
    }

}
