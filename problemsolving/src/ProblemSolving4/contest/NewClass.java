package ProblemSolving4;

import java.util.Scanner;

public class NewClass {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = scan.nextInt();
                }
            }
            int c = 0;
            int r = 0;
            for (int i = 0; i < n; i++) {
                int k = 0;
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] == 0) {
                        ++k;
                    }
                }
             
                if (k == m) {
                    ++r;
                }
            }
            for (int i = 0; i < m; i++) {
                int k = 0;
                for (int j = 0; j < n; j++) {
                    if (mat[j][i] == 0) {
                        ++k;
                    }
                }
                if (k == n) {
                    ++c;
                }
            }
            System.out.println(Math.min(r,c)%2==0?"Vivek":"Ashish");

        }

    }

}
