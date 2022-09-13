package ProblemSolving7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PPATHPrimePath {

    static boolean check(int a, int b) {
        String k = String.valueOf(a);
        String p = String.valueOf(b);
        int c = 0;
        for (int i = 0; i < 4; i++) {
            if (k.charAt(i) != p.charAt(i)) {
                ++c;
            }
        }
        return c == 1;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> pr = new ArrayList<Integer>();
        int[] ch = new int[10001];
        for (long i = 2; i < 10000; i++) {
            if (ch[(int) i] == 0) {
                if (i >= 1000) {
                    pr.add((int) i);
                }
                for (long j = i * i; j <= 10000; j += i) {
                    ch[(int) j] = 1;
                }
            }
        }

        Graph g = new Graph(10000);
        for (int i = 0; i < pr.size(); i++) {
            for (int j = i + 1; j < pr.size(); j++) {
                if (check(pr.get(i), pr.get(j))) {
                    g.addEgde(pr.get(i), pr.get(j));
                }
            }
        }
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            g.bfs(a, b);

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

    void bfs(int v, int b) {
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
        if (v != b && dis[b] == 0) {
            System.out.println("Impossible");
        } else {
            System.out.println(dis[b]);
        }
    }
}
