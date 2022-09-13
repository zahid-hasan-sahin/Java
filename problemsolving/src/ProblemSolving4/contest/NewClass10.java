package ProblemSolving4;

import java.util.Scanner;

public class NewClass10 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            char[][] a = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = scan.next();
                for (int j = 0; j < m; j++) {
                    a[i][j] = s.charAt(j);
                }
            }
            int c = 0;
            for (int i = 0; i < m; i++) {
               
                if (a[n - 1][i] == 'D') {
                    ++c;
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i][m - 1] == 'R') {
                    ++c;
                }
            }

            System.out.println(c);
        }

    }

}
