package ProblemSolving7;

import java.util.Scanner;

public class KthLargestValue {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] a = new int[n + 1];
        int one = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
            if (a[i] == 1) {
                ++one;
            }
        }
        while (q-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x == 1) {
                if (a[y] == 0) {
                    ++one;
                    a[y] = 1;
                } else {
                    --one;
                    a[y] = 0;
                }
            } else {
                if (y <= one) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        }

    }

}
