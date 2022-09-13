package ProblemSolving7;

import java.util.Scanner;

public class Program {

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

    static long query(long[] tree, int sIndex, int sStart, int sEnd, int qStart, int qEnd) {
        if (qEnd < sStart || qStart > sEnd) {
            return 1000000;
        }
        if (sStart >= qStart && sEnd <= qEnd) {
            return tree[sIndex];
        }
        int mid = (sStart + sEnd) / 2;
        long x = query(tree, 2 * sIndex, sStart, mid, qStart, qEnd);
        long y = query(tree, 2 * sIndex + 1, mid + 1, sEnd, qStart, qEnd);
        return Math.min(x, y);
    }

    static void mbuildSeg(long[] a, long[] tree, int sIndex, int sStart, int sEnd) {
        if (sStart == sEnd) {
            tree[sIndex] = a[sStart];
            return;
        }
        int m = (sStart + sEnd) / 2;
        mbuildSeg(a, tree, sIndex * 2, sStart, m);
        mbuildSeg(a, tree, sIndex * 2 + 1, m + 1, sEnd);
        tree[sIndex] = Math.max(tree[sIndex * 2], tree[sIndex * 2 + 1]);
    }

    static long mquery(long[] tree, int sIndex, int sStart, int sEnd, int qStart, int qEnd) {
        if (qEnd < sStart || qStart > sEnd) {
            return -1000000;
        }
        if (sStart >= qStart && sEnd <= qEnd) {
            return tree[sIndex];
        }
        int mid = (sStart + sEnd) / 2;
        long x = mquery(tree, 2 * sIndex, sStart, mid, qStart, qEnd);
        long y = mquery(tree, 2 * sIndex + 1, mid + 1, sEnd, qStart, qEnd);
        return Math.max(x, y);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = scan.nextInt();
            long q = scan.nextInt();
            long[] a = new long[n + 1];
            long[] min = new long[n * 4];
            long[] max = new long[n * 4];
            String s = scan.next();
            int x = 0;
            for (int i = 1; i <= n; i++) {
                if (s.charAt(i - 1) == '+') {
                    ++x;
                } else {
                    --x;
                }
                a[i] = x;
            }
            buildSeg(a, min, 1, 1, n);
            mbuildSeg(a, max, 1, 1, n);

            while (q-- > 0) {
                int l = scan.nextInt();
                int r = scan.nextInt();
                long p = a[r] - a[l - 1];
                long lmin = query(min, 1, 1, n, 1, l - 1);
                long rmin = query(min, 1, 1, n, r + 1, n) - p;
                long lmax = mquery(max, 1, 1, n, 1, l - 1);
                long rmax = mquery(max, 1, 1, n, r + 1, n) - p;

                long mx = Math.max(lmax, rmax);
                long mn = Math.min(lmin, rmin);
                long res = (mx - mn);
                if ((mx < 0 && mn < 0) || (mx > 0 && mn > 0)) {
                    res += 1;
                }
                ++res;
                sb.append(Math.max(res, 1) + "\n");

            }

        }
        System.out.println(sb);
    }
}
