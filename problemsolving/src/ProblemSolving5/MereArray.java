package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class MereArray {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] b = new int[n];
            int mn = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                b[i] = a[i];
                mn = Math.min(mn, a[i]);
            }
            Arrays.sort(b);
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    if (gcd(mn, a[i]) != mn) {
                        System.out.println("NO");
                        continue k;
                    }
                }
            }
            System.out.println("YES");
        }

    }

}
