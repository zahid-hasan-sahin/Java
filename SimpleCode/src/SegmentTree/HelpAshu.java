package SegmentTree;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class HelpAshu {

    static void makeSeg(long[] a, long[] tree, int sIndex, int sStart, int sEnd) {
        if (sStart == sEnd) {
            tree[sIndex] = a[sStart];
            return;
        }
        int m = (sStart + sEnd) / 2;
        makeSeg(a, tree, sIndex * 2, sStart, m);
        makeSeg(a, tree, sIndex * 2 + 1, m + 1, sEnd);
        tree[sIndex] = tree[sIndex * 2] + tree[sIndex * 2 + 1];
    }

    static long q(long[] tree, int sIndex, int sStart, int sEnd, int qStart, int qEnd) {
        if (qEnd < sStart || qStart > sEnd) {
            return 0;
        }
        if (qStart <= sStart && sEnd <= qEnd) {
            return tree[sIndex];
        }
        int m = (sStart + sEnd) / 2;
        long t = q(tree, sIndex * 2, sStart, m, qStart, qEnd);
        long p = q(tree, sIndex * 2 + 1, m + 1, sEnd, qStart, qEnd);
        return t + p;
    }

    static void p(long[] a, long[] tree, int sIndex, int sStart, int sEnd, int q, int val) {
        if (sStart == sEnd) {
            tree[sIndex] = val;
            a[q] = val;
            return;
        }
        int m = (sStart + sEnd) / 2;
        if (q <= m) {
            p(a, tree, sIndex * 2, sStart, m, q, val);
        } else {
            p(a, tree, sIndex * 2 + 1, m + 1, sEnd, q, val);
        }
        tree[sIndex] = tree[sIndex * 2] + tree[sIndex * 2 + 1];

    }

    public static void main(String args[]) {
        Reader scan = new Reader();
        int n = scan.nextInt();
        long[] a = new long[n + 1];
        for (int i = 1; i < n + 1; i++) {
            a[i] = scan.nextInt() % 2;
        }
        long[] tree = new long[n * 4];
        makeSeg(a, tree, 1, 1, n);
        StringBuilder sb = new StringBuilder();

        int q = scan.nextInt();
        while (q-- > 0) {
            int k = scan.nextInt();
            int l = scan.nextInt();
            int r = scan.nextInt();
            if (k == 0) {

                p(a, tree, 1, 1, n, l, r % 2);

            } else if (k == 1) {
                long p = q(tree, 1, 1, n, l, r);
                sb.append((r - l + 1) - p + "\n");
            } else {
                long p = q(tree, 1, 1, n, l, r);
                sb.append(p + "\n");
            }
        }
        System.out.println(sb);
    }

    PrintWriter out = new PrintWriter(System.out);

    public static class Reader {

        BufferedReader br;
        StringTokenizer st;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}
