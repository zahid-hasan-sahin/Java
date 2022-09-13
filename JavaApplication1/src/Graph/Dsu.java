package Graph;

import java.util.Scanner;

public class Dsu {

    static int find(int a, int[] par) {
        if (par[a] < 0) {
            return a;
        }
        return par[a] = find(par[a], par);
    }

    static void union(int a, int b, int[] par, int[] r) {
        int a1 = find(a, par);
        int b1 = find(b, par);
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

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ++n;
        int[] par = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = -1;
            r[i] = 1;
        }
        for (int i = 0; i < m; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            union(u, v, par, r);
        }

        for (int i = 1; i < n; i++) {
            System.out.print(par[i] + " ");
        }
        System.out.println();
    }

}
