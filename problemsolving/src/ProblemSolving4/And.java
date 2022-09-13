package ProblemSolving4;

import java.util.Scanner;

public class And {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int a[] = new int[100010];
        boolean b = false;
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            t[i] = in;
            if (a[in] >= 1) {
                b = true;
            } else {
                ++a[in];
            }
        }
        if (b) {
            System.out.println("0");
            return;
        }
        int[] p = new int[100010];
        for (int i = 0; i < n; i++) {
            int y = t[i] & k;
            if (a[y] >= 1) {
                System.out.println(t[i]+" "+y);
                b = true;
                break;
            } else {
                p[y] = 1;
            }

        }
        if (b) {
            System.out.println("1");
            return;
        }
        for (int i = 0; i < n; i++) {
            int y = t[i] & k;
            if (p[y] >= 1) {
                b = true;
            } else {
                p[y] = 1;
            }
        }
        if (b) {
            System.out.println("2");
            return;
        }
        System.out.println("-1");

    }

}
