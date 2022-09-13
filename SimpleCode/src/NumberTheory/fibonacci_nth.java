package NumberTheory;

import java.util.Scanner;

public class fibonacci_nth {

    public static void mul(int[][] res, int[][] mat, int n, int m) {
        long[][] temp = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    temp[i][j] = (temp[i][j] + ((long) res[i][k] * mat[k][j]) % 1000000007) % 1000000007;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = (int) temp[i][j];
            }
        }
    }

    public static void expon(int[][] mat, int n) {
        int[][] res = new int[2][2];
        for (int i = 0; i < 2; i++) {
            res[i][i] = 1;
        }
        while (n != 0) {
            if (n % 2 == 1) {
                mul(res, mat, 2, 2);
                --n;
            }
            mul(mat, mat, 2, 2);
            n = n / 2;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat[i][j] = res[i][j];
            }
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {

            int n = scan.nextInt();
            int[][] mat = new int[2][2];
            mat[0][0] = 0;
            mat[0][1] = 1;
            mat[1][0] = 1;
            mat[1][1] = 1;
            expon(mat, n);
            int[][] temp = new int[1][2];
            temp[0][0] = 0;
            temp[0][1] = 1;
            mul(temp, mat, 1, 2);
            System.out.println(temp[0][0]);
        }

    }
}
