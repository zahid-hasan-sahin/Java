package SegmentTree;

import java.util.Scanner;

public class fingKth0 {

    static void buildSeg(long[] a, long[] tree, int sIndex, int sStart, int sEnd) {
        if (sStart == sEnd) {
            if (a[sStart] == 0) {
                tree[sIndex] = 1;

            }

            return;
        }
        int m = (sStart + sEnd) / 2;
        buildSeg(a, tree, sIndex * 2, sStart, m);
        buildSeg(a, tree, sIndex * 2 + 1, m + 1, sEnd);
        tree[sIndex] = tree[sIndex * 2] + tree[sIndex * 2 + 1];
    }

    static long query(long[] tree, int sIndex, int sStart, int sEnd, int qStart, int qEnd) {
        if (sEnd < qStart) {
            return 0;
        } else if (sStart > qEnd) {
            return 0;
        }
        if (sStart >= qStart && sEnd <= qEnd) {
            return tree[sIndex];
        }
        int mid = (sStart + sEnd) / 2;
        long x = query(tree, 2 * sIndex, sStart, mid, qStart, qEnd);
        long y = query(tree, 2 * sIndex + 1, mid + 1, sEnd, qStart, qEnd);
        return x + y;
    }

    static void updatePoint(long[] a, long[] tree, int sIndex, int sStart, int sEnd, int q, int val) {
        if (sStart == sEnd) {
            if (val == 0) {
                tree[sIndex] = 1;
            } else {
                tree[sIndex] = 0;
            }
            return;
        }
        int m = (sStart + sEnd) / 2;
        if (q <= m) {
            updatePoint(a, tree, sIndex * 2, sStart, m, q, val);
        } else {
            updatePoint(a, tree, sIndex * 2 + 1, m + 1, sEnd, q, val);
        }
        tree[sIndex] = tree[sIndex * 2] + tree[sIndex * 2 + 1];
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

    static int kth(long[] tree, int sIndex, int sStart, int sEnd, long k) {
        if (k > tree[sIndex]) {
            return -1;
        }
        if (sStart == sEnd) {
            return sStart;
        }
        int mid = (sStart + sEnd) / 2;
        if (tree[sIndex * 2] >= k) {
            return kth(tree, sIndex * 2, sStart, mid, k);
        } else {
            return kth(tree, sIndex * 2 + 1, mid + 1, sEnd, k - tree[sIndex * 2]);
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();

        long[] a = new long[n + 1];
        for (int i = 1; i < n + 1; i++) {
            a[i] = scan.nextInt();
        }

        long[] tree = new long[n * 4];
        buildSeg(a, tree, 1, 1, n);
        while (q-- > 0) {
            int c = scan.nextInt();
            if (c == 2) {
                int l = scan.nextInt();
                int r = scan.nextInt();
                updatePoint(a, tree, 1, 1, n, l + 1, r);

            } else {
                int k = scan.nextInt();
                int p = kth(tree, 1, 1, n, k) - 1;
                if (p < 0) {
                    System.out.println("NO");
                } else {
                    System.out.println(p);
                }
            }
        }
    }

}
