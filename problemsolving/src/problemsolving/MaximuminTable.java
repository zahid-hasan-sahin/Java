package problemsolving;

import java.util.Scanner;

public class MaximuminTable {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] val = new int[n][n];
        for (int i = 0; i < n; i++) {
            val[0][i] = 1;
            val[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                val[i][j] = val[i-1][j] + val[i][j-1];             
            }            
        }

        System.out.println(val[n - 1][n - 1]);

    }

}
