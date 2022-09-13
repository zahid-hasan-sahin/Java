package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class cfContest1714 {

    static void dfs(ArrayList<Edge>[] g, int curr) {

        for (Edge e : g[curr]) {
            System.out.println(curr+" "+e.v);
            dfs(g, e.v);
           
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Edge>[] g = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                g[i] = new ArrayList<Edge>();
            }

            for (int i = 2; i <= n; i++) {
                int u = scan.nextInt();
                int v = i;
                int a = scan.nextInt();
                int b = scan.nextInt();
                g[u].add(new Edge(u, v, a, b));

            }

            for (int i = 1; i <= n; i++) {
                System.out.print(i + "->");
                for (int j = 0; j < g[i].size(); j++) {
                    System.out.print(g[i].get(j).v + " ");
                }
                System.out.println();
            }
            dfs(g, 1);
        }
    }
}

class Edge {

    int u;
    int v;
    int a;
    int b;

    public Edge(int u, int v, int a, int b) {
        this.u = u;
        this.v = v;
        this.a = a;
        this.b = b;
    }

}
