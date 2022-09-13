package ProblemSolving4;

import java.util.Scanner;

public class NewClass2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            int s = 0;
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                s += in;
                a[i] = in;
            }

            if (s % m != 0) {
                System.out.println(n);
            } else {
                int p = s;
                int i = 0;
                for (i = 0; i < n; i++) {
                    s -= a[i];
                    if (s % m != 0) {
                        break;
                    }
                }
                int j = n - 1;
                s = p;
                for (j = n - 1; j >= 0; j--) {
                    s -= a[j];
                    if (s % m != 0) {
                        break;
                    }
                }
                System.out.println(Math.max(n - i - 1, j - 1) != 00 ? Math.max(n - i - 1, j) : -1);
            }

        }
    }
}
