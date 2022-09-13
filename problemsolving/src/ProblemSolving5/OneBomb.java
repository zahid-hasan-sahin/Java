package ProblemSolving5;

import java.util.Scanner;

public class OneBomb {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        char[][] a = new char[n][m];
        int x = -1;
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
                if (a[i][j] == '*') {
                    x = i;
                }
            }
        }
        int y = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j != x) {
                    if (a[i][j] == '*') {
                        y = j;
                    }
                }
            }
        }
       

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == '*') {
                    if (x == i || y == j || j == x || i == y) {
                        continue;
                    }
                    System.out.println("NO");
                   
                    return;
                }
            }
        }

        System.out.println("YES");
        System.out.println((x+1)+" "+(y+1));

    }
}
