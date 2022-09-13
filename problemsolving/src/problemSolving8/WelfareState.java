package problemSolving8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class WelfareState {

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
        int q = scan.nextInt();
        Op[] s = new Op[q];
        for (int i = 0; i < q; i++) {
            s[i] = new Op();
            int t = scan.nextInt();
            s[i].type = t;
            if (t == 1) {
                int p = scan.nextInt();
                int x = scan.nextInt();
                s[i].p = p;
                s[i].x = x;

            } else {
                int x = scan.nextInt();
                s[i].x = x;
            }
        }
        int mx = 0;
        int imx = q - 1;
        int[] next = new int[q];
        for (int i = q - 1; i >= 0; i--) {

            if (s[i].type == 2) {
                if (s[i].x > mx) {
                    imx = i;
                    mx = s[i].x;
                }

            }
            next[i] = imx;
        }

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 1; i <= n; i++) {
            if (a[i] < s[next[0]].x) {
                set.add(i);
            }
        }

        for (int i = 0; i < q; i++) {
            if (s[i].type == 1) {
                a[s[i].p] = s[i].x;
                if (s[next[0]].x > s[i].x) {

                    set.add(s[i].p);
                }
            } else if (next[i] == i) {
                for (int ele : set) {
                    if (a[ele] < s[i].x) {

                        a[ele] = s[i].x;
                    }
                }
                set.clear();
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

class Op {

    int type;
    int p;
    int x;
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
