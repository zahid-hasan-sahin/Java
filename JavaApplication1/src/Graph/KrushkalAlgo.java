package Graph;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KrushkalAlgo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n, m);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
        g.kruskal();

    }
}

class Edge implements Comparable<Edge> {

    int u, v, w;

    Edge() {

    }

    Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    public int compareTo(Edge a) {
        return this.w - a.w;
    }

}

class Graph {

    int v;
    int e;
    int[] rank;
    int[] par;

    Graph(int v, int e) {
        this.v = v + 1;
        this.e = e;
        rank = new int[this.v];
        par = new int[this.v];
        for (int i = 0; i <= v; i++) {
            rank[i] = 1;
            par[i] = i;
        }

    }
    PriorityQueue<Edge> node = new PriorityQueue<Edge>();

    void addEdge(int v, int u, int w) {
        Edge e = new Edge(v, u, w);
        node.add(e);
    }

    int find(int a) {
        if (par[a] == a) {
            return a;
        }
        return par[a] = find(par[a]);
    }

    void union(int a, int b) {
        if (rank[a] < rank[b]) {
            rank[b] += rank[a];
            par[a] = par[b];
        } else {
            rank[a] += rank[b];
            par[b] = par[a];
        }
    }

    void kruskal() {
        Edge[] res = new Edge[v - 1];

        int p = 0;

        while (p < v - 2) {

            Edge i = node.poll();
            int a = find(i.u);
            int b = find(i.v);

            if (a != b) {
                res[p++] = i;
                union(a, b);

            }

        }
        long sum = 0;
        for (int i = 0; i < p; i++) {
            System.out.println(res[i].u + " " + res[i].v + " " + res[i].w);
            sum += res[i].w;
        }
        System.out.println("Sum=" + sum);

    }

}
