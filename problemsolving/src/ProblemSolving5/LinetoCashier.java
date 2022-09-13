package ProblemSolving5;

import java.util.Scanner;

public class LinetoCashier {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int r = 100000000;
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < a[i]; j++) {
                int in = scan.nextInt();
                s += (in * 5);
            }
            s += (a[i]*15);
            r = Math.min(s, r);
            
        }
        System.out.println(r);
    }

}
