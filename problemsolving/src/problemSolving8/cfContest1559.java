package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1559 {

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
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] par1 = new int[n + 10];
        int[] par2 = new int[n + 10];
        int[] r1 = new int[n + 10];
        int[] r2 = new int[n + 10];
        for (int i = 0; i < n + 10; i++) {
            par1[i] = -1;
            r1[i] = 1;
            par2[i] = -1;
            r2[i] = 1;
        }
        for (int i = 0; i < a; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            union(u, v, par1, r1);
        }

        for (int i = 0; i < b; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            union(u, v, par2, r2);
        }
        int c = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (find(i, par1) != find(j, par1) && find(i, par2) != find(j, par2)) {
                    sb.append(i + " " + j + "\n");
                    ++c;
                    union(i, j, par1, r1);
                    union(i, j, par2, r2);
                }
            }
        }
        System.out.println(c);
        System.out.println(sb);

    }
}
