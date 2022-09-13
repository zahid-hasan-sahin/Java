package ProblemSolving4;

import java.util.Arrays;
import java.util.Scanner;

public class TroubleSort {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            boolean b = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    b = false;
                }
            }
            int o = 0;
            int z = 0;
            for (int i = 0; i < n; i++) {
                if (scan.nextInt() == 1) {
                    ++o;
                } else {
                    ++z;
                }
            }
            if (b) {
                System.out.println("Yes");
                continue;
            }
            b = false;

            if (z == 0 || o == 0) {
                b = true;
            }
            if (b) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }

        }

    }

}
