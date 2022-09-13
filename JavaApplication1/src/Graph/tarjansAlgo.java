package Graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class tarjansAlgo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt());
        }
        boolean[] vis = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                g.dfs(i, vis);
            }
        }

    }

}

class Graph {

    ArrayList<Integer>[] node;
    int size;
    int scc = 0;
    int timer = 0;
    int[] inStack;
    int[] in;
    int[] low;

    Stack<Integer> st = new Stack<Integer>();

    Graph(int n) {
        size = n + 1;
        in = new int[size];
        low = new int[size];
        inStack = new int[size];

        node = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            node[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int v, int u) {
        node[v].add(u);

    }

    void dfs(int v, boolean[] vis) {
        vis[v] = true;
        in[v] = low[v] = timer++;
        st.add(v);
        inStack[v] = 1;
        for (int i : node[v]) {
            if (vis[i] && inStack[i] == 1) {
                low[v] = Math.min(low[v], in[i]);
            } else if (!vis[i]) {
                dfs(i, vis);
                if (inStack[i] == 1) {
                    low[v] = Math.min(low[v], low[i]);
                }
            }
        }
        if (low[v] == in[v]) {
            System.out.println("SCC #" + scc++);
            while (true) {
                int t = st.pop();
                System.out.print(t + " ");
                inStack[t] = 0;
                if (t == v) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
