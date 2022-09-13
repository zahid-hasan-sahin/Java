package SegmentTree;

import java.util.Scanner;

public class maximumHistogram {

    static void buildSeg(int Index, int l, int r, int[] arr, int[] tree) {
        if (l > r) {
            return;
        }
        if (l == r) {
            tree[Index] = arr[l];
            return;
        }
        int mid = (l + r) / 2;

        buildSeg(2 * Index + 1, l, mid, arr, tree);
        buildSeg(2 * Index + 2, mid + 1, r, arr, tree);
        tree[Index] = Math.min(tree[2 * Index + 1], tree[2 * Index + 2]);
    }

    static int query(int index, int l, int r, int sl, int sr, int[] tree) {
        if (sr < l || sl > r) {
            return Integer.MAX_VALUE;
        }
        if (sl >= l && sr <= r) {
            return tree[index];
        }

        int mid = (sl + sr) / 2;
        int a = query(index * 2 + 1, l, r, sl, mid, tree);
        int b = query(index * 2 + 2, l, r, mid + 1, sr, tree);
        return Math.min(a, b);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] tree = new int[4 * n];
        buildSeg(0, 0, n - 1, a, tree);
        long res = 0;
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = i;
            while (l <= r) {
                int mid = (l + r) / 2;
                int k = query(0, mid, r, 0, n - 1, tree);
                
                if (k < a[i]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            
            long p = (i - l) * a[i];

            l = i;
            r = n - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                int k = query(0, l, mid, 0, n - 1, tree);
                if (k < a[i]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            p += (r - i) * a[i];
            p += a[i];
            res = Math.max(res, p);
            //       System.out.println(p);

        }
        System.out.println(res);

    }

}
