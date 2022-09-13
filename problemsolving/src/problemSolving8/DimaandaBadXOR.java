package problemSolving8;

import java.util.HashSet;
import java.util.Scanner;

public class DimaandaBadXOR {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] a = new int[n][m];
        int[] f = new int[1024];
        int xor = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
                if (j == 0) {
                    xor ^= a[i][j];
                }
            }
        }
        if (xor > 0) {
            System.out.println("TAK");
            for (int i = 0; i < n; i++) {
                System.out.print(1 + " ");
            }
            return;
        }
        int[] res = new int[n];
        k:
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                int p = xor ^ a[i][0] ^ a[i][j];
                if (p > 0) {
                    xor ^= a[i][0] ^ a[i][j];
                    res[i] = j;
                    break k;
                }
            }
        }
        if (xor > 0) {
            System.out.println("TAK");
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + 1 + " ");
            }
            System.out.println();
        } else {
            System.out.println("NIE");
        }

    }

}
