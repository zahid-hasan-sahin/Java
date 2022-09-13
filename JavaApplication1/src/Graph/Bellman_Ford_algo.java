package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Bellman_Ford_algo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n, m);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
        g.bellmanFord(scan.nextInt());

    }

}

class Node {

    int u, v, w;

    Node() {

    }

    Node(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}

class Graph {

    ArrayList<Node>[] node;
    int v, e;

    Graph(int n, int m) {
        v = n + 1;
        m = e;
        node = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            node[i] = new ArrayList<Node>();
        }
    }

    void addEdge(int u, int v, int w) {
        Node n = new Node(u, v, w);
        node[u].add(n);
    }

    void bellmanFord(int s) {
        int[] par = new int[v];
        int[] dis = new int[v];
        for (int i = 0; i < v; i++) {
            dis[i] = Integer.MAX_VALUE;
            par[i] = -1;
        }
        dis[s] = 0;
        for (int i = 0; i < v; i++) {
            boolean b = true;
            for (int j = 0; j < v; j++) {
                for (int k = 0; k < node[j].size(); k++) {
                    Node e = node[j].get(k);
                    if (dis[e.u] < Integer.MAX_VALUE) {
                        if (dis[e.v] > dis[e.u] + e.w) {
                            dis[e.v] = dis[e.u] + e.w;
                            par[e.v] = e.u;
                            b = false;
                        }
                    }
                }
            }
            if (b) {
                break;
            }
            System.out.println();
        }
        for (int i = 1; i < v; i++) {
            int curr = i;
            System.out.println("SSSP of " + i + " is: " + dis[i]);
            System.out.print("Path is: ");
            for (; curr != -1; curr = par[curr]) {
                System.out.print(curr + " ");
            }
            System.out.println("\n");

        }
    }
}
