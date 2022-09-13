package TreeDs;

import java.util.Arrays;
import java.util.Scanner;

public class MKTHNUM {

    public static void build(int[] seg, int[] arra, int node, int l, int r) {
        if (l == r) {
            seg[node] = arra[l];
            return;
        }
        int left = 2 * node + 1;
        int right = (2 * node) + 2;
        int mid = (l + r) / 2;
        build(seg, arra, left, l, mid);
        build(seg, arra, right, mid + 1, r);
        seg[node] = seg[left] + seg[right];
    }

    public static int get(int[] seg, int node, int l, int r, int i, int j, int k) {
        System.out.println(l + " " + r + " " + k);
        if (i > r || j < l) {
            return 0;
        }
        if (l == r) {
            return -111;
        }

        int left = 2 * node + 1;
        int rigth = 2 * node + 2;
        int mid = (l + r) / 2;
        if (i <= l && r <= j) {
            
            if (seg[node] <= k) {
                return get(seg, left, l, mid, i, j, k);
            } else {
                return get(seg, rigth, mid + 1, r, i, j, k - seg[node]);
            }
        }
        get(seg, left, l, mid, i, j, k);
        get(seg, rigth, mid + 1, r, i, j, k);
        return 0;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] tree = new int[n * 4];
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            b[i] = 1;
        }
        build(tree, b, 0, 0, n - 1);

        while (q-- > 0) {
            int l = scan.nextInt() - 1;
            int r = scan.nextInt() - 1;
            int k = scan.nextInt();
            int res = get(tree, 0, 0, n - 1, l, r, k);
            System.out.println(res);
        }
    }
}
