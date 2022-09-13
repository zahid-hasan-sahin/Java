package ProblemSolving4;

import java.util.Scanner;

public class Timofeyandcubes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l += 2;
            r -= 2;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
