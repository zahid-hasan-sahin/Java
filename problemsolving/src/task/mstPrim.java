package task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class mstPrim {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph3 g = new Graph3(n, m);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
        g.prims();
    }
}

class Graph3 {

    ArrayList<Node>[] node;
    int v;
    int e;

    Graph3(int v, int e) {
        ++v;
        this.v = v;
        this.e = e;
        node = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            node[i] = new ArrayList<Node>();
        }
    }

    void addEdge(int u, int v, int w) {
        Node n = new Node(u, v, w);
        node[u].add(n);
        Node n1 = new Node(v, u, w);
        node[v].add(n1);
    }

    void prims() {
        PriorityQueue<Node> set = new PriorityQueue<Node>(new myCom());
        Node[] res = new Node[v];
        int p = 0;
        for (int i = 0; i < v; i++) {
            res[i] = new Node();
        }
        boolean[] vis = new boolean[v];
        vis[1] = true;
        int mn = Integer.MAX_VALUE;
        int q = 1;
        for (Node k : node[1]) {
            if (mn > k.w) {
                q = k.v;
                mn = k.w;
            }
        }

        set.add(new Node(1, q, mn));
        long re = 0;
        while (p < v - 2) {

            Node r = set.poll();

            if (!vis[r.u] || !vis[r.v]) {
                res[p++] = r;
                re += r.w;
            }
            vis[r.u] = true;

            for (Node i : node[r.u]) {
                if (!vis[i.v]) {
                    Node n = new Node(i.v, r.u, i.w);
                    set.add(n);
                }

            }
            vis[r.v] = true;
        }
        for (int i = 0; i < p; i++) {
            //     System.out.println(res[i].u + " " + res[i].v + " " + res[i].w);
        }

        System.out.println(re);

    }
}

class Node {

    int u, v, w;

    Node(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    Node() {

    }
}

class myCom implements Comparator<Node> {

    public int compare(Node a, Node b) {
        return a.w - b.w;
    }
}
