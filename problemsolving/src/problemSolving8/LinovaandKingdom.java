package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LinovaandKingdom {
    
    static ArrayList<store> a = new ArrayList<store>();
    
    static void dfs(ArrayList<Integer>[] node, int curr, int lvl, int[] vis) {
        a.add(new store(curr, lvl));
        vis[curr] = 1;
        for (int i : node[curr]) {
            if (vis[i] == 0) {
                dfs(node, i, lvl + 1, vis);
            }
        }
    }
    
    static void rooted(ArrayList<Integer>[] node, int curr, int[] root, int[] vis) {
        vis[curr] = 1;
        int c = 0;
        for (int i : node[curr]) {
            if (vis[i] == 0) {
                rooted(node, i, root, vis);
                c += root[i];
            }
        }
        root[curr] = c + node[curr].size() - 1;
    }
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer>[] node = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            node[i] = new ArrayList<Integer>();
        }
        
        for (int i = 0; i < n - 1; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            node[u].add(v);
            node[v].add(u);
            
        }
        int[] vis = new int[n + 1];
        dfs(node, 1, 0, vis);
        int[] root = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            vis[i] = 0;
        }
        rooted(node, 1, root, vis);
        root[1] += 1;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            store curr = a.get(i);
            ar.add(curr.lvl - root[curr.ind]);
        }
        Collections.sort(ar, Collections.reverseOrder());
        long res = 0;
        for (int i = 0; i < k; i++) {
            res += ar.get(i);
        }
        System.out.println(res);
    }
}

class store {
    
    int lvl, ind;
    
    store(int i, int l) {
        ind = i;
        lvl = l;
    }
}
