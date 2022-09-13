package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class OmkarandHeavenlTree {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] f = new int[n + 1];
            for (int i = 0; i < m; i++) {
                int u = scan.nextInt();
                int v = scan.nextInt();
                int k = scan.nextInt();
                ++f[v];
                a[i] = u;
                b[i] = k;
            }
            int par = 0;
            for (int i = 1; i <= n; i++) {
                if (f[i] == 0) {
                    par = i;
                }
            }
            for (int i = 1; i <= n; i++) {
                if (i == par) {
                    continue;
                }
                System.out.println(par+" "+i);
            }

        }
    }
}
