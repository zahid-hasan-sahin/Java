package ProblemSolving5;

import java.util.Scanner;

public class MinimumDifficulty {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        a[0] = scan.nextInt();
        a[1] = scan.nextInt();
        int m = a[1] - a[0];
        for (int i = 2; i < n; i++) {
            a[i] = scan.nextInt();
            m = Math.max(m, a[i] - a[i - 1]);
        }
       
        int k = 100000;
        for (int i = 0; i < n - 2; i++) {
            k = Math.min(k, a[i + 2] - a[i]);
        }
        System.out.println(Math.max(k, m));

    }

}
