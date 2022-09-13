package ProblemSolving5;

import java.util.Scanner;

public class NewClass {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            if (a[0] + a[1] <= a[n - 1]) {
                System.out.println(1 + " " + 2 + " " + (n ));
            } else {
                System.out.println("-1");
            }

        }
    }

}
