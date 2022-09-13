package SegmentTree;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class margeSortTree {

    static void buildMst(int[] a, ArrayList<Integer>[] tree, int mIndex, int mStart, int mEnd) {
        if (mStart == mEnd) {
            tree[mIndex] = new ArrayList<Integer>();
            tree[mIndex].add(a[mEnd]);
            return;
        }
        int mid = (mStart + mEnd) / 2;
        buildMst(a, tree, mIndex * 2, mStart, mid);
        buildMst(a, tree, mIndex * 2 + 1, mid + 1, mEnd);

        int i = 0;
        int j = 0;
        tree[mIndex] = new ArrayList<Integer>();
        while (i < tree[mIndex * 2].size() && j < tree[mIndex * 2 + 1].size()) {
            if (tree[mIndex * 2].get(i) < tree[mIndex * 2 + 1].get(j)) {

                tree[mIndex].add(tree[mIndex * 2].get(i));
                ++i;
            } else {

                tree[mIndex].add(tree[mIndex * 2 + 1].get(j));
                ++j;
            }
        }
        while (i < tree[mIndex * 2].size()) {

            tree[mIndex].add(tree[mIndex * 2].get(i));
            ++i;
        }
        while (j < tree[mIndex * 2 + 1].size()) {

            tree[mIndex].add(tree[mIndex * 2 + 1].get(j));
            ++j;
        }

    }

    static int query(ArrayList<Integer>[] tree, int mIndex, int mStart, int mEnd, int qStart, int qEnd, int k) {
        if (qStart > mEnd || qEnd < mStart) {
            return 0;
        }
        if (qStart <= mStart && qEnd >= mEnd) {
            return upper(tree[mIndex], k);
        }
        int mid = (mStart + mEnd) / 2;
        int l = query(tree, mIndex * 2, mStart, mid, qStart, qEnd, k);
        int r = query(tree, mIndex * 2 + 1, mid + 1, mEnd, qStart, qEnd, k);
        return l + r;
    }

    static int upper(ArrayList<Integer> ages, int target) {
        int l = 0;
        int r = ages.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (ages.get(m) == target) {
                return 1;
            } else if (ages.get(m) < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return 0;
    }

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] a = new int[n + 1];
        ArrayList<Integer>[] tree = new ArrayList[4 * n];

        for (int i = 1; i < n + 1; i++) {
            a[i] = scan.nextInt();
        }
        buildMst(a, tree, 1, 1, n);

        while (q-- > 0) {
            int l = scan.nextInt() + 1;
            int r = scan.nextInt() + 1;
            int k = scan.nextInt();
            if ((query(tree, 1, 1, n, l, r, k)) >= 1) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));

    }
}
