package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1594 {

    static int find(int a, int[] par) {
        if (par[a] == a) {
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
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] par = new int[n + 3];
            int[] r = new int[n + 3];
            for (int i = 0; i < n + 3; i++) {
                par[i] = i;
                r[i] = 1;
            }
            int cre = n + 1;
            int imo = n + 2;
            boolean ch = false;
            for (int i = 0; i < m; i++) {
                int u = scan.nextInt();
                int v = scan.nextInt();
                String s = scan.next();
                if (s.equals("imposter")) {
                    if (find(u, par) == find(cre, par) || find(u, par) == u) {
                        if (find(v, par) == find(cre, par)) {
                            ch = true;
                        } else {

                            union(u, cre, par, r);
                            union(u, imo, par, r);
                        }
                    } else if (find(u, par) == find(imo, par) || find(u, par) == u) {
                        if (find(v, par) == find(imo, par)) {
                            ch = true;
                        } else {

                            union(u, imo, par, r);
                            union(u, cre, par, r);
                        }
                    }
                } else {

                    if (find(u, par) == find(cre, par) || find(u, par) == u) {
                        if (find(v, par) == find(imo, par)) {
                            ch = true;
                        } else {
                            union(u, cre, par, r);
                            union(u, cre, par, r);
                        }
                    } else if (find(u, par) == find(imo, par) || find(imo, par) == u) {
                        if (find(v, par) == find(cre, par)) {
                            ch = true;
                        } else {
                            union(u, imo, par, r);
                            union(u, cre, par, r);
                        }
                    }
                }
            }
            if (ch) {
                System.out.println("-1");
            } else {
                int p = 0;
                int q = 0;

                for (int i = 1; i <= n + 2; i++) {

                    if (find(cre, par) == find(i, par)) {
                        ++p;
                    }
                    if (find(imo, par) == find(i, par)) {
                        ++q;
                    }
                }
                System.out.println(p + " " + q);
            }

        }
    }
}
