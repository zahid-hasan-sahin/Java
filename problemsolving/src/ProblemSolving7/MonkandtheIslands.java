package ProblemSolving7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MonkandtheIslands {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            Graph g = new Graph(n);
            for (int i = 0; i < m; i++) {
                int v = scan.nextInt();
                int u = scan.nextInt();
                g.addEgde(v, u);
            }
            g.bfs(1);
        }
    }

}

class Graph {

    ArrayList<Integer>[] node;
    int size;

    Graph(int n) {
        node = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            node[i] = new ArrayList<Integer>();
        }
        size = n;
    }

    void addEgde(int v, int u) {
        node[v].add(u);
        node[u].add(v);
    }

    void bfs(int v) {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] vis = new boolean[size + 1];
        int[] dis = new int[size + 1];
        q.add(v);
        vis[v] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int i : node[curr]) {
                if (!vis[i]) {
                    vis[i] = true;
                    dis[i] = dis[curr] + 1;
                    q.add(i);

                }
            }
        }
        System.out.println(dis[size]);
    }
}
