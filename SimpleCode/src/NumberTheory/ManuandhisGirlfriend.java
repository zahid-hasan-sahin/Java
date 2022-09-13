package NumberTheory;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ManuandhisGirlfriend {

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int[] ph = new int[1000010];
        for (int i = 0; i < 1000010; i++) {
            ph[i] = i;
        }
        for (int i = 2; i < 1000010; i++) {
            if (ph[i] == i) {
                for (int j = i; j < 1000010; j += i) {
                    ph[j] = ph[j] / i;
                    ph[j] = ph[j] * (i - 1);
                }
            }
        }
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scan.nextInt();
        }
        int q = scan.nextInt();

        while (q-- > 0) {
            String[] k = scan.readLine().split(" ");
            String c = k[0];
            int x = Integer.valueOf(k[1]);
            int y = Integer.valueOf(k[2]);

            if (c.equals("U")) {
                arr[x] = y;
            } else {
                int mod = 1000000007;
                long res = 0;
                for (int i = x; i <= y; i++) {
                    int p = arr[i];
                    for (long j = 1; j * j <= p; j++) {
                        if (p % j == 0) {
                            res = ((res % mod) + ((j * ph[p / (int) j])) % mod) % mod;
                            if (p / j != j) {
                                res = ((res % mod) + (((p / j) * ph[p / (p / (int) j)])) % mod) % mod;
                            }

                        }
                    }
                }
                System.out.println((res));

            }
        }

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
