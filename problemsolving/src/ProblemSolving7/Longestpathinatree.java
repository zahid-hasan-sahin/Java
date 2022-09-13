package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class Longestpathinatree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Graph g = new Graph(n);
        for (int i = 0; i < n - 1; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            g.addEdge(a, b);
        }
        g.findDiameterOfTree();

    }
}

class Graph {

    ArrayList<Integer>[] node;
    int size;
    boolean[] vis;
    int[] color;
    int counter = 1;
    int x = 1;
    int maxCount = 0;

    Graph(int size) {
        this.size = size;
        node = new ArrayList[size + 1];
        vis = new boolean[size + 1];
        color = new int[size + 1];
        for (int i = 0; i < size + 1; i++) {
            node[i] = new ArrayList<>();
        }
    }

    void addEdge(int u, int v) {
        node[u].add(v);
        node[v].add(u);
    }

    void dfsMain(int v) {
        vis[v] = true;
        for (int i : node[v]) {
            if (!vis[i]) {
                dfsMain(i);
            }
        }
    }

    void dfs(int v) {
        //  O(E+V)

        cleanVisArray();

        dfsMain(v);
    }

    void cleanVisArray() {
        for (int i = 0; i < size + 1; i++) {
            vis[i] = false;
        }
    }

    int countConnectedComponenets() {
        //  O(E+V)

        cleanVisArray();

        int count = 0;
        for (int i = 1; i < size + 1; i++) {
            if (!vis[i]) {
                ++count;
                dfsMain(i);
            }
        }
        return count;
    }

    void ssspHelper(int v, int d, int[] store) {
        vis[v] = true;
        store[v] = d;
        for (int i : node[v]) {
            if (!vis[i]) {
                ssspHelper(i, d + 1, store);
            }
        }
    }

    void sssp(int v) {
        //  Only Working For Tree
        //  O(V+E)

        cleanVisArray();

        int[] store = new int[size + 1];
        ssspHelper(v, 0, store);
        for (int i = 1; i < size + 1; i++) {
            System.out.print(store[i] + " ");
        }
        System.out.println();
    }

    boolean bipartiteHelper(int v, int c) {
        vis[v] = true;
        color[v] = c;
        for (int i : node[v]) {
            if (!vis[i]) {
                if (!bipartiteHelper(i, c ^ 1)) {
                    return false;
                }
            } else if (color[v] == color[i]) {
                return false;
            }
        }
        return true;

    }

    boolean isBipartite(int v, int c) {
        //  O(E+V)

        cleanVisArray();

        return bipartiteHelper(v, c);

    }

    boolean cycleHelper(int v, int p) {
        vis[v] = true;
        for (int i : node[v]) {
            if (!vis[i]) {
                return cycleHelper(i, v);
            } else if (i != p) {
                return true;
            }
        }
        return false;
    }

    boolean isContainCycle() {

        cleanVisArray();

        return cycleHelper(1, 1);
    }

    void inOutTimeHelper(int v, int[] in, int[] out) {
        vis[v] = true;
        in[v] = counter++;
        for (int i : node[v]) {
            if (!vis[i]) {
                inOutTimeHelper(i, in, out);
            }
        }
        out[v] = counter++;
    }

    void inOutTime(int[] in, int[] out) {

        cleanVisArray();

        inOutTimeHelper(1, in, out);
    }

    void findDiameterOfTreeHelper(int v, int c) {
        vis[v] = true;
        ++c;
        if (c > maxCount) {
            maxCount = c - 1;
            x = v;
        }
        for (int i : node[v]) {
            if (!vis[i]) {

                findDiameterOfTreeHelper(i, c);
            }
        }
    }

    void findDiameterOfTree() {
        cleanVisArray();
        findDiameterOfTreeHelper(1, 0);
        int endPoint1 = x;
        x = 0;
        maxCount = 1;
        cleanVisArray();
        findDiameterOfTreeHelper(endPoint1, 0);
        int endPoint2 = x;
        System.out.println(maxCount);
    }

}
