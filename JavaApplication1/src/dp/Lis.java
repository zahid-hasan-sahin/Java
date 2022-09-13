package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class Lis {

    static int[][] dp = new int[1010][1010];

    static int Lis(int[] a, int i, int p) {
        if (i >= a.length) {
            return 0;
        }
        if (dp[i][p] != -1) {
            return dp[i][p];
        }
        int res1 = Lis(a, i + 1, p);
        int res2 = 0;
        if (a[i] > a[p]) {
            res2 = Lis(a, i + 1, i) + 1;
        }
        return dp[i][p] = Math.max(res1, res2);

    }

    public static void main(String args[]) {
        for (int i = 0; i < 1010; i++) {
            for (int j = 0; j < 1010; j++) {
                dp[i][j] = -1;
            }
        }
        Scanner scan = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, -1};
        System.out.println(Lis(a, 0, a.length - 1));

    }
}
