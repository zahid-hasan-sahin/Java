package SegmentTree;

import java.util.Scanner;

public class firstGreaterElement {

    static void buildSeg(long[] a, long[] tree, int sIndex, int sStart, int sEnd) {

        if (sStart == sEnd) {
            tree[sIndex] = a[sStart];
            return;
        }
        int m = (sStart + sEnd) / 2;
        buildSeg(a, tree, sIndex * 2, sStart, m);
        buildSeg(a, tree, sIndex * 2 + 1, m + 1, sEnd);
        tree[sIndex] = Math.max(tree[sIndex * 2], tree[sIndex * 2 + 1]);
    }

    static long query(long[] a, long[] tree, int sIndex, int sStart, int sEnd, int qStart, int qEnd, int x) {
        if (sEnd < qStart) {
            return -1;
        } else if (sStart > qEnd) {
            return -1;
        }
        if (sStart >= qStart && sEnd <= qEnd) {
            if (tree[sIndex] <= x) {
                return -1;
            }

            int l = sStart;
            int r = sEnd;
            while (l != r) {
               
                int mid = (l + r) / 2;
                if (tree[2 * sIndex] > x) {
                    r = mid;
                    sIndex = 2 * sIndex;
                } else {
                    l = mid + 1;
                    sIndex = 2 * sIndex + 1;
                }

            }
            return r;
        }
        int mid = (sStart + sEnd) / 2;

        long r = query(a, tree, 2 * sIndex, sStart, mid, qStart, qEnd, x);
        if (r != -1) {
            return r;
        }
        return query(a, tree, 2 * sIndex + 1, mid + 1, sEnd, qStart, qEnd, x);

    }

    static void updatePoint(long[] a, long[] tree, int sIndex, int sStart, int sEnd, int q, int val) {
        if (sStart == sEnd) {
            tree[sIndex] = val;
            a[q] = val;
            return;
        }
        int m = (sStart + sEnd) / 2;
        if (q <= m) {
            updatePoint(a, tree, sIndex * 2, sStart, m, q, val);
        } else {
            updatePoint(a, tree, sIndex * 2 + 1, m + 1, sEnd, q, val);
        }
        tree[sIndex] = Math.min(tree[sIndex * 2], tree[sIndex * 2 + 1]);
    }

    static void updateRange(long[] tree, long lazy[], int sIndex, int sStart, int sEnd, int rStart, int rEnd, long val) {

        if (lazy[sIndex] != 0) {
            tree[sIndex] += lazy[sIndex] * (sEnd - sStart + 1);
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
            tree[sIndex] += ((sEnd - sStart + 1) * val);
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
            tree[sIndex] += lazy[sIndex] * (sEnd - sStart + 1);
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
        int n = scan.nextInt();
        long[] a = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
        long[] tree = new long[n * 4];
        buildSeg(a, tree, 1, 1, n);
        int q = scan.nextInt();
        while (q-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int x = scan.nextInt();
            System.out.println(query(a, tree, 1, 1, n, l, r, x));
        }
    }

}
