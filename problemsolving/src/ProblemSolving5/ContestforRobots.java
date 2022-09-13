package ProblemSolving5;

import java.util.Scanner;

public class ContestforRobots {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 1 && b[i] == 0) {
                ++c1;
            } else if (b[i] == 1 && a[i] == 0) {
                ++c2;
            }
        }

        if (c1 == 0) {
            System.out.println("-1");
        } else {
            System.out.println((int) Math.ceil((c2 + 1) / (double) c1));
        }
    }
}
