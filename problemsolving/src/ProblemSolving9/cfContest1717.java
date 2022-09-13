package ProblemSolving9;

import java.util.Scanner;

public class cfContest1717 {

    static void rec(char[][] res, int n, int i, int j, int k) {
        // System.out.println(i+" "+j);
        if (i <= 0 || i > n || j <= 0 || j > n || res[i][j] == 'X') {
            return;
        }

        res[i][j] = 'X';
        rec(res, n, i - 1, j + 1, k);
        rec(res, n, i + 1, j - 1, k);
        rec(res, n, i + k, j, k);
        rec(res, n, i, j + k, k);
        rec(res, n, i - k, j, k);
        rec(res, n, i, j - k, k);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int r = scan.nextInt();
            int c = scan.nextInt();
            char[][] res = new char[n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    res[i][j] = '.';
                }
            }
            rec(res, n, r, c, k);

            k:
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (res[i][j] == 'X') {
                        rec(res, n, i - 1, j - k + 1, k);
                        break k;
                    }
                }
            }

            k:
            for (int i = n; i >= 1; i--) {
                for (int j = n; j >= 1; j--) {
                    if (res[i][j] == 'X') {
                        rec(res, n, i - 1, j - k + 1, k);
                        break k;
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(res[i][j]);
                }
                System.out.println();
            }

        }
    }
}
