package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class VladikandComplicatedBook {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            a[i] = in;

        }
        q:
        while (m-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int x = scan.nextInt();
            int p = a[x - 1];
            int mn = 0;
            int mx = 0;
            for (int i = l - 1; i < x - 1; i++) {
                if (a[i] > p) {
                    ++mx;
                }
            }
            for (int i = x; i < r; i++) {

                if (a[i] < p) {
                    ++mn;
                }
            }
            if (mx == mn) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

}
