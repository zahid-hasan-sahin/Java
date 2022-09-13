package dp;

import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class knapsack0or1 {

    static int[][] dp = new int[1010][1010];

    int rec(int[] w, int[] val, int n, int k) {
        knapsack0or1 hehe = new knapsack0or1();
        if (n == 0 || k == 0) {
            return 0;
        }
        if (w[n - 1] > k) {
            if (hehe.dp[n - 1][k] == -1) {
                hehe.dp[n - 1][k] = hehe.rec(w, val, n - 1, k);
            }
            return dp[n - 1][k];
        }
        if (hehe.dp[n - 1][k - w[n - 1]] == -1) {
            hehe.dp[n - 1][k - w[n - 1]] = hehe.rec(w, val, n - 1, k - w[n - 1]);
        }
        if (hehe.dp[n - 1][k] == -1) {
            hehe.dp[n - 1][k] = hehe.rec(w, val, n - 1, k);
        }
        return Math.max(val[n - 1] + dp[n - 1][k - w[n - 1]], dp[n - 1][k]);
    }

    static int knapsac(int[] w, int[] val, int n, int k) {
        int[][] m = new int[n + 1][k + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                if (j < w[i - 1]) {
                    m[i][j] = m[i - 1][j];
                } else {
                    m[i][j] = Math.max(m[i - 1][j], val[i - 1] + m[i - 1][j - w[i - 1]]);
                }
            }
        }
        return m[n][k];
    }

    public static void main(String args[]) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        Reader scan = new Reader();
        int t = scan.nextInt();
        while (t-- > 0) {
            knapsack0or1 hehe = new knapsack0or1();
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] w = new int[n];
            int[] val = new int[n];
            for (int i = 0; i < n; i++) {
                val[i] = scan.nextInt();
            }
            for (int i = 0; i < 1010; i++) {
                for (int j = 0; j < 1010; j++) {
                    hehe.dp[i][j] = -1;
                }
            }
            for (int i = 0; i < n; i++) {
                w[i] = scan.nextInt();
            }
            out.println(hehe.rec(w, val, n, k));
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
