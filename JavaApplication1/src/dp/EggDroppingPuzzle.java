package dp;

import java.util.Scanner;

public class EggDroppingPuzzle {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int d = scan.nextInt();
            int f = scan.nextInt();
            int[][] a = new int[d + 1][f + 1];
            for (int i = 1; i <= d; i++) {
                a[i][1] = 1;
            }
            for (int i = 0; i <= f; i++) {
                a[1][i] = i;
            }
            for (int i = 2; i <= d; i++) {
                for (int j = 2; j <= f; j++) {
                    int m = Integer.MAX_VALUE;
                    for (int k = 2; k <= j; k++) {
                        if (j < k) {
                            m = a[i - 1][j];
                        } else {
                            m = Math.min(m, 1 + Math.max(a[i - 1][k - 1], a[i][j - k]));
                        }
                    }
                    a[i][j] = m;
                }
            }
            System.out.println(a[d][f]);

        }
    }
}
