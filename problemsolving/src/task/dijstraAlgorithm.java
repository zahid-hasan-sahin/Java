package task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class dijstraAlgorithm {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph1 g = new Graph1(n, m);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
        g.dijsktra(1);
    }

}

class Node {

    int u, v, w;

    Node() {

    }

    Node(int a, int b, int c) {
        u = a;
        v = b;
        w = c;
    }
}

class Store {

    int d, v;

    Store(int a, int b) {
        d = a;
        v = b;
    }
}

class myCom implements Comparator<Store> {

    @Override
    public int compare(Store a, Store b) {
        return a.d - b.d;
    }
}

class Graph1 {

    int v, e;
    ArrayList<Node> node[];

    Graph1(int n, int m) {
        ++n;
        v = n;
        e = m;
        node = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            node[i] = new ArrayList<Node>();
        }
    }

    void addEdge(int u, int v, int w) {
        Node n = new Node(u, v, w);
        Node n1 = new Node(v, u, w);
        node[u].add(n);
        node[v].add(n1);
    }

    void dijsktra(int n) {
        PriorityQueue<Store> p = new PriorityQueue<Store>(new myCom());
        int[] dis = new int[v];
        for (int i = 0; i < v; i++) {
            dis[i] = Integer.MAX_VALUE;
        }
        p.add(new Store(0, n));
        dis[n] = 0;
        while (!p.isEmpty()) {
            Store curr = p.poll();
            for (Node i : node[curr.v]) {
                if (dis[i.v] > curr.d + i.w) {
                    dis[i.v] = curr.d + i.w;
                    p.add(new Store(dis[i.v], i.v));
                }
            }
        }
        for (int i = 1; i < v; i++) {
            System.out.print(dis[i] + " ");

        }
        System.out.println();
    }

}
