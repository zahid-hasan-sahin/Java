package ProblemSolving7;

import java.util.*;
import java.io.*;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class Bertownroads {

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt());
        }
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        boolean[] bol = {false};
        g.isBridge(1, -1, a, b, bol);

        if (bol[0]) {
            System.out.println("0");
        } else {
            for (int i = 0; i < a.size(); i++) {
                sb.append(a.get(i) + " " + b.get(i) + "\n");
            }
        }
        System.out.println(sb);

    }

}

class Graph {

    ArrayList<Integer>[] node;
    int n;
    boolean[] vis;
    int[] in;
    int[] low;
    int timer;

    Graph(int size) {
        n = size + 1;
        vis = new boolean[n];
        in = new int[n];
        low = new int[n];
        timer = 0;
        node = new ArrayList[size + 1];
        for (int i = 0; i < size + 1; i++) {
            node[i] = new ArrayList<Integer>();
        }

    }

    void addEdge(int v, int u) {
        node[v].add(u);
        node[u].add(v);
    }

    void isBridge(int v, int par, ArrayList<Integer> a, ArrayList<Integer> b, boolean[] bol) {
        vis[v] = true;
        low[v] = in[v] = timer++;
        for (int child : node[v]) {
            if (child == par) {
                continue;
            } else if (vis[child]) {
                low[v] = Math.min(low[v], in[child]);
                if (in[child] < in[v]) {
                    a.add(v);
                    b.add(child);
                }
            } else {
                a.add(v);
                b.add(child);
                isBridge(child, v, a, b, bol);

                if (low[child] > in[v]) {
                    bol[0] = true;
                    return;
                }
                low[v] = Math.min(low[v], low[child]);
            }
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
