package problemSolving8;

import java.util.Scanner;

public class EhabandPatheticMEXs {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] f = new int[n + 1];
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            a[i] = u;
            b[i] = v;
            ++f[u];
            ++f[v];
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            int u = a[i];
            int v = b[i];
            if (f[u] == 1 || f[v] == 1) {
                res[i] = c++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (res[i] == -1) {
                res[i] = c++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(res[i]);
        }

    }
}
