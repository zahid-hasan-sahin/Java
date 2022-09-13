package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CodeMonk {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n);
        HashSet<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            int v = scan.nextInt();
            int u = scan.nextInt();
            g.addEdge(v, u);
            a.add(v);
            a.add(u);
        }
        long mod = 1000000007;
        long res = 1;
        boolean[] vis = new boolean[1000000];
        for (int i : a) {
            if (!vis[i]) {

                HashSet<Integer> k = new HashSet<Integer>();
                g.dfs(i, k, vis);
                res = ((res % mod) * (k.size() % mod)) % mod;
            }
        }
        System.out.println(res);
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

    void addEdge(int u, int v) {
        node[u].add(v);
        node[v].add(u);
    }

    void dfs(int v, HashSet<Integer> h, boolean[] vis) {
        vis[v] = true;
        h.add(v);
        for (int i : node[v]) {
            if (!vis[i]) {

                dfs(i, h, vis);

            }
        }
    }

}
