package ProblemSolving5;

import java.util.Scanner;

public class FindingSasuke {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i += 2) {
                System.out.print(-a[i+1] + " " + a[i] + " ");
            }
            System.out.println();
        }
    }

}
