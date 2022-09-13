package ProblemSolving7;

import java.util.Scanner;

public class flippingGameKadensalgo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (in == 0) {
                a[i] = 1;
            } else {
                a[i] = -1;
            }

        }
        int res = Integer.MIN_VALUE;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max += a[i];
            System.out.println(max);
            res = Math.max(res, max);
         //   max = Math.max(max, 0);
        }
        System.out.println(res);
    }

}
