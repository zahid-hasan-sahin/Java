package problemSolving8;

import java.util.Scanner;

public class NewYearConcert {

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static void build(int[] tree, int[] arr, int ind, int l, int r) {
        if (l == r) {

            tree[ind] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        build(tree, arr, 2 * ind, l, mid);
        build(tree, arr, 2 * ind + 1, mid + 1, r);
        tree[ind] = gcd(tree[2 * ind], tree[2 * ind + 1]);
    }

    static int query(int[] tree, int sIndex, int sStart, int sEnd, int qStart, int qEnd) {
        if (qEnd < sStart || qStart > sEnd) {
            return 0;
        }
        if (sStart >= qStart && sEnd <= qEnd) {
            return tree[sIndex];
        }
        int mid = (sStart + sEnd) / 2;
        int x = query(tree, 2 * sIndex, sStart, mid, qStart, qEnd);
        int y = query(tree, 2 * sIndex + 1, mid + 1, sEnd, qStart, qEnd);
        return gcd(x, y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        int[] tree = new int[n * 4];
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
        build(tree, a, 1, 1, n);
        int x = 1;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int r = i;
            int l = x;
            boolean ch = false;
            while (l <= r) {
                int mid = (l + r) / 2;
                int gcd = query(tree, 1, 1, n, mid, i);
                if (gcd == i - mid + 1) {
                    ch = true;
                    break;
                } else if (gcd > i - mid + 1) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (ch) {
                x = i + 1;
                ++res;
            }
            System.out.print(res + " ");
        }

    }
}
