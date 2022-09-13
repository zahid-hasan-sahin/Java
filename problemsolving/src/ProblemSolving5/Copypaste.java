package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class Copypaste {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();

            }
            Arrays.sort(a);
            int p = a[0];
            int res = 0;
            for (int i = 1; i < n; i++) {
                int e = k - a[i];
                res += (e/p);
            }
            System.out.println(res);
        }
    }
}
