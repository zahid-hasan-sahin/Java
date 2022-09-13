package DataStructuresAndAlgorithms.Sorting.Gready;

import java.util.Scanner;

public class MaximumIntervalsOverlap {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int mx = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                mx = Math.max(a[i], mx);
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
                mx = Math.max(mx, b[i]);
            }
            int[] c = new int[mx + 2];
            for (int i = 0; i < n; i++) {
                c[a[i]] += 1;
                c[b[i] + 1] -= 1;
            }
            int res = 0;
            int s = 0;
            int p = 0;
            for (int i = 0; i < mx + 2; i++) {
                s += c[i];
                if (s > res) {
                    p = i;
                }
                res = Math.max(res, s);
            }
            System.out.println(res+" "+p);
        }
    }

}
