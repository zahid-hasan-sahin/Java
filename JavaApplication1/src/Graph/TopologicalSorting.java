package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class TopologicalSorting {

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt());
        }
        g.TopologicalSort();

    }

}

class Graph {

    ArrayList<Integer>[] node;
    int size;
    int[] totalIn;

    Graph(int n) {
        size = n + 1;
        totalIn = new int[size];
        node = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            node[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int v, int u) {
        node[v].add(u);
        totalIn[u]++;
    }

    void TopologicalSort() {
        MultiSet<Integer> q = new MultiSet<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 1; i < size; i++) {
            if (totalIn[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int p = q.getFirst();
            q.remove(q.getFirst());

            int c = 0;
            for (int child : node[p]) {
                --totalIn[child];
                if (totalIn[child] == 0) {
                    q.add(child);
                    ++c;
                }
            }
            if (c == 1) {

            } else {
                res.add(p);
            }

        }
        if (res.size() < 3) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.print(res.get(i) + " ");
            }
        }

    }

}

class MultiSet<E> {

    int size = 0;
    private TreeSet<E> set = new TreeSet<E>();
    private HashMap<E, Integer> occour = new HashMap<E, Integer>();

    void add(E v) {
        ++size;
        if (occour.containsKey(v)) {
            occour.put(v, occour.get(v) + 1);
            if (occour.get(v) == 1) {
                set.add(v);
            }
        } else {
            set.add(v);
            occour.put(v, 1);
        }
    }

    void getFullSet() {
        // O(n)
        ArrayList<E> ar = new ArrayList<E>();
        for (E i : set) {
            int p = occour.get(i);
            for (int j = 0; j < p; j++) {
                ar.add(i);
            }
        }
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
        System.out.println();

    }

    boolean isEmpty() {
        return set.isEmpty();
    }

    E getFirst() {
        for (E i : set) {

            return i;
        }
        return null;
    }

    void remove(E el) {
        if (occour.containsKey(el) && occour.get(el) >= 1) {
            --size;
            occour.put(el, occour.get(el) - 1);
            if (occour.get(el) == 0) {
                set.remove(el);
            }
        }
    }

    int setCount(E k) {
        if (!occour.containsKey(k)) {
            return 0;
        }
        return occour.get(k);
    }

    int size() {
        return size;
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
