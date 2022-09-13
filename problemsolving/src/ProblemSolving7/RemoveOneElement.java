package ProblemSolving7;

import java.util.Scanner;

public class RemoveOneElement {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int res = 0;
        int m = 1;
        boolean b = false;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] >= a[i]) {
                if (b) {
                    m = 1;
                    b = false;
                } else {
                    b = true;
                }
            } else {
                ++m;
            }
            res = Math.max(res, m);
        }
        System.out.println(res);

    }
}
