package ProblemSolving5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Powerfularray {

    public static class st {

        int l, r, ind;

    }
    static int sq = 0;

    public static class myCom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.l / sq;
            int l = ob2.l / sq;
            if (f == l) {
                return ob1.r - ob2.r;
            }
            return f - l;

        }

    }

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        int[] a = new int[n + 1];
        int q = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
        sq = (int) Math.ceil((double) Math.sqrt(n));
        Powerfularray.st[] ob = new Powerfularray.st[q];
        for (int i = 0; i < q; i++) {
            ob[i] = new st();
            ob[i].l = scan.nextInt();
            ob[i].r = scan.nextInt();
            ob[i].ind = i;
        }
        Arrays.sort(ob, new myCom());

        long[] res = new long[q];
        int l = 1;
        int r = 0;
        long ans = 0;
        int[] cnt = new int[1000010];
        for (int i = 0; i < q; i++) {
            int b = ob[i].l;
            int c = ob[i].r;
            while (l < b) {
                int p = l++;
                int t = a[p];

                long k = cnt[t];
                ans -= k * k * t;
                --cnt[t];
                k = cnt[t];
                ans += k * k * t;

            }

            while (b < l) {
                int p = --l;
                int t = a[p];
                long k = cnt[t];
                ans -= k * k * t;
                ++cnt[t];
                k = cnt[t];
                ans += k * k * t;
            }
            while (r > c) {
                int p = r--;
                int t = a[p];
                long k = cnt[t];
                ans -= k * k * t;
                --cnt[t];
                k = cnt[t];
                ans += k * k * t;

            }
            while (r < c) {
                int p = ++r;
                int t = a[p];
                long k = cnt[t];
                ans -= k * k * t;
                ++cnt[t];
                k = cnt[t];
                ans += k * k * t;

            }

            res[ob[i].ind] = ans;
        }
        for (int i = 0; i < q; i++) {
            out.println(res[i]);
        }
        out.close();

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
            byte[] buf = new byte[64];
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
