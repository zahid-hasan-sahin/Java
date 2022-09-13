package problemSolving8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphWithoutLongDirectedPaths {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] u = new int[200010];
        int[] v = new int[200010];
        Graph g = new Graph(m);

        for (int i = 0; i < m; i++) {
            u[i] = scan.nextInt();
            v[i] = scan.nextInt();
            g.addEdge(u[i], v[i]);
        }
        g.bfs(v[0], u, v);
    }

}

class Graph {

    ArrayList<Integer>[] node;
    int n = 200010;
    int m;

    Graph(int ed) {
        m = ed;
        node = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            node[i] = new ArrayList<Integer>();
        }

    }

    void addEdge(int u, int v) {
        node[u].add(v);
        node[v].add(u);
    }

    void bfs(int s, int[] u, int[] v) {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] vis = new boolean[200010];
        q.add(s);
        vis[s] = true;
        int[] dir = new int[200010];
        dir[s] = 1;
        while (!q.isEmpty()) {
            int curr = q.poll();
            int c = dir[curr];
            vis[curr] = true;
            for (int child : node[curr]) {
                if (!vis[child]) {
                    q.add(child);
                    if (c == 1) {
                        dir[child] = 2;
                    } else {
                        dir[child] = 1;
                    }
                } else {
                    if (c == dir[child]) {
                        System.out.println("NO");
                        return;
                    }
                }
            }

        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            if (dir[u[i]] == 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        System.out.println("YES");
        System.out.println(sb);
    }
}
