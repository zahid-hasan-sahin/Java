package ProblemSolving4;

import java.util.Scanner;

public class Solutions {

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        long[] a = new long[5000010];
        for (int i = 0; i < 5000010; i++) {
            a[i] = i;
        }
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < 5000010; i++) {
            if (a[i] == i) {
                for (int j = i; j < 5000010; j += i) {
                    a[j] = a[j] / i;
                    a[j] = a[j] * (i - 1);
                }
            }
        }
        double[] r = new double[5000010];
        for (int i = 1; i < 5000010; i++) {
            r[i] = r[i - 1] + (long) Math.pow(a[i], 2);
        }
        int t = scan.nextInt();
        int p = 1;
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.printf("Case %d: %.0f\n", p, (r[m] - r[n - 1]));
            ++p;
        }
    }

}
