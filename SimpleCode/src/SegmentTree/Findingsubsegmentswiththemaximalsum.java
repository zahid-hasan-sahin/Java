package SegmentTree;

import java.util.Scanner;
import java.util.Scanner;

public class Findingsubsegmentswiththemaximalsum {

    static void buildSeg(long[] a, long[] pre, long[] suff, long[] sum, long[] res, int sIndex, int sStart, int sEnd) {
        if (sStart == sEnd) {
            pre[sIndex] = a[sStart];
            suff[sIndex] = a[sStart];
            sum[sIndex] = a[sStart];
            return;
        }
        int m = (sStart + sEnd) / 2;
        buildSeg(a, pre, suff, sum, res, sIndex * 2, sStart, m);
        buildSeg(a, pre, suff, sum, res, sIndex * 2 + 1, m + 1, sEnd);
        sum[sIndex] = sum[sIndex * 2] + sum[sIndex * 2 + 1];
        pre[sIndex] = Math.max(pre[sIndex * 2], sum[sIndex * 2] + pre[sIndex * 2 + 1]);
        suff[sIndex] = Math.max(suff[sIndex * 2 + 1], sum[sIndex * 2 + 1] + suff[sIndex * 2]);
        res[sIndex] = Math.max(res[sIndex * 2] + res[sIndex * 2 + 1], suff[sIndex * 2] + pre[sIndex * 2 + 1]);
    }

    static long query(long[] pre, long[] suff, long[] sum, long[] res, int sIndex, int sStart, int sEnd, int qStart, int qEnd) {
        if (qEnd < sStart || qStart > sEnd) {
            return Integer.MAX_VALUE;
        }
        if (sStart >= qStart && sEnd <= qEnd) {
            return res[sIndex];
        }
        int mid = (sStart + sEnd) / 2;
        long x = query(pre, suff, sum, res, 2 * sIndex, sStart, mid, qStart, qEnd);
        long y = query(pre, suff, sum, res, 2 * sIndex + 1, mid + 1, sEnd, qStart, qEnd);
        sum[sIndex] = sum[sIndex * 2] + sum[sIndex * 2 + 1];
        pre[sIndex] = Math.max(pre[sIndex * 2], sum[sIndex * 2] + pre[sIndex * 2 + 1]);
        suff[sIndex] = Math.max(suff[sIndex * 2 + 1], sum[sIndex * 2 + 1] + suff[sIndex * 2]);
        return res[sIndex] = Math.max(res[sIndex * 2] + res[sIndex * 2 + 1], suff[sIndex * 2] + pre[sIndex * 2 + 1]);
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
        int len = scan.nextInt();
        long[] a = new long[len + 1];
        long[] pre = new long[len * 4];
        long[] suff = new long[len * 4];
        long[] sum = new long[len * 4];
        long[] res = new long[len * 4];
        for (int i = 1; i <= len; i++) {
            a[i] = scan.nextInt();
        }
        buildSeg(a, pre, suff, sum, res, 1, 1, len);
        for (int i = 0; i < len * 4; i++) {
            System.out.println(pre[i] + " " + suff[i] + " " + sum[i]+" "+res[i]);
        }
        long q = scan.nextInt();

        while (q-- > 0) {

            int l = scan.nextInt();
            int r = scan.nextInt();
            System.out.println(query(pre, suff, sum, res, 1, 1, len, l, r));

        }
    }

}
