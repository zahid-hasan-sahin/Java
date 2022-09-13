package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class tast3 {

    static ArrayList<Integer> print = new ArrayList<Integer>();

    static void dfs_vis(ArrayList<Integer>[] graph, int node, int[] vis) {
        vis[node] = 1;
        print.add(node);
        for (int i = 0; i < graph[node].size(); i++) {
            if (vis[graph[node].get(i)] == 0) {
                dfs_vis(graph, graph[node].get(i), vis);
            }
        }

    }

    static void dfs(ArrayList<Integer>[] graph, int endPoint, int totalNode) {
        int[] vis = new int[totalNode + 1];
        for (int i = 1; i <= totalNode; i++) {
            if (vis[i] == 0) {
                dfs_vis(graph, i, vis);
            }
        }
        System.out.print("Places: ");
        for (int i = 0; i < print.size(); i++) {
            System.out.print(print.get(i) + " ");
            if (print.get(i) == endPoint) {
                return;
            }
        }

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
        dfs(node, 12, n);
        System.out.println();
    }
}
