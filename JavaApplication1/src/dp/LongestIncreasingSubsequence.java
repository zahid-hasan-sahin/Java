package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

    static int bns(int[] a, int n, int l, int r) {

        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == n) {
                return mid;
            }
            if (a[mid] > n) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r + 1;
    }

    static void lisOnLogn(int[] a, int n) {
        int[] p = new int[n];
        int k = 1;
        int w = 0;
        p[0] = a[0];

        while (k < n) {
            int y = bns(p, a[k], 0, w);

            p[y] = a[k];

            w = Math.max(w, y);
            ++k;
        }
        System.out.println(w + 1);
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] r = new int[n];
            int[] p = new int[n];//for print sequence
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                r[i] = 1;
                p[i] = -1;
            }

            for (int i = 01; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (a[i] > a[j] && r[i] < r[j] + 1) {
                        r[i] = r[j] + 1;
                        p[i] = j; //for print
                    }
                }
            }
            int mx = 0;
            int pos = 0;
            for (int i = 0; i < n; i++) {

                if (mx < r[i]) {
                    mx = r[i];
                    pos = i;
                }
            }
//            System.out.println(mx);
//            for (int i = 0; i < n; i++) {
//                System.out.print(p[i] + " ");
//            }
//            System.out.println();
//            ArrayList<Integer> ar = new ArrayList<Integer>();
//            while (pos != -1) {
//                ar.add(a[pos]);
//                pos = p[pos];
//            }
//            for (int i = ar.size() - 1; i >= 0; i--) {
//                System.out.print(ar.get(i) + " ");
//            }
//            System.out.println();
            lisOnLogn(a, n);

        }
    }
}
