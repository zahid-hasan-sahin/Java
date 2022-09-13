package lightOj;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FarthestNodesinaTree {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        PrintWriter out = new PrintWriter(System.out);

        while (t-- > 0) {
            mx = 0;
            int n = scan.nextInt();
            ArrayList<Node>[] node = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                node[i] = new ArrayList<Node>();
            }
            for (int i = 0; i < n - 1; i++) {
                addEdge(scan.nextInt(), scan.nextInt(), scan.nextInt(), node);
            }
            int[] a = new int[n];
            int[] b = new int[n];

            findDiameter(a, b, node, n);

            out.println("Case " + q++ + ":");
            for (int i = 0; i < n; i++) {
                out.println(farNode(i, a, b));
            }
        }
        out.close();

    }

    static void addEdge(int u, int v, int w, ArrayList<Node>[] node) {
        {
            node[u].add(new Node(v, w));
            node[v].add(new Node(u, w));
        }
    }

    static int currNode;
    static int mx = 0;

    static void findDiameter(int[] xDis, int[] yDis, ArrayList<Node>[] node, int n) {

        findDiameterHelper(0, 0, xDis, node, n);
        int x = currNode;
        for (int i = 0; i < n; i++) {
            xDis[i] = 0;
        }
        mx = Integer.MIN_VALUE;
        findDiameterHelper(x, 0, xDis, node, n);
        int y = currNode;
        mx = Integer.MIN_VALUE;

        findDiameterHelper(y, 0, yDis, node, n);

    }

    static int farNode(int u, int[] xDis, int[] yDis) {
        return Math.max(xDis[u], yDis[u]);
    }

    static void findDiameterHelper(int u, int w, int[] arr, ArrayList<Node>[] node, int n) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(u);
        boolean[] vis = new boolean[n];
        vis[u] = true;
    
        while (!q.isEmpty()) {
            int curr = q.poll();

            if (arr[curr] > mx) {
                mx = arr[curr];
                currNode = curr;
            }
            vis[curr] = true;
            for (Node child : node[curr]) {
                if (!vis[child.v]) {
                    arr[child.v] = child.w + arr[curr];
                    q.add(child.v);
                }
            }
        }
    }
}

class Node {

    int v;
    int w;

    Node(int a, int b) {
        v = a;
        w = b;
    }

}
