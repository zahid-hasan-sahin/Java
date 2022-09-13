package problemSolving8;

import java.util.Scanner;

public class CaesarsLegions {

    static int lim_l, lim_h;
    static int[][][][] dp = new int[101][101][11][11];

    static int cal(int n, int f, int h, int fl, int hl) {
        if (n == 0) {
            return 1;
        }
        int x = 0;
        int y = 0;
        if (dp[f][h][fl][hl] != -1) {
            return dp[f][h][fl][hl];
        }
        if (f >= 1 && fl >= 1) {
            x = cal(n - 1, f - 1, h, fl - 1, lim_h);
        }
        if (h >= 1 && hl >= 1) {
            y = cal(n - 1, f, h - 1, lim_l, hl - 1);
        }
        return dp[f][h][fl][hl] = ((x % 100000000) + (y % 100000000)) % 100000000;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        int h = scan.nextInt();
        int fl = scan.nextInt();
        int hl = scan.nextInt();
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 11; k++) {
                    for (int l = 0; l < 11; l++) {
                        dp[i][j][k][l] = -1;
                    }
                }
            }
        }
        lim_l = fl;
        lim_h = hl;
        System.out.println(cal(f + h, f, h, fl, hl));
    }
}
