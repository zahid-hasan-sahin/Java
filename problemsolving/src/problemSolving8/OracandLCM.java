package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class OracandLCM {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        if (n == 1) {
            System.out.println(a[0]);
            return;
        }
        int[] pr = new int[200010];
        for (int i = 0; i < 200010; i++) {
            pr[i] = i;
        }
        for (long i = 2; i < 200010; i++) {
            int te = (int) i;
            if (pr[te] == i) {
                for (long j = i * i; j < 200010; j += i) {
                    int tm = (int) j;
                    if (pr[tm] == tm) {
                        pr[tm] = te;
                    }
                }
            }
        }
        ArrayList<Integer>[] fre = new ArrayList[200010];
        for (int i = 0; i < 200010; i++) {
            fre[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n; i++) {
            int curr = a[i];
            int c = 1;

            while (curr > 1) {
                if (pr[curr] != pr[curr / pr[curr]]) {

                    fre[pr[curr]].add(c);
                    c = 0;
                }
                ++c;
                curr = curr / pr[curr];
            }

        }

        for (int i = 0; i < 200010; i++) {
            if (fre[i].size() == n - 1) {
                fre[i].add(0);
            }
            Collections.sort(fre[i]);
        }

        long res = 1;
        for (int i = 0; i <= 200005; i++) {
            if (fre[i].size() == n) {
                res *= Math.pow(i, Math.max(fre[i].get(0), fre[i].get(1)));
            }
        }
        System.out.println(res);
    }

}
