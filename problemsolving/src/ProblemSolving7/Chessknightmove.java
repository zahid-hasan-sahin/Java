package ProblemSolving7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chessknightmove {

    static boolean isValid(int i, int j, boolean[][] vis) {
        if (i < 0 || i >= 8 || j >= 8 || j < 0) {
            return false;
        }

        if (vis[i][j]) {
            return false;
        }
        return true;

    }

    static int bfs(int i, int j, boolean[][] vis, int[][] dis, int desx, int desy) {
        Queue<Integer> x = new LinkedList<Integer>();
        Queue<Integer> y = new LinkedList<Integer>();
        vis[i][j] = true;
        x.add(i);
        y.add(j);
        dis[i][j] = 0;
        while (!x.isEmpty()) {
            int p = x.poll();
            int q = y.poll();
            if (p == desx && q == desy) {
                return dis[p][q];
            }
            if (isValid(p + 2, q + 1, vis)) {
                dis[p + 2][q + 1] = dis[p][q] + 1;
                x.add(p + 2);
                y.add(q + 1);
                vis[p + 2][q + 1] = true;
            }
            if (isValid(p + 2, q - 1, vis)) {
                dis[p + 2][q - 1] = dis[p][q] + 1;
                x.add(p + 2);
                y.add(q - 1);
                vis[p + 2][q - 1] = true;
            }

            if (isValid(p - 2, q - 1, vis)) {
                dis[p - 2][q - 1] = dis[p][q] + 1;
                x.add(p - 2);
                y.add(q - 1);
                vis[p - 2][q - 1] = true;
            }

            if (isValid(p - 2, q + 1, vis)) {
                dis[p - 2][q + 1] = dis[p][q] + 1;
                x.add(p - 2);
                y.add(q + 1);
                vis[p - 2][q + 1] = true;
            }

            if (isValid(p + 1, q - 2, vis)) {
                dis[p + 1][q - 2] = dis[p][q] + 1;
                x.add(p + 1);
                y.add(q - 2);
                vis[p + 1][q - 2] = true;
            }

            if (isValid(p - 1, q - 2, vis)) {
                dis[p - 1][q - 2] = dis[p][q] + 1;
                x.add(p - 1);
                y.add(q - 2);
                vis[p - 1][q - 2] = true;
            }

            if (isValid(p - 1, q + 2, vis)) {
                dis[p - 1][q + 2] = dis[p][q] + 1;
                x.add(p - 1);
                y.add(q + 2);
                vis[p - 1][q + 2] = true;
            }

            if (isValid(p + 1, q + 2, vis)) {
                dis[p + 1][q + 2] = dis[p][q] + 1;
                x.add(p + 1);
                y.add(q + 2);
                vis[p + 1][q + 2] = true;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String to = scan.next();
            String des = scan.next();
            int x = to.charAt(0) - 'a';
            int y = to.charAt(1) - '1';
            int desX = des.charAt(0) - 'a';
            int desy = des.charAt(1) - '1';
            int[][] dis = new int[8][8];
            boolean[][] vis = new boolean[8][8];
            System.out.println(bfs(x, y, vis, dis, desX, desy));
        }
    }

}
