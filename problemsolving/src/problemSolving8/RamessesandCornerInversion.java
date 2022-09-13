package problemSolving8;

import java.util.Scanner;

public class RamessesandCornerInversion {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != b[i][j]) {
                    if (i == n - 1 || j == m - 1) {
                        System.out.println("NO");
                        return;
                    }
                    a[i][j] ^= 1;
                    a[i + 1][j] ^= 1;
                    a[i][j + 1] ^= 1;
                    a[i + 1][j + 1] ^= 1;
                }
            }
        }
        System.out.println("YES");
    }
}
