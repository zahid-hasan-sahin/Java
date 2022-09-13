package ProblemSolving5;

import java.util.Scanner;

public class PlusfromPicture {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
            }
        }
        int[][] b = new int[n][m];
        boolean ch = true;
        k:

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (a[i][j] == '*') {
                    if (a[i - 1][j] == '*' && a[i][j - 1] == '*' && a[i][j + 1] == '*' && a[i + 1][j] == '*') {
                        b[i][j] = 1;
                        int k = i;
                        int p = j;
                        while (i >= 0 && a[i][j] == '*') {
                            b[i][j] = 1;
                            --i;
                        }
                        i = k;

                        while (j >= 0 && a[i][j] == '*') {
                            b[i][j] = 1;
                            --j;
                        }
                        j = p;
                        while (i < n && a[i][j] == '*') {
                            b[i][j] = 1;
                            ++i;
                        }
                        i = k;
                        while (j < m && a[i][j] == '*') {
                            b[i][j] = 1;
                            j++;
                        }
                        j = p;
                        ch = false;
                        break k;

                    }
                }
            }
        }
        if (ch) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == '*' && b[i][j] == 0) {
                    System.out.println("NO");
                    return;
                }
            }

        }
        System.out.println("YES");

    }

}
