package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cfContest1620 {

    static void sort(int[] a) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            ar.add(a[i]);
        }
        Collections.sort(ar);
        for (int i = 0; i < a.length; i++) {
            a[i] = ar.get(i);
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            long n = scan.nextInt();
            long m = scan.nextInt();

            int k = scan.nextInt();
            int[] a = new int[k];
            for (int i = 0; i < k; i++) {
                a[i] = scan.nextInt();
            }
            k = scan.nextInt();
            int[] b = new int[k];
            for (int i = 0; i < k; i++) {
                b[i] = scan.nextInt();

            }
            k = scan.nextInt();
            int[] c = new int[k];
            for (int i = 0; i < k; i++) {
                c[i] = scan.nextInt();
            }
            k = scan.nextInt();
            int[] d = new int[k];
            for (int i = 0; i < k; i++) {
                d[i] = scan.nextInt();
            }
            sort(a);
            sort(c);
            sort(b);
            sort(d);
            long up = a[a.length - 1] - a[0];
            up *= m;

            long mx = b[b.length - 1] * m;
            mx -= b[0] * m;

            long dw = c[c.length - 1] - c[0];
            dw *= n;

            long mn = d[d.length - 1] * n;
            mn -= d[0] * n;

            System.out.println(Math.max(up, Math.max(dw, Math.max(mn, mx))));
        }
    }
}
