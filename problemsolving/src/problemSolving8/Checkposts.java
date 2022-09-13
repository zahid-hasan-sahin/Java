package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkposts {

    static void dfs(int u, ArrayList<Integer>[] node, boolean[] vis, ArrayList<Integer> ar) {
        vis[u] = true;
        for (int i : node[u]) {
            if (!vis[i]) {
                dfs(i, node, vis, ar);
            }
        }
        ar.add(u);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ++n;
        int[] a = new int[n];
        for (int i = 1; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        ArrayList[] node = new ArrayList[n];
        ArrayList[] trans = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            node[i] = new ArrayList<Integer>();
            trans[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            node[u].add(v);
            trans[v].add(u);
        }
        boolean[] vis = new boolean[n];
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            if (!vis[i]) {
                dfs(i, node, vis, ar);
            }
        }
        for (int i = 0; i < n; i++) {
            vis[i] = false;
        }
        long price = 0;
        long mod = 1000000007;
        long ways = 1;
        for (int i = ar.size() - 1; i >= 0; i--) {
            ArrayList<Integer> scc = new ArrayList<Integer>();
            if (!vis[ar.get(i)]) {
                dfs(ar.get(i), trans, vis, scc);
                int mn = 1000000000;
                for (int j = 0; j < scc.size(); j++) {
                    mn = Math.min(a[scc.get(j)], mn);
                }
                int count = 0;
                for (int j = 0; j < scc.size(); j++) {
                    if (a[scc.get(j)] == mn) {
                        ++count;
                    }
                }
                price += mn;
                ways = ((ways) % mod * (count % mod)) % mod;
            }

        }
        System.out.println(price + " " + ways);
    }
}
