package dp;

import java.util.Scanner;

public class BasketballExercise {

    static int rec(int[] a, int[] b, int i) {
        if (i >= a.length) {
            return 0;
        }
        int a1 = rec(a, b, i + 1) + b[i];
        int a2 = a[i] + rec(a, b, i + 1);
        if (i - 1 >= 0) {
            a1 += a[i - 1];
            a2 += b[i - 1];
        }
        if (i - 2 >= 0) {
            a2 += a[i - 2];
        }
        return Math.max(a1, a2);

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        int res = rec(a, b, 0);
        System.out.println(res);

    }

}
