package ProblemSolving5;

import java.util.Scanner;

public class CanceltheTrains {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[1000];
            for (int i = 0; i < n; i++) {
                ++a[scan.nextInt()];
            }
            int res = 0;
            for (int i = 0; i < m; i++) {
                int in = scan.nextInt();
                if (a[in] >= 1) {
                    ++res;
                }
            }
            System.out.println(res);
        }

    }
}
