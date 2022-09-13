package problemSolving8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class MP3 {

    public static long log2(int N) {

        int result = (int) Math.ceil((Math.log(N) / Math.log(2)));

        return result;
    }

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();
        int p = scan.nextInt();
        int[] a = new int[n];
        TreeSet<Integer> t = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            t.add(a[i]);
        }
        int k = 0;
        while (log2(k) * n <= p * 8 && k <= n) {
            ++k;
        }
        if (log2(k) * n > p * 8) {
            --k;
        }

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            h.put(a[i], h.getOrDefault(a[i], 0) + 1);
        }
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i : t) {
            ar.add(h.get(i));

        }
        int[] pre = new int[ar.size() + 1];
        for (int i = 1; i <= ar.size(); i++) {
            pre[i] = pre[i - 1] + ar.get(i - 1);

        }

        long res = 0;
        for (int i = 1; i <= ar.size() - k + 1; i++) {

            res = Math.max(res, pre[i + k - 1] - pre[i - 1]);
        }
        if (k >= ar.size()) {
            System.out.println("0");
        } else {
            System.out.println(n - res);
        }

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
