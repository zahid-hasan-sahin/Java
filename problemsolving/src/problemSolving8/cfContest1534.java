package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1534 {

    static long p = 1000000007;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            Graph g = new Graph(n);
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                g.addEdge(a[i], b[i]);
            }
            int c = 0;
            boolean[] vis = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                if (!vis[i]) {
                    ++c;
                    g.dfs(i, vis);
                }
            }
            long res = 1;
            for (int i = 0; i < c; i++) {
                res = (res * 2) % p;
            }
            System.out.println(res);
        }
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

    void dfs(int n, boolean[] vis) {
        vis[n] = true;
        for (int i : node[n]) {
            if (!vis[i]) {
                dfs(i, vis);
            }
        }
    }
}
