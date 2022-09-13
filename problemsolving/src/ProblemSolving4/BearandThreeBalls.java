package ProblemSolving4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BearandThreeBalls {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (a[i] != a[j] && a[j] != a[k] && a[k] != a[i] && Math.abs(a[i] - a[j]) <= 2 && Math.abs(a[j] - a[k]) <= 2 && Math.abs(a[i] - a[k]) <= 2) {

                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }

}
