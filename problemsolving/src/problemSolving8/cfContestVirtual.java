package problemSolving8;

import java.util.ArrayList;

import java.io.IOException;
import java.util.Scanner;

public class cfContestVirtual {
    
    static void dfs(ArrayList<Integer>[] g, int root, int[] white, int[] black, String s) {
        if (s.charAt(root - 1) == 'B') {
            black[root]++;
        } else {
            white[root]++;
        }
        for (int i : g[root]) {
            dfs(g, i, white, black, s);
            black[root] += black[i];
            white[root] += white[i];
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < m; j++) {
                    
                }
            }
        }
    }
}
