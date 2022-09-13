package ProblemSolving4;

import java.util.Scanner;

public class DuffandMeat {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            p[i] = scan.nextInt();
        }
        int m = p[0];
        int res = 0;
        for (int i = 0; i < n; i++) {
            m = Math.min(p[i], m);
            res += (a[i] * m);
        }

        System.out.println(res);
    }

}
