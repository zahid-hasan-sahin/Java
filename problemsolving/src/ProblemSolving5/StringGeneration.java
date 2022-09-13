package ProblemSolving5;

import java.util.Scanner;

public class StringGeneration {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            a[0] = 'a';
            a[1] = 'b';
            a[2] = 'c';
            int n = scan.nextInt();
            int k = scan.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print((char)a[i%3]);
            }
            System.out.println();
        }
    }

}
