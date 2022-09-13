package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.DataInputStream ;
import java.io.FileInputStream ;

import java.io.IOException ;


public class QueriesAboutNumbers {

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        long n = scan.nextLong();
        ArrayList<Long> ar = new ArrayList<Long>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    ar.add(i);
                } else {
                    ar.add(i);
                    ar.add(n / i);
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        long q = scan.nextInt();
        int len = ar.size();
        while (q-- > 0) {
            int t = scan.nextInt();
            long k = scan.nextLong();
            if (t == 1) {
                int c = 0;
                for (int i = 0; i < len; i++) {
                    if (k % ar.get(i) == 0) {
                        ++c;
                    }
                }
                sb.append(c + "\n");
            } else if (t == 2) {
                int c = 0;
                for (int i = 0; i < len; i++) {
                    if (ar.get(i) % k == 0) {
                        ++c;
                    }
                }
                sb.append(c + "\n");
            } else {
                int c = 0;
                for (int i = 0; i < len; i++) {
                    if (ar.get(i) % k != 0) {
                        ++c;
                    }
                }
                sb.append(c + "\n");
            }

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
