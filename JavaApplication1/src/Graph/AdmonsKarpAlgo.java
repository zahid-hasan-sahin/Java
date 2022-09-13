package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AdmonsKarpAlgo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n, m);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
        int s = scan.nextInt();
        int e = scan.nextInt();
        long res = g.max_flow(s, e);
        System.out.println(res);
    }
}

class Node {

    int pre;
    int currMin;

    Node(int c, int m) {
        pre = c;
        currMin = m;
    }
}

class Graph {

    ArrayList<Integer> node[];
    ArrayList<Integer> directed_for_print[];
    int v, e;
    int[][] cap;
    int[][] cap_for_print;

    Graph(int n, int m) {
        v = n + 1;
        e = m;
        node = new ArrayList[v];
        directed_for_print = new ArrayList[v];
        cap = new int[v][v];
        cap_for_print = new int[v][v];
        for (int i = 0; i < v; i++) {
            node[i] = new ArrayList<Integer>();
            directed_for_print[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int u, int v, int c) {
        node[u].add(v);
        node[v].add(u);
        cap[u][v] = c;
        cap_for_print[u][v] = c;
        directed_for_print[u].add(v);
    }

    long admonsKarp(int s, int e, int[] par) {
        Queue<Node> q = new LinkedList<Node>();

        q.add(new Node(s, Integer.MAX_VALUE));
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr.pre == e) {
                return curr.currMin;
            }
            for (int i : node[curr.pre]) {
                if (par[i] == -1 && cap[curr.pre][i] > 0) {

                    par[i] = curr.pre;
                    q.add(new Node(i, Math.min(curr.currMin, cap[curr.pre][i])));
                }
            }
        }
        return -1;
    }

    long max_flow(int s, int e) {
        int[] par = new int[v];

        long max_flow = 0;

        while (true) {

            for (int i = 0; i < v; i++) {
                par[i] = -1;
            }
            par[s] = -2;
            long new_flow = admonsKarp(s, e, par);
            if (new_flow == -1) {
                break;
            }
            max_flow += new_flow;
            int curr = e;
            while (curr != s) {
                int pre = par[curr];
                cap[pre][curr] -= new_flow;
                cap[curr][pre] += new_flow;
                curr = pre;

            }

        }
        for (int i = 0; i < directed_for_print.length; i++) {
            for (int j = 0; j < directed_for_print[i].size(); j++) {
                System.out.println(i + " " + directed_for_print[i].get(j) + " --> " + (cap_for_print[i][directed_for_print[i].get(j)] - cap[i][directed_for_print[i].get(j)]));
            }
        }
        return max_flow;

    }

}
