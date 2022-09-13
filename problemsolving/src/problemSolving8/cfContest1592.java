package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class cfContest1592 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {

            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] val = new int[n + 1];
            ArrayList<Integer>[] g = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                g[i] = new ArrayList<Integer>();
            }
            for (int i = 1; i <= n; i++) {
                val[i] = scan.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                int u = scan.nextInt();
                int v = scan.nextInt();
                g[u].add(v);
                g[v].add(u);
            }
            int[] vis = new int[n + 1];
            HashSet<Integer> a = new HashSet<Integer>();
            boolean ch = isPos(g, 1, 0, vis, 0, k, a, 0, n, val);
            System.out.println(ch);
        }
    }

    static boolean isPos(ArrayList<Integer>[] graph, int n, int xor, int vis[], int choosen, int k, HashSet<Integer> st, int visCount, int tot, int[] val) {
        if (visCount == tot) {
            for (int i : st) {
                System.out.print(i + " ");
            }
            System.out.println();
            if (st.size() <= 1 && choosen < k && choosen >= 1) {
                return true;
            }
            return false;
        }
        vis[n] = 1;
        ++visCount;
        boolean b = false;
        for (int i : graph[n]) {
            if (vis[i] == 0) {
                visCount++;
                boolean ch = isPos(graph, i, xor ^ val[n], vis, choosen, k, st, visCount, tot, val);
                if (ch) {
                    b = true;
                }
                if (xor != 0) {
                    st.add(xor);
                }
                ch = isPos(graph, i, 0, vis, choosen + 1, k, st, visCount, tot, val);
                if (ch) {
                    b = true;
                }
            }
        }
        return b;

    }
}
