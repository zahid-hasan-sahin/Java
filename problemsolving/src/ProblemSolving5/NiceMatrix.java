package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class NiceMatrix {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scan.nextInt();
                }
            }
            long res = 0;
            for (int i = 0; i < Math.ceil(n / 2.0); i++) {
                for (int j = 0; j < Math.ceil(m / 2.0); j++) {
                    int[] k = {a[i][j], a[n - i - 1][j], a[n - i - 1][m - j - 1], a[i][m - j - 1]};
                    Arrays.sort(k);
                    res += (k[3] + k[2]) - (k[0] + k[1]);
                }
            }
            System.out.println(res);
        }
    }
}
