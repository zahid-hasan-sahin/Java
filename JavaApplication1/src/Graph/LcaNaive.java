
package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class LcaNaive {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n, m);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt());
        }
        g.dfs(1, 0);
        int t = scan.nextInt();
        while (t-- > 0) {
            System.out.println(g.lca(scan.nextInt(), scan.nextInt()));
        }

    }

}

class Graph {

    ArrayList<Integer>[] node;
    int v, e;
    int[] par;
    int level[];
    boolean vis[];

    Graph(int v, int e) {
        this.v = v + 1;
        this.e = e + 1;

        par = new int[this.v];

        level = new int[this.v];
        vis = new boolean[this.v];
        node = new ArrayList[this.v];
        for (int i = 0; i < this.v; i++) {
            node[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int u, int v) {
        node[u].add(v);
        par[v] = u;
    }

    void dfs(int n, int lev) {
        level[n] = lev;
        vis[n] = true;
        for (int i : node[n]) {
            if (!vis[i]) {
                dfs(i, lev + 1);
            }
        }

    }

    int lca(int a, int b) {
        if (level[a] > level[b]) {
            int d = level[a] - level[b];
            while (d-- > 0) {
                a = par[a];
            }
        } else {
            int d = level[b] - level[a];

            while (d-- > 0) {

                b = par[b];

            }
        }
        if (a == b) {
            return a;
        }

        while (par[b] != par[a]) {
            b = par[b];
            a = par[a];
        }

        return par[a];
    }
}
