package ProblemSolving5;

import java.util.Scanner;

public class SumofNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        q:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int m = scan.nextInt();
            long k = 1 << n;
            for (int i = 1; i < k; i++) {
                long s = 0;
                for (int j = 0; j < n; j++) {
                    long p = 1 << j;
                    if ((i & p) != 0) {
                        s += a[j];
                    }
                }
                if (s == m) {
                    System.out.println("YES");
                    continue q;
                }
            }
            System.out.println("NO");
        }
    }
}
