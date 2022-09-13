package problemSolving6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ArrayDestruction {

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int t = scan.nextInt();
        StringBuilder s = new StringBuilder();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            Integer[] a = new Integer[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int[] f = new int[1000010];

            for (int i = 0; i < 2 * n - 1; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    f[a[j]]++;

                }
                StringBuilder sb = new StringBuilder();
                int j = 2 * n - 1;
                int x = a[i] + a[j];
                sb.append(x + "\n");
                boolean b = true;
                a:
                for (int k = 0; k < n; k++) {
                    while (j > 0 && f[a[j]] == 0) {
                        --j;
                    }

                    int r = x - a[j];
                    sb.append(r + " " + a[j]);
                    if (k != n - 1) {
                        sb.append("\n");
                    }
                    --f[a[j]];
                    --f[r];
                    if (f[r] < 0 || f[a[j]] < 0) {
                        f[r] = 0;
                        f[a[j]] = 0;
                        b = false;
                        break;
                    }
                    x = Math.max(r, a[j]);

                }
                for (int k = 0; k < 2 * n; k++) {
                    f[a[k]] = 0;
                }
                if (b) {
                    s.append("YES" + "\n");
                    s.append(sb + "\n");
                    continue k;
                }
            }
            s.append("NO\n");
        }
        System.out.println(s);
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
