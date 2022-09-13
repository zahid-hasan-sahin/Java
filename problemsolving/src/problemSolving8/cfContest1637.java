package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1637 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] t1 = new int[n];
            int[] t2 = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
                t1[i] = a[i] - b[i];
                t2[i] = b[i] - a[i];
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum1 += a[i];
                sum2 += b[i];
            }
            if (sum1 > sum2) {
                int diff = sum1 - sum2;
                
            } else {
                
            }

        }
    }
}
