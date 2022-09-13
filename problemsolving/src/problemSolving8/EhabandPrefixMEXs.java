package problemSolving8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EhabandPrefixMEXs {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 2];
        int[] f = new int[n + 2];
        int mx = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
            ++f[a[i]];
            mx = Math.max(mx, a[i]);
        }
        int[] res = new int[n + 2];
        ArrayList<Integer> not = new ArrayList<Integer>();
        for (int i = 0; i <= mx; i++) {
            if (f[i] == 0) {
                not.add(i);
            }
        }
        for (int i = 0; i <= n; i++) {
            res[i] = -1;
        }
        for (int i = 1; i <= n; i++) {
            if (a[i] != a[i - 1]) {
                res[i] = a[i - 1];
            }
        }
        not.add(mx + 1);
        res[1] = -1;
        int p = 0;
        for (int i = 1; i <= n; i++) {
            if (res[i] == -1) {
                if (p >= not.size()) {
                    p = not.size() - 1;
                }
                res[i] = not.get(p++);
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
