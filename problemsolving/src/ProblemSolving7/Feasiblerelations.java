package ProblemSolving7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Feasiblerelations {

    public static void main(String args[]) throws IOException {
        FastReader scan = new FastReader();
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            Integer[] l = new Integer[k];
            Integer[] r = new Integer[k];
            Integer[] x = new Integer[k];
            Integer[] y = new Integer[k];
            int u = 0;
            int q = 0;
            for (int i = 0; i < k; i++) {
                int a = scan.nextInt();
                String c = scan.next();
                int b = scan.nextInt();
                if (c.equals("=")) {
                    x[u] = a;
                    y[u++] = b;
                } else {
                    l[q] = a;
                    r[q++] = b;
                }
            }
            Graph g = new Graph(n);
            for (int i = 0; i < u; i++) {
                g.addEdge(x[i], y[i]);
            }
            int[] isCon = new int[n + 1];
            int p = 1;
            boolean[] vis = new boolean[n + 1];
            for (int i = 0; i < u; i++) {
                if (!vis[x[i]]) {
                    g.isConnected(x[i], vis, isCon, p++);
                }
            }
            for (int i = 0; i < q; i++) {

                if (isCon[l[i]] == isCon[r[i]] && isCon[l[i]] != 0) {
                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");
        }

    }
}

class FastReader {

    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(
                new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}



class Graph {

    ArrayList<Integer>[] node;
    int size;

    Graph(int size) {
        this.size = size;
        node = new ArrayList[size + 1];
        for (int i = 0; i < size + 1; i++) {
            node[i] = new ArrayList<>();
        }
    }

    void addEdge(int u, int v) {
        node[u].add(v);
        node[v].add(u);
    }

    boolean isConnected(int a, boolean[] vis, int[] col, int c) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(a);
        vis[a] = true;
        while (!q.isEmpty()) {
            int k = q.poll();
            col[k] = c;
            for (int i : node[k]) {
                if (!vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }

        }
        return false;
    }

}
