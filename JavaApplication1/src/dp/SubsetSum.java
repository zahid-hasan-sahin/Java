package dp;

import java.util.Scanner;

public class SubsetSum {

    static void m1(int[] a, boolean[][] b, int n, int k) {
        b[0][0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (a[i - 1] > j) {
                    b[i][j] = b[i - 1][j];
                } else {
                    b[i][j] = b[i - 1][j] || b[i - 1][j - a[i - 1]];
                }
            }
        }
    }

    static void m2(int[] a, boolean[] b, int n, int k) {
        b[0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = k; j >= a[i]; j--) {
                b[j] = b[j] || b[j - a[i]];
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int k = scan.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            boolean[] b = new boolean[k + 1];
            m2(a, b, n, k);
            if(b[k]){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }

}
