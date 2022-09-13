package problemSolving8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DecorateAppleTree {

    static void dfs(ArrayList<Integer>[] graph, int[] vis, int[] dis, int curr) {
        vis[curr] = 1;

        if (graph[curr].size() == 1 && curr != 1) {
            dis[curr] = 1;
            return;
        }
        int c = 0;
        for (int child : graph[curr]) {
            if (vis[child] == 0) {
                dfs(graph, vis, dis, child);
            }
            c += dis[child];
        }
        dis[curr] = c;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 2; i <= n; i++) {
            int u = i;
            int v = scan.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        if(n==1){
            System.out.println(1);
            return ;
        }
        int[] dis = new int[n + 1];
        int[] vis = new int[n + 1];
        dfs(graph, vis, dis, 1);
        Arrays.sort(dis);
        for (int i = 1; i <= n; i++) {
            System.out.print(dis[i] + " ");
        }

    }

}
