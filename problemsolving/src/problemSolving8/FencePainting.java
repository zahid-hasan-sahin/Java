package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class FencePainting {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n + 1];
            int[] b = new int[n + 1];
            ArrayList<Integer>[] need = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                b[i] = scan.nextInt();
            }
            for (int i = 0; i <= n; i++) {
                need[i] = new ArrayList<Integer>();
            }
            for (int i = 1; i <= n; i++) {
                if (b[i] != a[i]) {
                    need[b[i]].add(i);
                }
            }
            int[] c = new int[m + 1];
            for (int i = 1; i <= m; i++) {
                c[i] = scan.nextInt();
            }
            int last = -1;
            for (int i = 1; i <= n; i++) {
                if (b[i] == c[m] && a[i] != b[i]) {
                    last = i;
                }
            }
            for (int i = 1; i <= n; i++) {
                if (b[i] == c[m] && last == -1) {
                    last = i;
                }
            }
            if (last == -1) {
                System.out.println("NO");
                continue k;
            }
            int[] pos = new int[n + 1];
            int[] res = new int[m + 1];
            for (int i = 1; i <= m; i++) {
                if (pos[c[i]] == need[c[i]].size()) {
                    res[i] = last;
                    a[last] = c[i];
                } else {
                    res[i] = need[c[i]].get(pos[c[i]]);
                    a[need[c[i]].get(pos[c[i]])] = c[i];
                    ++pos[c[i]];
                }
            }
            for (int i = 1; i <= n; i++) {
                if (a[i] != b[i]) {
                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");
            for (int i = 1; i <= m; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }

    }
}
