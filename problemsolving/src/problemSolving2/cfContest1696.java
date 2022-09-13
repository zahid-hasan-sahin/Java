package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1696 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int[] a = new int[n];
            long sum1 = 0;
            long sum2 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                sum1 += a[i];
            }
            int m = scan.nextInt();
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = scan.nextInt();
                sum2 += b[i];
            }
            int c = 0;
            for (int i = 0; i < m; i++) {
                int k = b[i] / x;
                int r = a[c];
                while (true) {
                    if (r == k) {
                        break;
                    }
                    r /= x;
                    
                }
            }

        }
    }
}
/*
1
8 3
3 3 3 3 3 3 3 3
4
6 6 6 6
 */
