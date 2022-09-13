package ProblemSolving7;

import java.util.Scanner;

public class Education {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            long[] a = new long[n];
            long[] b = new long[n - 1];
            long res = 1000000000;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                b[i] = scan.nextInt();
            }
            long[] min = new long[n];
            long got = 0;
            for (int i = 0; i < n; i++) {
                res = Math.min(res, min[i] + (int) Math.ceil((double) (m - got) / a[i]));
                if (i < n - 1) {
                    min[i + 1] = min[i] + (long) Math.ceil((double) (b[i] - got) / a[i]) + 1;
                    got = ((long) Math.ceil((double) (b[i] - got) / a[i]) * a[i]) - (b[i] - got);

                }

            }
            System.out.println(res);
        }

    }
}
