package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;
import javax.lang.model.SourceVersion;

public class ColoringaTree {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        Graph g = new Graph(n);
        for (int i = 2; i <= n; i++) {
            g.addEdge(i, scan.nextInt());
        }
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
        boolean[] vis = new boolean[n + 1];
        int k = g.dfs(1, vis, a, 0);
        System.out.println(k);
    }

}

class Graph {

    ArrayList<Integer>[] node;

    Graph(int n) {
        ++n;
        node = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            node[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int v, int u) {
        node[v].add(u);
        node[u].add(v);
    }
    int res = 0;

    int dfs(int v, boolean[] vis, int[] col, int c) {
        if (col[v] != c) {
            ++res;
        }
        vis[v] = true;
        for (int i : node[v]) {
            if (!vis[i]) {
                dfs(i, vis, col, col[v]);
            }
        }
        return res;
    }

   
}
