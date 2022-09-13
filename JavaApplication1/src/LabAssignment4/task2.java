package LabAssignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class task2 {

    static ArrayList<Integer> dijkstra(ArrayList<Node>[] graph, int n) {
        PriorityQueue<Store> p = new PriorityQueue<Store>(new myCom());
        int[] dis = new int[n + 1];
        int[] pre = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dis[i] = 2000000000;
            pre[i] = -1;
        }
        p.add(new Store(0, 1));
        dis[1] = 0;
        while (!p.isEmpty()) {
            Store curr = p.poll();
            for (Node i : graph[curr.v]) {
                if (dis[i.v] > curr.d + i.w) {
                    dis[i.v] = curr.d + i.w;
                    pre[i.v] = curr.v;
                    p.add(new Store(dis[i.v], i.v));
                }
            }
        }
        ArrayList<Integer> path = new ArrayList<Integer>();
        int w = n;
        while (w != -1) {
            path.add(w);
            w = pre[w];
        }
        return path;
    }

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File file = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment4\\input2.txt");
        FileWriter out = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment4\\output2.txt");
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
                Node vToU = new Node(v, u, w);
                graph[v].add(vToU);
            }
            ArrayList<Integer> path = new ArrayList<Integer>();
            path = dijkstra(graph, n);
            for (int i = path.size() - 1; i >= 0; i--) {
                out.write(path.get(i) + " ");
            }
            out.write("\r\n");
        }
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
        return a.d - b.d;
    }
}
