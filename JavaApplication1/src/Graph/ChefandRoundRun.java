package Graph;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class ChefandRoundRun {

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        StringBuilder sb = new StringBuilder();

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int res = 0;
            Graph g = new Graph(n);
            Graph transpose = new Graph(n);
            for (int i = 0; i < n; i++) {
                int k = i + a[i] + 2;
                int p = k % n;
                if (p == 0) {
                    p = n;
                }
                if ((i + 1) == p) {
                    ++res;
                }

                g.addEdge((i + 1), p);
                transpose.addEdge(p, i + 1);
            }
            ArrayList<Integer> out = new ArrayList<Integer>();
            boolean[] vis = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                if (!vis[i]) {
                    g.dfs1(i, vis, out);
                }
            }
            for (int i = 0; i < n + 1; i++) {
                vis[i] = false;
            }
            int p = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (!vis[out.get(i)]) {
                    ArrayList<Integer> ar = new ArrayList<Integer>();
                    transpose.dfs2(out.get(i), vis, ar);
                    if (ar.size() == 1) {
                        ++p;
                    }
                }
            }
            p -= res;
            sb.append(n - p + "\n");

        }
        System.out.println(sb);
    }

}

class Graph {

    ArrayList<Integer>[] node;
    int size;

    Graph(int n) {
        size = n + 1;
        node = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            node[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int v, int u) {
        node[v].add(u);

    }

    void dfs1(int v, boolean[] vis, ArrayList<Integer> out) {
        vis[v] = true;
        for (int i : node[v]) {
            if (!vis[i]) {
                dfs1(i, vis, out);
            }
        }
        out.add(v);
    }

    void dfs2(int v, boolean[] vis, ArrayList<Integer> ar) {
        vis[v] = true;
        for (int i : node[v]) {
            if (!vis[i]) {
                dfs1(i, vis, ar);
            }
        }
        ar.add(v);
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
