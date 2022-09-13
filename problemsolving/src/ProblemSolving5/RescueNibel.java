package ProblemSolving5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class RescueNibel {

    static long mod = 998244353;
    static Long[] inv = new Long[300005];
    static Long[] f = new Long[300005];

    static long nCr(int n, int k) {
        if (k > n) {
            return 0;
        }
        long r = ((inv[n - k] % mod) * (f[n] % mod)) % mod;

        return ((r % mod) * (inv[k] % mod)) % mod;
    }

    public static long pow(long a, long n) {
        long res = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                res = mul(res, a);
            }
            a = mul(a, a);
            n >>= 1;
        }
        return res;
    }

    public static int mul(long a, long b) {
        return (int) ((long) a * (long) b % mod);
    }

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        PrintWriter out = new PrintWriter(System.out);
        Integer n = scan.nextInt();
        Integer k = scan.nextInt();

        f[0] = (long) 1;
        inv[0] = (long) 1;
        for (int i = 1; i < n + 1; i++) {
            f[i] = ((f[i - 1] % mod) * (i % mod)) % mod;
            inv[i] = (((long) inv[i - 1] * (long) pow(i, mod - 2)) % mod);
        }

        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> e = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            Integer in1 = scan.nextInt();
            Integer in2 = scan.nextInt();
            if (s.containsKey(in1)) {
                s.put(in1, s.get(in1) + 1);
            } else {
                s.put(in1, 1);
            }
            if (e.containsKey(in2)) {
                e.put(in2, e.get(in2) + 1);
            } else {
                e.put(in2, 1);
            }
        }

        ArrayList<Integer> st = new ArrayList<Integer>();
        ArrayList<Integer> en = new ArrayList<Integer>();
        st.addAll(s.keySet());
        en.addAll(e.keySet());
        long l = 0;
        long r = 0;
        long res = 0;
        long ac = 0;
        Collections.sort(st);
        Collections.sort(en);
        while (l < st.size() && r < en.size()) {
            if (st.get((int) l) > en.get((int) r)) {
                ac -= e.get(en.get((int) r));
                ++r;
                continue;
            }
            long t = s.get(st.get((int) l));
            long u = ac + t;
            if (u >= k) {
                res = res + nCr((int) u, k);
                if (res >= mod) {
                    res -= mod;
                }
            }
            if (ac >= k) {
                res += mod - nCr((int) ac, k);
                if (res >= mod) {
                    res -= mod;
                }
            }
            ac = u;
            if (st.get((int) l) == en.get((int) r)) {
                ac -= e.get(en.get((int) r));
                ++r;
            }
            ++l;

        }
        out.println(res);
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
