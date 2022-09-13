package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class Suminthetree {

    static void dfs(ArrayList<Integer>[] graph, int curr, int[] vis, long[] path, long[] height, long min, int h, long[] s) {
        height[curr] = h;
        min = Math.max(min, s[curr]);
        vis[curr] = 1;
        path[curr] = min;

        for (int child : graph[curr]) {
            if (vis[child] == 0) {
                dfs(graph, child, vis, path, height, min, h + 1, s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 2; i <= n; i++) {
            int p = scan.nextInt();
            graph[i].add(p);
            graph[p].add(i);
        }
        long[] s = new long[n + 1];
        long res = -1;
        for (int i = 1; i <= n; i++) {
            s[i] = scan.nextInt();
            res = Math.max(res, s[i]);
       
        }

        int[] vis = new int[n + 1];
        long[] height = new long[n + 1];
        long[] path = new long[n + 1];
        dfs(graph, 1, vis, path, height, s[1], 1, s);
        for (int i = 1; i <= n; i++) {
            if (height[i] % 2 == 0) {
                if (s[i] != -1) {
                    System.out.println("-1");
                    return;
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (height[i]%2==1 && s[i] < path[i]) {
                System.out.println("-1");
                return;
            }
        }
        
        System.out.println(res);

    }
}
