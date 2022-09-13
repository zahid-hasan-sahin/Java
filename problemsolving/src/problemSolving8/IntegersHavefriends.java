package problemSolving8;

import java.util.Scanner;

public class IntegersHavefriends {

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static long build(long[] tree, long[] a, int s, int l, int r) {
        if (l == r) {
            return tree[s] = a[l];

        }
        int m = (l + r) / 2;
        long left = build(tree, a, s * 2 + 1, l, m);
        long right = build(tree, a, s * 2 + 2, m + 1, r);
        return tree[s] = gcd(left, right);
    }

    static long query(long[] tree, long[] a, int s, int l, int r, int l2, int r2) {
        if (l > r2 || r < l2) {
            return 0;
        }
        if (l2 <= l && r <= r2) {
            return tree[s];
        }
        int m = (l + r) / 2;
        long left = query(tree, a, s * 2 + 1, l, m, l2, r2);
        long right = query(tree, a, s * 2 + 2, m + 1, r, l2, r2);;
        return gcd(left, right);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextLong();
            }

            long[] diff = new long[n];
            for (int i = 0; i < n - 1; i++) {
                diff[i] = Math.abs(a[i + 1] - a[i]);
            }
            long[] tree = new long[4 * n];
            --n;
            build(tree, diff, 0, 0, Math.max(0,n - 1));
            int l = 0;
            long res = 1;
            for (int i = 0; i < n; i++) {
                while (l <= i && query(tree, diff, 0, 0, n - 1, l, i) <= 1) {
                    ++l;
                }

                res = Math.max(res, i - l + 2);
            }
            System.out.println(res);
        }

    }
}
