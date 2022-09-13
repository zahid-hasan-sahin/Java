package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class BakryandPartitioning {

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n + 1];
            int x = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
                x ^= a[i];
            }
            ArrayList<Integer>[] graph = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                graph[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < n - 1; i++) {
                int u = scan.nextInt();
                int v = scan.nextInt();
                graph[u].add(v);
                graph[v].add(u);
            }

            if (x == 0) {
                sb.append("YES\n");
            } else {
                if (k == 2) {
                    sb.append("NO\n");;
                    continue k;
                }
                int[] vis = new int[n + 1];
                int[] xor = new int[n + 1];
                int l = 0;
                int r = 0;
                int[] p = new int[1];
                checkXor(graph, 1, vis, xor, a, l);
                dfs(graph, 1, -1, x, xor, p);
                l = p[0];
                
                if (l == 0) {
                    sb.append("NO\n");
                    continue k;
                }
                for (int i = 0; i <= n; i++) {
                    vis[i] = 0;
                    xor[i] = 0;
                }
                checkXor(graph, 1, vis, xor, a, l);
                p[0] = 0;
                dfs(graph, 1, -1, x, xor, p);
                r = p[0];
          
                if (r == 0) {
                    sb.append("NO\n");
                    continue k;
                }
                sb.append("YES\n");

            }
        }
        System.out.println(sb);
    }

    static void dfs(ArrayList<Integer>[] graph, int curr, int par, int x, int[] xor, int[] l) {
        for (int i : graph[curr]) {
            if (i != par) {
                dfs(graph, i, curr, x, xor, l);
            }
        }
        if (xor[curr] == x && l[0]==0) {
            l[0] = curr;
        }

    }

    static void checkXor(ArrayList<Integer>[] graph, int curr, int[] vis, int[] xor, int[] val, int l) {
        if (curr == l) {
            return;
        }
        vis[curr] = 1;
        int x = 0;
        for (int i : graph[curr]) {
            if (vis[i] == 0) {
                checkXor(graph, i, vis, xor, val, l);
                x ^= xor[i];
            }
        }
        xor[curr] = x ^ val[curr];
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
