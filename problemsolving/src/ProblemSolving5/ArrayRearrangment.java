package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRearrangment {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        a:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int x = scan.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);

            for (int i = 0; i < n; i++) {
                if (a[i] + b[n - i - 1] > x) {
                    System.out.println("No");
                    continue a;
                }
            }
            System.out.println("Yes");
        }
    }

}
