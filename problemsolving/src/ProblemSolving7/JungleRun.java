package ProblemSolving7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JungleRun {

    static int res = 1000000000;

    static boolean isValid(int i, int j, char[][] a, boolean[][] vis, int n) {
        if (i < 0 || i >= n || j >= n || j < 0) {
            return false;
        }

        if (vis[i][j] || a[i][j] == 'T') {
            return false;
        }
        return true;

    }

    static void bfs(int i, int j, char[][] a, boolean[][] vis, int n, int[][] dis) {
        Queue<Integer> x = new LinkedList<Integer>();
        Queue<Integer> y = new LinkedList<Integer>();
        vis[i][j] = true;
        x.add(i);
        y.add(j);
        dis[i][j] = 0;
        while (!x.isEmpty()) {
            int p = x.poll();
            int q = y.poll();

            if (isValid(p + 1, q, a, vis, n)) {
                dis[p + 1][q] = dis[p][q] + 1;
                x.add(p + 1);
                y.add(q);
                vis[p + 1][q] = true;
            }
            if (isValid(p - 1, q, a, vis, n)) {
                dis[p - 1][q] = dis[p][q] + 1;
                x.add(p - 1);
                y.add(q);
                vis[p - 1][q] = true;
            }
            if (isValid(p, q + 1, a, vis, n)) {
                dis[p][q + 1] = dis[p][q] + 1;
                x.add(p);
                y.add(q + 1);
                vis[p][q + 1] = true;
            }
            if (isValid(p, q - 1, a, vis, n)) {
                dis[p][q - 1] = dis[p][q] + 1;
                x.add(p);
                y.add(q - 1);
                vis[p][q - 1] = true;
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.next().charAt(0);
            }
        }
        int r = 0;
        int c = 0;
        int dx = 0;
        int dy = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 'S') {
                    r = i;
                    c = j;
                }
                if (a[i][j] == 'E') {
                    dx = i;
                    dy = j;
                }
            }
        }

        boolean[][] vis = new boolean[n][n];
        int[][] dis = new int[n][n];

        bfs(r, c, a, vis, n, dis);
        System.out.println(dis[dx][dy]);
    }

}
