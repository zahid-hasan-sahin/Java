package ProblemSolving5;

import java.util.Scanner;

public class CircleColoring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                c[i] = scan.nextInt();
            }
            int[] res = new int[n];
            res[0] = a[0];
            for (int i = 1; i < n; i++) {
                if (res[i - 1] == a[i]) {
                    res[i] = b[i];
                } else {
                    res[i] = a[i];
                }
            }
            if (res[n - 1] == res[0] && res[n - 2] != a[n - 1]) {
                res[n - 1] = a[n - 1];
            }
            if (res[n - 1] == res[0] && res[n - 2] != b[n - 1]) {
                res[n - 1] = b[n - 1];
            }
            if (res[n - 1] == res[0] && res[n - 2] != c[n - 1]) {
                res[n - 1] = c[n - 1];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }

}
