package ProblemSolving5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SwapAdjacentElements {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
        String s = scan.next();
        for (int i = 1; i < n; i++) {
            b[i] = s.charAt(i - 1) - '0';
        }
        for (int i = 1; i < n; i++) {
            if (b[i] == 1) {
                int k = i;
                while (i < n && b[i] == 1) {
                    ++i;
                }
                Arrays.sort(a, k, i + 1);
            
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > a[i + 1]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}
