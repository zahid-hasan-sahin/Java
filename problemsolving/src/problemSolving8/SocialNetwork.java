package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SocialNetwork {

    static int find(int a, int[] par, int[] vis) {
        vis[a] = 1;
        if (par[a] < 0) {
            return a;
        }

        return par[a] = find(par[a], par, vis);
    }

    static void union(int a, int b, int[] par, int[] r, int[] vis) {
        int a1 = find(a, par, vis);
        int b1 = find(b, par, vis);
        if (a1 != b1) {
            if (r[a1] > r[b1]) {
                r[a1] += r[b1];
                par[b1] = a1;
            } else {
                r[b1] += r[a1];
                par[a1] = b1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] par = new int[n + 1];
        int[] r = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            par[i] = -1;
            r[i] = 1;
        }
        int ex = 0;
        int[] temp = new int[n + 1];
        for (int i = 0; i < d; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            if (find(u, par, temp) == find(v, par, temp)) {
                ++ex;
            } else {
                union(u, v, par, r, temp);
            }
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int j = 1; j <= n; j++) {
                if (par[j] == -1) {

                    ar.add(r[j]);
                }
            }
            Collections.sort(ar, Collections.reverseOrder());

            long sum = 0;
            for (int j = 0; j < ex + 1; j++) {
                sum += ar.get(j);
            }
            System.out.println(sum - 1);
        }

    }
}
