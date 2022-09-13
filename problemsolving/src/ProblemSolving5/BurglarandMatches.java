package ProblemSolving5;


import java.util.Scanner;

public class BurglarandMatches {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (b[j] < b[j + 1]) {
                    int t = b[j];

                    b[j] = b[j + 1];
                    b[j + 1] = t;

                    int k = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = k;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            res += Math.min(a[i], n) * b[i];
            n -= Math.min(n, a[i]);
        }
        System.out.println(res);
        
    }
}
