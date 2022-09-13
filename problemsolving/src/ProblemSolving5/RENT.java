package ProblemSolving5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class RENT {

    public static class st {

        int s, e, p;

    }

    public static class myCom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.e;
            int l = ob2.e;
            return f > l ? 1 : -11;

        }

    }

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        PrintWriter out = new PrintWriter(System.out);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            RENT.st[] ob = new RENT.st[n];
            for (int i = 0; i < n; i++) {
                ob[i] = new st();
                ob[i].s = scan.nextInt();
                ob[i].e = ob[i].s + scan.nextInt();
                ob[i].p = scan.nextInt();
            }
            Arrays.sort(ob, new myCom());
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = ob[i].p;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (ob[i].s >= ob[j].e) {
                        res[i] = Math.max(res[i], res[j] + ob[i].p);
                    }
                }
            }
            long r = 0;
            for (int i = 0; i < n; i++) {
                r = Math.max(res[i], r);
            }
            out.println(r);
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
