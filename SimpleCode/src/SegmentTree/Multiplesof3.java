package SegmentTree;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

class Main {

    static void buildSeg(long[] a, long zero[], long[] one, long[] two, int sIndex, int sStart, int sEnd) {
        if (sStart == sEnd) {

            if (a[sStart] % 3 == 0) {
                ++zero[sIndex];
            } else if (a[sStart] % 3 == 1) {
                ++one[sIndex];
            } else {
                ++two[sIndex];
            }

            return;
        }
        int m = (sStart + sEnd) / 2;
        buildSeg(a, zero, one, two, sIndex * 2, sStart, m);
        buildSeg(a, zero, one, two, sIndex * 2 + 1, m + 1, sEnd);

        zero[sIndex] = zero[sIndex * 2] + zero[sIndex * 2 + 1];
        one[sIndex] = one[sIndex * 2] + one[sIndex * 2 + 1];
        two[sIndex] = two[sIndex * 2] + two[sIndex * 2 + 1];
    }

    static void updateRange(long[] zero, long[] one, long[] two, long lazy[], int sIndex, int sStart, int sEnd, int rStart, int rEnd, long val) {

        if (lazy[sIndex] != 0) {
            long k = lazy[sIndex] % 3;
            if (k == 1) {
                long[] a = {zero[sIndex], one[sIndex], two[sIndex]};
                zero[sIndex] = a[1];
                one[sIndex] = a[2];
                two[sIndex] = a[0];
            } else if (k == 2) {
                long[] a = {zero[sIndex], one[sIndex], two[sIndex]};
                zero[sIndex] = a[2];
                one[sIndex] = a[0];
                two[sIndex] = a[1];
            }
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
            long[] a = {zero[sIndex], one[sIndex], two[sIndex]};
            zero[sIndex] = a[1];
            one[sIndex] = a[2];
            two[sIndex] = a[0];
            if (sStart != sEnd) {
                lazy[sIndex * 2] += val;
                lazy[sIndex * 2 + 1] += val;
            }
            return;
        }
        int m = (sStart + sEnd) / 2;
        updateRange(zero, one, two, lazy, sIndex * 2, sStart, m, rStart, rEnd, val);
        updateRange(zero, one, two, lazy, sIndex * 2 + 1, m + 1, sEnd, rStart, rEnd, val);
        zero[sIndex] = zero[sIndex * 2] + zero[sIndex * 2 + 1];
        one[sIndex] = one[sIndex * 2] + one[sIndex * 2 + 1];
        two[sIndex] = two[sIndex * 2] + two[sIndex * 2 + 1];
    }

    static long rangeQuery(long[] zero, long[] one, long[] two, long[] lazy, int sIndex, int sStart, int sEnd, int qStart, int qEnd) {

        if (lazy[sIndex] != 0) {
            long k = lazy[sIndex] % 3;
            if (k == 1) {
                long[] a = {zero[sIndex], one[sIndex], two[sIndex]};
                zero[sIndex] = a[1];
                one[sIndex] = a[2];
                two[sIndex] = a[0];
            } else if (k == 2) {
                long[] a = {zero[sIndex], one[sIndex], two[sIndex]};
                zero[sIndex] = a[2];
                one[sIndex] = a[0];
                two[sIndex] = a[1];
            }
            if (sStart != sEnd) {
                lazy[sIndex * 2] += lazy[sIndex];
                lazy[sIndex * 2 + 1] += lazy[sIndex];
            }
            lazy[sIndex] = 0;
        }

        if (sStart > qEnd || sEnd < qStart) {
            return 0;
        }
        if (sStart >= qStart && sEnd <= qEnd) {
            return zero[sIndex];
        }
        int m = (sStart + sEnd) / 2;
        long left = rangeQuery(zero, one, two, lazy, sIndex * 2, sStart, m, qStart, qEnd);
        long right = rangeQuery(zero, one, two, lazy, sIndex * 2 + 1, m + 1, sEnd, qStart, qEnd);
        return left + right;
    }

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();
        int q = scan.nextInt();
        long[] a = new long[n + 1];

        long[] lazy = new long[n * 4];
        long[] zero = new long[n * 4];
        long[] one = new long[n * 4];
        long[] two = new long[n * 4];
        buildSeg(a, zero, one, two, 1, 1, n);
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            int c = scan.nextInt();
            int l = scan.nextInt();
            int r = scan.nextInt();
            if (c == 0) {
                updateRange(zero, one, two, lazy, 1, 1, n, l + 1, r + 1, 1);
            } else {
                sb.append(rangeQuery(zero, one, two, lazy, 1, 1, n, l + 1, r + 1) + "\n");
            }
        }
        System.out.println(sb);

    }

    static class Reader {

        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    break;
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg) {
                return -ret;
            }
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg) {
                return -ret;
            }
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null) {
                return;
            }
            din.close();
        }
    }

}
