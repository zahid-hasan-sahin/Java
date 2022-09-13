package problemSolving8;

import java.util.Scanner;

public class RoomandStaircases {

    static int rec(String s, int i, int n, int[][] vis, int c) {
        int l = 0, r = 0, u = 0;
        boolean b = true;
        if (vis[i][(c + 1) % 2] == 0 && s.charAt(i) == '1') {
            u = 1 + rec(s, i, n, vis, (c + 1) % 2);
            b = false;
        }
        if (i + 1 < n && vis[i + 1][c] == 0) {
            l = 1 + rec(s, i + 1, n, vis, c);
            b = false;
        }
        if (i - 1 >= 0 && vis[i - 1][c] == 0) {
            r = 1 + rec(s, i - 1, n, vis, c);
            b = false;
        }

        if (b) {
            return 1;
        }
        return Math.max(l, Math.max(r, u));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    //  int[][] vis = new int[n][2];
                    //  res = Math.max(res, rec(s, i, n, vis, j));
                }

            }
            int[][] vis = new int[n][2];
            res = rec(s, 2, n, vis, 1);

            System.out.println(res);
        }
    }
}
