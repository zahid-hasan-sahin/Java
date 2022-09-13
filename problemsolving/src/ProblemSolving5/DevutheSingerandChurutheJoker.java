package ProblemSolving5;

import java.util.Scanner;

public class DevutheSingerandChurutheJoker {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] a = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            s += a[i];
        }
        if ((n - 1) * 10 + s > d) {
            System.out.println("-1");
        } else {
            int k = (d - s) / 5;
            System.out.println(k);
        }

    }

}
