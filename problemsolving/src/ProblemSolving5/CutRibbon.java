package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class CutRibbon {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[3];
        int[] res = new int[n + 1];

        for (int i = 0; i < 3; i++) {
            int in = scan.nextInt();

            a[i] = in;

        }
        Arrays.sort(a);
        res[0] = 1;
        for (int i = 1; i <= n; i++) {
            int m = 0;
            for (int j = 0; j < 3 && i >= a[j]; j++) {
                m = Math.max(res[i - a[j]], m);
            }
            if (m != 0) {
                res[i] = m + 1;
            }
        }
        System.out.println(res[n]-1);
    }
}
