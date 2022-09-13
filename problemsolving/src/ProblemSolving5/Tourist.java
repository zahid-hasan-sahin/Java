package ProblemSolving5;

import java.util.Scanner;

public class Tourist {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            t[i] = scan.nextInt();
        }
        int v = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = -a[i] + v * t[i];
            y[i] = a[i] + v * t[i];
            System.out.println(x[i] + " " + y[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (x[i] > x[j]) {
                    int w = x[i];
                    x[i] = x[j];
                    x[j] = w;
                    w = y[i];
                    y[i] = y[j];
                    y[j] = w;
                } else if (a[i] == a[j] && y[i] > y[j]) {
                    int w = x[i];
                    x[i] = x[j];
                    x[j] = w;
                    w = y[i];
                    y[i] = y[j];
                    y[j] = w;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(y[i] + " ");
        }
        System.out.println();

    }

}
