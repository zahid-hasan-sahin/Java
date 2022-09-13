package problemSolving8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CatParty {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] f = new int[100005];
        for (int i = 0; i < n; i++) {
            ++f[a[i]];
        }
        HashSet<Integer> h = new HashSet<Integer>();
        int one = 0;
        int[] f2 = new int[100005];
        for (int i = 0; i < 100005; i++) {
            if (f[i] != 0) {
                h.add(f[i]);
                if (f[i] == 1) {
                    ++one;
                }
            }
        }
        for (int i = 0; i < 100005; i++) {
            if (f[i] != 0) {
                ++f2[f[i]];
            }
        }
        int res = n;

        for (int i = n - 1; i >= 0; i--) {
            if (h.size() == 2) {
                ArrayList<Integer> ar = new ArrayList<Integer>();
                for (int el : h) {
                    ar.add(el);
                }
                if (Math.abs(ar.get(0) - ar.get(1)) == 1 || ((ar.get(0) == 1 && f2[1] == 1)) || ar.get(1) == 1 && f2[1] == 1) {
                    res = i + 1;
                    break;
                }
            }
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int el : h) {
                ar.add(el);
            }

            int curr = a[i];
            --f2[f[curr]];
            if (f2[f[curr]] == 0) {
                h.remove(f[curr]);
            }

            --f[curr];
            ++f2[f[curr]];
            if (f[curr] != 0) {
                h.add(f[curr]);
            }

        }
        System.out.println(res);
    }

}
