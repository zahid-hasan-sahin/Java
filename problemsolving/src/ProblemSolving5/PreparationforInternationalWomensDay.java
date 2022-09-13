package ProblemSolving5;

import java.util.Scanner;

public class PreparationforInternationalWomensDay {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] t = new int[105];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt() % k;
            t[a[i]]++;
        }
        long res = t[0] / 2;
        t[0] -= (res * 2);

        for (int i = 1; i <= k / 2; i++) {
            int in = 0;
            if (i == k - i) {
                in = t[i] / 2;
                res += in;
                t[i] -= in;
            } else {
                in = Math.min(t[i], t[k - i]);
                res += in;
                t[i] -= in;
                t[k - i] = in;
            }
        }
        System.out.println(res * 2);
    }

}
