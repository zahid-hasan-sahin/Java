package Graph;

import java.util.Scanner;

public class OwlFight {

    static int find(int a, int[] par) {
        if (par[a] < 0) {
            return a;
        }
        return par[a] = find(par[a], par);
    }

    static void union(int a, int b, int[] par) {
        int a1 = find(a, par);
        int b1 = find(b, par);
        if (a1 != b1) {
            if (a1 > b1) {
                par[a1] += par[b1];
                par[b1] = a1;
            } else {
                par[b1] += par[a1];
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
        for (int i = 0; i < n; i++) {
            par[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            union(u, v, par);
        }

        int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            int r = scan.nextInt();
            int p = scan.nextInt();
            int a = find(r, par);
            int b = find(p, par);

            if (a == b) {
                System.out.println("TIE");
            } else if (a > b) {
                System.out.println(r);
            } else {
                System.out.println(p);
            }
        }
    }

}
