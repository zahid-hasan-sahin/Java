package ProblemSolving7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class GCDofanArray {

    static class pair {

    }

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int[] pr = new int[200010];

        for (int i = 2; i < 200010; i++) {
            if (pr[i] == 0) {
                pr[i] = i;
                for (long j = i * (long) i; j < 200010; j += i) {
                    pr[(int) j] = i;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        int n = scan.nextInt();
        int q = scan.nextInt();
        HashMap<Integer, Integer>[] count = new HashMap[n + 1];
        MultiSet<Integer>[] mn = new MultiSet[200010];
        for (int i = 0; i < 200010; i++) {
            mn[i] = new MultiSet<Integer>();
        }
        for (int i = 0; i < n + 1; i++) {
            count[i] = new HashMap<Integer, Integer>();

        }
        int M = 1000000007;
        int i = 0;
        long ans = 1;
        while (i < n) {
            int in = scan.nextInt();
            while (in != 1) {
                int p = pr[in];

                if (!count[i].containsKey(p)) {
                    mn[p].add(0);
                    count[i].put(p, 0);
                }

                int best = mn[p].getFirst();

                mn[p].remove(count[i].get(p));

                int k = 0;
                if (count[i].containsKey(p)) {
                    k = count[i].get(p);
                }

                count[i].put(p, k + 1);
                mn[p].add(count[i].get(p));
                if (mn[p].size == n && best < mn[p].getFirst()) {
                    ans = ((ans % M) * (p % M)) % M;

                }
                in /= p;
            }

            ++i;

        }
        while (q-- > 0) {
            i = scan.nextInt() - 1;
            int in = scan.nextInt();
            while (in != 1) {
                int p = pr[in];

                if (!count[i].containsKey(p)) {
                    mn[p].add(0);
                    count[i].put(p, 0);
                }
                int best = mn[p].getFirst();

                mn[p].remove(count[i].get(p));

                int k = 0;
                if (count[i].containsKey(p)) {
                    k = count[i].get(p);
                }
                count[i].put(p, k + 1);
                mn[p].add(count[i].get(p));
                if (mn[p].size == n && best < mn[p].getFirst()) {
                    ans = ans * p % M;

                }
                in /= p;
            }
            sb.append(ans + "\n");
        }
        System.out.println(sb);
    }

}

class MultiSet<E> {

    int size = 0;
    TreeSet<E> set = new TreeSet<E>();
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
        ArrayList<E> ar = new ArrayList<E>();
        for (E i : set) {
            int p = occour.get(i);
            for (int j = 0; j < p; j++) {
                ar.add(i);
            }
        }
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i)+" ");
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
