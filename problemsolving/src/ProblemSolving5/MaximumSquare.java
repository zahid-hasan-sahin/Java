package ProblemSolving5;

import java.util.Scanner;

public class MaximumSquare {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        a:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[10010];
            for (int i = 0; i < n; i++) {
                ++a[scan.nextInt()];
            }
            int k = 0;
            for (int i = 1010; i >= 0; i--) {
                k += a[i];
                if (k >= i) {
                    System.out.println(i);
                    continue a;
                }
            }

        }
    }

}
