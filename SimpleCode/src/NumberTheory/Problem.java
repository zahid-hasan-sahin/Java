

import java.util.ArrayList;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

class main {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int sqrt = 1010;
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> prime = new ArrayList<Integer>();
        boolean[] isActive = new boolean[sqrt + 1];
        for (int i = 2; i < sqrt; i++) {
            if (!isActive[i]) {
                prime.add(i);
                for (long j = (long) i * i; j < sqrt; j += i) {
                    isActive[(int) j] = true;
                }
            }
        }

        int sqrt2 = sqrt * 2;
        int[] phi = new int[sqrt2 + 1];
        for (int i = 1; i < sqrt2; i++) {
            phi[i] = i;
        }

        for (int i = 2; i < sqrt2; i++) {
            if (phi[i] == i) {
                for (int j = i; j < sqrt2; j += i) {
                    phi[j] /= i;
                    phi[j] *= (i - 1);
                }
            }
        }

        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int gcd = gcd(a, b);
            int temp = gcd;
            int nod = 1;
           

            for (int i = 0; i < prime.size() && prime.get(i) * prime.get(i) <= temp; i++) {
              
                int pr = prime.get(i);
                if (temp % pr == 0) {
                    int counter = 0;
                    while (temp % pr == 0) {

                        ++counter;
                        temp /= pr;
                    }
                    nod *= (counter + 1);
                }
            }
            if (temp >= 2) {
             
                nod *= 2;
            }

            sb.append(phi[nod] + "\n");
        }

        System.out.println(sb);

    }

}

class Reader {

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
