package ProblemSolving7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();

            int r = 0;
            if (n - 2 <= a) {

                r += a - (n - 2);
            }
            if (n - 2 <= c) {

                r += c - (n - 2);
            }
            if (b + d < r) {
                System.out.println("NO");
                continue;
            }

            r -= Math.min(b, 2);
            if (r > d) {
                System.out.println("NO");
                continue;
            }
            r = 0;
            if (n - 2 <= b) {
                r += b - (n - 2);
            }
            if (n - 2 <= d) {

                r += d - (n - 2);
            }
            if (a + c < r) {
                System.out.println("NO");
                continue;
            }
            r -= Math.min(a, 2);

            if (r > c) {
                System.out.println("NO");
                continue;
            }

            r = 0;
            if (n - 2 <= a) {

                r += a - (n - 2);
            }
            if (n - 2 <= c) {

                r += c - (n - 2);
            }
            if (b + d < r) {
                System.out.println("NO");
                continue;
            }
            r -= Math.min(d, 2);

            if (r > b) {
                System.out.println("NO");
                continue;
            }
            r = 0;
            if (n - 2 <= b) {
                r += b - (n - 2);
            }
            if (n - 2 <= d) {

                r += d - (n - 2);
            }
            if (a + c < r) {
                System.out.println("NO");
                continue;
            }
            r -= Math.min(c, 2);

            if (r > a) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
        }
    }
}
