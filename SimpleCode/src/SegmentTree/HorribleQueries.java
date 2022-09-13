package SegmentTree;

import java.util.Scanner;

public class HorribleQueries {

    static void build(long[] seg, int low, int high, int node) {
        if (low > high) {
            return;
        }
        if (low == high) {
            seg[node] = 0;
            return;
        }
        int mid = low + high >> 1;
        build(seg, low, mid, 2 * node + 1);
        build(seg, mid + 1, high, 2 * node + 2);
        seg[node] = seg[2 * node + 1] + seg[2 * node + 2];
    }

    static void update(long[] seg, long[] lazy, int low, int high, int lq, int hq, int node, long val) {
        if (lazy[node] != 1) {
            seg[node] += (high - low + 1) * lazy[node];
            if (high != low) {
                lazy[2 * node + 1] += lazy[node];
                lazy[2 * node + 2] += lazy[node];
            }
            lazy[node] = 0;
        }
        if (low > hq || high < lq) {
            return;
        }
        if (lq <= low && high <= hq) {
            seg[node] += (high - low + 1) * val;
            if (high != low) {
                lazy[2 * node + 1] += val;
                lazy[2 * node + 2] += val;
            }
            return;
        }
        int mid = low + high >> 1;
        update(seg, lazy, low, mid, lq, hq, 2 * node + 1, val);
        update(seg, lazy, mid + 1, high, lq, hq, 2 * node + 2, val);
        seg[node] = seg[2 * node + 1] + seg[2 * node + 2];
    }

    static long query(long[] seg, long[] lazy, int low, int high, int lq, int hq, int node) {
        if (lazy[node] != 1) {
            seg[node] += (high - low + 1) * lazy[node];
            if (high != low) {
                lazy[2 * node + 1] += lazy[node];
                lazy[2 * node + 2] += lazy[node];
            }
            lazy[node] = 0;
        }
        if (low > hq || high < lq) {
            return 0;
        }
        if (lq <= low && high <= hq) {
            return seg[node];
        }
        int mid = low + high >> 1;
        return query(seg, lazy, low, mid, lq, hq, 2 * node + 1) + query(seg, lazy, mid + 1, high, lq, hq, 2 * node + 2);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] seg = new long[n * 4];
            long[] lazy = new long[n * 4];
            int c = scan.nextInt();
            build(seg, 0, n - 1, 0);
            while (c-- > 0) {
                char ch = scan.next().charAt(0);
                int l = scan.nextInt();
                int r = scan.nextInt();
                if (ch == '0') {
                    long val = scan.nextLong();
                    update(seg, lazy, 0, n - 1, l - 1, r - 1, 0, val);
                } else {
                    long res = query(seg, lazy, 0, n - 1, l - 1, r - 1, 0);
                    System.out.println(res);
                }
            }
        }
    }

}
