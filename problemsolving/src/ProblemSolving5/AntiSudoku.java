package ProblemSolving5;


import java.util.Scanner;

import java.io.IOException;
import java.io.PrintWriter;

public class AntiSudoku {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        while (t-- > 0) {
            int[][] a = new int[9][9];
            for (int i = 0; i < 9; i++) {
                StringBuilder s = new StringBuilder(scan.next());
                for (int j = 0; j < 9; j++) {
                    a[i][j] = s.charAt(j) - '0';
                }
            }
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (a[i][j] == 7) {
                        out.print(9);
                    } else {
                        out.print(a[i][j]);
                    }
                }
                out.println();
            }
            
        }
        out.close();
    }
}
