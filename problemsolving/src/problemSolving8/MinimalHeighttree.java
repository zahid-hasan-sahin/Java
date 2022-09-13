package problemSolving8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinimalHeighttree {

    static void bfs(int[] a, int n) {
        ArrayList<Integer>[] node = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            node[i] = new ArrayList<Integer>();
            node[i].add(0);
        }
        Queue<Integer> q = new LinkedList<Integer>();
        int i = 1;
        int curr = 1;
        int res = 1;
        int[] lvl = new int[n + 1];
        while (i < n) {
            int c = a[i++];
            if (node[curr].get(node[curr].size() - 1) < c) {
                node[curr].add(c);

                q.add(c);
                lvl[c] = lvl[curr] + 1;
            } else {
                curr = q.poll();
                node[curr].add(c);
                q.add(c);
                lvl[c] = lvl[curr] + 1;
            }
        }
        for (int j = 1; j <= n; j++) {
            res = Math.max(res, lvl[j]);
        }
        System.out.println(res);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            bfs(a, n);
        }
    }
}
