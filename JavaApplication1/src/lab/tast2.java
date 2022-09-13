package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tast2 {

    static void bfs(int[] vis, ArrayList<Integer>[] graph, int node, int endPoint) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        System.out.print("Places: ");
        while (!q.isEmpty()) {
            int m = q.poll();
            if (vis[m] == 0) {
                System.out.print(m + " ");
            }
            if (m == endPoint) {
                break;
            }
            vis[m] = 1;
            for (int i = 0; i < graph[m].size(); i++) {
                if (vis[graph[m].get(i)] == 0) {
                    q.add(graph[m].get(i));
                }
            }
        }
        System.out.println();

    }

    public static void main(String args[]) throws FileNotFoundException {
       File file = new File("input.txt");
        Scanner scan = new Scanner(file);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer>[] node = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            node[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            node[u].add(v);
        }
        int[] vis = new int[n + 1];
        bfs(vis, node, 1, 12);
    }

}
