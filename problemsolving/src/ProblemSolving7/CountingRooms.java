package ProblemSolving7;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.util.StringTokenizer;

public class CountingRooms {

    static void dfs(int i, int j, int[][] mat, boolean[][] vis, int n, int m) {
        vis[i][j] = true;
        if (isValid(i + 1, j, mat, vis, n, m)) {
            dfs(i + 1, j, mat, vis, n, m);
        }
        if (isValid(i, j + 1, mat, vis, n, m)) {
            dfs(i, j + 1, mat, vis, n, m);
        }
        if (isValid(i - 1, j, mat, vis, n, m)) {
            dfs(i - 1, j, mat, vis, n, m);
        }
        if (isValid(i, j - 1, mat, vis, n, m)) {
            dfs(i, j - 1, mat, vis, n, m);
        }
    }

    static boolean isValid(int i, int j, int[][] mat, boolean[][] vis, int n, int m) {
        if (i >= n || i < 0 || j >= m || j < 0) {
            return false;
        }
        if (vis[i][j]) {
            return false;
        }
        if (mat[i][j] != '.') {
            return false;
        }
        return true;

    }

    public static void main(String args[]) {
        FastReader scan = new FastReader();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
            }
          
        }
        int res = 0;
        boolean[][] vis = new boolean[n][m];
     
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && a[i][j] == '.') {
                    ++res;
                    dfs(i, j, a, vis, n, m);
                }
            }
        }
        System.out.println(res);
    }
}



 
class FastReader {

    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(
                new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
