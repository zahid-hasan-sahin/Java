package ProblemSolving7;

import java.util.Scanner;

public class NotAdjacentMatrix {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n == 2) {
                System.out.println("-1");
                continue k;
            }
            int c = 1;
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j += 2) {
                    a[i][j] = c++;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j += 2) {
                    a[i][j] = c++;
                }
            }
            if (n == 3) {
                System.out.println("2 9 7\n"
                        + "4 6 3\n"
                        + "1 8 5\n");
                continue;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
