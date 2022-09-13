package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class FireEscapeRoutes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long mod = 1000000007;
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            Graph g = new Graph(n);
            for (int i = 0; i < m; i++) {
                g.addEdge(scan.nextInt(), scan.nextInt());
            }
            boolean[] vis = new boolean[n + 1];
            int c = 0;
            long res = 1;
            for (int i = 1; i <= n; i++) {
                if (!vis[i]) {
                    ++c;
                    long[] p = new long[1];
                    g.connectedComponent(i, vis, p);

                    res = ((res % mod) * (p[0] % mod)) % mod;
                }
            }
            System.out.println(c + " " + res);

        }
    }
}

class Graph {

    ArrayList<Integer>[] node;

    Graph(int n) {
        node = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            node[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int a, int b) {
        node[a].add(b);
        node[b].add(a);
    }

    void connectedComponent(int v, boolean vis[], long[] p) {
        vis[v] = true;
        ++p[0];
        for (int i : node[v]) {
            if (!vis[i]) {
                connectedComponent(i, vis, p);
            }
        }
    }
}
