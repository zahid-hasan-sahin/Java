package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task {

    static void dfs(ArrayList<Integer>[] graph, int curr, int[] vis, ArrayList<Integer> ar) {
        vis[curr] = 1;
        for (int child : graph[curr]) {
            if (vis[child] == 0) {
                dfs(graph, child, vis, ar);
            }
        }
        ar.add(curr);
    }

    static void dfs2(ArrayList<Integer>[] graph, int curr, int[] vis, ArrayList<Integer> ar) {
        ar.add(curr);
        vis[curr] = 1;
        for (int child : graph[curr]) {
            if (vis[child] == 0) {
                dfs(graph, child, vis, ar);
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("G:\\Solutin\\input.txt");
        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        ArrayList<Integer>[] transposeGraph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
            transposeGraph[i] = new ArrayList<Integer>();
        }

        while (scan.hasNext()) {
            int u = scan.nextInt();
            int v = scan.nextInt();

            graph[u].add(v);
            transposeGraph[v].add(u);
        }
        int[] vis1 = new int[n + 1];
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (vis1[i] == 0) {
                dfs(graph, i, vis1, ar);

            }
        }

        int[] vis2 = new int[n + 1];
        for (int i = ar.size() - 1; i >= 0; i--) {
            int curr = ar.get(i);
            if (vis2[curr] == 0) {
                ArrayList<Integer> res = new ArrayList<Integer>();
                dfs2(transposeGraph, curr, vis2, res);
                Collections.sort(res);

                for (int j = 0; j < res.size(); j++) {
                    System.out.print(res.get(j) + " ");
                }
                System.out.println();
            }
        }

    }

}
