package problemSolving8;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LunarNewYearandaWander {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n, m);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt());
        }
        g.bfs();

    }

}

class Graph {

    int n, m;
    ArrayList<Integer>[] node;

    Graph(int ver, int ed) {
        n = ++ver;
        m = ed;
        node = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            node[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int v, int u) {
        node[v].add(u);
        node[u].add(v);
    }

    void bfs() {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(1);
        boolean[] vis = new boolean[n];
        vis[1] = true;
        while (!q.isEmpty()) {

            int curr = q.poll();
            System.out.print(curr + " ");
            for (int child : node[curr]) {
                if (!vis[child]) {
                    q.add(child);
                    vis[child] = true;
                }
            }
        }
        System.out.println();
    }
}
