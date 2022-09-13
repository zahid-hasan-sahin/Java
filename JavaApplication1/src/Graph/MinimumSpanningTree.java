package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MinimumSpanningTree {

    static int getNext(int[] X, int A, int C, int Mod) {
        X[0] = (X[0] * A + C) % Mod;
        return X[0];
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] x = {scan.nextInt()};
        int a = scan.nextInt();
        int c = scan.nextInt();
        int mod = scan.nextInt();
        Graph g = new Graph(n);
        for (int i = 0; i < m; i++) {
            int u = getNext(x, a, c, mod) % n;
            int v = getNext(x, a, c, mod) % n;
            int w = getNext(x, a, c, mod);
            g.addEdge(u, v, w);

        }
        g.sort();
    }

}

class Edge {

    int u;
    int v;
    int w;

    Edge(int a, int b, int c) {
        u = a;
        v = b;
        w = c;
    }

    public int compareTo(Edge compareEdge) {
        return this.w - compareEdge.w;
    }
}

class Graph {

    ArrayList<Edge> node[];
    int size;

    Graph(int n) {
        ++n;
        size = n;
        node = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            node[i] = new ArrayList<Edge>();
        }

    }

    void addEdge(int u, int v, int w) {
        Edge e = new Edge(u, v, w);
        node[u].add(e);
        Edge e2 = new Edge(v, u, w);
        node[v].add(e2);
    }

    void sort() {
        Arrays.sort(node);
        for (int i = 0; i < size; i++) {
            System.out.println(node[i]);
        }
    }
}
