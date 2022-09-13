package problemSolving8;

import java.util.Scanner;

public class MagicOddSquare {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] res = new int[n][n];
        int m = n / 2;
        int o = 1;
        int e = 2;
        for (int i = 0; i < n; i++) {
            res[i][m] = o;
            o += 2;
        }
        for (int i = 0; i < n; i++) {
            if (i == m) {
                continue;
            }
            res[m][i] = o;
            o += 2;
        }
        if (n % 4 == 1) {
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < n; j += 2) {
                    if (res[i][j] == 0) {
                        res[i][j] = o;
                        o += 2;
                    }
                }
            }
        } else {
            for (int i = 1; i < n; i += 2) {
                for (int j = 1; j < n; j += 2) {
                    if (res[i][j] == 0) {
                        res[i][j] = o;
                        o += 2;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] == 0) {
                    res[i][j] = e;
                    e += 2;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
