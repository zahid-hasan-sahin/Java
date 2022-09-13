package ProblemSolving5;

import java.util.Scanner;

public class LightsOut {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        boolean[][] r = new boolean[5][5];
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                r[i][j] = true;
            }
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                int in = scan.nextInt() % 2;
                if (in == 1) {
                    r[i][j] = !r[i][j];
                    r[i + 1][j] = !r[i + 1][j];
                    r[i][j + 1] = !r[i][j + 1];
                    r[i - 1][j] = !r[i - 1][j];
                    r[i][j - 1] = !r[i][j - 1];
                }

            }

        }

        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= 3; k++) {
                if (r[i][k] == true) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();

        }

    }
}
