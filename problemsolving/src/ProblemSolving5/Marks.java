package ProblemSolving5;

import java.util.Scanner;

public class Marks {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }      
        
        int[] b = new int[n+1];
        for (int i = 0; i < m; i++) {
            int mx = 0;
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx, a[j][i]);
                
            }        
            for (int j = 0; j < n; j++) {
                if (a[j][i] == mx) {                 
                    b[j] = 1;
                }
            }

        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] == 1) {
                ++c;
            }
        }
        System.out.println(c);

    }

}
