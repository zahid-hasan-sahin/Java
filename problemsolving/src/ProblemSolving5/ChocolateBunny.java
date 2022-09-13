package ProblemSolving5;

import java.util.Scanner;

public class ChocolateBunny {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];

        int i = 1;
        int j = 2;
        while (i <= n && j <= n) {
            while (i <= n && a[i] != 0 || i == j) {
                ++i;
            }
            while (j <= n && a[j] != 0 || i == j) {
                ++j;
            }
            if (i > n || j > n) {
                break;
            }
            System.out.println("? " + i + " " + j);
            int p = scan.nextInt();
            System.out.println("? " + j + " " + i);
            int q = scan.nextInt();
            if (p > q) {
                a[i++] = p;
            } else {
                a[j++] = q;
            }
        }
        for (int k = 1; k <= n; k++) {
            if (a[k] == 0) {
                a[k] = n;
                break;
            }
        }
        System.out.print("! ");
        for (int k = 1; k <= n; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }
}
