package LabAssignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class task4 {

    static void dijkstra(ArrayList<Node>[] graph, int[] vis, int[] dis, int s, int n) {
        PriorityQueue<Store> p = new PriorityQueue<Store>(new myCom());
        for (int i = 0; i < n + 1; i++) {
            dis[i] = -1;
        }
        p.add(new Store(Integer.MAX_VALUE, s));
        dis[s] = Integer.MAX_VALUE;
        while (!p.isEmpty()) {
            Store curr = p.poll();
            for (Node i : graph[curr.v]) {
                if (Math.min(dis[curr.v], i.w) > dis[i.v]) {
                    dis[i.v] = Math.min(dis[curr.v], i.w);
                    p.add(new Store(dis[i.v], i.v));
                }
            }
        }

    }

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File file = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment4\\input4.txt");
        FileWriter out = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment4\\output4.txt");

        Scanner scan = new Scanner(file);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            ArrayList<Node> graph[] = new ArrayList[n + 1];
            for (int i = 0; i < n + 1; i++) {
                graph[i] = new ArrayList<Node>();
            }
            for (int i = 0; i < m; i++) {
                int u = scan.nextInt();
                int v = scan.nextInt();
                int w = scan.nextInt();
                Node uToV = new Node(u, v, w);
                graph[u].add(uToV);
            }
            int s = scan.nextInt();

            int[] vis = new int[n + 1];
            int[] res = new int[n + 1];
            dijkstra(graph, vis, res, s, n);
            for (int i = 1; i <= n; i++) {
                if (i == s) {
                    res[i] = 0;
                }
                out.write(res[i] + " ");
            }
            out.write("\r\n");
        }
        out.close();
        out.close();
    }
}

class Node {

    int u, v, w;

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

    public int compare(Store a, Store b) {
        return b.d - a.d;
    }
}
