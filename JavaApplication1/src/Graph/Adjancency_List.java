package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Adjancency_List {

    static boolean vis[] = new boolean[9];
    static ArrayList<Integer>[] a = new ArrayList[9];

    static void dfs(int v) {
        vis[v] = true;
        System.out.println(v);
        for (int i = 0; i < a[v].size(); i++) {
            if (!vis[a[v].get(i)]) {
                dfs(a[v].get(i));
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = 8;
        int m = 7;

        for (int i = 0; i <= n; i++) {
            a[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            a[p].add(q);
            a[q].add(p);
        }
        int c = 0;
        dfs(1);
    }

}
