package ProblemSolving5;

import java.util.HashMap;
import java.util.Scanner;

public class RotationMatching {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[scan.nextInt()] = i;
        }

        int[] r = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int u = a[scan.nextInt()] - i;
            
            if (u < 0) {
                u = n + u;
            }
            
            ++r[a[u]];

        }
        int m = 0;
        for (int i = 0; i <= n; i++) {
            m = Math.max(m, r[i]);
        }
        System.out.println(m);
    }
}
