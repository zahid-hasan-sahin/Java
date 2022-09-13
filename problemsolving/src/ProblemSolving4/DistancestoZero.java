package ProblemSolving4;

import java.util.ArrayList;
import java.util.Scanner;

public class DistancestoZero {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            a[i] = in;
        }
        int[] pr = new int[n];
        int[] ps = new int[n];
        int y = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                y = i;
               
            }
            pr[i] = Math.abs(y - i);
        }
        y = Integer.MAX_VALUE;
        for (int i = n-1; i >=0;i--) {
            if (a[i] == 0) {
                y = i;
               
            }
            ps[i] = Math.abs(y - i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(Math.min(ps[i], pr[i])+" ");
        }
        System.out.println();
    }

}
