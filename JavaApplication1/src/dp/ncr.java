package dp;

import java.util.Scanner;

public class ncr {

    static long[][] arra = new long[1000][1000];

    public static long nCr(int n, int r) {
        if (n == r) {
            return 1;
        }
        if (r == 1) {
            return n;
        }
        if (arra[n][r] != 0) {
            return arra[n][r];
        }
        return arra[n][r] = nCr(n - 1, r) + nCr(n - 1, r - 1);
    }

    public static void main(String args[]) {
        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                if (i == j) {
                    arra[i][j] = 1;
                } else if (j == 1) {
                    arra[i][j] = i;
                } else {
                    arra[i][j] = arra[i - 1][j] + arra[i - 1][j - 1];
                }
            }
            
        }
        System.out.println(arra[2][1]);

    }

}
