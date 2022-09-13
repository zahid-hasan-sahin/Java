package problemSolving8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Uniqueness {

    static boolean p(int[] a, int k) {
        boolean b = false;
        for (int i = 0; i < a.length; i++) {
            boolean ch = false;
            int[] fre = new int[2010];
            for (int j = 0; j < i; j++) {
                ++fre[a[j]];
                if (fre[a[j]] >= 2) {
                    ch = true;
                }
            }

            for (int j = i + k; j < a.length; j++) {
                ++fre[a[j]];
                if (fre[a[j]] >= 2) {
                    ch = true;
                }
            }
            if (!ch) {
                b = true;
            }

        }
        return b;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] f = new int[2010];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            if (a[i] <= 2000) {
                ++f[a[i]];
            }
        }
        ArrayList<Integer> p = new ArrayList<Integer>();
        for (int i = 1; i < 2010; i++) {
            if (f[i] == 0) {
                p.add(i);
            }
        }

        int q = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 2000) {
                int pr = a[i];
                int k = p.get(q++);
                for (int j = i; j < n; j++) {
                    if (pr == a[j]) {
                        a[j] = k;
                    }
                }
            }
        }

        int l = 0;
        int r = n;
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (p(a, mid)) {
                r = mid - 1;
                ans = mid;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ans);
    }

}
