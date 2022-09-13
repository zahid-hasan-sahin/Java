package ProblemSolving4;

import java.util.Scanner;

public class FaceDetection {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
            }
        }
        
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                String s = String.valueOf(a[i][j]) + String.valueOf(a[i][j + 1]) + String.valueOf(a[i + 1][j]) + (char) a[i + 1][j + 1];
                char[] b = s.toCharArray();
            }
        }
    }
}
