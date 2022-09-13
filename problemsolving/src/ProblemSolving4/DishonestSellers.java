package ProblemSolving4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DishonestSellers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        long s = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
            s += b[i];
            c[i] = a[i] - b[i];
        }
        Arrays.sort(c);

        for (int i = 0; i < n; i++) {

            if (k > i || c[i] < 0) {
                s += c[i];
            }
        }
        System.out.println(s);

    }

}
