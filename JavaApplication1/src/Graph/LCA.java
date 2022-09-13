package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class LCA {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n, m);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt());
        }
        g.calParent();
        int q = scan.nextInt();
        while (q-- > 0) {
            System.out.println(g.distance(scan.nextInt(), scan.nextInt()));
        }

    }
}

class Graph {

    ArrayList<Integer>[] node;
    int v, e;
    int[][] par;
    int[] level;

    Graph(int ver, int ed) {
        v = ver + 1;
        e = ed;
        node = new ArrayList[v];
        level = new int[v];
        int log = (int) Math.ceil(Math.log(v));
        par = new int[v][log + 1];
        for (int i = 0; i < v; i++) {
            node[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int u, int v) {
        node[u].add(v);
    }

    void dfs(int n, int p, int l) {
        par[n][0] = p;
        level[n] = l;
        for (int i : node[n]) {
            if (i != p) {
                dfs(i, n, l + 1);
            }
        }
    }

    void calParent() {
        dfs(1, 0, 1);
        int log = (int) Math.ceil(Math.log(v));
        for (int i = 1; i < v; i++) {
            for (int j = 1; j <= log; j++) {
                par[i][j] = par[par[i][j - 1]][j - 1];
            }
        }

    }

    int lca(int a, int b) {
        if (level[a] > level[b]) {
            int temp = a;
            a = b;
            b = temp;
        }

        int log = (int) Math.ceil(Math.log(v));
        int d = level[b] - level[a];
        int p = b;
        while (d != 0) {
            int q = 0;
            while (Math.pow(2, q + 1) < d) {
                ++q;
            }
            p = par[p][q];
            d -= Math.pow(2, q);

        }
        b = p;

        if (a == b) {
            return a;
        }
        for (int i = log; i >= 0; i--) {
            if (par[a][i] != 0 && par[a][i] != par[b][i]) {
                a = par[a][i];
                b = par[b][i];
            }
        }
        return par[a][0];
    }

    int distance(int a, int b) {
        int lca = lca(a, b);
        return level[a] + level[b] - 2 * level[lca];
    }

}
