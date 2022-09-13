package ProblemSolving5;

import java.util.Scanner;

public class Pipes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[][] a = new int[2][n];
            for (int i = 0; i < 2; i++) {
                String s = scan.next();
                for (int j = 0; j < s.length(); j++) {
                    a[i][j] = s.charAt(j) - '0';
                }
            }
            int c = 0;
            boolean b = true;
            for (int i = 0; i < n; i++) {
                if (a[c][i] >= 3) {
                    if (a[c ^ 1][i] <= 2) {
                        b = false;
                    } else {
                        c ^= 1;
                    }
                }
            }
            if (b && c == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
