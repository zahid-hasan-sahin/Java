package ProblemSolving9;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class cfContest1713 {

    public static void main(String[] args) throws IOException {
        Reader1 scan = new Reader1();

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            n = (int) Math.pow(2, n);
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                ar.add(i);
            }
            while (n > 2) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                for (int i = 0; i < n; i += 4) {
                    int u = ar.get(i);
                    int v = ar.get(i + 2);
                    System.out.println("? " + u + " " + v);
                    int in = scan.nextInt();
                    if (in == 1) {
                        temp.add(u);
                        temp.add(ar.get(i + 3));
                    } else if (in == 2) {
                        temp.add(v);
                        temp.add(ar.get(i + 1));
                    } else {
                        temp.add(ar.get(i + 1));
                        temp.add(ar.get(i + 3));
                    }
                }

                ar.clear();
                for (int i : temp) {
                    ar.add(i);
                }
                n = ar.size();
            }
            System.out.println("? " + ar.get(0) + " " + ar.get(1));
            int in = scan.nextInt();
            if (in == 1) {
                System.out.println("! " + ar.get(0));
            } else {
                System.out.println("! " + ar.get(1));
            }
        }
    }
}

class Reader1 {

    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader1() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public Reader1(String file_name) throws IOException {
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
