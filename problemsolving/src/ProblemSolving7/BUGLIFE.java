package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class BUGLIFE {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            Graph g = new Graph(n + 1);
            for (int i = 0; i < m; i++) {
                g.addEdge(scan.nextInt(), scan.nextInt());
            }
            int[] vis = new int[n + 1];
            boolean b = true;
            for (int i = 1; i <= n; i++) {
                if (vis[i] == 0) {
                    b = g.isBipartite(i, 0, vis);
                }
                if (!b) {
                    System.out.println("Scenario #" + q++ + ":");
                    System.out.println("Suspicious bugs found!");
                    continue k;
                }
            }
            System.out.println("Scenario #" + q++ + ":");

            System.out.println("No suspicious bugs found!");

        }
    }

}

class Graph {

    ArrayList<Integer>[] node;

    int[] col;

    Graph(int n) {
        node = new ArrayList[n];
        col = new int[n];
        for (int i = 0; i < n; i++) {
            node[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int a, int b) {
        node[a].add(b);
        node[b].add(a);
    }

    boolean isBipartite(int v, int c, int[] vis) {
        vis[v] = 1;
        col[v] = c;
        for (int i : node[v]) {
            if (vis[i] == 0) {
                if (!isBipartite(i, c ^ 1, vis)) {
                    return false;
                }
            } else if (col[v] == col[i]) {
                return false;
            }
        }
        return true;
    }
}
