package ProblemSolving7;

import java.util.Scanner;

public class PermutationTransformation {

    static int[] res = new int[110];

    static void rec(int[] a, int l, int r, int p) {
        if (l == r) {
            res[l] = p;
            return;
        }
        int k = l;
        for (int i = l; i <= r; i++) {
            if (a[k] < a[i]) {
                k = i;
            }
        }
        res[k] = p;
        if (k == l) {

            rec(a, k + 1, r, p + 1);
        } else if (k == r) {
            rec(a, l, k - 1, p + 1);

        } else {
            rec(a, l, k - 1, p + 1);
            rec(a, k + 1, r, p + 1);
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            rec(a, 0, n - 1, 0);
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();

        }
    }

}
