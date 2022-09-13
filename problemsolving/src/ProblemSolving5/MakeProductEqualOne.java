package ProblemSolving5;

import java.util.Scanner;

public class MakeProductEqualOne {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long res = 0;
        int[] a = new int[n];
        int m = 0;
        int z = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            if (a[i] < 0) {
                ++m;
            }
            if (a[i] == 0) {
                ++z;
            }
        }
     
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            res += Math.abs(Math.abs(a[i]) - 1);
            if (a[i] > 0) {
                min = Math.min(min, a[i]);
            }
        }

        if (m % 2 == 0 || z >= 1) {
            System.out.println(res);
        } else {
            System.out.println(res + 2);
        }
    }

}
