package ProblemSolving5;

import java.util.Scanner;

public class Boredom {

    static int[] a = new int[1000005];
    static int[] dp = new int[1000005];

    static int cal(int n) {

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a[n] * n;
        }
        int res = 0;
        res += 1;
        int p = a[n - 1] * cal(n - 1);
        int q = a[n - 2] * cal(n - 2);
        int t = a[n] * n;
        System.out.println(p + " " + q + " " + t + " " + n);

        if (p >= t + q) {
            a[n] = 0;
            a[n - 2] = 0;
            res += p;

        }
        return res;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            ++a[scan.nextInt()];
        }

        System.out.println(cal(9));
    }
}
