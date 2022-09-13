package ProblemSolving7;

import java.util.Scanner;

public class BalancedRemainders {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[3];
            for (int i = 0; i < n; i++) {
                int p = scan.nextInt() % 3;
                ++a[p];
            }
            int p = n / 3;
            int res = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    if (a[j] > p) {
                        res += (a[j] - p);
                        a[(j + 1) % 3] += (a[j] - p);
                        a[j] = p;
                    }
                }
            }
            System.out.println(res);

        }
    }
}
