package ProblemSolving7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SocialNetworkingGraph {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt());
        }
        int q = scan.nextInt();
        while (q-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int[] dis = new int[n + 1];
            g.bfs(x, dis);
            int res = 0;
            for (int i = 0; i < n + 1; i++) {
                if (dis[i] == y) {
                    ++res;
                }
            }
            System.out.println(res);
        }

    }
}

class Graph {

    ArrayList<Integer>[] node;

    Graph(int size) {
        node = new ArrayList[size + 1];
        for (int i = 0; i < size + 1; i++) {
            node[i] = new ArrayList<Integer>();
        }

    }

    void addEdge(int v, int u) {
        node[v].add(u);
        node[u].add(v);
    }

    void bfs(int a, int[] dis) {
        boolean[] vis = new boolean[10000];
        dis[a] = 0;
        vis[a] = true;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(a);
        while (!q.isEmpty()) {
            int k = q.poll();
            for (int i : node[k]) {
                if (!vis[i]) {
                    dis[i] = dis[k] + 1;
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
    }
}