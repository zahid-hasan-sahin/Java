package problemSolving8;

import java.util.Scanner;

public class cfContest1546 {

    static void buildSeg(long[] a, long[] tree, int sIndex, int sStart, int sEnd) {

        if (sStart == sEnd) {
            tree[sIndex] = a[sStart];
            return;
        }
        int m = (sStart + sEnd) / 2;
        buildSeg(a, tree, sIndex * 2, sStart, m);
        buildSeg(a, tree, sIndex * 2 + 1, m + 1, sEnd);
        tree[sIndex] = Math.min(tree[sIndex * 2], tree[sIndex * 2 + 1]);
    }

    static void updateRange(long[] tree, long lazy[], int sIndex, int sStart, int sEnd, int rStart, int rEnd, long val) {

        if (lazy[sIndex] != 0) {
            tree[sIndex] += lazy[sIndex];
            if (sStart != sEnd) {
                lazy[sIndex * 2] += lazy[sIndex];
                lazy[sIndex * 2 + 1] += lazy[sIndex];
            }
            lazy[sIndex] = 0;
        }

        if (sStart > rEnd || sEnd < rStart) {
            return;
        }
        if (sStart >= rStart && sEnd <= rEnd) {
            tree[sIndex] += val;
            if (sStart != sEnd) {
                lazy[sIndex * 2] += val;
                lazy[sIndex * 2 + 1] += val;
            }
            return;
        }
        int m = (sStart + sEnd) / 2;
        updateRange(tree, lazy, sIndex * 2, sStart, m, rStart, rEnd, val);
        updateRange(tree, lazy, sIndex * 2 + 1, m + 1, sEnd, rStart, rEnd, val);
        tree[sIndex] = Math.min(tree[sIndex * 2], tree[sIndex * 2 + 1]);
    }

    static long rangeQuery(long[] tree, long[] lazy, int sIndex, int sStart, int sEnd, int qStart, int qEnd) {
        if (lazy[sIndex] != 0) {
            tree[sIndex] += lazy[sIndex];
            if (sStart != sEnd) {
                lazy[sIndex * 2] += lazy[sIndex];
                lazy[sIndex * 2 + 1] += lazy[sIndex];
            }
            lazy[sIndex] = 0;
        }

        if (sStart > qEnd || sEnd < qStart) {
            return Integer.MAX_VALUE;
        }
        if (sStart >= qStart && sEnd <= qEnd) {
            return tree[sIndex];
        }
        int m = (sStart + sEnd) / 2;
        long left = rangeQuery(tree, lazy, sIndex * 2, sStart, m, qStart, qEnd);
        long right = rangeQuery(tree, lazy, sIndex * 2 + 1, m + 1, sEnd, qStart, qEnd);
        return Math.min(left, right);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int len = scan.nextInt();
            long[] a = new long[n + 1];
            long[] tree = new long[n * 4];
            long[] lazy = new long[n * 4];
            long[] ar = new long[len + 1];
            long[] in = new long[len + 1];
            for (int i = 1; i <= len; i++) {
                ar[i] = scan.nextInt();
            }
            for (int i = 1; i <= len; i++) {
                in[i] = scan.nextInt();
            }

            for (int i = 1; i <= len; i++) {
                a[(int) ar[i]] = ar[i] + in[i];
            }
            for (int i = 1; i <= n; i++) {
                if (a[i] == 0) {
                    a[i] = Integer.MAX_VALUE;
                }
            }

            buildSeg(a, tree, 1, 1, n);

            for (int i = 1; i <= n; i++) {
                updateRange(tree, lazy, 1, 1, n, 1, i - 1, 1);
                updateRange(tree, lazy, 1, 1, n, i, n, -1);
                long res = rangeQuery(tree, lazy, 1, 1, n, 1, n);
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }

}
