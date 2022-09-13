package ProblemSolving7;

import java.util.Scanner;

public class NastiaandaGoodArray {

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int pr = 1000000007;
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            StringBuilder sb = new StringBuilder();
            int res = 0;
            for (int i = 1; i < n; i += 2) {
                int l = a[i - 1];
                int r = a[i];
                if (l < r) {
                    ++res;
                    sb.append(i + " " + (i + 1) + " " + l + " " + pr + "\n");
                } else {
                    ++res;
                    sb.append(i + " " + (i + 1) + " " + r + " " + pr + "\n");
                }

            }
            System.out.println(res);
            if (sb.length() > 0) {
                System.out.println(sb.delete(sb.length() - 1, sb.length()));
            }
        }
    }
}
