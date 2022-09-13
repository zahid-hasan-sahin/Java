package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class SpanningTreewithMaximumDegree {
    
    static int find(int a, int[] par) {
        if (par[a] < 0) {
            return a;
        }
        return par[a] = find(par[a], par);
    }
    
    static void union(int a, int b, int[] par, int[] r) {
        int a1 = find(a, par);
        int b1 = find(b, par);
        if (a1 != b1) {
            if (r[a1] > r[b1]) {
                r[a1] += r[b1];
                par[b1] = a1;
            } else {
                r[b1] += r[a1];
                par[a1] = b1;
            }
        }
    }
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ++n;
        int[] par = new int[n];
        int[] r = new int[n];
        ArrayList<Integer>[] graph = new ArrayList[n];
        int[] deg = new int[200001];
        for (int i = 0; i < n; i++) {
            par[i] = -1;
            r[i] = 1;
            graph[i] = new ArrayList<Integer>();
        }
        ArrayList<Integer> s = new ArrayList<Integer>();
        ArrayList<Integer> t = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            ++deg[u];
            ++deg[v];
            graph[u].add(v);
            graph[v].add(u);
            s.add(u);
            t.add(v);
        }
        int mx = 0;
        int ind = 0;
        for (int i = 1; i < 200001; i++) {
            if (mx <= deg[i]) {
                mx = deg[i];
                ind = i;
            }
        }

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i : graph[ind]) {
            union(i, ind, par, r);
            a.add(ind);
            b.add(i);
        }
      
        for (int i = 0; i < m; i++) {
            int u = s.get(i);
            int v = t.get(i);
            if (find(u, par) != find(v, par)) {
                a.add(u);
                b.add(v);
                union(u, v, par, r);
            }
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " " + b.get(i));
        }
        
    }
}
