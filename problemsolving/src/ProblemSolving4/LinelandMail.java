package ProblemSolving4;

import java.util.Scanner;

public class LinelandMail {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int t = (int) Math.sqrt(Math.pow(a[0] - a[1], 2));
        int w = (int) Math.sqrt(Math.pow(a[0] - a[n - 1], 2));
        System.out.println(t + " " + w);
        for (int i = 1; i < n - 1; i++) {
            int x = (int) Math.sqrt(Math.pow(a[i] - a[i + 1], 2));
            int y = (int) Math.sqrt(Math.pow(a[i] - a[i - 1], 2));
            int p = (int) Math.sqrt(Math.pow(a[n - 1] - a[i], 2));
            int r = (int) Math.sqrt(Math.pow(a[0] - a[i], 2));
            System.out.println(Math.min(x, y) + " " + Math.max(p, r));
        }
        t = (int) Math.sqrt(Math.pow(a[n - 1] - a[n - 2], 2));
        System.out.println(t + " " + w);
    }

}
