package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class kosarajusAlgo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph2 g = new Graph2(n);
        Graph2 trans = new Graph2(n);
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            g.addEdge(a, b);
            trans.addEdge(b, a);
        }
        ArrayList<Integer> ar = new ArrayList<Integer>();
        boolean[] vis = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                g.dfs(i, vis, ar);
            }
        }
        
        System.out.println(ar);

        for (int i = 0; i <= n; i++) {
            vis[i] = false;
        }
      
        for (int i = ar.size() - 1; i >= 0; i--) {
            if (!vis[ar.get(i)]) {
                ArrayList<Integer> a = new ArrayList<Integer>();
                trans.dfs(ar.get(i), vis, a);
                System.out.println(a);
            }
        }

    }

}

class Graph2 {

    ArrayList<Integer>[] node;
    int n;

    Graph2(int n) {
        ++n;
        this.n = n;
        node = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            node[i] = new ArrayList<Integer>();
        }

    }

    void addEdge(int u, int v) {
        node[u].add(v);
    }

    void dfs(int i, boolean[] vis, ArrayList<Integer> ar) {
        vis[i] = true;
        for (int c : node[i]) {
            if (!vis[c]) {
                dfs(c, vis, ar);
            }
        }
        ar.add(i);
    }
}
