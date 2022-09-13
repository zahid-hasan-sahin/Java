package ProblemSolving5;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        char[][] a = new char[9][9];

        for (int i = 0; i < 9; i++) {
            String s = scan.next();
            if (s.equals(" ")) {
                --i;
                continue;

            }
            String s1 = scan.next();
            String s2 = scan.next();
            int k = 0;
            for (int j = 0; j < 3; j++) {
                a[i][k++] = s.charAt(j);
            }
            for (int j = 0; j < 3; j++) {
                a[i][k++] = s1.charAt(j);
            }
            for (int j = 0; j < 3; j++) {
                a[i][k++] = s2.charAt(j);
            }
        }
        int n = scan.nextInt() - 1;
        int m = scan.nextInt() - 1;
        int l = (n % 3) * 3;
        int r = (m % 3) * 3;
        boolean b = false;
        for (int i = l; i < l + 3; i++) {
            for (int j = r; j < r + 3; j++) {
                if (a[i][j] == '.') {
                    a[i][j] = '!';
                    b = true;
                }
            }
        }
        if (b) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (j == 3 || j == 6) {
                        System.out.print(" ");
                    }
                    System.out.print(a[i][j]);
                }
                if (i == 2 || i == 5) {
                    System.out.println();
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (j == 3 || j == 6) {
                        System.out.print(" ");
                    }
                    if (a[i][j] == '.') {
                        System.out.print('!');
                    } else {
                        System.out.print(a[i][j]);
                    }
                }
                if (i == 2 || i == 5) {
                    System.out.println();
                }
                System.out.println();
            }
        }

    }

}
