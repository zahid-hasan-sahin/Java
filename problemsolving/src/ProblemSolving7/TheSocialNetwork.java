package ProblemSolving7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TheSocialNetwork {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Graph g = new Graph(10000);
        while (n-- > 0) {
            int k = scan.nextInt();
            g.addEdge(1, k);
            int m = scan.nextInt();
            for (int i = 0; i < m; i++) {
                g.addEdge(k, scan.nextInt());
            }
        }
        int[] dis = new int[10000];
        g.bfs(1, dis);
        int res = 0;
        for (int i = 1000; i < 10000; i++) {
            if (dis[i] > 1) {
                ++res;
            }
        }
        System.out.println(res);
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
