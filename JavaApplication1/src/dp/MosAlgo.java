package dp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class MosAlgo {

    public static class st {

        int l = 0;
        int r = 0;
        int ind = 0;

    }
    static int k = 0;

    public static class myCom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.l / k;
            int l = ob2.l / k;
            if (f == l) {
                if (ob1.r > ob2.r) {
                    return 1;
                }
                return -1;
            } else {
                if (f > l) {
                    return 1;
                }
                return -1;
            }
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
        int q = scan.nextInt();
        k = (int) Math.ceil(Math.sqrt(n));
        MosAlgo.st[] ob = new MosAlgo.st[q];
        for (int i = 0; i < q; i++) {
            ob[i] = new st();
            ob[i].l = scan.nextInt();
            ob[i].r = scan.nextInt();
            ob[i].ind = i;

        }
        Arrays.sort(ob, new myCom());
        long[] res = new long[q];
        long s = 0;
        int l = 0;
        int r = 0;
       

        for (int i = 0; i < q; i++) {
            int b = ob[i].l;
            int c = ob[i].r;
            int[] o = new int[1010];
            while (l > b) {

                s += a[--l];
            }
            while (l < b) {
                s -= a[l++];
            }
            while (r > c) {
                s -= a[r--];
            }
            while (r < c) {
                s += a[++r];
            }
            res[ob[i].ind] = s;

        }
        for (int i = 0; i < q; i++) {
            System.out.println(res[i]);
        }
    }
}
